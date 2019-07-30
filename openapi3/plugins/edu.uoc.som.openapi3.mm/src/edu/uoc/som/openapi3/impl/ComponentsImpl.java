/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Callback;
import edu.uoc.som.openapi3.Components;
import edu.uoc.som.openapi3.Example;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Parameter;
import edu.uoc.som.openapi3.RequestBody;
import edu.uoc.som.openapi3.ResponseDefinition;
import edu.uoc.som.openapi3.Schema;
import edu.uoc.som.openapi3.SecurityScheme;
import edu.uoc.som.openapi3.link;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getRequestBodies <em>Request Bodies</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getSecuritySchemes <em>Security Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ComponentsImpl#getCallBacks <em>Call Backs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsImpl extends MinimalEObjectImpl.Container implements Components {
	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Schema> schemas;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ResponseDefinition> responses;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Example> examples;

	/**
	 * The cached value of the '{@link #getRequestBodies() <em>Request Bodies</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestBodies()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, RequestBody> requestBodies;

	/**
	 * The cached value of the '{@link #getSecuritySchemes() <em>Security Schemes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySchemes()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, SecurityScheme> securitySchemes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, link> links;

	/**
	 * The cached value of the '{@link #getCallBacks() <em>Call Backs</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallBacks()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Callback> callBacks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Schema> getSchemas() {
		if (schemas == null) {
			schemas = new EcoreEMap<String,Schema>(Openapi3Package.Literals.SCHEMA_ENTRY, SchemaEntryImpl.class, this, Openapi3Package.COMPONENTS__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, ResponseDefinition> getResponses() {
		if (responses == null) {
			responses = new EcoreEMap<String,ResponseDefinition>(Openapi3Package.Literals.RESPONSE_DEFINITION_ENTRY, ResponseDefinitionEntryImpl.class, this, Openapi3Package.COMPONENTS__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,Parameter>(Openapi3Package.Literals.PARAMETER_ENTRY, ParameterEntryImpl.class, this, Openapi3Package.COMPONENTS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Example> getExamples() {
		if (examples == null) {
			examples = new EcoreEMap<String,Example>(Openapi3Package.Literals.EXAMPLE_ENTRY, ExampleEntryImpl.class, this, Openapi3Package.COMPONENTS__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, RequestBody> getRequestBodies() {
		if (requestBodies == null) {
			requestBodies = new EcoreEMap<String,RequestBody>(Openapi3Package.Literals.REQUEST_BODY_ENTRY, RequestBodyEntryImpl.class, this, Openapi3Package.COMPONENTS__REQUEST_BODIES);
		}
		return requestBodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, SecurityScheme> getSecuritySchemes() {
		if (securitySchemes == null) {
			securitySchemes = new EcoreEMap<String,SecurityScheme>(Openapi3Package.Literals.SECURITY_SCHEME_ENTRY, SecuritySchemeEntryImpl.class, this, Openapi3Package.COMPONENTS__SECURITY_SCHEMES);
		}
		return securitySchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, link> getLinks() {
		if (links == null) {
			links = new EcoreEMap<String,link>(Openapi3Package.Literals.LINK_ENTRY, LinkEntryImpl.class, this, Openapi3Package.COMPONENTS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Callback> getCallBacks() {
		if (callBacks == null) {
			callBacks = new EcoreEMap<String,Callback>(Openapi3Package.Literals.CALLBACK_ENTRY, CallbackEntryImpl.class, this, Openapi3Package.COMPONENTS__CALL_BACKS);
		}
		return callBacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi3Package.COMPONENTS__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__REQUEST_BODIES:
				return ((InternalEList<?>)getRequestBodies()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__SECURITY_SCHEMES:
				return ((InternalEList<?>)getSecuritySchemes()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case Openapi3Package.COMPONENTS__CALL_BACKS:
				return ((InternalEList<?>)getCallBacks()).basicRemove(otherEnd, msgs);
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
			case Openapi3Package.COMPONENTS__SCHEMAS:
				if (coreType) return getSchemas();
				else return getSchemas().map();
			case Openapi3Package.COMPONENTS__RESPONSES:
				if (coreType) return getResponses();
				else return getResponses().map();
			case Openapi3Package.COMPONENTS__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case Openapi3Package.COMPONENTS__EXAMPLES:
				if (coreType) return getExamples();
				else return getExamples().map();
			case Openapi3Package.COMPONENTS__REQUEST_BODIES:
				if (coreType) return getRequestBodies();
				else return getRequestBodies().map();
			case Openapi3Package.COMPONENTS__SECURITY_SCHEMES:
				if (coreType) return getSecuritySchemes();
				else return getSecuritySchemes().map();
			case Openapi3Package.COMPONENTS__LINKS:
				if (coreType) return getLinks();
				else return getLinks().map();
			case Openapi3Package.COMPONENTS__CALL_BACKS:
				if (coreType) return getCallBacks();
				else return getCallBacks().map();
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
			case Openapi3Package.COMPONENTS__SCHEMAS:
				((EStructuralFeature.Setting)getSchemas()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__RESPONSES:
				((EStructuralFeature.Setting)getResponses()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__EXAMPLES:
				((EStructuralFeature.Setting)getExamples()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__REQUEST_BODIES:
				((EStructuralFeature.Setting)getRequestBodies()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__SECURITY_SCHEMES:
				((EStructuralFeature.Setting)getSecuritySchemes()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__LINKS:
				((EStructuralFeature.Setting)getLinks()).set(newValue);
				return;
			case Openapi3Package.COMPONENTS__CALL_BACKS:
				((EStructuralFeature.Setting)getCallBacks()).set(newValue);
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
			case Openapi3Package.COMPONENTS__SCHEMAS:
				getSchemas().clear();
				return;
			case Openapi3Package.COMPONENTS__RESPONSES:
				getResponses().clear();
				return;
			case Openapi3Package.COMPONENTS__PARAMETERS:
				getParameters().clear();
				return;
			case Openapi3Package.COMPONENTS__EXAMPLES:
				getExamples().clear();
				return;
			case Openapi3Package.COMPONENTS__REQUEST_BODIES:
				getRequestBodies().clear();
				return;
			case Openapi3Package.COMPONENTS__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				return;
			case Openapi3Package.COMPONENTS__LINKS:
				getLinks().clear();
				return;
			case Openapi3Package.COMPONENTS__CALL_BACKS:
				getCallBacks().clear();
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
			case Openapi3Package.COMPONENTS__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case Openapi3Package.COMPONENTS__RESPONSES:
				return responses != null && !responses.isEmpty();
			case Openapi3Package.COMPONENTS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Openapi3Package.COMPONENTS__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case Openapi3Package.COMPONENTS__REQUEST_BODIES:
				return requestBodies != null && !requestBodies.isEmpty();
			case Openapi3Package.COMPONENTS__SECURITY_SCHEMES:
				return securitySchemes != null && !securitySchemes.isEmpty();
			case Openapi3Package.COMPONENTS__LINKS:
				return links != null && !links.isEmpty();
			case Openapi3Package.COMPONENTS__CALL_BACKS:
				return callBacks != null && !callBacks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentsImpl
