/**
 */
package Workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Workflow.Option#getName <em>Name</em>}</li>
 *   <li>{@link Workflow.Option#getOptionParameters <em>Option Parameters</em>}</li>
 * </ul>
 *
 * @see Workflow.WorkflowPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Workflow.WorkflowPackage#getOption_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Workflow.Option#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Option Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Parameters</em>' containment reference.
	 * @see #setOptionParameters(Parameter)
	 * @see Workflow.WorkflowPackage#getOption_OptionParameters()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getOptionParameters();

	/**
	 * Sets the value of the '{@link Workflow.Option#getOptionParameters <em>Option Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Parameters</em>' containment reference.
	 * @see #getOptionParameters()
	 * @generated
	 */
	void setOptionParameters(Parameter value);

} // Option
