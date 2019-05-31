/**
 */
package edu.uoc.som.openapi.impl;

import edu.uoc.som.openapi.Example;
import edu.uoc.som.openapi.Header;
import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ReferenceableElement;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.ResponseDeclaringContext;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemaContext;
import edu.uoc.som.openapi.SecurityScheme;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.impl.ResponseImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends SchemaDeclaringContextImpl implements Response {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Example> examples;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclaringContext() <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringContext()
	 * @generated
	 * @ordered
	 */
	protected ResponseDeclaringContext declaringContext;

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
		return OpenAPIPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (Schema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.RESPONSE__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.RESPONSE__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.RESPONSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<Header>(Header.class, this, OpenAPIPackage.RESPONSE__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Example> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<Example>(Example.class, this, OpenAPIPackage.RESPONSE__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.RESPONSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseDeclaringContext getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (ResponseDeclaringContext)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.RESPONSE__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDeclaringContext basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaringContext(ResponseDeclaringContext newDeclaringContext) {
		ResponseDeclaringContext oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.RESPONSE__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
				if(this instanceof Schema)
					return "#/definitions/"+referenceName;
				if(this instanceof Parameter)
					return "#/parameters/"+referenceName;
				if(this instanceof Response)
					return "#/responses/"+referenceName;
				if(this instanceof SecurityScheme)
					return "#/securityDefinitions/"+referenceName;
				return "unkown";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.RESPONSE__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.RESPONSE__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.RESPONSE__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
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
			case OpenAPIPackage.RESPONSE__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case OpenAPIPackage.RESPONSE__REFERENCE_NAME:
				return getReferenceName();
			case OpenAPIPackage.RESPONSE__DESCRIPTION:
				return getDescription();
			case OpenAPIPackage.RESPONSE__HEADERS:
				return getHeaders();
			case OpenAPIPackage.RESPONSE__EXAMPLES:
				return getExamples();
			case OpenAPIPackage.RESPONSE__CODE:
				return getCode();
			case OpenAPIPackage.RESPONSE__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
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
			case OpenAPIPackage.RESPONSE__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case OpenAPIPackage.RESPONSE__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case OpenAPIPackage.RESPONSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIPackage.RESPONSE__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
				return;
			case OpenAPIPackage.RESPONSE__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends Example>)newValue);
				return;
			case OpenAPIPackage.RESPONSE__CODE:
				setCode((String)newValue);
				return;
			case OpenAPIPackage.RESPONSE__DECLARING_CONTEXT:
				setDeclaringContext((ResponseDeclaringContext)newValue);
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
			case OpenAPIPackage.RESPONSE__SCHEMA:
				setSchema((Schema)null);
				return;
			case OpenAPIPackage.RESPONSE__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case OpenAPIPackage.RESPONSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIPackage.RESPONSE__HEADERS:
				getHeaders().clear();
				return;
			case OpenAPIPackage.RESPONSE__EXAMPLES:
				getExamples().clear();
				return;
			case OpenAPIPackage.RESPONSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case OpenAPIPackage.RESPONSE__DECLARING_CONTEXT:
				setDeclaringContext((ResponseDeclaringContext)null);
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
			case OpenAPIPackage.RESPONSE__SCHEMA:
				return schema != null;
			case OpenAPIPackage.RESPONSE__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case OpenAPIPackage.RESPONSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIPackage.RESPONSE__HEADERS:
				return headers != null && !headers.isEmpty();
			case OpenAPIPackage.RESPONSE__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case OpenAPIPackage.RESPONSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case OpenAPIPackage.RESPONSE__DECLARING_CONTEXT:
				return declaringContext != null;
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
		if (baseClass == SchemaContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.RESPONSE__SCHEMA: return OpenAPIPackage.SCHEMA_CONTEXT__SCHEMA;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.RESPONSE__REFERENCE_NAME: return OpenAPIPackage.REFERENCEABLE_ELEMENT__REFERENCE_NAME;
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
		if (baseClass == SchemaContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.SCHEMA_CONTEXT__SCHEMA: return OpenAPIPackage.RESPONSE__SCHEMA;
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.REFERENCEABLE_ELEMENT__REFERENCE_NAME: return OpenAPIPackage.RESPONSE__REFERENCE_NAME;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == SchemaContext.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceableElement.class) {
			switch (baseOperationID) {
				case OpenAPIPackage.REFERENCEABLE_ELEMENT___GET_REF: return OpenAPIPackage.RESPONSE___GET_REF;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenAPIPackage.RESPONSE___GET_REF:
				return getRef();
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
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(", description: ");
		result.append(description);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
