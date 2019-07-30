/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Encoding;
import edu.uoc.som.openapi3.Example;
import edu.uoc.som.openapi3.MediaType;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Schema;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.MediaTypeImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.MediaTypeImpl#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.MediaTypeImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.MediaTypeImpl#getEncoding <em>Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaTypeImpl extends MinimalEObjectImpl.Container implements MediaType {
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
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, Example>> examples;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, Encoding>> encoding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.MEDIA_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Openapi3Package.MEDIA_TYPE__SCHEMA, oldSchema, schema));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.MEDIA_TYPE__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.MEDIA_TYPE__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, Example>> getExamples() {
		if (examples == null) {
			examples = new EObjectResolvingEList<Map.Entry<String, Example>>(Entry.class, this, Openapi3Package.MEDIA_TYPE__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, Encoding>> getEncoding() {
		if (encoding == null) {
			encoding = new EObjectResolvingEList<Map.Entry<String, Encoding>>(Entry.class, this, Openapi3Package.MEDIA_TYPE__ENCODING);
		}
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openapi3Package.MEDIA_TYPE__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case Openapi3Package.MEDIA_TYPE__EXAMPLE:
				return getExample();
			case Openapi3Package.MEDIA_TYPE__EXAMPLES:
				return getExamples();
			case Openapi3Package.MEDIA_TYPE__ENCODING:
				return getEncoding();
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
			case Openapi3Package.MEDIA_TYPE__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case Openapi3Package.MEDIA_TYPE__EXAMPLE:
				setExample((String)newValue);
				return;
			case Openapi3Package.MEDIA_TYPE__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends Map.Entry<String, Example>>)newValue);
				return;
			case Openapi3Package.MEDIA_TYPE__ENCODING:
				getEncoding().clear();
				getEncoding().addAll((Collection<? extends Map.Entry<String, Encoding>>)newValue);
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
			case Openapi3Package.MEDIA_TYPE__SCHEMA:
				setSchema((Schema)null);
				return;
			case Openapi3Package.MEDIA_TYPE__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case Openapi3Package.MEDIA_TYPE__EXAMPLES:
				getExamples().clear();
				return;
			case Openapi3Package.MEDIA_TYPE__ENCODING:
				getEncoding().clear();
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
			case Openapi3Package.MEDIA_TYPE__SCHEMA:
				return schema != null;
			case Openapi3Package.MEDIA_TYPE__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case Openapi3Package.MEDIA_TYPE__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case Openapi3Package.MEDIA_TYPE__ENCODING:
				return encoding != null && !encoding.isEmpty();
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
		result.append(" (example: ");
		result.append(example);
		result.append(')');
		return result.toString();
	}

} //MediaTypeImpl
