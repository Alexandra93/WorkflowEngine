/**
 */
package Workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Workflow.MainWorkflow#getScripts <em>Scripts</em>}</li>
 * </ul>
 *
 * @see Workflow.WorkflowPackage#getMainWorkflow()
 * @model
 * @generated
 */
public interface MainWorkflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link Workflow.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see Workflow.WorkflowPackage#getMainWorkflow_Scripts()
	 * @model containment="true" upper="5"
	 * @generated
	 */
	EList<Script> getScripts();

} // MainWorkflow
