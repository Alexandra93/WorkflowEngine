/**
 */
package Workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = Workflow.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link Workflow.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workflow.impl.CommandImpl
	 * @see Workflow.impl.WorkflowPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Command Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workflow.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workflow.impl.ParameterImpl
	 * @see Workflow.impl.WorkflowPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workflow.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workflow.impl.ScriptImpl
	 * @see Workflow.impl.WorkflowPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workflow.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workflow.impl.OptionImpl
	 * @see Workflow.impl.WorkflowPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Option Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Workflow.impl.MainWorkflowImpl <em>Main Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Workflow.impl.MainWorkflowImpl
	 * @see Workflow.impl.WorkflowPackageImpl#getMainWorkflow()
	 * @generated
	 */
	int MAIN_WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_WORKFLOW__SCRIPTS = 0;

	/**
	 * The number of structural features of the '<em>Main Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_WORKFLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Main Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_WORKFLOW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Workflow.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see Workflow.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link Workflow.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Workflow.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Workflow.Command#getCommandParameters <em>Command Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command Parameters</em>'.
	 * @see Workflow.Command#getCommandParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_CommandParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link Workflow.Command#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see Workflow.Command#getOptions()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Options();

	/**
	 * Returns the meta object for the attribute '{@link Workflow.Command#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Workflow.Command#getDescription()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Description();

	/**
	 * Returns the meta object for class '{@link Workflow.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see Workflow.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link Workflow.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Workflow.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link Workflow.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see Workflow.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link Workflow.Script#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see Workflow.Script#getCommands()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Commands();

	/**
	 * Returns the meta object for the attribute '{@link Workflow.Script#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Workflow.Script#getName()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Name();

	/**
	 * Returns the meta object for class '{@link Workflow.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see Workflow.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link Workflow.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Workflow.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Workflow.Option#getOptionParameters <em>Option Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option Parameters</em>'.
	 * @see Workflow.Option#getOptionParameters()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_OptionParameters();

	/**
	 * Returns the meta object for class '{@link Workflow.MainWorkflow <em>Main Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Workflow</em>'.
	 * @see Workflow.MainWorkflow
	 * @generated
	 */
	EClass getMainWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link Workflow.MainWorkflow#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see Workflow.MainWorkflow#getScripts()
	 * @see #getMainWorkflow()
	 * @generated
	 */
	EReference getMainWorkflow_Scripts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Workflow.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workflow.impl.CommandImpl
		 * @see Workflow.impl.WorkflowPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Command Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMMAND_PARAMETERS = eINSTANCE.getCommand_CommandParameters();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__OPTIONS = eINSTANCE.getCommand_Options();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
		 * The meta object literal for the '{@link Workflow.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workflow.impl.ParameterImpl
		 * @see Workflow.impl.WorkflowPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link Workflow.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workflow.impl.ScriptImpl
		 * @see Workflow.impl.WorkflowPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__COMMANDS = eINSTANCE.getScript_Commands();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__NAME = eINSTANCE.getScript_Name();

		/**
		 * The meta object literal for the '{@link Workflow.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workflow.impl.OptionImpl
		 * @see Workflow.impl.WorkflowPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '<em><b>Option Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__OPTION_PARAMETERS = eINSTANCE.getOption_OptionParameters();

		/**
		 * The meta object literal for the '{@link Workflow.impl.MainWorkflowImpl <em>Main Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Workflow.impl.MainWorkflowImpl
		 * @see Workflow.impl.WorkflowPackageImpl#getMainWorkflow()
		 * @generated
		 */
		EClass MAIN_WORKFLOW = eINSTANCE.getMainWorkflow();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_WORKFLOW__SCRIPTS = eINSTANCE.getMainWorkflow_Scripts();

	}

} //WorkflowPackage
