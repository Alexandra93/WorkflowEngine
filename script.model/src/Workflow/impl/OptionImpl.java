/**
 */
package Workflow.impl;

import Workflow.Option;
import Workflow.Parameter;
import Workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Workflow.impl.OptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Workflow.impl.OptionImpl#getOptionParameters <em>Option Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionParameters() <em>Option Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameter optionParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.OPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getOptionParameters() {
		return optionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParameters(Parameter newOptionParameters, NotificationChain msgs) {
		Parameter oldOptionParameters = optionParameters;
		optionParameters = newOptionParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.OPTION__OPTION_PARAMETERS, oldOptionParameters, newOptionParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionParameters(Parameter newOptionParameters) {
		if (newOptionParameters != optionParameters) {
			NotificationChain msgs = null;
			if (optionParameters != null)
				msgs = ((InternalEObject)optionParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.OPTION__OPTION_PARAMETERS, null, msgs);
			if (newOptionParameters != null)
				msgs = ((InternalEObject)newOptionParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.OPTION__OPTION_PARAMETERS, null, msgs);
			msgs = basicSetOptionParameters(newOptionParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.OPTION__OPTION_PARAMETERS, newOptionParameters, newOptionParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.OPTION__OPTION_PARAMETERS:
				return basicSetOptionParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.OPTION__NAME:
				return getName();
			case WorkflowPackage.OPTION__OPTION_PARAMETERS:
				return getOptionParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.OPTION__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.OPTION__OPTION_PARAMETERS:
				setOptionParameters((Parameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.OPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.OPTION__OPTION_PARAMETERS:
				setOptionParameters((Parameter)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.OPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.OPTION__OPTION_PARAMETERS:
				return optionParameters != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
