/**
 */
package edu.uoc.som.openapi2;

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
 * @see edu.uoc.som.openapi2.OpenAPI2Factory
 * @model kind="package"
 * @generated
 */
public interface OpenAPI2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openapi2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://som.uoc.edu/openapi/2.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openapi2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenAPI2Package eINSTANCE = edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONSchemaSubset()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ContainedCollectionsImpl <em>Contained Collections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ContainedCollectionsImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getContainedCollections()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsContainerImpl <em>External Docs Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExternalDocsContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExternalDocsContainer()
	 * @generated
	 */
	int EXTERNAL_DOCS_CONTAINER = 22;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS = 0;

	/**
	 * The number of structural features of the '<em>External Docs Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>External Docs Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.APIImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getAPI()
	 * @generated
	 */
	int API = 2;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__EXTERNAL_DOCS = EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SECURITY = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__INFO = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HOST = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_PATH = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SCHEMES = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CONSUMES = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PRODUCES = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PATHS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__DEFINITIONS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__RESPONSES = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SECURITY_DEFINITIONS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TAGS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PARAMETERS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Contained Collections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CONTAINED_COLLECTIONS = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_ALL_OPERATIONS = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Schema By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_SCHEMA_BY_REFERENCE__STRING = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Operation By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_OPERATION_BY_ID__STRING = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Path By Relative Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PATH_BY_RELATIVE_PATH__STRING = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Parameter By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PARAMETER_BY_REFERENCE__STRING = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Response Definition By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.InfoImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getInfo()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ContactImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getContact()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.LicenseImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getLicense()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterContainer()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.PathImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getPath()
	 * @generated
	 */
	int PATH = 6;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RELATIVE_PATH = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__GET = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PUT = PARAMETER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__POST = PARAMETER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DELETE = PARAMETER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__OPTIONS = PARAMETER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HEAD = PARAMETER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATCH = PARAMETER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Api</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__API = PARAMETER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PARAMETERS = PARAMETER_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 10;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.OperationImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTERNAL_DOCS = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SECURITY = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Responses</b></em>' map.
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
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = PARAMETER_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 12;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExternalDocsImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExternalDocs()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SchemaContainerImpl <em>Schema Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SchemaContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemaContainer()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameter()
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
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REF = SCHEMA_CONTAINER_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SCHEMA_CONTAINER_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOCATION = SCHEMA_CONTAINER_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = SCHEMA_CONTAINER_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOW_EMPLY_VALUE = SCHEMA_CONTAINER_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DECLARING_CONTEXT = SCHEMA_CONTAINER_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXAMPLE = SCHEMA_CONTAINER_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SCHEMA = SCHEMA_CONTAINER_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SCHEMA_CONTAINER_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SCHEMA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ItemsDefinitionImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getItemsDefinition()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SchemaImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchema()
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
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REF = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TITLE = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXAMPLE = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISCRIMINATOR = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__READ_ONLY = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ALL_OF = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ITEMS = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Additonal Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITONAL_PROPERTIES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DECLARING_CONTEXT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Additonal Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITONAL_PROPERTIES_ALLOWED = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Property By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_PROPERTY_BY_NAME__STRING = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_NAME = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__REF = SCHEMA_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = SCHEMA_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__HEADERS = SCHEMA_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__EXAMPLES = SCHEMA_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DECLARING_CONTEXT = SCHEMA_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__SCHEMA = SCHEMA_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = SCHEMA_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = SCHEMA_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.HeaderImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getHeader()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.TagImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getTag()
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
	int TAG__EXTERNAL_DOCS = EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = EXTERNAL_DOCS_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = EXTERNAL_DOCS_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.JSONPointerImpl <em>JSON Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.JSONPointerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONPointer()
	 * @generated
	 */
	int JSON_POINTER = 25;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecuritySchemeImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityScheme()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExampleImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 16;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__MIME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.XMLElementImpl <em>XML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.XMLElementImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getXMLElement()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecurityScopeImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityScope()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseContainerImpl <em>Response Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseContainer()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ArrayContainerImpl <em>Array Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ArrayContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getArrayContainer()
	 * @generated
	 */
	int ARRAY_CONTAINER = 23;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTAINER__COLLECTION_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTAINER__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Array Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Array Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecurityRequirementImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 24;

	/**
	 * The feature id for the '<em><b>Security Schemes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_SCHEMES = 0;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_POINTER__REF = 0;

	/**
	 * The number of structural features of the '<em>JSON Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_POINTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JSON Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_POINTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.PropertyImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 26;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REF = JSON_POINTER__REF;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = JSON_POINTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCHEMA = JSON_POINTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = JSON_POINTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = JSON_POINTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = JSON_POINTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseEntryImpl <em>Response Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseEntryImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseEntry()
	 * @generated
	 */
	int RESPONSE_ENTRY = 27;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Response Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SchemaEntryImpl <em>Schema Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SchemaEntryImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemaEntry()
	 * @generated
	 */
	int SCHEMA_ENTRY = 28;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseDefinitionEntryImpl <em>Response Definition Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseDefinitionEntryImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseDefinitionEntry()
	 * @generated
	 */
	int RESPONSE_DEFINITION_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY__KEY = RESPONSE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY__VALUE = RESPONSE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY_FEATURE_COUNT = RESPONSE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Response Definition Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_ENTRY_OPERATION_COUNT = RESPONSE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterEntryImpl <em>Parameter Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterEntryImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterEntry()
	 * @generated
	 */
	int PARAMETER_ENTRY = 30;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY__KEY = PARAMETER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY__VALUE = PARAMETER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY_FEATURE_COUNT = PARAMETER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_ENTRY_OPERATION_COUNT = PARAMETER_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecurityContainerImpl <em>Security Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecurityContainerImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityContainer()
	 * @generated
	 */
	int SECURITY_CONTAINER = 31;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTAINER__SECURITY = 0;

	/**
	 * The number of structural features of the '<em>Security Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecuritySchemeEntryImpl <em>Security Scheme Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecuritySchemeEntryImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecuritySchemeEntry()
	 * @generated
	 */
	int SECURITY_SCHEME_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.RequiredSecuritySchemeImpl <em>Required Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.RequiredSecuritySchemeImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getRequiredSecurityScheme()
	 * @generated
	 */
	int REQUIRED_SECURITY_SCHEME = 33;

	/**
	 * The feature id for the '<em><b>Security Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SECURITY_SCHEME__SECURITY_SCOPES = 0;

	/**
	 * The feature id for the '<em><b>Security Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SECURITY_SCHEME__SECURITY_SCHEME = 1;

	/**
	 * The number of structural features of the '<em>Required Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SECURITY_SCHEME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Required Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 34;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.ParameterLocation
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 35;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.CollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.CollectionFormat
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 36;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.OAuth2FlowType
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getOAuth2FlowType()
	 * @generated
	 */
	int OAUTH2_FLOW_TYPE = 37;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.APIKeyLocation <em>API Key Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.APIKeyLocation
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getAPIKeyLocation()
	 * @generated
	 */
	int API_KEY_LOCATION = 38;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.SecuritySchemeType
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecuritySchemeType()
	 * @generated
	 */
	int SECURITY_SCHEME_TYPE = 39;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.JSONDataType <em>JSON Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.JSONDataType
	 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONDataType()
	 * @generated
	 */
	int JSON_DATA_TYPE = 40;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.JSONSchemaSubset <em>JSON Schema Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Schema Subset</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset
	 * @generated
	 */
	EClass getJSONSchemaSubset();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getType()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getFormat()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getDescription()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getExclusiveMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMaximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getExclusiveMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMaxLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMinLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getPattern()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMaxItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMinItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Items</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getUniqueItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_UniqueItems();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getEnum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Enum();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getDefault()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Default();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Of</em>'.
	 * @see edu.uoc.som.openapi2.JSONSchemaSubset#getMultipleOf()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MultipleOf();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ContainedCollections <em>Contained Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Collections</em>'.
	 * @see edu.uoc.som.openapi2.ContainedCollections
	 * @generated
	 */
	EClass getContainedCollections();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.ContainedCollections#getParamters <em>Paramters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramters</em>'.
	 * @see edu.uoc.som.openapi2.ContainedCollections#getParamters()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Paramters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.ContainedCollections#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see edu.uoc.som.openapi2.ContainedCollections#getSchemas()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Schemas();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.ContainedCollections#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi2.ContainedCollections#getResponses()
	 * @see #getContainedCollections()
	 * @generated
	 */
	EReference getContainedCollections_Responses();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see edu.uoc.som.openapi2.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.API#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see edu.uoc.som.openapi2.API#getInfo()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Info();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.API#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see edu.uoc.som.openapi2.API#getHost()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Host();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.API#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see edu.uoc.som.openapi2.API#getBasePath()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_BasePath();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.API#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.uoc.som.openapi2.API#getSchemes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Schemes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.API#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.uoc.som.openapi2.API#getConsumes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.API#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.uoc.som.openapi2.API#getProduces()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Produces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.API#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see edu.uoc.som.openapi2.API#getPaths()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Paths();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi2.API#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Definitions</em>'.
	 * @see edu.uoc.som.openapi2.API#getDefinitions()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Definitions();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi2.API#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi2.API#getResponses()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Responses();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi2.API#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Security Definitions</em>'.
	 * @see edu.uoc.som.openapi2.API#getSecurityDefinitions()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_SecurityDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.API#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see edu.uoc.som.openapi2.API#getTags()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Tags();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi2.API#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi2.API#getParameters()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.API#getContainedCollections <em>Contained Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contained Collections</em>'.
	 * @see edu.uoc.som.openapi2.API#getContainedCollections()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_ContainedCollections();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getAllOperations() <em>Get All Operations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operations</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getAllOperations()
	 * @generated
	 */
	EOperation getAPI__GetAllOperations();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getSchemaByReference(java.lang.String) <em>Get Schema By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schema By Reference</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getSchemaByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetSchemaByReference__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getOperationById(java.lang.String) <em>Get Operation By Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation By Id</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getOperationById(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetOperationById__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getPathByRelativePath(java.lang.String) <em>Get Path By Relative Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path By Relative Path</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getPathByRelativePath(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetPathByRelativePath__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getParameterByReference(java.lang.String) <em>Get Parameter By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parameter By Reference</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getParameterByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetParameterByReference__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getResponseDefinitionByReference(java.lang.String) <em>Get Response Definition By Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Response Definition By Reference</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getResponseDefinitionByReference(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetResponseDefinitionByReference__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see edu.uoc.som.openapi2.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Info#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.openapi2.Info#getTitle()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Info#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.Info#getDescription()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Info#getTermsOfService <em>Terms Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Of Service</em>'.
	 * @see edu.uoc.som.openapi2.Info#getTermsOfService()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_TermsOfService();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Info#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see edu.uoc.som.openapi2.Info#getContact()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Info#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see edu.uoc.som.openapi2.Info#getLicense()
	 * @see #getInfo()
	 * @generated
	 */
	EReference getInfo_License();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Info#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see edu.uoc.som.openapi2.Info#getVersion()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Version();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see edu.uoc.som.openapi2.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi2.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Url();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see edu.uoc.som.openapi2.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see edu.uoc.som.openapi2.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi2.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see edu.uoc.som.openapi2.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Path#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see edu.uoc.som.openapi2.Path#getRelativePath()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_RelativePath();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get</em>'.
	 * @see edu.uoc.som.openapi2.Path#getGet()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Get();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getPut <em>Put</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Put</em>'.
	 * @see edu.uoc.som.openapi2.Path#getPut()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Put();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see edu.uoc.som.openapi2.Path#getPost()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Post();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see edu.uoc.som.openapi2.Path#getDelete()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see edu.uoc.som.openapi2.Path#getOptions()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Options();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see edu.uoc.som.openapi2.Path#getHead()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Head();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Path#getPatch <em>Patch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patch</em>'.
	 * @see edu.uoc.som.openapi2.Path#getPatch()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Patch();

	/**
	 * Returns the meta object for the container reference '{@link edu.uoc.som.openapi2.Path#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Api</em>'.
	 * @see edu.uoc.som.openapi2.Path#getApi()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Api();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.Path#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi2.Path#getParameters()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Parameters();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Path#getOperationByHTTPMethod(java.lang.String) <em>Get Operation By HTTP Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation By HTTP Method</em>' operation.
	 * @see edu.uoc.som.openapi2.Path#getOperationByHTTPMethod(java.lang.String)
	 * @generated
	 */
	EOperation getPath__GetOperationByHTTPMethod__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see edu.uoc.som.openapi2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.Operation#getTagReferences <em>Tag References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag References</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getTagReferences()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_TagReferences();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Operation#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getSummary()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Summary();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Operation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getOperationId()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OperationId();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.Operation#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getConsumes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getProduces()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Produces();

	/**
	 * Returns the meta object for the map '{@link edu.uoc.som.openapi2.Operation#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getResponses()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Responses();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.openapi2.Operation#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getSchemes()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Schemes();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Operation#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getDeprecated()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Deprecated();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi2.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getFullPath() <em>Get Full Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Path</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getFullPath()
	 * @generated
	 */
	EOperation getOperation__GetFullPath();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getHTTPMethod() <em>Get HTTP Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get HTTP Method</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getHTTPMethod()
	 * @generated
	 */
	EOperation getOperation__GetHTTPMethod();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocs
	 * @generated
	 */
	EClass getExternalDocs();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ExternalDocs#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocs#getDescription()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ExternalDocs#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocs#getUrl()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Url();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see edu.uoc.som.openapi2.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Parameter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getLocation()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Parameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Emply Value</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getAllowEmplyValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AllowEmplyValue();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Parameter#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getDeclaringContext()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_DeclaringContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Parameter#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getExample()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Example();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Parameter#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi2.Parameter#getSchema()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Schema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ItemsDefinition <em>Items Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items Definition</em>'.
	 * @see edu.uoc.som.openapi2.ItemsDefinition
	 * @generated
	 */
	EClass getItemsDefinition();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi2.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getTitle()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getMaxProperties <em>Max Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Properties</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getMaxProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getMinProperties <em>Min Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Properties</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getMinProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getExample()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Example();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getDiscriminator()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Discriminator();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getReadOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ReadOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Schema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Properties();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.Schema#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Of</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getAllOf()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AllOf();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Schema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Items</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getItems()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Items();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Schema#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getXml()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Xml();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Schema#getAdditonalProperties <em>Additonal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Additonal Properties</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getAdditonalProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_AdditonalProperties();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Schema#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getDeclaringContext()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_DeclaringContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Schema#getAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additonal Properties Allowed</em>'.
	 * @see edu.uoc.som.openapi2.Schema#getAdditonalPropertiesAllowed()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AdditonalPropertiesAllowed();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Schema#getPropertyByName(java.lang.String) <em>Get Property By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property By Name</em>' operation.
	 * @see edu.uoc.som.openapi2.Schema#getPropertyByName(java.lang.String)
	 * @generated
	 */
	EOperation getSchema__GetPropertyByName__String();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Schema#getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Name</em>' operation.
	 * @see edu.uoc.som.openapi2.Schema#getName()
	 * @generated
	 */
	EOperation getSchema__GetName();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see edu.uoc.som.openapi2.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Response#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see edu.uoc.som.openapi2.Response#getHeaders()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Response#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi2.Response#getExamples()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Examples();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Response#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.Response#getDeclaringContext()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_DeclaringContext();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Response#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi2.Response#getSchema()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Schema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see edu.uoc.som.openapi2.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see edu.uoc.som.openapi2.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getName()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getLocation()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getFlow()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Flow();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getAuthorizationUrl()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScheme#getTokenUrl <em>Token Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Url</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getTokenUrl()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_TokenUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getScopes()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Scopes();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.SecurityScheme#getSecurityScopeByName(java.lang.String) <em>Get Security Scope By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Security Scope By Name</em>' operation.
	 * @see edu.uoc.som.openapi2.SecurityScheme#getSecurityScopeByName(java.lang.String)
	 * @generated
	 */
	EOperation getSecurityScheme__GetSecurityScopeByName__String();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see edu.uoc.som.openapi2.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Example#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see edu.uoc.som.openapi2.Example#getMimeType()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Example#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.uoc.som.openapi2.Example#getValue()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.XMLElement <em>XML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Element</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement
	 * @generated
	 */
	EClass getXMLElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.XMLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement#getName()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.XMLElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement#getNamespace()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.XMLElement#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement#getPrefix()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.XMLElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement#getAttribute()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.XMLElement#getWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see edu.uoc.som.openapi2.XMLElement#getWrapped()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Wrapped();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scope</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScope
	 * @generated
	 */
	EClass getSecurityScope();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScope#getName()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.SecurityScope#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.SecurityScope#getDescription()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Description();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ParameterContainer <em>Parameter Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Container</em>'.
	 * @see edu.uoc.som.openapi2.ParameterContainer
	 * @generated
	 */
	EClass getParameterContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SchemaContainer <em>Schema Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Container</em>'.
	 * @see edu.uoc.som.openapi2.SchemaContainer
	 * @generated
	 */
	EClass getSchemaContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ResponseContainer <em>Response Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Container</em>'.
	 * @see edu.uoc.som.openapi2.ResponseContainer
	 * @generated
	 */
	EClass getResponseContainer();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ExternalDocsContainer <em>External Docs Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs Container</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocsContainer
	 * @generated
	 */
	EClass getExternalDocsContainer();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.ExternalDocsContainer#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocsContainer#getExternalDocs()
	 * @see #getExternalDocsContainer()
	 * @generated
	 */
	EReference getExternalDocsContainer_ExternalDocs();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ArrayContainer <em>Array Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Container</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContainer
	 * @generated
	 */
	EClass getArrayContainer();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ArrayContainer#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContainer#getCollectionFormat()
	 * @see #getArrayContainer()
	 * @generated
	 */
	EAttribute getArrayContainer_CollectionFormat();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.ArrayContainer#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContainer#getItems()
	 * @see #getArrayContainer()
	 * @generated
	 */
	EReference getArrayContainer_Items();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see edu.uoc.som.openapi2.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.SecurityRequirement#getSecuritySchemes <em>Security Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Schemes</em>'.
	 * @see edu.uoc.som.openapi2.SecurityRequirement#getSecuritySchemes()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecuritySchemes();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.JSONPointer <em>JSON Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Pointer</em>'.
	 * @see edu.uoc.som.openapi2.JSONPointer
	 * @generated
	 */
	EClass getJSONPointer();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.JSONPointer#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see edu.uoc.som.openapi2.JSONPointer#getRef()
	 * @see #getJSONPointer()
	 * @generated
	 */
	EAttribute getJSONPointer_Ref();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see edu.uoc.som.openapi2.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Property#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see edu.uoc.som.openapi2.Property#getRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Property#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi2.Property#getSchema()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Schema();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.openapi2.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Response Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi2.Response"
	 * @generated
	 */
	EClass getResponseEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResponseEntry()
	 * @generated
	 */
	EAttribute getResponseEntry_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getResponseEntry()
	 * @generated
	 */
	EReference getResponseEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Schema Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi2.Schema"
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
	 *        valueType="edu.uoc.som.openapi2.Response"
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
	 *        valueType="edu.uoc.som.openapi2.Parameter"
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
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SecurityContainer <em>Security Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Container</em>'.
	 * @see edu.uoc.som.openapi2.SecurityContainer
	 * @generated
	 */
	EClass getSecurityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.SecurityContainer#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see edu.uoc.som.openapi2.SecurityContainer#getSecurity()
	 * @see #getSecurityContainer()
	 * @generated
	 */
	EReference getSecurityContainer_Security();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Security Scheme Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="edu.uoc.som.openapi2.SecurityScheme" valueContainment="true"
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
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getSecuritySchemeEntry()
	 * @generated
	 */
	EReference getSecuritySchemeEntry_Value();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.RequiredSecurityScheme <em>Required Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Security Scheme</em>'.
	 * @see edu.uoc.som.openapi2.RequiredSecurityScheme
	 * @generated
	 */
	EClass getRequiredSecurityScheme();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScopes <em>Security Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Scopes</em>'.
	 * @see edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScopes()
	 * @see #getRequiredSecurityScheme()
	 * @generated
	 */
	EReference getRequiredSecurityScheme_SecurityScopes();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.openapi2.RequiredSecurityScheme#getSecurityScheme()
	 * @see #getRequiredSecurityScheme()
	 * @generated
	 */
	EReference getRequiredSecurityScheme_SecurityScheme();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.SchemeType <em>Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme Type</em>'.
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @generated
	 */
	EEnum getSchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see edu.uoc.som.openapi2.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Format</em>'.
	 * @see edu.uoc.som.openapi2.CollectionFormat
	 * @generated
	 */
	EEnum getCollectionFormat();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.OAuth2FlowType <em>OAuth2 Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OAuth2 Flow Type</em>'.
	 * @see edu.uoc.som.openapi2.OAuth2FlowType
	 * @generated
	 */
	EEnum getOAuth2FlowType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.APIKeyLocation <em>API Key Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Key Location</em>'.
	 * @see edu.uoc.som.openapi2.APIKeyLocation
	 * @generated
	 */
	EEnum getAPIKeyLocation();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.SecuritySchemeType <em>Security Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme Type</em>'.
	 * @see edu.uoc.som.openapi2.SecuritySchemeType
	 * @generated
	 */
	EEnum getSecuritySchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.uoc.som.openapi2.JSONDataType <em>JSON Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JSON Data Type</em>'.
	 * @see edu.uoc.som.openapi2.JSONDataType
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
	OpenAPI2Factory getOpenAPI2Factory();

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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONSchemaSubset()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ContainedCollectionsImpl <em>Contained Collections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ContainedCollectionsImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getContainedCollections()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.APIImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

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
		 * The meta object literal for the '<em><b>Definitions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__DEFINITIONS = eINSTANCE.getAPI_Definitions();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__RESPONSES = eINSTANCE.getAPI_Responses();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__SECURITY_DEFINITIONS = eINSTANCE.getAPI_SecurityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__TAGS = eINSTANCE.getAPI_Tags();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__PARAMETERS = eINSTANCE.getAPI_Parameters();

		/**
		 * The meta object literal for the '<em><b>Contained Collections</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__CONTAINED_COLLECTIONS = eINSTANCE.getAPI_ContainedCollections();

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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.InfoImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getInfo()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ContactImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getContact()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.LicenseImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getLicense()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.PathImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getPath()
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__PARAMETERS = eINSTANCE.getPath_Parameters();

		/**
		 * The meta object literal for the '<em><b>Get Operation By HTTP Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___GET_OPERATION_BY_HTTP_METHOD__STRING = eINSTANCE.getPath__GetOperationByHTTPMethod__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.OperationImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getOperation()
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
		 * The meta object literal for the '<em><b>Responses</b></em>' map feature.
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
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsImpl <em>External Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ExternalDocsImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExternalDocs()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ParameterImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameter()
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
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SCHEMA = eINSTANCE.getParameter_Schema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ItemsDefinitionImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getItemsDefinition()
		 * @generated
		 */
		EClass ITEMS_DEFINITION = eINSTANCE.getItemsDefinition();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchema()
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
		 * The meta object literal for the '<em><b>Get Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEMA___GET_NAME = eINSTANCE.getSchema__GetName();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__HEADERS = eINSTANCE.getResponse_Headers();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__EXAMPLES = eINSTANCE.getResponse_Examples();

		/**
		 * The meta object literal for the '<em><b>Declaring Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__DECLARING_CONTEXT = eINSTANCE.getResponse_DeclaringContext();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__SCHEMA = eINSTANCE.getResponse_Schema();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.HeaderImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getHeader()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.TagImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getTag()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecuritySchemeImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityScheme()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ExampleImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__MIME_TYPE = eINSTANCE.getExample_MimeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__VALUE = eINSTANCE.getExample_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.XMLElementImpl <em>XML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.XMLElementImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getXMLElement()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecurityScopeImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityScope()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ParameterContainerImpl <em>Parameter Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ParameterContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterContainer()
		 * @generated
		 */
		EClass PARAMETER_CONTAINER = eINSTANCE.getParameterContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaContainerImpl <em>Schema Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemaContainer()
		 * @generated
		 */
		EClass SCHEMA_CONTAINER = eINSTANCE.getSchemaContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseContainerImpl <em>Response Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseContainer()
		 * @generated
		 */
		EClass RESPONSE_CONTAINER = eINSTANCE.getResponseContainer();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsContainerImpl <em>External Docs Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ExternalDocsContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getExternalDocsContainer()
		 * @generated
		 */
		EClass EXTERNAL_DOCS_CONTAINER = eINSTANCE.getExternalDocsContainer();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS = eINSTANCE.getExternalDocsContainer_ExternalDocs();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ArrayContainerImpl <em>Array Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ArrayContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getArrayContainer()
		 * @generated
		 */
		EClass ARRAY_CONTAINER = eINSTANCE.getArrayContainer();

		/**
		 * The meta object literal for the '<em><b>Collection Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_CONTAINER__COLLECTION_FORMAT = eINSTANCE.getArrayContainer_CollectionFormat();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CONTAINER__ITEMS = eINSTANCE.getArrayContainer_Items();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecurityRequirementImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Security Schemes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_SCHEMES = eINSTANCE.getSecurityRequirement_SecuritySchemes();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.JSONPointerImpl <em>JSON Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.JSONPointerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONPointer()
		 * @generated
		 */
		EClass JSON_POINTER = eINSTANCE.getJSONPointer();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_POINTER__REF = eINSTANCE.getJSONPointer_Ref();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.PropertyImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getProperty()
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
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SCHEMA = eINSTANCE.getProperty_Schema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseEntryImpl <em>Response Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseEntryImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseEntry()
		 * @generated
		 */
		EClass RESPONSE_ENTRY = eINSTANCE.getResponseEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_ENTRY__KEY = eINSTANCE.getResponseEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_ENTRY__VALUE = eINSTANCE.getResponseEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaEntryImpl <em>Schema Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaEntryImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemaEntry()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseDefinitionEntryImpl <em>Response Definition Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseDefinitionEntryImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getResponseDefinitionEntry()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ParameterEntryImpl <em>Parameter Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ParameterEntryImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterEntry()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecurityContainerImpl <em>Security Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecurityContainerImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecurityContainer()
		 * @generated
		 */
		EClass SECURITY_CONTAINER = eINSTANCE.getSecurityContainer();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTAINER__SECURITY = eINSTANCE.getSecurityContainer_Security();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecuritySchemeEntryImpl <em>Security Scheme Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecuritySchemeEntryImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecuritySchemeEntry()
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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME_ENTRY__VALUE = eINSTANCE.getSecuritySchemeEntry_Value();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.RequiredSecuritySchemeImpl <em>Required Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.RequiredSecuritySchemeImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getRequiredSecurityScheme()
		 * @generated
		 */
		EClass REQUIRED_SECURITY_SCHEME = eINSTANCE.getRequiredSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Security Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_SECURITY_SCHEME__SECURITY_SCOPES = eINSTANCE.getRequiredSecurityScheme_SecurityScopes();

		/**
		 * The meta object literal for the '<em><b>Security Scheme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_SECURITY_SCHEME__SECURITY_SCHEME = eINSTANCE.getRequiredSecurityScheme_SecurityScheme();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.SchemeType
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.ParameterLocation
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.CollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.CollectionFormat
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getCollectionFormat()
		 * @generated
		 */
		EEnum COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.OAuth2FlowType
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getOAuth2FlowType()
		 * @generated
		 */
		EEnum OAUTH2_FLOW_TYPE = eINSTANCE.getOAuth2FlowType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.APIKeyLocation <em>API Key Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.APIKeyLocation
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getAPIKeyLocation()
		 * @generated
		 */
		EEnum API_KEY_LOCATION = eINSTANCE.getAPIKeyLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.SecuritySchemeType
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getSecuritySchemeType()
		 * @generated
		 */
		EEnum SECURITY_SCHEME_TYPE = eINSTANCE.getSecuritySchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.JSONDataType <em>JSON Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.JSONDataType
		 * @see edu.uoc.som.openapi2.impl.OpenAPI2PackageImpl#getJSONDataType()
		 * @generated
		 */
		EEnum JSON_DATA_TYPE = eINSTANCE.getJSONDataType();

	}

} //OpenAPI2Package
