package de.alpharogroup.bundle.app.panels.creation;

import java.awt.event.ActionEvent;

import de.alpharogroup.bundle.app.MainFrame;
import de.alpharogroup.bundle.app.panels.dashboard.ApplicationDashboardBean;
import de.alpharogroup.bundle.app.spring.SpringApplicationContext;
import de.alpharogroup.db.resource.bundles.entities.BundleApplications;
import de.alpharogroup.db.resource.bundles.service.api.BundleApplicationsService;
import de.alpharogroup.model.BaseModel;
import de.alpharogroup.model.api.Model;
import de.alpharogroup.swing.base.BasePanel;
import lombok.Getter;

@Getter
public class NewBundleApplicationPanel extends BasePanel<ApplicationDashboardBean>
{

	private static final long serialVersionUID = 1L;

	private javax.swing.JButton btnSave;
	private javax.swing.JLabel lblBundleName;
	private javax.swing.JLabel lblHeaderNewBundleApp;
	private javax.swing.JTextField txtBundleName;

	public NewBundleApplicationPanel()
	{
		this(BaseModel.<ApplicationDashboardBean> of(ApplicationDashboardBean.builder().build()));
	}

	public NewBundleApplicationPanel(Model<ApplicationDashboardBean> model)
	{
		super(model);
	}

	@Override
	protected void onInitializeComponents()
	{
		super.onInitializeComponents();
		lblHeaderNewBundleApp = new javax.swing.JLabel();
		lblBundleName = new javax.swing.JLabel();
		txtBundleName = new javax.swing.JTextField();
		btnSave = new javax.swing.JButton();
		btnSave.addActionListener(e -> onSave(e));

		lblHeaderNewBundleApp.setText("Create new bundle application");

		lblBundleName.setText("Application name");

		btnSave.setText("Create bundle application");
		if (getModelObject().getBundleApplication() != null)
		{
			txtBundleName.setText(getModelObject().getBundleApplication().getName());
			btnSave.setText("Rename bundle application");
		}
	}

	@Override
	protected void onInitializeLayout()
	{
		super.onInitializeLayout();


		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout
			.setHorizontalGroup(
				layout.createParallelGroup(
					javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addGap(46, 46, 46).addGroup(layout
							.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(layout
								.createParallelGroup(
									javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(
									lblHeaderNewBundleApp, javax.swing.GroupLayout.PREFERRED_SIZE,
									700, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
									layout.createSequentialGroup()
										.addComponent(lblBundleName,
											javax.swing.GroupLayout.PREFERRED_SIZE, 200,
											javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
											javax.swing.LayoutStyle.ComponentPlacement.RELATED,
											javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtBundleName,
											javax.swing.GroupLayout.PREFERRED_SIZE, 460,
											javax.swing.GroupLayout.PREFERRED_SIZE)))
							.addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 222,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(54, Short.MAX_VALUE)));
		layout
			.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
					.addComponent(lblHeaderNewBundleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblBundleName).addComponent(txtBundleName,
							javax.swing.GroupLayout.PREFERRED_SIZE,
							javax.swing.GroupLayout.DEFAULT_SIZE,
							javax.swing.GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18).addComponent(btnSave)
					.addContainerGap(26, Short.MAX_VALUE)));
	}

	protected void onSave(ActionEvent e)
	{
		BundleApplicationsService bundleApplicationsService = (BundleApplicationsService)SpringApplicationContext
			.getInstance().getApplicationContext().getBean("bundleApplicationsService");
		String name = getTxtBundleName().getText();
		BundleApplications currentBundleApplication;
		if (getModelObject().getBundleApplication() != null) {
			currentBundleApplication = getModelObject().getBundleApplication();
			currentBundleApplication.setName(name);
			currentBundleApplication = bundleApplicationsService.merge(currentBundleApplication);
		} else {
			BundleApplications newBundleApplication = bundleApplicationsService.find(name);
			if (newBundleApplication == null)
			{
				newBundleApplication = BundleApplications.builder().name(name).build();
				newBundleApplication = bundleApplicationsService.merge(newBundleApplication);
			}
			if (!MainFrame.getInstance().getModelObject().getBundleApplications()
				.contains(newBundleApplication))
			{
				MainFrame.getInstance().getModelObject().getBundleApplications()
					.add(newBundleApplication);
			}
			getModelObject().setBundleApplication(newBundleApplication);
		}

	}

}
