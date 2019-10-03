/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.Mapping;
import mapping.MappingPackage;
import mapping.PropertyToParameter;
import mapping.PropertyToProperty;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.MappingImpl#getPropertyToParameterMappings <em>Property To Parameter Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingImpl#getPropertyToPropertyMapping <em>Property To Property Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getPropertyToParameterMappings() <em>Property To Parameter Mappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyToParameterMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyToParameter> propertyToParameterMappings;

	/**
	 * The cached value of the '{@link #getPropertyToPropertyMapping() <em>Property To Property Mapping</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyToPropertyMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyToProperty> propertyToPropertyMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyToParameter> getPropertyToParameterMappings() {
		if (propertyToParameterMappings == null) {
			propertyToParameterMappings = new EObjectResolvingEList<PropertyToParameter>(PropertyToParameter.class, this, MappingPackage.MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS);
		}
		return propertyToParameterMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyToProperty> getPropertyToPropertyMapping() {
		if (propertyToPropertyMapping == null) {
			propertyToPropertyMapping = new EObjectResolvingEList<PropertyToProperty>(PropertyToProperty.class, this, MappingPackage.MAPPING__PROPERTY_TO_PROPERTY_MAPPING);
		}
		return propertyToPropertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS:
				return getPropertyToParameterMappings();
			case MappingPackage.MAPPING__PROPERTY_TO_PROPERTY_MAPPING:
				return getPropertyToPropertyMapping();
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
			case MappingPackage.MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS:
				getPropertyToParameterMappings().clear();
				getPropertyToParameterMappings().addAll((Collection<? extends PropertyToParameter>)newValue);
				return;
			case MappingPackage.MAPPING__PROPERTY_TO_PROPERTY_MAPPING:
				getPropertyToPropertyMapping().clear();
				getPropertyToPropertyMapping().addAll((Collection<? extends PropertyToProperty>)newValue);
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
			case MappingPackage.MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS:
				getPropertyToParameterMappings().clear();
				return;
			case MappingPackage.MAPPING__PROPERTY_TO_PROPERTY_MAPPING:
				getPropertyToPropertyMapping().clear();
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
			case MappingPackage.MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS:
				return propertyToParameterMappings != null && !propertyToParameterMappings.isEmpty();
			case MappingPackage.MAPPING__PROPERTY_TO_PROPERTY_MAPPING:
				return propertyToPropertyMapping != null && !propertyToPropertyMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
