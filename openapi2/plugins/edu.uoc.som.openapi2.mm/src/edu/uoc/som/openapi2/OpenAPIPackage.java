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
 * @see edu.uoc.som.openapi2.OpenAPIFactory
 * @model kind="package"
 * @generated
 */
public interface OpenAPIPackage extends EPackage {
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
	OpenAPIPackage eINSTANCE = edu.uoc.som.openapi2.impl.OpenAPIPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.JSONSchemaSubsetImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getJSONSchemaSubset()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.RootImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__API = 0;

	/**
	 * The feature id for the '<em><b>Paramters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PARAMTERS = 1;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SCHEMAS = 2;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__RESPONSES = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterDeclaringContextImpl <em>Parameter Declaring Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterDeclaringContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterDeclaringContext()
	 * @generated
	 */
	int PARAMETER_DECLARING_CONTEXT = 19;

	/**
	 * The number of structural features of the '<em>Parameter Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.APIImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getAPI()
	 * @generated
	 */
	int API = 2;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SECURITY = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PARAMETERS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__EXTERNAL_DOCS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SWAGGER = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__INFO = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HOST = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_PATH = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SCHEMES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CONSUMES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PRODUCES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PATHS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__DEFINITIONS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__RESPONSES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SECURITY_DEFINITIONS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__TAGS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 15;

	/**
	 * The operation id for the '<em>Paths Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___PATHS_IS_SET = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_ALL_OPERATIONS = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Schema By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_SCHEMA_BY_REFERENCE__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Operation By Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_OPERATION_BY_ID__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Path By Relative Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PATH_BY_RELATIVE_PATH__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Schema By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_SCHEMA_BY_NAME__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Parameter By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_PARAMETER_BY_REFERENCE__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Security Schema By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_SECURITY_SCHEMA_BY_NAME__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Response Definition By Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.InfoImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getInfo()
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
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getContact()
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
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getLicense()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.PathImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getPath()
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
	int PATH__PARAMETERS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RELATIVE_PATH = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__GET = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PUT = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__POST = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DELETE = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__OPTIONS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__HEAD = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__PATCH = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Api</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__API = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Operation By Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___GET_OPERATION_BY_METHOD__STRING = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.OperationImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SECURITY = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTERNAL_DOCS = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tag References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TAG_REFERENCES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUMMARY = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATION_ID = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONSUMES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRODUCES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RESPONSES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SCHEMES = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEPRECATED = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = PARAMETER_DECLARING_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Full Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_FULL_PATH = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Consumed Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_CONSUMED_SCHEMA = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Produced Schema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_PRODUCED_SCHEMA = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Producing List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_PRODUCING_LIST = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_METHOD = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = PARAMETER_DECLARING_CONTEXT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExternalDocsImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExternalDocs()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SchemaDeclaringContextImpl <em>Schema Declaring Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SchemaDeclaringContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemaDeclaringContext()
	 * @generated
	 */
	int SCHEMA_DECLARING_CONTEXT = 20;

	/**
	 * The number of structural features of the '<em>Schema Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Schema Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DECLARING_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SCHEMA = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FORMAT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAXIMUM = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUSIVE_MAXIMUM = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MINIMUM = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXCLUSIVE_MINIMUM = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX_LENGTH = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN_LENGTH = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PATTERN = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX_ITEMS = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN_ITEMS = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIQUE_ITEMS = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENUM = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MULTIPLE_OF = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLLECTION_FORMAT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ITEMS = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REFERENCE_NAME = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOCATION = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOW_EMPLY_VALUE = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DECLARING_CONTEXT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXAMPLE = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_REF = SCHEMA_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = SCHEMA_DECLARING_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ItemsDefinitionImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getItemsDefinition()
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
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchema()
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
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REFERENCE_NAME = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_REF = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Property By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_PROPERTY_BY_NAME__STRING = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseDefinitionImpl <em>Response Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseDefinitionImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponseDefinition()
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
	int RESPONSE_DEFINITION__SCHEMA = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__REFERENCE_NAME = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__DESCRIPTION = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__HEADERS = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__EXAMPLES = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__CODE = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION__DECLARING_CONTEXT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Response Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_FEATURE_COUNT = SCHEMA_DECLARING_CONTEXT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION___GET_REF = SCHEMA_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DEFINITION_OPERATION_COUNT = SCHEMA_DECLARING_CONTEXT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.HeaderImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getHeader()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsContextImpl <em>External Docs Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExternalDocsContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExternalDocsContext()
	 * @generated
	 */
	int EXTERNAL_DOCS_CONTEXT = 25;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.TagImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getTag()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ReferenceableElementImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getReferenceableElement()
	 * @generated
	 */
	int REFERENCEABLE_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT__REFERENCE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Referenceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT___GET_REF = 0;

	/**
	 * The number of operations of the '<em>Referenceable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCEABLE_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecuritySchemeImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 15;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__REFERENCE_NAME = REFERENCEABLE_ELEMENT__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TYPE = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__NAME = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__LOCATION = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__FLOW = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__AUTHORIZATION_URL = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TOKEN_URL = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCOPES = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME___GET_REF = REFERENCEABLE_ELEMENT___GET_REF;

	/**
	 * The operation id for the '<em>Get Security Scope By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME___GET_SECURITY_SCOPE_BY_NAME__STRING = REFERENCEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = REFERENCEABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ExampleImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExample()
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
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getXMLElement()
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
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityScope()
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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseDeclaringContextImpl <em>Response Declaring Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseDeclaringContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponseDeclaringContext()
	 * @generated
	 */
	int RESPONSE_DECLARING_CONTEXT = 21;

	/**
	 * The number of structural features of the '<em>Response Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DECLARING_CONTEXT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Response Declaring Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DECLARING_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecurityContextImpl <em>Security Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecurityContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityContext()
	 * @generated
	 */
	int SECURITY_CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT__SECURITY = 0;

	/**
	 * The number of structural features of the '<em>Security Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ParameterContextImpl <em>Parameter Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ParameterContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterContext()
	 * @generated
	 */
	int PARAMETER_CONTEXT = 23;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SchemaContextImpl <em>Schema Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SchemaContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemaContext()
	 * @generated
	 */
	int SCHEMA_CONTEXT = 24;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ArrayContextImpl <em>Array Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ArrayContextImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getArrayContext()
	 * @generated
	 */
	int ARRAY_CONTEXT = 26;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.SecurityRequirementImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 27;

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
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.PropertyImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 29;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCE_NAME = REFERENCEABLE_ELEMENT__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCHEMA = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = REFERENCEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Ref</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_REF = REFERENCEABLE_ELEMENT___GET_REF;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = REFERENCEABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.impl.ResponseImpl
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 30;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = RESPONSE_DECLARING_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_DEFINITION = RESPONSE_DECLARING_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DEFAULT = RESPONSE_DECLARING_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = RESPONSE_DECLARING_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = RESPONSE_DECLARING_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.SchemeType
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 31;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.ParameterLocation
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 32;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.CollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.CollectionFormat
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 33;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.OAuth2FlowType
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getOAuth2FlowType()
	 * @generated
	 */
	int OAUTH2_FLOW_TYPE = 34;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.APIKeyLocation <em>API Key Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.APIKeyLocation
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getAPIKeyLocation()
	 * @generated
	 */
	int API_KEY_LOCATION = 35;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.SecuritySchemeType
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecuritySchemeType()
	 * @generated
	 */
	int SECURITY_SCHEME_TYPE = 36;

	/**
	 * The meta object id for the '{@link edu.uoc.som.openapi2.JSONDataType <em>JSON Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.openapi2.JSONDataType
	 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getJSONDataType()
	 * @generated
	 */
	int JSON_DATA_TYPE = 37;


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
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see edu.uoc.som.openapi2.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.Root#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Api</em>'.
	 * @see edu.uoc.som.openapi2.Root#getApi()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Api();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Root#getParamters <em>Paramters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramters</em>'.
	 * @see edu.uoc.som.openapi2.Root#getParamters()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Paramters();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Root#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see edu.uoc.som.openapi2.Root#getSchemas()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Schemas();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Root#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi2.Root#getResponses()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Responses();

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
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.API#getSwagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swagger</em>'.
	 * @see edu.uoc.som.openapi2.API#getSwagger()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Swagger();

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
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.API#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see edu.uoc.som.openapi2.API#getDefinitions()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.API#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see edu.uoc.som.openapi2.API#getResponses()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Responses();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.API#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Definitions</em>'.
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
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#pathsIsSet() <em>Paths Is Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Paths Is Set</em>' operation.
	 * @see edu.uoc.som.openapi2.API#pathsIsSet()
	 * @generated
	 */
	EOperation getAPI__PathsIsSet();

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
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getSchemaByName(java.lang.String) <em>Get Schema By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Schema By Name</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getSchemaByName(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetSchemaByName__String();

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
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.API#getSecuritySchemaByName(java.lang.String) <em>Get Security Schema By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Security Schema By Name</em>' operation.
	 * @see edu.uoc.som.openapi2.API#getSecuritySchemaByName(java.lang.String)
	 * @generated
	 */
	EOperation getAPI__GetSecuritySchemaByName__String();

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
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Path#getOperationByMethod(java.lang.String) <em>Get Operation By Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation By Method</em>' operation.
	 * @see edu.uoc.som.openapi2.Path#getOperationByMethod(java.lang.String)
	 * @generated
	 */
	EOperation getPath__GetOperationByMethod__String();

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
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.Operation#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
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
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getFullPath() <em>Get Full Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Path</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getFullPath()
	 * @generated
	 */
	EOperation getOperation__GetFullPath();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getConsumedSchema() <em>Get Consumed Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Consumed Schema</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getConsumedSchema()
	 * @generated
	 */
	EOperation getOperation__GetConsumedSchema();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getProducedSchema() <em>Get Produced Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Produced Schema</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getProducedSchema()
	 * @generated
	 */
	EOperation getOperation__GetProducedSchema();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#IsProducingList() <em>Is Producing List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Producing List</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#IsProducingList()
	 * @generated
	 */
	EOperation getOperation__IsProducingList();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.Operation#getMethod() <em>Get Method</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Method</em>' operation.
	 * @see edu.uoc.som.openapi2.Operation#getMethod()
	 * @generated
	 */
	EOperation getOperation__GetMethod();

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
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ResponseDefinition <em>Response Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Definition</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition
	 * @generated
	 */
	EClass getResponseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ResponseDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition#getDescription()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EAttribute getResponseDefinition_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.ResponseDefinition#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition#getHeaders()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_Headers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.ResponseDefinition#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition#getExamples()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_Examples();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ResponseDefinition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition#getCode()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EAttribute getResponseDefinition_Code();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.ResponseDefinition#getDeclaringContext <em>Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDefinition#getDeclaringContext()
	 * @see #getResponseDefinition()
	 * @generated
	 */
	EReference getResponseDefinition_DeclaringContext();

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
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ParameterDeclaringContext <em>Parameter Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.ParameterDeclaringContext
	 * @generated
	 */
	EClass getParameterDeclaringContext();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SchemaDeclaringContext <em>Schema Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.SchemaDeclaringContext
	 * @generated
	 */
	EClass getSchemaDeclaringContext();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ResponseDeclaringContext <em>Response Declaring Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Declaring Context</em>'.
	 * @see edu.uoc.som.openapi2.ResponseDeclaringContext
	 * @generated
	 */
	EClass getResponseDeclaringContext();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SecurityContext <em>Security Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Context</em>'.
	 * @see edu.uoc.som.openapi2.SecurityContext
	 * @generated
	 */
	EClass getSecurityContext();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.openapi2.SecurityContext#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see edu.uoc.som.openapi2.SecurityContext#getSecurity()
	 * @see #getSecurityContext()
	 * @generated
	 */
	EReference getSecurityContext_Security();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ParameterContext <em>Parameter Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Context</em>'.
	 * @see edu.uoc.som.openapi2.ParameterContext
	 * @generated
	 */
	EClass getParameterContext();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.ParameterContext#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see edu.uoc.som.openapi2.ParameterContext#getParameters()
	 * @see #getParameterContext()
	 * @generated
	 */
	EReference getParameterContext_Parameters();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.SchemaContext <em>Schema Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Context</em>'.
	 * @see edu.uoc.som.openapi2.SchemaContext
	 * @generated
	 */
	EClass getSchemaContext();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.SchemaContext#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see edu.uoc.som.openapi2.SchemaContext#getSchema()
	 * @see #getSchemaContext()
	 * @generated
	 */
	EReference getSchemaContext_Schema();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ExternalDocsContext <em>External Docs Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs Context</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocsContext
	 * @generated
	 */
	EClass getExternalDocsContext();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.ExternalDocsContext#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see edu.uoc.som.openapi2.ExternalDocsContext#getExternalDocs()
	 * @see #getExternalDocsContext()
	 * @generated
	 */
	EReference getExternalDocsContext_ExternalDocs();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ArrayContext <em>Array Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Context</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContext
	 * @generated
	 */
	EClass getArrayContext();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ArrayContext#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContext#getCollectionFormat()
	 * @see #getArrayContext()
	 * @generated
	 */
	EAttribute getArrayContext_CollectionFormat();

	/**
	 * Returns the meta object for the containment reference '{@link edu.uoc.som.openapi2.ArrayContext#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see edu.uoc.som.openapi2.ArrayContext#getItems()
	 * @see #getArrayContext()
	 * @generated
	 */
	EReference getArrayContext_Items();

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
	 * Returns the meta object for the reference list '{@link edu.uoc.som.openapi2.SecurityRequirement#getSecurityScopes <em>Security Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Scopes</em>'.
	 * @see edu.uoc.som.openapi2.SecurityRequirement#getSecurityScopes()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityScopes();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.SecurityRequirement#getSecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Scheme</em>'.
	 * @see edu.uoc.som.openapi2.SecurityRequirement#getSecurityScheme()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityScheme();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.ReferenceableElement <em>Referenceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenceable Element</em>'.
	 * @see edu.uoc.som.openapi2.ReferenceableElement
	 * @generated
	 */
	EClass getReferenceableElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.ReferenceableElement#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see edu.uoc.som.openapi2.ReferenceableElement#getReferenceName()
	 * @see #getReferenceableElement()
	 * @generated
	 */
	EAttribute getReferenceableElement_ReferenceName();

	/**
	 * Returns the meta object for the '{@link edu.uoc.som.openapi2.ReferenceableElement#getRef() <em>Get Ref</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ref</em>' operation.
	 * @see edu.uoc.som.openapi2.ReferenceableElement#getRef()
	 * @generated
	 */
	EOperation getReferenceableElement__GetRef();

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
	 * Returns the meta object for class '{@link edu.uoc.som.openapi2.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see edu.uoc.som.openapi2.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.openapi2.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.openapi2.Response#getResponseDefinition <em>Response Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Definition</em>'.
	 * @see edu.uoc.som.openapi2.Response#getResponseDefinition()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.openapi2.Response#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.uoc.som.openapi2.Response#getDefault()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Default();

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
	OpenAPIFactory getOpenAPIFactory();

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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getJSONSchemaSubset()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.RootImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__API = eINSTANCE.getRoot_Api();

		/**
		 * The meta object literal for the '<em><b>Paramters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PARAMTERS = eINSTANCE.getRoot_Paramters();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SCHEMAS = eINSTANCE.getRoot_Schemas();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__RESPONSES = eINSTANCE.getRoot_Responses();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.APIImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Swagger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__SWAGGER = eINSTANCE.getAPI_Swagger();

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
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__DEFINITIONS = eINSTANCE.getAPI_Definitions();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__RESPONSES = eINSTANCE.getAPI_Responses();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Paths Is Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___PATHS_IS_SET = eINSTANCE.getAPI__PathsIsSet();

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
		 * The meta object literal for the '<em><b>Get Schema By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_SCHEMA_BY_NAME__STRING = eINSTANCE.getAPI__GetSchemaByName__String();

		/**
		 * The meta object literal for the '<em><b>Get Parameter By Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_PARAMETER_BY_REFERENCE__STRING = eINSTANCE.getAPI__GetParameterByReference__String();

		/**
		 * The meta object literal for the '<em><b>Get Security Schema By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation API___GET_SECURITY_SCHEMA_BY_NAME__STRING = eINSTANCE.getAPI__GetSecuritySchemaByName__String();

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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getInfo()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getContact()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getLicense()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getPath()
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
		 * The meta object literal for the '<em><b>Get Operation By Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH___GET_OPERATION_BY_METHOD__STRING = eINSTANCE.getPath__GetOperationByMethod__String();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.OperationImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getOperation()
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
		 * The meta object literal for the '<em><b>Get Full Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_FULL_PATH = eINSTANCE.getOperation__GetFullPath();

		/**
		 * The meta object literal for the '<em><b>Get Consumed Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_CONSUMED_SCHEMA = eINSTANCE.getOperation__GetConsumedSchema();

		/**
		 * The meta object literal for the '<em><b>Get Produced Schema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_PRODUCED_SCHEMA = eINSTANCE.getOperation__GetProducedSchema();

		/**
		 * The meta object literal for the '<em><b>Is Producing List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___IS_PRODUCING_LIST = eINSTANCE.getOperation__IsProducingList();

		/**
		 * The meta object literal for the '<em><b>Get Method</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___GET_METHOD = eINSTANCE.getOperation__GetMethod();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsImpl <em>External Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ExternalDocsImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExternalDocs()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameter()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ItemsDefinitionImpl <em>Items Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ItemsDefinitionImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getItemsDefinition()
		 * @generated
		 */
		EClass ITEMS_DEFINITION = eINSTANCE.getItemsDefinition();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchema()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseDefinitionImpl <em>Response Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseDefinitionImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponseDefinition()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.HeaderImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getHeader()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getTag()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityScheme()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExample()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getXMLElement()
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
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityScope()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ParameterDeclaringContextImpl <em>Parameter Declaring Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ParameterDeclaringContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterDeclaringContext()
		 * @generated
		 */
		EClass PARAMETER_DECLARING_CONTEXT = eINSTANCE.getParameterDeclaringContext();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaDeclaringContextImpl <em>Schema Declaring Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaDeclaringContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemaDeclaringContext()
		 * @generated
		 */
		EClass SCHEMA_DECLARING_CONTEXT = eINSTANCE.getSchemaDeclaringContext();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseDeclaringContextImpl <em>Response Declaring Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseDeclaringContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponseDeclaringContext()
		 * @generated
		 */
		EClass RESPONSE_DECLARING_CONTEXT = eINSTANCE.getResponseDeclaringContext();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecurityContextImpl <em>Security Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecurityContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityContext()
		 * @generated
		 */
		EClass SECURITY_CONTEXT = eINSTANCE.getSecurityContext();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTEXT__SECURITY = eINSTANCE.getSecurityContext_Security();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ParameterContextImpl <em>Parameter Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ParameterContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterContext()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SchemaContextImpl <em>Schema Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SchemaContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemaContext()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ExternalDocsContextImpl <em>External Docs Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ExternalDocsContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getExternalDocsContext()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ArrayContextImpl <em>Array Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ArrayContextImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getArrayContext()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.SecurityRequirementImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecurityRequirement()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ReferenceableElementImpl <em>Referenceable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ReferenceableElementImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getReferenceableElement()
		 * @generated
		 */
		EClass REFERENCEABLE_ELEMENT = eINSTANCE.getReferenceableElement();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCEABLE_ELEMENT__REFERENCE_NAME = eINSTANCE.getReferenceableElement_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Get Ref</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCEABLE_ELEMENT___GET_REF = eINSTANCE.getReferenceableElement__GetRef();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.PropertyImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.impl.ResponseImpl
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getResponse()
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
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.SchemeType
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.ParameterLocation
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.CollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.CollectionFormat
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getCollectionFormat()
		 * @generated
		 */
		EEnum COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.OAuth2FlowType
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getOAuth2FlowType()
		 * @generated
		 */
		EEnum OAUTH2_FLOW_TYPE = eINSTANCE.getOAuth2FlowType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.APIKeyLocation <em>API Key Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.APIKeyLocation
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getAPIKeyLocation()
		 * @generated
		 */
		EEnum API_KEY_LOCATION = eINSTANCE.getAPIKeyLocation();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.SecuritySchemeType
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getSecuritySchemeType()
		 * @generated
		 */
		EEnum SECURITY_SCHEME_TYPE = eINSTANCE.getSecuritySchemeType();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.openapi2.JSONDataType <em>JSON Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.openapi2.JSONDataType
		 * @see edu.uoc.som.openapi2.impl.OpenAPIPackageImpl#getJSONDataType()
		 * @generated
		 */
		EEnum JSON_DATA_TYPE = eINSTANCE.getJSONDataType();

	}

} //OpenAPIPackage
