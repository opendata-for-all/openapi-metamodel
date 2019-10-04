/**
 */
package edu.uoc.som.openapi2.mapping.impl;

import edu.uoc.som.openapi2.mapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPI2MappingFactoryImpl extends EFactoryImpl implements OpenAPI2MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenAPI2MappingFactory init() {
		try {
			OpenAPI2MappingFactory theOpenAPI2MappingFactory = (OpenAPI2MappingFactory)EPackage.Registry.INSTANCE.getEFactory(OpenAPI2MappingPackage.eNS_URI);
			if (theOpenAPI2MappingFactory != null) {
				return theOpenAPI2MappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenAPI2MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPI2MappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenAPI2MappingPackage.PROPERTY_TO_PARAMETER: return createPropertyToParameter();
			case OpenAPI2MappingPackage.PROPERTY_TO_PROPERTY: return createPropertyToProperty();
			case OpenAPI2MappingPackage.MAPPING: return createMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyToParameter createPropertyToParameter() {
		PropertyToParameterImpl propertyToParameter = new PropertyToParameterImpl();
		return propertyToParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyToProperty createPropertyToProperty() {
		PropertyToPropertyImpl propertyToProperty = new PropertyToPropertyImpl();
		return propertyToProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAPI2MappingPackage getOpenAPI2MappingPackage() {
		return (OpenAPI2MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenAPI2MappingPackage getPackage() {
		return OpenAPI2MappingPackage.eINSTANCE;
	}

} //OpenAPI2MappingFactoryImpl
