/**
 */
package edu.uoc.som.openapi.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.uoc.som.openapi.ExternalDocs;
import edu.uoc.som.openapi.ExternalDocsContext;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ParameterContext;
import edu.uoc.som.openapi.ParameterLocation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.ResponseDeclaringContext;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemeType;
import edu.uoc.som.openapi.SecurityContext;
import edu.uoc.som.openapi.SecurityRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.OperationImpl#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ParameterDeclaringContextImpl implements Operation {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

	/**
	 * The cached value of the '{@link #getTagReferences() <em>Tag References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tagReferences;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consumes;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> produces;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> responses;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, OpenAPIPackage.OPERATION__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, OpenAPIPackage.OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDocs getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(ExternalDocs newExternalDocs, NotificationChain msgs) {
		ExternalDocs oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDocs(ExternalDocs newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTagReferences() {
		if (tagReferences == null) {
			tagReferences = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIPackage.OPERATION__TAG_REFERENCES);
		}
		return tagReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIPackage.OPERATION__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProduces() {
		if (produces == null) {
			produces = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIPackage.OPERATION__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectResolvingEList<Response>(Response.class, this, OpenAPIPackage.OPERATION__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, OpenAPIPackage.OPERATION__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeprecated(Boolean newDeprecated) {
		Boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.OPERATION__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullPath() {
		return ((Path)eContainer).getApi().getHost()
						+ ((Path)eContainer).getApi().getBasePath() + ((Path)eContainer).getRelativePath();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getConsumedSchema() {
		for(Parameter parameter: getParameters()) {
			if(parameter.getLocation().equals(ParameterLocation.BODY))
				if(parameter.getSchema().getType().equals(JSONDataType.ARRAY))
					return parameter.getSchema().getItems();
					else
						return parameter.getSchema();
			}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getProducedSchema() {
		for(Response response: getResponses()) {
			if((response.getCode().equals("200") ||response.getCode().equals("201"))   && (response.getSchema()!= null && response.getSchema().getType().equals(JSONDataType.ARRAY))) {
				return response.getSchema().getItems();
			
			}
			if((response.getCode().equals("200") ||response.getCode().equals("201")) && (response.getSchema()!= null && response.getSchema().getType().equals(JSONDataType.OBJECT))) {
				return response.getSchema();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean IsProducingList() {
		for (Response response : getResponses()) {
			if ((response.getCode().equals("200") || response.getCode().equals("201"))
					&& (response.getSchema() != null && response.getSchema().getType().equals(JSONDataType.ARRAY))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		Path path = ((Path)eContainer);
		if(path.getGet()!= null && path.getGet().equals(this))
			return "GET";
		if(path.getPost()!= null && path.getPost().equals(this))
			return "POST";
		if(path.getPut()!= null && path.getPut().equals(this))
			return "PUT";
		if(path.getDelete()!=null && path.getDelete().equals(this))
			return "DELETE";
		if(path.getOptions()!= null && path.getOptions().equals(this))
			return "OPTIONS";
		if(path.getHead()!= null && path.getHead().equals(this))
			return "HEAD";
		if(path.getPatch()!=null && path.getPatch().equals(this))
			return "PATCH";
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.OPERATION__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.OPERATION__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
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
			case OpenAPIPackage.OPERATION__SECURITY:
				return getSecurity();
			case OpenAPIPackage.OPERATION__PARAMETERS:
				return getParameters();
			case OpenAPIPackage.OPERATION__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenAPIPackage.OPERATION__TAG_REFERENCES:
				return getTagReferences();
			case OpenAPIPackage.OPERATION__SUMMARY:
				return getSummary();
			case OpenAPIPackage.OPERATION__DESCRIPTION:
				return getDescription();
			case OpenAPIPackage.OPERATION__OPERATION_ID:
				return getOperationId();
			case OpenAPIPackage.OPERATION__CONSUMES:
				return getConsumes();
			case OpenAPIPackage.OPERATION__PRODUCES:
				return getProduces();
			case OpenAPIPackage.OPERATION__RESPONSES:
				return getResponses();
			case OpenAPIPackage.OPERATION__SCHEMES:
				return getSchemes();
			case OpenAPIPackage.OPERATION__DEPRECATED:
				return getDeprecated();
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
			case OpenAPIPackage.OPERATION__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case OpenAPIPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OpenAPIPackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenAPIPackage.OPERATION__TAG_REFERENCES:
				getTagReferences().clear();
				getTagReferences().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIPackage.OPERATION__SUMMARY:
				setSummary((String)newValue);
				return;
			case OpenAPIPackage.OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIPackage.OPERATION__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case OpenAPIPackage.OPERATION__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIPackage.OPERATION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIPackage.OPERATION__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case OpenAPIPackage.OPERATION__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case OpenAPIPackage.OPERATION__DEPRECATED:
				setDeprecated((Boolean)newValue);
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
			case OpenAPIPackage.OPERATION__SECURITY:
				getSecurity().clear();
				return;
			case OpenAPIPackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case OpenAPIPackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenAPIPackage.OPERATION__TAG_REFERENCES:
				getTagReferences().clear();
				return;
			case OpenAPIPackage.OPERATION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case OpenAPIPackage.OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIPackage.OPERATION__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case OpenAPIPackage.OPERATION__CONSUMES:
				getConsumes().clear();
				return;
			case OpenAPIPackage.OPERATION__PRODUCES:
				getProduces().clear();
				return;
			case OpenAPIPackage.OPERATION__RESPONSES:
				getResponses().clear();
				return;
			case OpenAPIPackage.OPERATION__SCHEMES:
				getSchemes().clear();
				return;
			case OpenAPIPackage.OPERATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
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
			case OpenAPIPackage.OPERATION__SECURITY:
				return security != null && !security.isEmpty();
			case OpenAPIPackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OpenAPIPackage.OPERATION__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenAPIPackage.OPERATION__TAG_REFERENCES:
				return tagReferences != null && !tagReferences.isEmpty();
			case OpenAPIPackage.OPERATION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case OpenAPIPackage.OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIPackage.OPERATION__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case OpenAPIPackage.OPERATION__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case OpenAPIPackage.OPERATION__PRODUCES:
				return produces != null && !produces.isEmpty();
			case OpenAPIPackage.OPERATION__RESPONSES:
				return responses != null && !responses.isEmpty();
			case OpenAPIPackage.OPERATION__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case OpenAPIPackage.OPERATION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SecurityContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.OPERATION__SECURITY: return OpenAPIPackage.SECURITY_CONTEXT__SECURITY;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.OPERATION__PARAMETERS: return OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.OPERATION__EXTERNAL_DOCS: return OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseDeclaringContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SecurityContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.SECURITY_CONTEXT__SECURITY: return OpenAPIPackage.OPERATION__SECURITY;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS: return OpenAPIPackage.OPERATION__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return OpenAPIPackage.OPERATION__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseDeclaringContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenAPIPackage.OPERATION___GET_FULL_PATH:
				return getFullPath();
			case OpenAPIPackage.OPERATION___GET_CONSUMED_SCHEMA:
				return getConsumedSchema();
			case OpenAPIPackage.OPERATION___GET_PRODUCED_SCHEMA:
				return getProducedSchema();
			case OpenAPIPackage.OPERATION___IS_PRODUCING_LIST:
				return IsProducingList();
			case OpenAPIPackage.OPERATION___GET_METHOD:
				return getMethod();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (tagReferences: ");
		result.append(tagReferences);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", operationId: ");
		result.append(operationId);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", produces: ");
		result.append(produces);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
