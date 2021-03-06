/**
 */
package edu.uoc.som.openapi2.mapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi2.mapping.OpenAPI2MappingFactory
 * @model kind="package"
 * @generated
 */
public interface OpenAPI2MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://som.uoc.edu/openapi/2.0.0/mapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenAPI2MappingPackage eINSTANCE = edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.mapping.impl.PropertyToParameterImpl <em>Property To Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.mapping.impl.PropertyToParameterImpl
	 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getPropertyToParameter()
	 * @generated
	 */
	int PROPERTY_TO_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PARAMETER__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PARAMETER__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Property To Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property To Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.mapping.impl.PropertyToPropertyImpl <em>Property To Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.mapping.impl.PropertyToPropertyImpl
	 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getPropertyToProperty()
	 * @generated
	 */
	int PROPERTY_TO_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PROPERTY__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PROPERTY__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Property To Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property To Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TO_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.mapping.impl.MappingImpl
	 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Property To Parameter Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS = 0;

	/**
	 * The feature id for the '<em><b>Property To Property Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__PROPERTY_TO_PROPERTY_MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.mapping.PropertyToParameter <em>Property To Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property To Parameter</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToParameter
	 * @generated
	 */
	EClass getPropertyToParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.mapping.PropertyToParameter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToParameter#getSource()
	 * @see #getPropertyToParameter()
	 * @generated
	 */
	EReference getPropertyToParameter_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.mapping.PropertyToParameter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToParameter#getTarget()
	 * @see #getPropertyToParameter()
	 * @generated
	 */
	EReference getPropertyToParameter_Target();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.mapping.PropertyToProperty <em>Property To Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property To Property</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToProperty
	 * @generated
	 */
	EClass getPropertyToProperty();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToProperty#getSource()
	 * @see #getPropertyToProperty()
	 * @generated
	 */
	EReference getPropertyToProperty_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.mapping.PropertyToProperty#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.uoc.som.openapi2.mapping.PropertyToProperty#getTarget()
	 * @see #getPropertyToProperty()
	 * @generated
	 */
	EReference getPropertyToProperty_Target();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see edu.uoc.som.openapi2.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.mapping.Mapping#getPropertyToParameterMappings <em>Property To Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property To Parameter Mappings</em>'.
	 * @see edu.uoc.som.openapi2.mapping.Mapping#getPropertyToParameterMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_PropertyToParameterMappings();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.mapping.Mapping#getPropertyToPropertyMappings <em>Property To Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property To Property Mappings</em>'.
	 * @see edu.uoc.som.openapi2.mapping.Mapping#getPropertyToPropertyMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_PropertyToPropertyMappings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenAPI2MappingFactory getOpenAPI2MappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.mapping.impl.PropertyToParameterImpl <em>Property To Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.mapping.impl.PropertyToParameterImpl
		 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getPropertyToParameter()
		 * @generated
		 */
		EClass PROPERTY_TO_PARAMETER = eINSTANCE.getPropertyToParameter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TO_PARAMETER__SOURCE = eINSTANCE.getPropertyToParameter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TO_PARAMETER__TARGET = eINSTANCE.getPropertyToParameter_Target();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.mapping.impl.PropertyToPropertyImpl <em>Property To Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.mapping.impl.PropertyToPropertyImpl
		 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getPropertyToProperty()
		 * @generated
		 */
		EClass PROPERTY_TO_PROPERTY = eINSTANCE.getPropertyToProperty();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TO_PROPERTY__SOURCE = eINSTANCE.getPropertyToProperty_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TO_PROPERTY__TARGET = eINSTANCE.getPropertyToProperty_Target();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.mapping.impl.MappingImpl
		 * @see edu.uoc.som.openapi2.mapping.impl.OpenAPI2MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Property To Parameter Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PROPERTY_TO_PARAMETER_MAPPINGS = eINSTANCE.getMapping_PropertyToParameterMappings();

		/**
		 * The meta object literal for the '<em><b>Property To Property Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__PROPERTY_TO_PROPERTY_MAPPINGS = eINSTANCE.getMapping_PropertyToPropertyMappings();

	}

} //OpenAPI2MappingPackage
