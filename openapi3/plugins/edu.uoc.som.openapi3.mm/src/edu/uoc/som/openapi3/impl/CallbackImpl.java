/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Callback;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Path;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.CallbackImpl#getCallbacks <em>Callbacks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallbackImpl extends MinimalEObjectImpl.Container implements Callback {
	/**
	 * The cached value of the '{@link #getCallbacks() <em>Callbacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, Path>> callbacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.CALLBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, Path>> getCallbacks() {
		if (callbacks == null) {
			callbacks = new EObjectResolvingEList<Map.Entry<String, Path>>(Entry.class, this, Openapi3Package.CALLBACK__CALLBACKS);
		}
		return callbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openapi3Package.CALLBACK__CALLBACKS:
				return getCallbacks();
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
			case Openapi3Package.CALLBACK__CALLBACKS:
				getCallbacks().clear();
				getCallbacks().addAll((Collection<? extends Map.Entry<String, Path>>)newValue);
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
			case Openapi3Package.CALLBACK__CALLBACKS:
				getCallbacks().clear();
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
			case Openapi3Package.CALLBACK__CALLBACKS:
				return callbacks != null && !callbacks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallbackImpl
