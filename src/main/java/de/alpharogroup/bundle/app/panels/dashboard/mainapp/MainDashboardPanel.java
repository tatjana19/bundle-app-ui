package de.alpharogroup.bundle.app.panels.dashboard.mainapp;

import java.awt.event.ActionEvent;

import de.alpharogroup.bundle.app.panels.creation.NewBundleApplicationPanel;
import de.alpharogroup.bundle.app.panels.dashboard.ApplicationDashboardBean;
import de.alpharogroup.bundle.app.panels.overview.OverviewOfAllBundleApplicationsPanel;
import de.alpharogroup.model.BaseModel;
import de.alpharogroup.model.PropertyModel;
import de.alpharogroup.model.api.Model;
import de.alpharogroup.swing.base.BaseCardLayoutPanel;
import lombok.Getter;

@Getter
public class MainDashboardPanel extends BaseCardLayoutPanel<MainDashboardBean>
{

	public MainDashboardPanel()
	{
		this(BaseModel.<MainDashboardBean> of(MainDashboardBean.builder().build()));
	}

	public MainDashboardPanel(Model<MainDashboardBean> model)
	{
		super(model);
		getCardLayout().show(this, MainDashboardView.MAIN_DASHBOARD.name());
	}

	protected NewBundleApplicationPanel newBundleApplicationPanel(Model<MainDashboardBean> model)
	{
		model.getObject().setSelectedBundleApplication(ApplicationDashboardBean.builder().build());
		Model<ApplicationDashboardBean> baModel = PropertyModel.<ApplicationDashboardBean> of(model,
			"selectedBundleApplication");

		return new NewBundleApplicationPanel(baModel)
		{
			@Override
			protected void onSave(ActionEvent e)
			{
				super.onSave(e);
				MainDashboardPanel.this.onSaveBundleApplication(e);
			}
		};
	}

	protected OverviewOfAllBundleApplicationsPanel newOverviewOfAllBundleApplicationsPanel(
		Model<MainDashboardBean> model)
	{
		return new OverviewOfAllBundleApplicationsPanel(model)
		{

			@Override
			protected void onCreateBundleApp(ActionEvent e)
			{
				MainDashboardPanel.this.onCreateBundleApp(e);
			}
		};
	}

	protected void onCreateBundleApp(ActionEvent e)
	{
		getCardLayout().show(this, MainDashboardView.CREATE_NEW_BUNDLE_APP.name());
	}

	@Override
	protected void onInitializeComponents()
	{
		super.onInitializeComponents();
		add(newOverviewOfAllBundleApplicationsPanel(getModel()),
			MainDashboardView.MAIN_DASHBOARD.name());
		add(newBundleApplicationPanel(getModel()), MainDashboardView.CREATE_NEW_BUNDLE_APP.name());
	}

	protected void onSaveBundleApplication(ActionEvent e)
	{
		add(newOverviewOfAllBundleApplicationsPanel(getModel()),
			MainDashboardView.MAIN_DASHBOARD.name());
		revalidate();
		getCardLayout().show(this, MainDashboardView.MAIN_DASHBOARD.name());
	}

}
