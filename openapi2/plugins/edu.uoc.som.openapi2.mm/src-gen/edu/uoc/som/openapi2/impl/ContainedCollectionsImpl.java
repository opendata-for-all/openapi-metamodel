/**
 */
package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ContainedCollections;
import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.Response;
import edu.uoc.som.openapi2.Schema;

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
 * An implementation of the model object '<em><b>Contained Collections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.impl.ContainedCollectionsImpl#getParamters <em>Paramters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.ContainedCollectionsImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.ContainedCollectionsImpl#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainedCollectionsImpl extends MinimalEObjectImpl.Container implements ContainedCollections {
	/**
	 * The cached value of the '{@link #getParamters() <em>Paramters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> paramters;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schemas;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> responses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedCollectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPI2Package.Literals.CONTAINED_COLLECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParamters() {
		if (paramters == null) {
			paramters = new EObjectContainmentEList<Parameter>(Parameter.class, this, OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS);
		}
		return paramters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<Schema>(Schema.class, this, OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectContainmentEList<Response>(Response.class, this, OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS:
				return ((InternalEList<?>)getParamters()).basicRemove(otherEnd, msgs);
			case OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
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
			case OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS:
				return getParamters();
			case OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS:
				return getSchemas();
			case OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES:
				return getResponses();
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
			case OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS:
				getParamters().clear();
				getParamters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
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
			case OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS:
				getParamters().clear();
				return;
			case OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS:
				getSchemas().clear();
				return;
			case OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES:
				getResponses().clear();
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
			case OpenAPI2Package.CONTAINED_COLLECTIONS__PARAMTERS:
				return paramters != null && !paramters.isEmpty();
			case OpenAPI2Package.CONTAINED_COLLECTIONS__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case OpenAPI2Package.CONTAINED_COLLECTIONS__RESPONSES:
				return responses != null && !responses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainedCollectionsImpl
