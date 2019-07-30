/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Response;
import edu.uoc.som.openapi3.ResponseDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseImpl#getResponseDefinition <em>Response Definition</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends ResponseContainerImpl implements Response {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Integer code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponseDefinition() <em>Response Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDefinition()
	 * @generated
	 * @ordered
	 */
	protected ResponseDefinition responseDefinition;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Integer newCode) {
		Integer oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseDefinition getResponseDefinition() {
		if (responseDefinition != null && responseDefinition.eIsProxy()) {
			InternalEObject oldResponseDefinition = (InternalEObject)responseDefinition;
			responseDefinition = (ResponseDefinition)eResolveProxy(oldResponseDefinition);
			if (responseDefinition != oldResponseDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi3Package.RESPONSE__RESPONSE_DEFINITION, oldResponseDefinition, responseDefinition));
			}
		}
		return responseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDefinition basicGetResponseDefinition() {
		return responseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseDefinition(ResponseDefinition newResponseDefinition) {
		ResponseDefinition oldResponseDefinition = responseDefinition;
		responseDefinition = newResponseDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE__RESPONSE_DEFINITION, oldResponseDefinition, responseDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(Boolean newDefault) {
		Boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openapi3Package.RESPONSE__CODE:
				return getCode();
			case Openapi3Package.RESPONSE__RESPONSE_DEFINITION:
				if (resolve) return getResponseDefinition();
				return basicGetResponseDefinition();
			case Openapi3Package.RESPONSE__DEFAULT:
				return getDefault();
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
			case Openapi3Package.RESPONSE__CODE:
				setCode((Integer)newValue);
				return;
			case Openapi3Package.RESPONSE__RESPONSE_DEFINITION:
				setResponseDefinition((ResponseDefinition)newValue);
				return;
			case Openapi3Package.RESPONSE__DEFAULT:
				setDefault((Boolean)newValue);
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
			case Openapi3Package.RESPONSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Openapi3Package.RESPONSE__RESPONSE_DEFINITION:
				setResponseDefinition((ResponseDefinition)null);
				return;
			case Openapi3Package.RESPONSE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
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
			case Openapi3Package.RESPONSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Openapi3Package.RESPONSE__RESPONSE_DEFINITION:
				return responseDefinition != null;
			case Openapi3Package.RESPONSE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
