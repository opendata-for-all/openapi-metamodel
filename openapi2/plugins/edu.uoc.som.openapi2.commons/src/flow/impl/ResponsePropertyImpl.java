/**
 */
package flow.impl;

import edu.uoc.som.openapi2.Property;

import flow.FlowPackage;
import flow.ResponseProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flow.impl.ResponsePropertyImpl#getSchemaProperty <em>Schema Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsePropertyImpl extends OutputPropertyImpl implements ResponseProperty {
	/**
	 * The cached value of the '{@link #getSchemaProperty() <em>Schema Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaProperty()
	 * @generated
	 * @ordered
	 */
	protected Property schemaProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.RESPONSE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getSchemaProperty() {
		if (schemaProperty != null && schemaProperty.eIsProxy()) {
			InternalEObject oldSchemaProperty = (InternalEObject)schemaProperty;
			schemaProperty = (Property)eResolveProxy(oldSchemaProperty);
			if (schemaProperty != oldSchemaProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY, oldSchemaProperty, schemaProperty));
			}
		}
		return schemaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetSchemaProperty() {
		return schemaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaProperty(Property newSchemaProperty) {
		Property oldSchemaProperty = schemaProperty;
		schemaProperty = newSchemaProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY, oldSchemaProperty, schemaProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY:
				if (resolve) return getSchemaProperty();
				return basicGetSchemaProperty();
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
			case FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY:
				setSchemaProperty((Property)newValue);
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
			case FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY:
				setSchemaProperty((Property)null);
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
			case FlowPackage.RESPONSE_PROPERTY__SCHEMA_PROPERTY:
				return schemaProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponsePropertyImpl
