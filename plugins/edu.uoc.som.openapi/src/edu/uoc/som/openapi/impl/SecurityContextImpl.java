/**
 */
package edu.uoc.som.openapi.impl;

import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.SecurityContext;
import edu.uoc.som.openapi.SecurityRequirement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.impl.SecurityContextImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SecurityContextImpl extends MinimalEObjectImpl.Container implements SecurityContext {
	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> security;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.SECURITY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, OpenAPIPackage.SECURITY_CONTEXT__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY:
				return getSecurity();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY:
				getSecurity().clear();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY:
				return security != null && !security.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityContextImpl
