/**
 */
package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.SecurityRequirement;
import edu.uoc.som.openapi2.SecurityScheme;
import edu.uoc.som.openapi2.SecurityScope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl#getSecurityScopes <em>Security Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl#getSecurityScheme <em>Security Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends MinimalEObjectImpl.Container implements SecurityRequirement {
	/**
	 * The cached value of the '{@link #getSecurityScopes() <em>Security Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScope> securityScopes;

	/**
	 * The cached value of the '{@link #getSecurityScheme() <em>Security Scheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScheme()
	 * @generated
	 * @ordered
	 */
	protected SecurityScheme securityScheme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPI2Package.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScope> getSecurityScopes() {
		if (securityScopes == null) {
			securityScopes = new EObjectResolvingEList<SecurityScope>(SecurityScope.class, this, OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCOPES);
		}
		return securityScopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScheme getSecurityScheme() {
		if (securityScheme != null && securityScheme.eIsProxy()) {
			InternalEObject oldSecurityScheme = (InternalEObject)securityScheme;
			securityScheme = (SecurityScheme)eResolveProxy(oldSecurityScheme);
			if (securityScheme != oldSecurityScheme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME, oldSecurityScheme, securityScheme));
			}
		}
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScheme basicGetSecurityScheme() {
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityScheme(SecurityScheme newSecurityScheme) {
		SecurityScheme oldSecurityScheme = securityScheme;
		securityScheme = newSecurityScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME, oldSecurityScheme, securityScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				return getSecurityScopes();
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME:
				if (resolve) return getSecurityScheme();
				return basicGetSecurityScheme();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				getSecurityScopes().clear();
				getSecurityScopes().addAll((Collection<? extends SecurityScope>)newValue);
				return;
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME:
				setSecurityScheme((SecurityScheme)newValue);
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
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				getSecurityScopes().clear();
				return;
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME:
				setSecurityScheme((SecurityScheme)null);
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
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				return securityScopes != null && !securityScopes.isEmpty();
			case OpenAPI2Package.SECURITY_REQUIREMENT__SECURITY_SCHEME:
				return securityScheme != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementImpl
