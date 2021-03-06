package de.alpharogroup.bundle.app.panels.start;

import org.jdesktop.swingx.JXPanel;

import de.alpharogroup.design.pattern.state.wizard.model.WizardModelStateMachine;
import de.alpharogroup.model.BaseModel;
import de.alpharogroup.model.api.Model;
import de.alpharogroup.swing.wizard.BaseWizardContentPanel;

/**
 * The class {@link WizardContentPanel}.
 */
public class WizardContentPanel extends BaseWizardContentPanel<WizardModel>
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new {@link WizardContentPanel}.
	 */
	public WizardContentPanel()
	{
		this(BaseModel.<WizardModelStateMachine<WizardModel>> of(
			WizardModelStateMachine.<WizardModel> builder().build()));
	}

	/**
	 * Instantiates a new {@link WizardContentPanel}.
	 *
	 * @param model
	 *            the model
	 */
	public WizardContentPanel(Model<WizardModelStateMachine<WizardModel>> model)
	{
		super(model);
	}

	public JXPanel newBundleApp(Model<WizardModelStateMachine<WizardModel>> model)
	{
		NewBundleAppPanel newBundleAppPanel = new NewBundleAppPanel(model);
		return newBundleAppPanel;
	}

	public JXPanel newBundleAppFinalStepPanel(Model<WizardModelStateMachine<WizardModel>> model)
	{
		return new SuccessfulConnectionToBundleAppPanel(model);
	}

	public JXPanel newConnectToExistingBundleAppPanel(
		Model<WizardModelStateMachine<WizardModel>> model)
	{
		return new ConnectToExistingBundleAppPanel(model);
	}

	public JXPanel newFirstStepPanel(Model<WizardModelStateMachine<WizardModel>> model)
	{
		return new WizardStartPanel(model);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onInitializeComponents()
	{
		super.onInitializeComponents();
		add(newFirstStepPanel(getModel()), WizardModelState.FIRST.getName());
		add(newBundleApp(getModel()), WizardModelState.NEW_BUNDLE_APP.getName());
		add(newBundleAppFinalStepPanel(getModel()),
			WizardModelState.SUCCESSFUL_CONNECT_TO_BUNDLE_APP.getName());
		add(newConnectToExistingBundleAppPanel(getModel()),
			WizardModelState.CONNECT_TO_EXISTING_BUNDLE_APP.getName());
	}

}