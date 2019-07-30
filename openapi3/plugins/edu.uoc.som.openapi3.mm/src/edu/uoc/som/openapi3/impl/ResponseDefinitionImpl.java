/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Example;
import edu.uoc.som.openapi3.Header;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.ResponseContainer;
import edu.uoc.som.openapi3.ResponseDefinition;
import edu.uoc.som.openapi3.Schema;
import edu.uoc.som.openapi3.SchemaContext;

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
 * An implementation of the model object '<em><b>Response Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseDefinitionImpl extends SchemaContainerImpl implements ResponseDefinition {
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
	protected ResponseContainer declaringContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.RESPONSE_DEFINITION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi3Package.RESPONSE_DEFINITION__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE_DEFINITION__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<Header>(Header.class, this, Openapi3Package.RESPONSE_DEFINITION__HEADERS);
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
			examples = new EObjectContainmentEList<Example>(Example.class, this, Openapi3Package.RESPONSE_DEFINITION__EXAMPLES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE_DEFINITION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseContainer getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (ResponseContainer)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseContainer basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaringContext(ResponseContainer newDeclaringContext) {
		ResponseContainer oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi3Package.RESPONSE_DEFINITION__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case Openapi3Package.RESPONSE_DEFINITION__EXAMPLES:
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
			case Openapi3Package.RESPONSE_DEFINITION__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case Openapi3Package.RESPONSE_DEFINITION__DESCRIPTION:
				return getDescription();
			case Openapi3Package.RESPONSE_DEFINITION__HEADERS:
				return getHeaders();
			case Openapi3Package.RESPONSE_DEFINITION__EXAMPLES:
				return getExamples();
			case Openapi3Package.RESPONSE_DEFINITION__CODE:
				return getCode();
			case Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT:
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
			case Openapi3Package.RESPONSE_DEFINITION__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends Example>)newValue);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__CODE:
				setCode((String)newValue);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT:
				setDeclaringContext((ResponseContainer)newValue);
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
			case Openapi3Package.RESPONSE_DEFINITION__SCHEMA:
				setSchema((Schema)null);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__HEADERS:
				getHeaders().clear();
				return;
			case Openapi3Package.RESPONSE_DEFINITION__EXAMPLES:
				getExamples().clear();
				return;
			case Openapi3Package.RESPONSE_DEFINITION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT:
				setDeclaringContext((ResponseContainer)null);
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
			case Openapi3Package.RESPONSE_DEFINITION__SCHEMA:
				return schema != null;
			case Openapi3Package.RESPONSE_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Openapi3Package.RESPONSE_DEFINITION__HEADERS:
				return headers != null && !headers.isEmpty();
			case Openapi3Package.RESPONSE_DEFINITION__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case Openapi3Package.RESPONSE_DEFINITION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Openapi3Package.RESPONSE_DEFINITION__DECLARING_CONTEXT:
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
				case Openapi3Package.RESPONSE_DEFINITION__SCHEMA: return Openapi3Package.SCHEMA_CONTEXT__SCHEMA;
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
				case Openapi3Package.SCHEMA_CONTEXT__SCHEMA: return Openapi3Package.RESPONSE_DEFINITION__SCHEMA;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ResponseDefinitionImpl
