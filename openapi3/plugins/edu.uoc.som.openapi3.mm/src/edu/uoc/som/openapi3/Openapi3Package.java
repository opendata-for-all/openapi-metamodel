/**
 */
package edu.uoc.som.openapi3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see edu.uoc.som.openapi3.Openapi3Factory
 * @model kind="package"
 * @generated
 */
public interface Openapi3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openapi3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://som.uoc.edu/openapi/3.0.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openapi3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Openapi3Package eINSTANCE = edu.uoc.som.openapi3.impl.Openapi3PackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.JSONSchemaSubsetImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getJSONSchemaSubset()
	 * @generated
	 */
	int JSON_SCHEMA_SUBSET = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAXIMUM = 3;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM = 4;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MINIMUM = 5;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM = 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAX_LENGTH = 7;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MIN_LENGTH = 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAX_ITEMS = 10;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MIN_ITEMS = 11;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__UNIQUE_ITEMS = 12;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__ENUM = 13;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__DEFAULT = 14;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MULTIPLE_OF = 15;

	/**
	 * The number of structural features of the '<em>JSON Schema Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>JSON Schema Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ContainedCollectionsImpl <em>Contained Collections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ContainedCollectionsImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getContainedCollections()
	 * @generated
	 */
	int CONTAINED_COLLECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Paramters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_COLLECTIONS__PARAMTERS = 0;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_COLLECTIONS__SCHEMAS = 1;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_COLLECTIONS__RESPONSES = 2;

	/**
	 * The number of structural features of the '<em>Contained Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_COLLECTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contained Collections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_COLLECTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ParameterContainerImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterContainer()
	 * @generated
	 */
	int PARAMETER_CONTAINER = 19;

	/**
	 * The number of structural features of the '<em>Parameter Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.APIImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getAPI()
	 * @generated
	 */
	int API = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PARAMETERS = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__EXTERNAL_DOCS = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Openapi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__OPENAPI = PARAMETER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__INFO = PARAMETER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HOST = PARAMETER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_PATH = PARAMETER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SCHEMES = PARAMETER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CONSUMES = PARAMETER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PRODUCES = PARAMETER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PATHS = PARAMETER_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TAGS = PARAMETER_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__COMPONENTS = PARAMETER_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SECURITY = PARAMETER_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SERVERS = PARAMETER_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_ALL_OPERATIONS = PARAMETER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Schema By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_SCHEMA_BY_REFERENCE__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Operation By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_OPERATION_BY_ID__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path By Relative Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PATH_BY_RELATIVE_PATH__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parameter By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PARAMETER_BY_REFERENCE__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Response Definition By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = PARAMETER_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.InfoImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Terms Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__TERMS_OF_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__CONTACT = 3;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__VERSION = 5;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ContactImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__URL = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 2;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.LicenseImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 1;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.PathImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getPath()
	 * @generated
	 */
	int PATH = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PARAMETERS = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RELATIVE_PATH = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__GET = PARAMETER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PUT = PARAMETER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__POST = PARAMETER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DELETE = PARAMETER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__OPTIONS = PARAMETER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HEAD = PARAMETER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATCH = PARAMETER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Api</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__API = PARAMETER_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SERVERS = PARAMETER_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Operation By HTTP Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_OPERATION_BY_HTTP_METHOD__STRING = PARAMETER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = PARAMETER_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.OperationImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTERNAL_DOCS = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tag References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TAG_REFERENCES = PARAMETER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUMMARY = PARAMETER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = PARAMETER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ID = PARAMETER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONSUMES = PARAMETER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRODUCES = PARAMETER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESPONSES = PARAMETER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SCHEMES = PARAMETER_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEPRECATED = PARAMETER_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SECURITY = PARAMETER_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Request Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REQUEST_BODY = PARAMETER_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CALLBACKS = PARAMETER_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SERVERS = PARAMETER_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Full Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_FULL_PATH = PARAMETER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get HTTP Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_HTTP_METHOD = PARAMETER_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = PARAMETER_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ExternalDocsImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExternalDocs()
	 * @generated
	 */
	int EXTERNAL_DOCS = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__URL = 1;

	/**
	 * The number of structural features of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SchemaContainerImpl <em>Schema Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SchemaContainerImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaContainer()
	 * @generated
	 */
	int SCHEMA_CONTAINER = 20;

	/**
	 * The number of structural features of the '<em>Schema Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ParameterImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = SCHEMA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FORMAT = SCHEMA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = SCHEMA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAXIMUM = SCHEMA_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUSIVE_MAXIMUM = SCHEMA_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MINIMUM = SCHEMA_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUSIVE_MINIMUM = SCHEMA_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX_LENGTH = SCHEMA_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN_LENGTH = SCHEMA_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PATTERN = SCHEMA_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX_ITEMS = SCHEMA_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN_ITEMS = SCHEMA_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIQUE_ITEMS = SCHEMA_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENUM = SCHEMA_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = SCHEMA_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_OF = SCHEMA_CONTAINER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLLECTION_FORMAT = SCHEMA_CONTAINER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ITEMS = SCHEMA_CONTAINER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SCHEMA_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOCATION = SCHEMA_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = SCHEMA_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOW_EMPLY_VALUE = SCHEMA_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DECLARING_CONTEXT = SCHEMA_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXAMPLE = SCHEMA_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__STYLE = SCHEMA_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Explode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXPLODE = SCHEMA_CONTAINER_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Allow Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOW_RESERVED = SCHEMA_CONTAINER_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXAMPLES = SCHEMA_CONTAINER_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SCHEMA = SCHEMA_CONTAINER_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTENT = SCHEMA_CONTAINER_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SCHEMA_CONTAINER_FEATURE_COUNT + 30;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SCHEMA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ItemsDefinitionImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getItemsDefinition()
	 * @generated
	 */
	int ITEMS_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__TYPE = JSON_SCHEMA_SUBSET__TYPE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__FORMAT = JSON_SCHEMA_SUBSET__FORMAT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__DESCRIPTION = JSON_SCHEMA_SUBSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MAXIMUM = JSON_SCHEMA_SUBSET__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__EXCLUSIVE_MAXIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MINIMUM = JSON_SCHEMA_SUBSET__MINIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__EXCLUSIVE_MINIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MAX_LENGTH = JSON_SCHEMA_SUBSET__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MIN_LENGTH = JSON_SCHEMA_SUBSET__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__PATTERN = JSON_SCHEMA_SUBSET__PATTERN;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MAX_ITEMS = JSON_SCHEMA_SUBSET__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MIN_ITEMS = JSON_SCHEMA_SUBSET__MIN_ITEMS;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__UNIQUE_ITEMS = JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__ENUM = JSON_SCHEMA_SUBSET__ENUM;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__DEFAULT = JSON_SCHEMA_SUBSET__DEFAULT;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__MULTIPLE_OF = JSON_SCHEMA_SUBSET__MULTIPLE_OF;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__COLLECTION_FORMAT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION__ITEMS = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Items Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION_FEATURE_COUNT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Items Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_DEFINITION_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SchemaImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPE = JSON_SCHEMA_SUBSET__TYPE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FORMAT = JSON_SCHEMA_SUBSET__FORMAT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DESCRIPTION = JSON_SCHEMA_SUBSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAXIMUM = JSON_SCHEMA_SUBSET__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MAXIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINIMUM = JSON_SCHEMA_SUBSET__MINIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MINIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_LENGTH = JSON_SCHEMA_SUBSET__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_LENGTH = JSON_SCHEMA_SUBSET__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PATTERN = JSON_SCHEMA_SUBSET__PATTERN;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_ITEMS = JSON_SCHEMA_SUBSET__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_ITEMS = JSON_SCHEMA_SUBSET__MIN_ITEMS;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNIQUE_ITEMS = JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ENUM = JSON_SCHEMA_SUBSET__ENUM;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEFAULT = JSON_SCHEMA_SUBSET__DEFAULT;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MULTIPLE_OF = JSON_SCHEMA_SUBSET__MULTIPLE_OF;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXTERNAL_DOCS = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TITLE = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXAMPLE = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISCRIMINATOR = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__READ_ONLY = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ALL_OF = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ITEMS = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Additonal Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITONAL_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DECLARING_CONTEXT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Additonal Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITONAL_PROPERTIES_ALLOWED = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Property By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_PROPERTY_BY_NAME__STRING = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl <em>Response Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ResponseDefinitionImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseDefinition()
	 * @generated
	 */
	int RESPONSE_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__SCHEMA = SCHEMA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__DESCRIPTION = SCHEMA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__HEADERS = SCHEMA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__EXAMPLES = SCHEMA_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__CODE = SCHEMA_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__DECLARING_CONTEXT = SCHEMA_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Response Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_FEATURE_COUNT = SCHEMA_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Response Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_OPERATION_COUNT = SCHEMA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.HeaderImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TYPE = JSON_SCHEMA_SUBSET__TYPE;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__FORMAT = JSON_SCHEMA_SUBSET__FORMAT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DESCRIPTION = JSON_SCHEMA_SUBSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAXIMUM = JSON_SCHEMA_SUBSET__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__EXCLUSIVE_MAXIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MINIMUM = JSON_SCHEMA_SUBSET__MINIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__EXCLUSIVE_MINIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAX_LENGTH = JSON_SCHEMA_SUBSET__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MIN_LENGTH = JSON_SCHEMA_SUBSET__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__PATTERN = JSON_SCHEMA_SUBSET__PATTERN;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAX_ITEMS = JSON_SCHEMA_SUBSET__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MIN_ITEMS = JSON_SCHEMA_SUBSET__MIN_ITEMS;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__UNIQUE_ITEMS = JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ENUM = JSON_SCHEMA_SUBSET__ENUM;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DEFAULT = JSON_SCHEMA_SUBSET__DEFAULT;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MULTIPLE_OF = JSON_SCHEMA_SUBSET__MULTIPLE_OF;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COLLECTION_FORMAT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ITEMS = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ExternalDocsContextImpl <em>External Docs Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ExternalDocsContextImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExternalDocsContext()
	 * @generated
	 */
	int EXTERNAL_DOCS_CONTEXT = 24;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS = 0;

	/**
	 * The number of structural features of the '<em>External Docs Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External Docs Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.TagImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getTag()
	 * @generated
	 */
	int TAG = 14;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__EXTERNAL_DOCS = EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = EXTERNAL_DOCS_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = EXTERNAL_DOCS_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = EXTERNAL_DOCS_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = EXTERNAL_DOCS_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SecuritySchemeImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__NAME = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__FLOW = 4;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__AUTHORIZATION_URL = 5;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TOKEN_URL = 6;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCOPES = 7;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Get Security Scope By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME___GET_SECURITY_SCOPE_BY_NAME__STRING = 0;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ExampleImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 16;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>External Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__EXTERNAL_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.XMLElementImpl <em>XML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.XMLElementImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getXMLElement()
	 * @generated
	 */
	int XML_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__WRAPPED = 4;

	/**
	 * The number of structural features of the '<em>XML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>XML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SecurityScopeImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityScope()
	 * @generated
	 */
	int SECURITY_SCOPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Security Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ResponseContainerImpl <em>Response Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ResponseContainerImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseContainer()
	 * @generated
	 */
	int RESPONSE_CONTAINER = 21;

	/**
	 * The number of structural features of the '<em>Response Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CONTAINER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Response Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ParameterContextImpl <em>Parameter Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ParameterContextImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterContext()
	 * @generated
	 */
	int PARAMETER_CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTEXT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Parameter Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SchemaContextImpl <em>Schema Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SchemaContextImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaContext()
	 * @generated
	 */
	int SCHEMA_CONTEXT = 23;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_CONTEXT__SCHEMA = 0;

	/**
	 * The number of structural features of the '<em>Schema Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schema Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ArrayContextImpl <em>Array Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ArrayContextImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getArrayContext()
	 * @generated
	 */
	int ARRAY_CONTEXT = 25;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTEXT__COLLECTION_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTEXT__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Array Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SecurityRequirementImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 26;

	/**
	 * The feature id for the '<em><b>Security Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_SCOPES = 0;

	/**
	 * The feature id for the '<em><b>Security Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_SCHEME = 1;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.PropertyImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCHEMA = SCHEMA_CONTEXT__SCHEMA;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = SCHEMA_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = SCHEMA_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = SCHEMA_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ResponseImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 28;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = RESPONSE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_DEFINITION = RESPONSE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DEFAULT = RESPONSE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = RESPONSE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = RESPONSE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ServerImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 29;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__URL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ServerVariableEntryImpl <em>Server Variable Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ServerVariableEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerVariableEntry()
	 * @generated
	 */
	int SERVER_VARIABLE_ENTRY = 30;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Server Variable Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Server Variable Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ServerVariableImpl <em>Server Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ServerVariableImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerVariable()
	 * @generated
	 */
	int SERVER_VARIABLE = 31;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE__ENUM = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE__DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Server Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Server Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ComponentsImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 32;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__SCHEMAS = 0;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__RESPONSES = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__EXAMPLES = 3;

	/**
	 * The feature id for the '<em><b>Request Bodies</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__REQUEST_BODIES = 4;

	/**
	 * The feature id for the '<em><b>Security Schemes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__SECURITY_SCHEMES = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__LINKS = 6;

	/**
	 * The feature id for the '<em><b>Call Backs</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__CALL_BACKS = 7;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SchemaEntryImpl <em>Schema Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SchemaEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaEntry()
	 * @generated
	 */
	int SCHEMA_ENTRY = 33;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY__KEY = SCHEMA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY__VALUE = SCHEMA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Schema Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY_FEATURE_COUNT = SCHEMA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Schema Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_ENTRY_OPERATION_COUNT = SCHEMA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ResponseDefinitionEntryImpl <em>Response Definition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ResponseDefinitionEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseDefinitionEntry()
	 * @generated
	 */
	int RESPONSE_DEFINITION_ENTRY = 34;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Response Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ParameterEntryImpl <em>Parameter Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ParameterEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterEntry()
	 * @generated
	 */
	int PARAMETER_ENTRY = 35;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ExampleEntryImpl <em>Example Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ExampleEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExampleEntry()
	 * @generated
	 */
	int EXAMPLE_ENTRY = 36;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Example Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Example Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.RequestBodyEntryImpl <em>Request Body Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.RequestBodyEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRequestBodyEntry()
	 * @generated
	 */
	int REQUEST_BODY_ENTRY = 37;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Request Body Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Request Body Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.HeaderEntryImpl <em>Header Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.HeaderEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getHeaderEntry()
	 * @generated
	 */
	int HEADER_ENTRY = 38;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Header Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.SecuritySchemeEntryImpl <em>Security Scheme Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.SecuritySchemeEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecuritySchemeEntry()
	 * @generated
	 */
	int SECURITY_SCHEME_ENTRY = 39;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Security Scheme Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Scheme Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.LinkEntryImpl <em>Link Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.LinkEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getLinkEntry()
	 * @generated
	 */
	int LINK_ENTRY = 40;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Link Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.CallbackEntryImpl <em>Callback Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.CallbackEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCallbackEntry()
	 * @generated
	 */
	int CALLBACK_ENTRY = 41;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Callback Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Callback Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.RequestBodyImpl <em>Request Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.RequestBodyImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRequestBody()
	 * @generated
	 */
	int REQUEST_BODY = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY__REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Request Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Request Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.linkImpl <em>link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.linkImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getlink()
	 * @generated
	 */
	int LINK = 43;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SERVER = 1;

	/**
	 * The number of structural features of the '<em>link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.CallbackImpl <em>Callback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.CallbackImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCallback()
	 * @generated
	 */
	int CALLBACK = 44;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK__CALLBACKS = 0;

	/**
	 * The number of structural features of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Callback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ServerContainerImpl <em>Server Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ServerContainerImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerContainer()
	 * @generated
	 */
	int SERVER_CONTAINER = 45;

	/**
	 * The feature id for the '<em><b>Servers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONTAINER__SERVERS = 0;

	/**
	 * The number of structural features of the '<em>Server Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Server Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.MediaTypeImpl <em>Media Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.MediaTypeImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__EXAMPLE = 1;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__EXAMPLES = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE__ENCODING = 3;

	/**
	 * The number of structural features of the '<em>Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Media Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.MediaTypeEntryImpl <em>Media Type Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.MediaTypeEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getMediaTypeEntry()
	 * @generated
	 */
	int MEDIA_TYPE_ENTRY = 47;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Media Type Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Media Type Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_TYPE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.EncodingImpl <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.EncodingImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 48;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__CONTENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__HEADERS = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Explode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__EXPLODE = 3;

	/**
	 * The feature id for the '<em><b>Allow Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__ALLOW_RESERVED = 4;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.EncodingEntryImpl <em>Encoding Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.EncodingEntryImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getEncodingEntry()
	 * @generated
	 */
	int ENCODING_ENTRY = 49;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Encoding Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Encoding Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.RuntimeExpressionImpl <em>Runtime Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.RuntimeExpressionImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRuntimeExpression()
	 * @generated
	 */
	int RUNTIME_EXPRESSION = 50;

	/**
	 * The number of structural features of the '<em>Runtime Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runtime Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.impl.ExpressionToPathImpl <em>Expression To Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.impl.ExpressionToPathImpl
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExpressionToPath()
	 * @generated
	 */
	int EXPRESSION_TO_PATH = 51;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_PATH__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_PATH__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Expression To Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression To Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TO_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.SchemeType
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 52;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.ParameterLocation
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 53;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.CollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.CollectionFormat
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 54;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.OAuth2FlowType
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getOAuth2FlowType()
	 * @generated
	 */
	int OAUTH2_FLOW_TYPE = 55;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.APIKeyLocation <em>API Key Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.APIKeyLocation
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getAPIKeyLocation()
	 * @generated
	 */
	int API_KEY_LOCATION = 56;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.SecuritySchemeType
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecuritySchemeType()
	 * @generated
	 */
	int SECURITY_SCHEME_TYPE = 57;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi3.JSONDataType <em>JSON Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi3.JSONDataType
	 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getJSONDataType()
	 * @generated
	 */
	int JSON_DATA_TYPE = 58;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.JSONSchemaSubset <em>JSON Schema Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Schema Subset</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset
	 * @generated
	 */
	EClass getJSONSchemaSubset();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getType()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getFormat()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getDescription()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getExclusiveMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMaximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getExclusiveMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMaxLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMinLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getPattern()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMaxItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMinItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Items</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getUniqueItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_UniqueItems();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getEnum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Enum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getDefault()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Default();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Of</em>'.
	 * @see edu.uoc.som.openapi3.JSONSchemaSubset#getMultipleOf()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MultipleOf();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ContainedCollections <em>Contained Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Collections</em>'.
	 * @see edu.uoc.som.openapi3.ContainedCollections
	 * @generated
	 */
	EClass getContainedCollections();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ContainedCollections#getParamters <em>Paramters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramters</em>'.
	 * @see edu.uoc.som.openapi3.ContainedCollections#getParamters()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Paramters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ContainedCollections#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see edu.uoc.som.openapi3.ContainedCollections#getSchemas()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Schemas();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ContainedCollections#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi3.ContainedCollections#getResponses()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Responses();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see edu.uoc.som.openapi3.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.API#getOpenapi <em>Openapi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Openapi</em>'.
	 * @see edu.uoc.som.openapi3.API#getOpenapi()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Openapi();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.API#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see edu.uoc.som.openapi3.API#getInfo()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Info();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.API#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see edu.uoc.som.openapi3.API#getHost()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Host();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.API#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see edu.uoc.som.openapi3.API#getBasePath()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_BasePath();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.API#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.uoc.som.openapi3.API#getSchemes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Schemes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.API#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.uoc.som.openapi3.API#getConsumes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.API#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.uoc.som.openapi3.API#getProduces()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Produces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.API#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see edu.uoc.som.openapi3.API#getPaths()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Paths();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.API#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see edu.uoc.som.openapi3.API#getTags()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.API#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components</em>'.
	 * @see edu.uoc.som.openapi3.API#getComponents()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.API#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see edu.uoc.som.openapi3.API#getSecurity()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Security();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.API#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see edu.uoc.som.openapi3.API#getServers()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Servers();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getAllOperations() <em>Get All Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operations</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getAllOperations()
	 * @generated
	 */
	EOperation getAPI__GetAllOperations();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getSchemaByReference(java.lang.String) <em>Get Schema By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schema By Reference</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getSchemaByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetSchemaByReference__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getOperationById(java.lang.String) <em>Get Operation By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation By Id</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getOperationById(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetOperationById__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getPathByRelativePath(java.lang.String) <em>Get Path By Relative Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path By Relative Path</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getPathByRelativePath(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetPathByRelativePath__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getParameterByReference(java.lang.String) <em>Get Parameter By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter By Reference</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getParameterByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetParameterByReference__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.API#getResponseDefinitionByReference(java.lang.String) <em>Get Response Definition By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Response Definition By Reference</em>' operation.
	 * @see edu.uoc.som.openapi3.API#getResponseDefinitionByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetResponseDefinitionByReference__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see edu.uoc.som.openapi3.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Info#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.openapi3.Info#getTitle()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Info#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.Info#getDescription()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Info#getTermsOfService <em>Terms Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Of Service</em>'.
	 * @see edu.uoc.som.openapi3.Info#getTermsOfService()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_TermsOfService();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Info#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see edu.uoc.som.openapi3.Info#getContact()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Info#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see edu.uoc.som.openapi3.Info#getLicense()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_License();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Info#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see edu.uoc.som.openapi3.Info#getVersion()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Version();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see edu.uoc.som.openapi3.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi3.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Url();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see edu.uoc.som.openapi3.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see edu.uoc.som.openapi3.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi3.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see edu.uoc.som.openapi3.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Path#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see edu.uoc.som.openapi3.Path#getRelativePath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_RelativePath();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get</em>'.
	 * @see edu.uoc.som.openapi3.Path#getGet()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Get();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getPut <em>Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Put</em>'.
	 * @see edu.uoc.som.openapi3.Path#getPut()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Put();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see edu.uoc.som.openapi3.Path#getPost()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Post();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see edu.uoc.som.openapi3.Path#getDelete()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see edu.uoc.som.openapi3.Path#getOptions()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Options();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see edu.uoc.som.openapi3.Path#getHead()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Head();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Path#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patch</em>'.
	 * @see edu.uoc.som.openapi3.Path#getPatch()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Patch();

	/**
	 * Returns the meta object for the container reference '{@link edu.uoc.som.openapi3.Path#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api</em>'.
	 * @see edu.uoc.som.openapi3.Path#getApi()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Api();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.Path#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see edu.uoc.som.openapi3.Path#getServers()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Servers();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.Path#getOperationByHTTPMethod(java.lang.String) <em>Get Operation By HTTP Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation By HTTP Method</em>' operation.
	 * @see edu.uoc.som.openapi3.Path#getOperationByHTTPMethod(java.lang.String)
	 * @generated
	 */
	EOperation getPath__GetOperationByHTTPMethod__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edu.uoc.som.openapi3.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.Operation#getTagReferences <em>Tag References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag References</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getTagReferences()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_TagReferences();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Operation#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getSummary()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Summary();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Operation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getOperationId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationId();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.Operation#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getConsumes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getProduces()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Produces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.Operation#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getResponses()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Responses();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.Operation#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getSchemes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Schemes();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Operation#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getDeprecated()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Deprecated();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.Operation#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getSecurity()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Security();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Operation#getRequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request Body</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getRequestBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RequestBody();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Operation#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Callbacks</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getCallbacks()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Callbacks();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.Operation#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see edu.uoc.som.openapi3.Operation#getServers()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Servers();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.Operation#getFullPath() <em>Get Full Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Path</em>' operation.
	 * @see edu.uoc.som.openapi3.Operation#getFullPath()
	 * @generated
	 */
	EOperation getOperation__GetFullPath();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.Operation#getHTTPMethod() <em>Get HTTP Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get HTTP Method</em>' operation.
	 * @see edu.uoc.som.openapi3.Operation#getHTTPMethod()
	 * @generated
	 */
	EOperation getOperation__GetHTTPMethod();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs</em>'.
	 * @see edu.uoc.som.openapi3.ExternalDocs
	 * @generated
	 */
	EClass getExternalDocs();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ExternalDocs#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.ExternalDocs#getDescription()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ExternalDocs#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi3.ExternalDocs#getUrl()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Url();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edu.uoc.som.openapi3.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getLocation()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Emply Value</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getAllowEmplyValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AllowEmplyValue();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Parameter#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getDeclaringContext()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DeclaringContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getExample()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Example();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getStyle()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Style();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getExplode <em>Explode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explode</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getExplode()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Explode();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Parameter#getAllowReserved <em>Allow Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Reserved</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getAllowReserved()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AllowReserved();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Parameter#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getExamples()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Examples();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Parameter#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getSchema()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Schema();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Parameter#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content</em>'.
	 * @see edu.uoc.som.openapi3.Parameter#getContent()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Content();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ItemsDefinition <em>Items Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items Definition</em>'.
	 * @see edu.uoc.som.openapi3.ItemsDefinition
	 * @generated
	 */
	EClass getItemsDefinition();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi3.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getTitle()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getMaxProperties <em>Max Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Properties</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getMaxProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getMinProperties <em>Min Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Properties</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getMinProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getExample()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Example();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getDiscriminator()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Discriminator();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getReadOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ReadOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.Schema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Properties();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Schema#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Of</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getAllOf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AllOf();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Schema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Items</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getItems()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Items();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.Schema#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getXml()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Xml();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Schema#getAdditonalProperties <em>Additonal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additonal Properties</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getAdditonalProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AdditonalProperties();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Schema#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getDeclaringContext()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DeclaringContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Schema#getAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additonal Properties Allowed</em>'.
	 * @see edu.uoc.som.openapi3.Schema#getAdditonalPropertiesAllowed()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AdditonalPropertiesAllowed();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.Schema#getPropertyByName(java.lang.String) <em>Get Property By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property By Name</em>' operation.
	 * @see edu.uoc.som.openapi3.Schema#getPropertyByName(java.lang.String)
	 * @generated
	 */
	EOperation getSchema__GetPropertyByName__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ResponseDefinition <em>Response Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Definition</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition
	 * @generated
	 */
	EClass getResponseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ResponseDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition#getDescription()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EAttribute getResponseDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ResponseDefinition#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition#getHeaders()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ResponseDefinition#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition#getExamples()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_Examples();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ResponseDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition#getCode()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EAttribute getResponseDefinition_Code();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.ResponseDefinition#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi3.ResponseDefinition#getDeclaringContext()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_DeclaringContext();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see edu.uoc.som.openapi3.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see edu.uoc.som.openapi3.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getName()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getLocation()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getFlow()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Flow();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getAuthorizationUrl()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScheme#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getTokenUrl()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_TokenUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getScopes()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Scopes();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi3.SecurityScheme#getSecurityScopeByName(java.lang.String) <em>Get Security Scope By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Security Scope By Name</em>' operation.
	 * @see edu.uoc.som.openapi3.SecurityScheme#getSecurityScopeByName(java.lang.String)
	 * @generated
	 */
	EOperation getSecurityScheme__GetSecurityScopeByName__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see edu.uoc.som.openapi3.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Example#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see edu.uoc.som.openapi3.Example#getSummary()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Summary();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Example#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.Example#getDescription()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Example#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.openapi3.Example#getValue()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Value();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Example#getExternalValue <em>External Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Value</em>'.
	 * @see edu.uoc.som.openapi3.Example#getExternalValue()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_ExternalValue();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.XMLElement <em>XML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Element</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement
	 * @generated
	 */
	EClass getXMLElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.XMLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement#getName()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.XMLElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement#getNamespace()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.XMLElement#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement#getPrefix()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.XMLElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement#getAttribute()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.XMLElement#getWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see edu.uoc.som.openapi3.XMLElement#getWrapped()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Wrapped();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scope</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScope
	 * @generated
	 */
	EClass getSecurityScope();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScope#getName()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.SecurityScope#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.SecurityScope#getDescription()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ParameterContainer <em>Parameter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Container</em>'.
	 * @see edu.uoc.som.openapi3.ParameterContainer
	 * @generated
	 */
	EClass getParameterContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.SchemaContainer <em>Schema Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Container</em>'.
	 * @see edu.uoc.som.openapi3.SchemaContainer
	 * @generated
	 */
	EClass getSchemaContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ResponseContainer <em>Response Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Container</em>'.
	 * @see edu.uoc.som.openapi3.ResponseContainer
	 * @generated
	 */
	EClass getResponseContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ParameterContext <em>Parameter Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Context</em>'.
	 * @see edu.uoc.som.openapi3.ParameterContext
	 * @generated
	 */
	EClass getParameterContext();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.ParameterContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi3.ParameterContext#getParameters()
	 * @see #getParameterContext()
	 * @generated
	 */
	EReference getParameterContext_Parameters();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.SchemaContext <em>Schema Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Context</em>'.
	 * @see edu.uoc.som.openapi3.SchemaContext
	 * @generated
	 */
	EClass getSchemaContext();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.SchemaContext#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi3.SchemaContext#getSchema()
	 * @see #getSchemaContext()
	 * @generated
	 */
	EReference getSchemaContext_Schema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ExternalDocsContext <em>External Docs Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs Context</em>'.
	 * @see edu.uoc.som.openapi3.ExternalDocsContext
	 * @generated
	 */
	EClass getExternalDocsContext();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.ExternalDocsContext#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see edu.uoc.som.openapi3.ExternalDocsContext#getExternalDocs()
	 * @see #getExternalDocsContext()
	 * @generated
	 */
	EReference getExternalDocsContext_ExternalDocs();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ArrayContext <em>Array Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Context</em>'.
	 * @see edu.uoc.som.openapi3.ArrayContext
	 * @generated
	 */
	EClass getArrayContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ArrayContext#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.uoc.som.openapi3.ArrayContext#getCollectionFormat()
	 * @see #getArrayContext()
	 * @generated
	 */
	EAttribute getArrayContext_CollectionFormat();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi3.ArrayContext#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see edu.uoc.som.openapi3.ArrayContext#getItems()
	 * @see #getArrayContext()
	 * @generated
	 */
	EReference getArrayContext_Items();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see edu.uoc.som.openapi3.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.SecurityRequirement#getSecurityScopes <em>Security Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Scopes</em>'.
	 * @see edu.uoc.som.openapi3.SecurityRequirement#getSecurityScopes()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityScopes();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.SecurityRequirement#getSecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.openapi3.SecurityRequirement#getSecurityScheme()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityScheme();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.uoc.som.openapi3.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Property#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.uoc.som.openapi3.Property#getRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see edu.uoc.som.openapi3.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.openapi3.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.Response#getResponseDefinition <em>Response Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Definition</em>'.
	 * @see edu.uoc.som.openapi3.Response#getResponseDefinition()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Response#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.uoc.som.openapi3.Response#getDefault()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Default();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see edu.uoc.som.openapi3.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Server#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi3.Server#getUrl()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Url();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Server#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.Server#getDescription()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_Description();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Server#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Variables</em>'.
	 * @see edu.uoc.som.openapi3.Server#getVariables()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Variables();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Server Variable Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Variable Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.ServerVariable" valueContainment="true"
	 * @generated
	 */
	EClass getServerVariableEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getServerVariableEntry()
	 * @generated
	 */
	EAttribute getServerVariableEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getServerVariableEntry()
	 * @generated
	 */
	EReference getServerVariableEntry_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ServerVariable <em>Server Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Variable</em>'.
	 * @see edu.uoc.som.openapi3.ServerVariable
	 * @generated
	 */
	EClass getServerVariable();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi3.ServerVariable#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see edu.uoc.som.openapi3.ServerVariable#getEnum()
	 * @see #getServerVariable()
	 * @generated
	 */
	EAttribute getServerVariable_Enum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ServerVariable#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.uoc.som.openapi3.ServerVariable#getDefault()
	 * @see #getServerVariable()
	 * @generated
	 */
	EAttribute getServerVariable_Default();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.ServerVariable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.ServerVariable#getDescription()
	 * @see #getServerVariable()
	 * @generated
	 */
	EAttribute getServerVariable_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see edu.uoc.som.openapi3.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Schemas</em>'.
	 * @see edu.uoc.som.openapi3.Components#getSchemas()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Schemas();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi3.Components#getResponses()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Responses();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi3.Components#getParameters()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Parameters();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi3.Components#getExamples()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Examples();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getRequestBodies <em>Request Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Request Bodies</em>'.
	 * @see edu.uoc.som.openapi3.Components#getRequestBodies()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_RequestBodies();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getSecuritySchemes <em>Security Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Security Schemes</em>'.
	 * @see edu.uoc.som.openapi3.Components#getSecuritySchemes()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_SecuritySchemes();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Links</em>'.
	 * @see edu.uoc.som.openapi3.Components#getLinks()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Links();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi3.Components#getCallBacks <em>Call Backs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Call Backs</em>'.
	 * @see edu.uoc.som.openapi3.Components#getCallBacks()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_CallBacks();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Schema Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Schema"
	 * @generated
	 */
	EClass getSchemaEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getSchemaEntry()
	 * @generated
	 */
	EAttribute getSchemaEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getSchemaEntry()
	 * @generated
	 */
	EReference getSchemaEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Response Definition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Definition Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.ResponseDefinition"
	 * @generated
	 */
	EClass getResponseDefinitionEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResponseDefinitionEntry()
	 * @generated
	 */
	EAttribute getResponseDefinitionEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResponseDefinitionEntry()
	 * @generated
	 */
	EReference getResponseDefinitionEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Parameter Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Parameter"
	 * @generated
	 */
	EClass getParameterEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterEntry()
	 * @generated
	 */
	EAttribute getParameterEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getParameterEntry()
	 * @generated
	 */
	EReference getParameterEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Example Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Example"
	 * @generated
	 */
	EClass getExampleEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExampleEntry()
	 * @generated
	 */
	EAttribute getExampleEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExampleEntry()
	 * @generated
	 */
	EReference getExampleEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Request Body Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Body Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.RequestBody"
	 * @generated
	 */
	EClass getRequestBodyEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRequestBodyEntry()
	 * @generated
	 */
	EAttribute getRequestBodyEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getRequestBodyEntry()
	 * @generated
	 */
	EReference getRequestBodyEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Header Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Header"
	 * @generated
	 */
	EClass getHeaderEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHeaderEntry()
	 * @generated
	 */
	EAttribute getHeaderEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getHeaderEntry()
	 * @generated
	 */
	EReference getHeaderEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Security Scheme Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.SecurityScheme"
	 * @generated
	 */
	EClass getSecuritySchemeEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getSecuritySchemeEntry()
	 * @generated
	 */
	EAttribute getSecuritySchemeEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getSecuritySchemeEntry()
	 * @generated
	 */
	EReference getSecuritySchemeEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Link Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.link"
	 * @generated
	 */
	EClass getLinkEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkEntry()
	 * @generated
	 */
	EAttribute getLinkEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLinkEntry()
	 * @generated
	 */
	EReference getLinkEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Callback Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Callback"
	 * @generated
	 */
	EClass getCallbackEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCallbackEntry()
	 * @generated
	 */
	EAttribute getCallbackEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCallbackEntry()
	 * @generated
	 */
	EReference getCallbackEntry_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.RequestBody <em>Request Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Body</em>'.
	 * @see edu.uoc.som.openapi3.RequestBody
	 * @generated
	 */
	EClass getRequestBody();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.RequestBody#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi3.RequestBody#getDescription()
	 * @see #getRequestBody()
	 * @generated
	 */
	EAttribute getRequestBody_Description();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.RequestBody#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Content</em>'.
	 * @see edu.uoc.som.openapi3.RequestBody#getContent()
	 * @see #getRequestBody()
	 * @generated
	 */
	EReference getRequestBody_Content();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.RequestBody#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.uoc.som.openapi3.RequestBody#getRequired()
	 * @see #getRequestBody()
	 * @generated
	 */
	EAttribute getRequestBody_Required();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.link <em>link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link</em>'.
	 * @see edu.uoc.som.openapi3.link
	 * @generated
	 */
	EClass getlink();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.link#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edu.uoc.som.openapi3.link#getOperation()
	 * @see #getlink()
	 * @generated
	 */
	EReference getlink_Operation();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.link#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see edu.uoc.som.openapi3.link#getServer()
	 * @see #getlink()
	 * @generated
	 */
	EReference getlink_Server();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Callback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callback</em>'.
	 * @see edu.uoc.som.openapi3.Callback
	 * @generated
	 */
	EClass getCallback();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Callback#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Callbacks</em>'.
	 * @see edu.uoc.som.openapi3.Callback#getCallbacks()
	 * @see #getCallback()
	 * @generated
	 */
	EReference getCallback_Callbacks();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.ServerContainer <em>Server Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Container</em>'.
	 * @see edu.uoc.som.openapi3.ServerContainer
	 * @generated
	 */
	EClass getServerContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi3.ServerContainer#getServers <em>Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servers</em>'.
	 * @see edu.uoc.som.openapi3.ServerContainer#getServers()
	 * @see #getServerContainer()
	 * @generated
	 */
	EReference getServerContainer_Servers();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type</em>'.
	 * @see edu.uoc.som.openapi3.MediaType
	 * @generated
	 */
	EClass getMediaType();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi3.MediaType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi3.MediaType#getSchema()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_Schema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.MediaType#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.uoc.som.openapi3.MediaType#getExample()
	 * @see #getMediaType()
	 * @generated
	 */
	EAttribute getMediaType_Example();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.MediaType#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi3.MediaType#getExamples()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_Examples();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.MediaType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encoding</em>'.
	 * @see edu.uoc.som.openapi3.MediaType#getEncoding()
	 * @see #getMediaType()
	 * @generated
	 */
	EReference getMediaType_Encoding();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Media Type Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media Type Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.MediaType"
	 * @generated
	 */
	EClass getMediaTypeEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMediaTypeEntry()
	 * @generated
	 */
	EAttribute getMediaTypeEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getMediaTypeEntry()
	 * @generated
	 */
	EReference getMediaTypeEntry_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see edu.uoc.som.openapi3.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Encoding#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see edu.uoc.som.openapi3.Encoding#getContentType()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_ContentType();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi3.Encoding#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Headers</em>'.
	 * @see edu.uoc.som.openapi3.Encoding#getHeaders()
	 * @see #getEncoding()
	 * @generated
	 */
	EReference getEncoding_Headers();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Encoding#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see edu.uoc.som.openapi3.Encoding#getStyle()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_Style();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Encoding#getExplode <em>Explode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explode</em>'.
	 * @see edu.uoc.som.openapi3.Encoding#getExplode()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_Explode();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi3.Encoding#getAllowReserved <em>Allow Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Reserved</em>'.
	 * @see edu.uoc.som.openapi3.Encoding#getAllowReserved()
	 * @see #getEncoding()
	 * @generated
	 */
	EAttribute getEncoding_AllowReserved();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Encoding Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Encoding"
	 * @generated
	 */
	EClass getEncodingEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEncodingEntry()
	 * @generated
	 */
	EAttribute getEncodingEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEncodingEntry()
	 * @generated
	 */
	EReference getEncodingEntry_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi3.RuntimeExpression <em>Runtime Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Expression</em>'.
	 * @see edu.uoc.som.openapi3.RuntimeExpression
	 * @generated
	 */
	EClass getRuntimeExpression();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Expression To Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression To Path</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi3.Path"
	 * @generated
	 */
	EClass getExpressionToPath();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExpressionToPath()
	 * @generated
	 */
	EAttribute getExpressionToPath_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getExpressionToPath()
	 * @generated
	 */
	EReference getExpressionToPath_Value();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.SchemeType <em>Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme Type</em>'.
	 * @see edu.uoc.som.openapi3.SchemeType
	 * @generated
	 */
	EEnum getSchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see edu.uoc.som.openapi3.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Format</em>'.
	 * @see edu.uoc.som.openapi3.CollectionFormat
	 * @generated
	 */
	EEnum getCollectionFormat();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.OAuth2FlowType <em>OAuth2 Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OAuth2 Flow Type</em>'.
	 * @see edu.uoc.som.openapi3.OAuth2FlowType
	 * @generated
	 */
	EEnum getOAuth2FlowType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.APIKeyLocation <em>API Key Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Key Location</em>'.
	 * @see edu.uoc.som.openapi3.APIKeyLocation
	 * @generated
	 */
	EEnum getAPIKeyLocation();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.SecuritySchemeType <em>Security Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme Type</em>'.
	 * @see edu.uoc.som.openapi3.SecuritySchemeType
	 * @generated
	 */
	EEnum getSecuritySchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi3.JSONDataType <em>JSON Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JSON Data Type</em>'.
	 * @see edu.uoc.som.openapi3.JSONDataType
	 * @generated
	 */
	EEnum getJSONDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Openapi3Factory getOpenapi3Factory();

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
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.JSONSchemaSubsetImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getJSONSchemaSubset()
		 * @generated
		 */
		EClass JSON_SCHEMA_SUBSET = eINSTANCE.getJSONSchemaSubset();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__TYPE = eINSTANCE.getJSONSchemaSubset_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__FORMAT = eINSTANCE.getJSONSchemaSubset_Format();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__DESCRIPTION = eINSTANCE.getJSONSchemaSubset_Description();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAXIMUM = eINSTANCE.getJSONSchemaSubset_Maximum();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM = eINSTANCE.getJSONSchemaSubset_ExclusiveMaximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MINIMUM = eINSTANCE.getJSONSchemaSubset_Minimum();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM = eINSTANCE.getJSONSchemaSubset_ExclusiveMinimum();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAX_LENGTH = eINSTANCE.getJSONSchemaSubset_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MIN_LENGTH = eINSTANCE.getJSONSchemaSubset_MinLength();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__PATTERN = eINSTANCE.getJSONSchemaSubset_Pattern();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAX_ITEMS = eINSTANCE.getJSONSchemaSubset_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MIN_ITEMS = eINSTANCE.getJSONSchemaSubset_MinItems();

		/**
		 * The meta object literal for the '<em><b>Unique Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__UNIQUE_ITEMS = eINSTANCE.getJSONSchemaSubset_UniqueItems();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__ENUM = eINSTANCE.getJSONSchemaSubset_Enum();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__DEFAULT = eINSTANCE.getJSONSchemaSubset_Default();

		/**
		 * The meta object literal for the '<em><b>Multiple Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MULTIPLE_OF = eINSTANCE.getJSONSchemaSubset_MultipleOf();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ContainedCollectionsImpl <em>Contained Collections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ContainedCollectionsImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getContainedCollections()
		 * @generated
		 */
		EClass CONTAINED_COLLECTIONS = eINSTANCE.getContainedCollections();

		/**
		 * The meta object literal for the '<em><b>Paramters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_COLLECTIONS__PARAMTERS = eINSTANCE.getContainedCollections_Paramters();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_COLLECTIONS__SCHEMAS = eINSTANCE.getContainedCollections_Schemas();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_COLLECTIONS__RESPONSES = eINSTANCE.getContainedCollections_Responses();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.APIImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Openapi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__OPENAPI = eINSTANCE.getAPI_Openapi();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__INFO = eINSTANCE.getAPI_Info();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__HOST = eINSTANCE.getAPI_Host();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__BASE_PATH = eINSTANCE.getAPI_BasePath();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__SCHEMES = eINSTANCE.getAPI_Schemes();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__CONSUMES = eINSTANCE.getAPI_Consumes();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__PRODUCES = eINSTANCE.getAPI_Produces();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__PATHS = eINSTANCE.getAPI_Paths();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__TAGS = eINSTANCE.getAPI_Tags();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__COMPONENTS = eINSTANCE.getAPI_Components();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__SECURITY = eINSTANCE.getAPI_Security();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__SERVERS = eINSTANCE.getAPI_Servers();

		/**
		 * The meta object literal for the '<em><b>Get All Operations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_ALL_OPERATIONS = eINSTANCE.getAPI__GetAllOperations();

		/**
		 * The meta object literal for the '<em><b>Get Schema By Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_SCHEMA_BY_REFERENCE__STRING = eINSTANCE.getAPI__GetSchemaByReference__String();

		/**
		 * The meta object literal for the '<em><b>Get Operation By Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_OPERATION_BY_ID__STRING = eINSTANCE.getAPI__GetOperationById__String();

		/**
		 * The meta object literal for the '<em><b>Get Path By Relative Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_PATH_BY_RELATIVE_PATH__STRING = eINSTANCE.getAPI__GetPathByRelativePath__String();

		/**
		 * The meta object literal for the '<em><b>Get Parameter By Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_PARAMETER_BY_REFERENCE__STRING = eINSTANCE.getAPI__GetParameterByReference__String();

		/**
		 * The meta object literal for the '<em><b>Get Response Definition By Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING = eINSTANCE.getAPI__GetResponseDefinitionByReference__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.InfoImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TITLE = eINSTANCE.getInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__DESCRIPTION = eINSTANCE.getInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Terms Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__TERMS_OF_SERVICE = eINSTANCE.getInfo_TermsOfService();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__CONTACT = eINSTANCE.getInfo_Contact();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO__LICENSE = eINSTANCE.getInfo_License();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__VERSION = eINSTANCE.getInfo_Version();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ContactImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME = eINSTANCE.getContact_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__URL = eINSTANCE.getContact_Url();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.LicenseImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.PathImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__RELATIVE_PATH = eINSTANCE.getPath_RelativePath();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__GET = eINSTANCE.getPath_Get();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PUT = eINSTANCE.getPath_Put();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__POST = eINSTANCE.getPath_Post();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__DELETE = eINSTANCE.getPath_Delete();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__OPTIONS = eINSTANCE.getPath_Options();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__HEAD = eINSTANCE.getPath_Head();

		/**
		 * The meta object literal for the '<em><b>Patch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PATCH = eINSTANCE.getPath_Patch();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__API = eINSTANCE.getPath_Api();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__SERVERS = eINSTANCE.getPath_Servers();

		/**
		 * The meta object literal for the '<em><b>Get Operation By HTTP Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___GET_OPERATION_BY_HTTP_METHOD__STRING = eINSTANCE.getPath__GetOperationByHTTPMethod__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.OperationImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Tag References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TAG_REFERENCES = eINSTANCE.getOperation_TagReferences();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SUMMARY = eINSTANCE.getOperation_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OPERATION_ID = eINSTANCE.getOperation_OperationId();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__CONSUMES = eINSTANCE.getOperation_Consumes();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PRODUCES = eINSTANCE.getOperation_Produces();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RESPONSES = eINSTANCE.getOperation_Responses();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SCHEMES = eINSTANCE.getOperation_Schemes();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__DEPRECATED = eINSTANCE.getOperation_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SECURITY = eINSTANCE.getOperation_Security();

		/**
		 * The meta object literal for the '<em><b>Request Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__REQUEST_BODY = eINSTANCE.getOperation_RequestBody();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CALLBACKS = eINSTANCE.getOperation_Callbacks();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SERVERS = eINSTANCE.getOperation_Servers();

		/**
		 * The meta object literal for the '<em><b>Get Full Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_FULL_PATH = eINSTANCE.getOperation__GetFullPath();

		/**
		 * The meta object literal for the '<em><b>Get HTTP Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_HTTP_METHOD = eINSTANCE.getOperation__GetHTTPMethod();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ExternalDocsImpl <em>External Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ExternalDocsImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExternalDocs()
		 * @generated
		 */
		EClass EXTERNAL_DOCS = eINSTANCE.getExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__DESCRIPTION = eINSTANCE.getExternalDocs_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__URL = eINSTANCE.getExternalDocs_Url();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ParameterImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LOCATION = eINSTANCE.getParameter_Location();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Allow Emply Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALLOW_EMPLY_VALUE = eINSTANCE.getParameter_AllowEmplyValue();

		/**
		 * The meta object literal for the '<em><b>Declaring Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DECLARING_CONTEXT = eINSTANCE.getParameter_DeclaringContext();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXAMPLE = eINSTANCE.getParameter_Example();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__STYLE = eINSTANCE.getParameter_Style();

		/**
		 * The meta object literal for the '<em><b>Explode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXPLODE = eINSTANCE.getParameter_Explode();

		/**
		 * The meta object literal for the '<em><b>Allow Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALLOW_RESERVED = eINSTANCE.getParameter_AllowReserved();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__EXAMPLES = eINSTANCE.getParameter_Examples();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SCHEMA = eINSTANCE.getParameter_Schema();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CONTENT = eINSTANCE.getParameter_Content();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ItemsDefinitionImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getItemsDefinition()
		 * @generated
		 */
		EClass ITEMS_DEFINITION = eINSTANCE.getItemsDefinition();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SchemaImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TITLE = eINSTANCE.getSchema_Title();

		/**
		 * The meta object literal for the '<em><b>Max Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_PROPERTIES = eINSTANCE.getSchema_MaxProperties();

		/**
		 * The meta object literal for the '<em><b>Min Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_PROPERTIES = eINSTANCE.getSchema_MinProperties();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__EXAMPLE = eINSTANCE.getSchema_Example();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DISCRIMINATOR = eINSTANCE.getSchema_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__READ_ONLY = eINSTANCE.getSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__PROPERTIES = eINSTANCE.getSchema_Properties();

		/**
		 * The meta object literal for the '<em><b>All Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ALL_OF = eINSTANCE.getSchema_AllOf();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ITEMS = eINSTANCE.getSchema_Items();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__XML = eINSTANCE.getSchema_Xml();

		/**
		 * The meta object literal for the '<em><b>Additonal Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ADDITONAL_PROPERTIES = eINSTANCE.getSchema_AdditonalProperties();

		/**
		 * The meta object literal for the '<em><b>Declaring Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DECLARING_CONTEXT = eINSTANCE.getSchema_DeclaringContext();

		/**
		 * The meta object literal for the '<em><b>Additonal Properties Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ADDITONAL_PROPERTIES_ALLOWED = eINSTANCE.getSchema_AdditonalPropertiesAllowed();

		/**
		 * The meta object literal for the '<em><b>Get Property By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEMA___GET_PROPERTY_BY_NAME__STRING = eINSTANCE.getSchema__GetPropertyByName__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ResponseDefinitionImpl <em>Response Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ResponseDefinitionImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseDefinition()
		 * @generated
		 */
		EClass RESPONSE_DEFINITION = eINSTANCE.getResponseDefinition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DEFINITION__DESCRIPTION = eINSTANCE.getResponseDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DEFINITION__HEADERS = eINSTANCE.getResponseDefinition_Headers();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DEFINITION__EXAMPLES = eINSTANCE.getResponseDefinition_Examples();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DEFINITION__CODE = eINSTANCE.getResponseDefinition_Code();

		/**
		 * The meta object literal for the '<em><b>Declaring Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DEFINITION__DECLARING_CONTEXT = eINSTANCE.getResponseDefinition_DeclaringContext();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.HeaderImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.TagImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DESCRIPTION = eINSTANCE.getTag_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SecuritySchemeImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__TYPE = eINSTANCE.getSecurityScheme_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__NAME = eINSTANCE.getSecurityScheme_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__LOCATION = eINSTANCE.getSecurityScheme_Location();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__FLOW = eINSTANCE.getSecurityScheme_Flow();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__AUTHORIZATION_URL = eINSTANCE.getSecurityScheme_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>Token Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__TOKEN_URL = eINSTANCE.getSecurityScheme_TokenUrl();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME__SCOPES = eINSTANCE.getSecurityScheme_Scopes();

		/**
		 * The meta object literal for the '<em><b>Get Security Scope By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECURITY_SCHEME___GET_SECURITY_SCOPE_BY_NAME__STRING = eINSTANCE.getSecurityScheme__GetSecurityScopeByName__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ExampleImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__SUMMARY = eINSTANCE.getExample_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__DESCRIPTION = eINSTANCE.getExample_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__VALUE = eINSTANCE.getExample_Value();

		/**
		 * The meta object literal for the '<em><b>External Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__EXTERNAL_VALUE = eINSTANCE.getExample_ExternalValue();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.XMLElementImpl <em>XML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.XMLElementImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getXMLElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXMLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__NAME = eINSTANCE.getXMLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__NAMESPACE = eINSTANCE.getXMLElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__PREFIX = eINSTANCE.getXMLElement_Prefix();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__ATTRIBUTE = eINSTANCE.getXMLElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__WRAPPED = eINSTANCE.getXMLElement_Wrapped();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SecurityScopeImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityScope()
		 * @generated
		 */
		EClass SECURITY_SCOPE = eINSTANCE.getSecurityScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCOPE__NAME = eINSTANCE.getSecurityScope_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCOPE__DESCRIPTION = eINSTANCE.getSecurityScope_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ParameterContainerImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterContainer()
		 * @generated
		 */
		EClass PARAMETER_CONTAINER = eINSTANCE.getParameterContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SchemaContainerImpl <em>Schema Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SchemaContainerImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaContainer()
		 * @generated
		 */
		EClass SCHEMA_CONTAINER = eINSTANCE.getSchemaContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ResponseContainerImpl <em>Response Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ResponseContainerImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseContainer()
		 * @generated
		 */
		EClass RESPONSE_CONTAINER = eINSTANCE.getResponseContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ParameterContextImpl <em>Parameter Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ParameterContextImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterContext()
		 * @generated
		 */
		EClass PARAMETER_CONTEXT = eINSTANCE.getParameterContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_CONTEXT__PARAMETERS = eINSTANCE.getParameterContext_Parameters();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SchemaContextImpl <em>Schema Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SchemaContextImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaContext()
		 * @generated
		 */
		EClass SCHEMA_CONTEXT = eINSTANCE.getSchemaContext();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_CONTEXT__SCHEMA = eINSTANCE.getSchemaContext_Schema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ExternalDocsContextImpl <em>External Docs Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ExternalDocsContextImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExternalDocsContext()
		 * @generated
		 */
		EClass EXTERNAL_DOCS_CONTEXT = eINSTANCE.getExternalDocsContext();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS = eINSTANCE.getExternalDocsContext_ExternalDocs();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ArrayContextImpl <em>Array Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ArrayContextImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getArrayContext()
		 * @generated
		 */
		EClass ARRAY_CONTEXT = eINSTANCE.getArrayContext();

		/**
		 * The meta object literal for the '<em><b>Collection Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_CONTEXT__COLLECTION_FORMAT = eINSTANCE.getArrayContext_CollectionFormat();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONTEXT__ITEMS = eINSTANCE.getArrayContext_Items();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SecurityRequirementImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Security Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_SCOPES = eINSTANCE.getSecurityRequirement_SecurityScopes();

		/**
		 * The meta object literal for the '<em><b>Security Scheme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_SCHEME = eINSTANCE.getSecurityRequirement_SecurityScheme();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.PropertyImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REQUIRED = eINSTANCE.getProperty_Required();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ResponseImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CODE = eINSTANCE.getResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Response Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_DEFINITION = eINSTANCE.getResponse_ResponseDefinition();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DEFAULT = eINSTANCE.getResponse_Default();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ServerImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__URL = eINSTANCE.getServer_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__DESCRIPTION = eINSTANCE.getServer_Description();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__VARIABLES = eINSTANCE.getServer_Variables();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ServerVariableEntryImpl <em>Server Variable Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ServerVariableEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerVariableEntry()
		 * @generated
		 */
		EClass SERVER_VARIABLE_ENTRY = eINSTANCE.getServerVariableEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_VARIABLE_ENTRY__KEY = eINSTANCE.getServerVariableEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_VARIABLE_ENTRY__VALUE = eINSTANCE.getServerVariableEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ServerVariableImpl <em>Server Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ServerVariableImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerVariable()
		 * @generated
		 */
		EClass SERVER_VARIABLE = eINSTANCE.getServerVariable();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_VARIABLE__ENUM = eINSTANCE.getServerVariable_Enum();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_VARIABLE__DEFAULT = eINSTANCE.getServerVariable_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_VARIABLE__DESCRIPTION = eINSTANCE.getServerVariable_Description();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ComponentsImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__SCHEMAS = eINSTANCE.getComponents_Schemas();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__RESPONSES = eINSTANCE.getComponents_Responses();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__PARAMETERS = eINSTANCE.getComponents_Parameters();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__EXAMPLES = eINSTANCE.getComponents_Examples();

		/**
		 * The meta object literal for the '<em><b>Request Bodies</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__REQUEST_BODIES = eINSTANCE.getComponents_RequestBodies();

		/**
		 * The meta object literal for the '<em><b>Security Schemes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__SECURITY_SCHEMES = eINSTANCE.getComponents_SecuritySchemes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__LINKS = eINSTANCE.getComponents_Links();

		/**
		 * The meta object literal for the '<em><b>Call Backs</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__CALL_BACKS = eINSTANCE.getComponents_CallBacks();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SchemaEntryImpl <em>Schema Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SchemaEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemaEntry()
		 * @generated
		 */
		EClass SCHEMA_ENTRY = eINSTANCE.getSchemaEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_ENTRY__KEY = eINSTANCE.getSchemaEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_ENTRY__VALUE = eINSTANCE.getSchemaEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ResponseDefinitionEntryImpl <em>Response Definition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ResponseDefinitionEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getResponseDefinitionEntry()
		 * @generated
		 */
		EClass RESPONSE_DEFINITION_ENTRY = eINSTANCE.getResponseDefinitionEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DEFINITION_ENTRY__KEY = eINSTANCE.getResponseDefinitionEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DEFINITION_ENTRY__VALUE = eINSTANCE.getResponseDefinitionEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ParameterEntryImpl <em>Parameter Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ParameterEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterEntry()
		 * @generated
		 */
		EClass PARAMETER_ENTRY = eINSTANCE.getParameterEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_ENTRY__KEY = eINSTANCE.getParameterEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_ENTRY__VALUE = eINSTANCE.getParameterEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ExampleEntryImpl <em>Example Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ExampleEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExampleEntry()
		 * @generated
		 */
		EClass EXAMPLE_ENTRY = eINSTANCE.getExampleEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_ENTRY__KEY = eINSTANCE.getExampleEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_ENTRY__VALUE = eINSTANCE.getExampleEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.RequestBodyEntryImpl <em>Request Body Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.RequestBodyEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRequestBodyEntry()
		 * @generated
		 */
		EClass REQUEST_BODY_ENTRY = eINSTANCE.getRequestBodyEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_BODY_ENTRY__KEY = eINSTANCE.getRequestBodyEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_BODY_ENTRY__VALUE = eINSTANCE.getRequestBodyEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.HeaderEntryImpl <em>Header Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.HeaderEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getHeaderEntry()
		 * @generated
		 */
		EClass HEADER_ENTRY = eINSTANCE.getHeaderEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_ENTRY__KEY = eINSTANCE.getHeaderEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER_ENTRY__VALUE = eINSTANCE.getHeaderEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.SecuritySchemeEntryImpl <em>Security Scheme Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.SecuritySchemeEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecuritySchemeEntry()
		 * @generated
		 */
		EClass SECURITY_SCHEME_ENTRY = eINSTANCE.getSecuritySchemeEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME_ENTRY__KEY = eINSTANCE.getSecuritySchemeEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME_ENTRY__VALUE = eINSTANCE.getSecuritySchemeEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.LinkEntryImpl <em>Link Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.LinkEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getLinkEntry()
		 * @generated
		 */
		EClass LINK_ENTRY = eINSTANCE.getLinkEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_ENTRY__KEY = eINSTANCE.getLinkEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ENTRY__VALUE = eINSTANCE.getLinkEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.CallbackEntryImpl <em>Callback Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.CallbackEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCallbackEntry()
		 * @generated
		 */
		EClass CALLBACK_ENTRY = eINSTANCE.getCallbackEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLBACK_ENTRY__KEY = eINSTANCE.getCallbackEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLBACK_ENTRY__VALUE = eINSTANCE.getCallbackEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.RequestBodyImpl <em>Request Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.RequestBodyImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRequestBody()
		 * @generated
		 */
		EClass REQUEST_BODY = eINSTANCE.getRequestBody();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_BODY__DESCRIPTION = eINSTANCE.getRequestBody_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_BODY__CONTENT = eINSTANCE.getRequestBody_Content();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_BODY__REQUIRED = eINSTANCE.getRequestBody_Required();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.linkImpl <em>link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.linkImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getlink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getlink();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OPERATION = eINSTANCE.getlink_Operation();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SERVER = eINSTANCE.getlink_Server();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.CallbackImpl <em>Callback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.CallbackImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCallback()
		 * @generated
		 */
		EClass CALLBACK = eINSTANCE.getCallback();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLBACK__CALLBACKS = eINSTANCE.getCallback_Callbacks();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ServerContainerImpl <em>Server Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ServerContainerImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getServerContainer()
		 * @generated
		 */
		EClass SERVER_CONTAINER = eINSTANCE.getServerContainer();

		/**
		 * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER_CONTAINER__SERVERS = eINSTANCE.getServerContainer_Servers();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.MediaTypeImpl <em>Media Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.MediaTypeImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getMediaType()
		 * @generated
		 */
		EClass MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__SCHEMA = eINSTANCE.getMediaType_Schema();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE__EXAMPLE = eINSTANCE.getMediaType_Example();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__EXAMPLES = eINSTANCE.getMediaType_Examples();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE__ENCODING = eINSTANCE.getMediaType_Encoding();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.MediaTypeEntryImpl <em>Media Type Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.MediaTypeEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getMediaTypeEntry()
		 * @generated
		 */
		EClass MEDIA_TYPE_ENTRY = eINSTANCE.getMediaTypeEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA_TYPE_ENTRY__KEY = eINSTANCE.getMediaTypeEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA_TYPE_ENTRY__VALUE = eINSTANCE.getMediaTypeEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.EncodingImpl <em>Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.EncodingImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getEncoding()
		 * @generated
		 */
		EClass ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__CONTENT_TYPE = eINSTANCE.getEncoding_ContentType();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCODING__HEADERS = eINSTANCE.getEncoding_Headers();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__STYLE = eINSTANCE.getEncoding_Style();

		/**
		 * The meta object literal for the '<em><b>Explode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__EXPLODE = eINSTANCE.getEncoding_Explode();

		/**
		 * The meta object literal for the '<em><b>Allow Reserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING__ALLOW_RESERVED = eINSTANCE.getEncoding_AllowReserved();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.EncodingEntryImpl <em>Encoding Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.EncodingEntryImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getEncodingEntry()
		 * @generated
		 */
		EClass ENCODING_ENTRY = eINSTANCE.getEncodingEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_ENTRY__KEY = eINSTANCE.getEncodingEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCODING_ENTRY__VALUE = eINSTANCE.getEncodingEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.RuntimeExpressionImpl <em>Runtime Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.RuntimeExpressionImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getRuntimeExpression()
		 * @generated
		 */
		EClass RUNTIME_EXPRESSION = eINSTANCE.getRuntimeExpression();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.impl.ExpressionToPathImpl <em>Expression To Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.impl.ExpressionToPathImpl
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getExpressionToPath()
		 * @generated
		 */
		EClass EXPRESSION_TO_PATH = eINSTANCE.getExpressionToPath();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TO_PATH__KEY = eINSTANCE.getExpressionToPath_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TO_PATH__VALUE = eINSTANCE.getExpressionToPath_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.SchemeType
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.ParameterLocation
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.CollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.CollectionFormat
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getCollectionFormat()
		 * @generated
		 */
		EEnum COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.OAuth2FlowType
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getOAuth2FlowType()
		 * @generated
		 */
		EEnum OAUTH2_FLOW_TYPE = eINSTANCE.getOAuth2FlowType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.APIKeyLocation <em>API Key Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.APIKeyLocation
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getAPIKeyLocation()
		 * @generated
		 */
		EEnum API_KEY_LOCATION = eINSTANCE.getAPIKeyLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.SecuritySchemeType
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getSecuritySchemeType()
		 * @generated
		 */
		EEnum SECURITY_SCHEME_TYPE = eINSTANCE.getSecuritySchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi3.JSONDataType <em>JSON Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi3.JSONDataType
		 * @see edu.uoc.som.openapi3.impl.Openapi3PackageImpl#getJSONDataType()
		 * @generated
		 */
		EEnum JSON_DATA_TYPE = eINSTANCE.getJSONDataType();

	}

} //Openapi3Package
