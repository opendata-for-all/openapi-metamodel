/**
 */
package edu.uoc.som.openapi.impl;

import edu.uoc.som.openapi.APIKeyLocation;
import edu.uoc.som.openapi.ArrayContext;
import edu.uoc.som.openapi.CollectionFormat;
import edu.uoc.som.openapi.Contact;
import edu.uoc.som.openapi.Example;
import edu.uoc.som.openapi.ExternalDocs;
import edu.uoc.som.openapi.ExternalDocsContext;
import edu.uoc.som.openapi.Header;
import edu.uoc.som.openapi.Info;
import edu.uoc.som.openapi.ItemsDefinition;
import edu.uoc.som.openapi.JSONDataType;
import edu.uoc.som.openapi.JSONSchemaSubset;
import edu.uoc.som.openapi.License;
import edu.uoc.som.openapi.OAuth2FlowType;
import edu.uoc.som.openapi.OpenAPIFactory;
import edu.uoc.som.openapi.OpenAPIPackage;
import edu.uoc.som.openapi.Operation;
import edu.uoc.som.openapi.Parameter;
import edu.uoc.som.openapi.ParameterContext;
import edu.uoc.som.openapi.ParameterDeclaringContext;
import edu.uoc.som.openapi.ParameterLocation;
import edu.uoc.som.openapi.Path;
import edu.uoc.som.openapi.Property;
import edu.uoc.som.openapi.ReferenceableElement;
import edu.uoc.som.openapi.Response;
import edu.uoc.som.openapi.ResponseDeclaringContext;
import edu.uoc.som.openapi.Root;
import edu.uoc.som.openapi.Schema;
import edu.uoc.som.openapi.SchemaContext;
import edu.uoc.som.openapi.SchemaDeclaringContext;
import edu.uoc.som.openapi.SchemeType;
import edu.uoc.som.openapi.SecurityContext;
import edu.uoc.som.openapi.SecurityRequirement;
import edu.uoc.som.openapi.SecurityScheme;
import edu.uoc.som.openapi.SecuritySchemeType;
import edu.uoc.som.openapi.SecurityScope;
import edu.uoc.som.openapi.Tag;
import edu.uoc.som.openapi.XMLElement;

import edu.uoc.som.openapi.util.OpenAPIValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPIPackageImpl extends EPackageImpl implements OpenAPIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonSchemaSubsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemsDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDeclaringContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDeclaringContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDeclaringContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocsContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oAuth2FlowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiKeyLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securitySchemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.openapi.OpenAPIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenAPIPackageImpl() {
		super(eNS_URI, OpenAPIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OpenAPIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenAPIPackage init() {
		if (isInited) return (OpenAPIPackage)EPackage.Registry.INSTANCE.getEPackage(OpenAPIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenAPIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenAPIPackageImpl theOpenAPIPackage = registeredOpenAPIPackage instanceof OpenAPIPackageImpl ? (OpenAPIPackageImpl)registeredOpenAPIPackage : new OpenAPIPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOpenAPIPackage.createPackageContents();

		// Initialize created meta-data
		theOpenAPIPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOpenAPIPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OpenAPIValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOpenAPIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenAPIPackage.eNS_URI, theOpenAPIPackage);
		return theOpenAPIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONSchemaSubset() {
		return jsonSchemaSubsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Type() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Format() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Description() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Maximum() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_ExclusiveMaximum() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Minimum() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_ExclusiveMinimum() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_MaxLength() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_MinLength() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Pattern() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_MaxItems() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_MinItems() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_UniqueItems() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Enum() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_Default() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONSchemaSubset_MultipleOf() {
		return (EAttribute)jsonSchemaSubsetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Api() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Paramters() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Schemas() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoot_Responses() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPI() {
		return apiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Swagger() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Info() {
		return (EReference)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Host() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_BasePath() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Schemes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Consumes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Produces() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Paths() {
		return (EReference)apiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Definitions() {
		return (EReference)apiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Responses() {
		return (EReference)apiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_SecurityDefinitions() {
		return (EReference)apiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Tags() {
		return (EReference)apiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__PathsIsSet() {
		return apiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetAllOperations() {
		return apiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetSchemaByReference__String() {
		return apiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetOperationById__String() {
		return apiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetPathByRelativePath__String() {
		return apiEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetSchemaByName__String() {
		return apiEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetParameterByRef__String() {
		return apiEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetSecuritySchemaByName__String() {
		return apiEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfo() {
		return infoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfo_Title() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfo_Description() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfo_TermsOfService() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfo_Contact() {
		return (EReference)infoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfo_License() {
		return (EReference)infoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfo_Version() {
		return (EAttribute)infoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContact_Name() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContact_Url() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContact_Email() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicense() {
		return licenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicense_Name() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicense_Url() {
		return (EAttribute)licenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPath_RelativePath() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Get() {
		return (EReference)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Put() {
		return (EReference)pathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Post() {
		return (EReference)pathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Delete() {
		return (EReference)pathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Options() {
		return (EReference)pathEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Head() {
		return (EReference)pathEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Patch() {
		return (EReference)pathEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Api() {
		return (EReference)pathEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPath__GetOperationByMethod__String() {
		return pathEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_TagReferences() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Summary() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Description() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_OperationId() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Consumes() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Produces() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Responses() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Schemes() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Deprecated() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation__GetFullPath() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation__GetConsumedSchema() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation__GetProducedSchema() {
		return operationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation__IsProducingList() {
		return operationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOperation__GetMethod() {
		return operationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalDocs() {
		return externalDocsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalDocs_Description() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalDocs_Url() {
		return (EAttribute)externalDocsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Location() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Required() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_AllowEmplyValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_DeclaringContext() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Example() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemsDefinition() {
		return itemsDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Title() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MaxProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_MinProperties() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Example() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_Discriminator() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_ReadOnly() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Properties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_AllOf() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Items() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Xml() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_AdditonalProperties() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_DeclaringContext() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Required() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_AdditonalPropertiesAllowed() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSchema__GetPropertyByName__String() {
		return schemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Description() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Headers() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Examples() {
		return (EReference)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Code() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_DeclaringContext() {
		return (EReference)responseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeader_Name() {
		return (EAttribute)headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTag_Description() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityScheme() {
		return securitySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Type() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Description() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Name() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Location() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_Flow() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_AuthorizationUrl() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScheme_TokenUrl() {
		return (EAttribute)securitySchemeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityScheme_Scopes() {
		return (EReference)securitySchemeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSecurityScheme__GetSecurityScopeByName__String() {
		return securitySchemeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExample() {
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_MimeType() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_Value() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLElement() {
		return xmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLElement_Name() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLElement_Namespace() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLElement_Prefix() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLElement_Attribute() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLElement_Wrapped() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityScope() {
		return securityScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScope_Name() {
		return (EAttribute)securityScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityScope_Description() {
		return (EAttribute)securityScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDeclaringContext() {
		return parameterDeclaringContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaDeclaringContext() {
		return schemaDeclaringContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseDeclaringContext() {
		return responseDeclaringContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityContext() {
		return securityContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityContext_Security() {
		return (EReference)securityContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterContext() {
		return parameterContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterContext_Parameters() {
		return (EReference)parameterContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaContext() {
		return schemaContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaContext_Schema() {
		return (EReference)schemaContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalDocsContext() {
		return externalDocsContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalDocsContext_ExternalDocs() {
		return (EReference)externalDocsContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayContext() {
		return arrayContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayContext_CollectionFormat() {
		return (EAttribute)arrayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayContext_Items() {
		return (EReference)arrayContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityRequirement() {
		return securityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityRequirement_SecurityScopes() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityRequirement_SecurityScheme() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceableElement() {
		return referenceableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceableElement_ReferenceName() {
		return (EAttribute)referenceableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceableElement__GetRef() {
		return referenceableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSchemeType() {
		return schemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterLocation() {
		return parameterLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCollectionFormat() {
		return collectionFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOAuth2FlowType() {
		return oAuth2FlowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAPIKeyLocation() {
		return apiKeyLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecuritySchemeType() {
		return securitySchemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJSONDataType() {
		return jsonDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAPIFactory getOpenAPIFactory() {
		return (OpenAPIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jsonSchemaSubsetEClass = createEClass(JSON_SCHEMA_SUBSET);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__TYPE);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__FORMAT);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__DESCRIPTION);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MAXIMUM);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MINIMUM);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MAX_LENGTH);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MIN_LENGTH);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__PATTERN);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MAX_ITEMS);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MIN_ITEMS);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__UNIQUE_ITEMS);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__ENUM);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__DEFAULT);
		createEAttribute(jsonSchemaSubsetEClass, JSON_SCHEMA_SUBSET__MULTIPLE_OF);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__API);
		createEReference(rootEClass, ROOT__PARAMTERS);
		createEReference(rootEClass, ROOT__SCHEMAS);
		createEReference(rootEClass, ROOT__RESPONSES);

		apiEClass = createEClass(API);
		createEAttribute(apiEClass, API__SWAGGER);
		createEReference(apiEClass, API__INFO);
		createEAttribute(apiEClass, API__HOST);
		createEAttribute(apiEClass, API__BASE_PATH);
		createEAttribute(apiEClass, API__SCHEMES);
		createEAttribute(apiEClass, API__CONSUMES);
		createEAttribute(apiEClass, API__PRODUCES);
		createEReference(apiEClass, API__PATHS);
		createEReference(apiEClass, API__DEFINITIONS);
		createEReference(apiEClass, API__RESPONSES);
		createEReference(apiEClass, API__SECURITY_DEFINITIONS);
		createEReference(apiEClass, API__TAGS);
		createEOperation(apiEClass, API___PATHS_IS_SET);
		createEOperation(apiEClass, API___GET_ALL_OPERATIONS);
		createEOperation(apiEClass, API___GET_SCHEMA_BY_REFERENCE__STRING);
		createEOperation(apiEClass, API___GET_OPERATION_BY_ID__STRING);
		createEOperation(apiEClass, API___GET_PATH_BY_RELATIVE_PATH__STRING);
		createEOperation(apiEClass, API___GET_SCHEMA_BY_NAME__STRING);
		createEOperation(apiEClass, API___GET_PARAMETER_BY_REF__STRING);
		createEOperation(apiEClass, API___GET_SECURITY_SCHEMA_BY_NAME__STRING);

		infoEClass = createEClass(INFO);
		createEAttribute(infoEClass, INFO__TITLE);
		createEAttribute(infoEClass, INFO__DESCRIPTION);
		createEAttribute(infoEClass, INFO__TERMS_OF_SERVICE);
		createEReference(infoEClass, INFO__CONTACT);
		createEReference(infoEClass, INFO__LICENSE);
		createEAttribute(infoEClass, INFO__VERSION);

		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__NAME);
		createEAttribute(contactEClass, CONTACT__URL);
		createEAttribute(contactEClass, CONTACT__EMAIL);

		licenseEClass = createEClass(LICENSE);
		createEAttribute(licenseEClass, LICENSE__NAME);
		createEAttribute(licenseEClass, LICENSE__URL);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__RELATIVE_PATH);
		createEReference(pathEClass, PATH__GET);
		createEReference(pathEClass, PATH__PUT);
		createEReference(pathEClass, PATH__POST);
		createEReference(pathEClass, PATH__DELETE);
		createEReference(pathEClass, PATH__OPTIONS);
		createEReference(pathEClass, PATH__HEAD);
		createEReference(pathEClass, PATH__PATCH);
		createEReference(pathEClass, PATH__API);
		createEOperation(pathEClass, PATH___GET_OPERATION_BY_METHOD__STRING);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__TAG_REFERENCES);
		createEAttribute(operationEClass, OPERATION__SUMMARY);
		createEAttribute(operationEClass, OPERATION__DESCRIPTION);
		createEAttribute(operationEClass, OPERATION__OPERATION_ID);
		createEAttribute(operationEClass, OPERATION__CONSUMES);
		createEAttribute(operationEClass, OPERATION__PRODUCES);
		createEReference(operationEClass, OPERATION__RESPONSES);
		createEAttribute(operationEClass, OPERATION__SCHEMES);
		createEAttribute(operationEClass, OPERATION__DEPRECATED);
		createEOperation(operationEClass, OPERATION___GET_FULL_PATH);
		createEOperation(operationEClass, OPERATION___GET_CONSUMED_SCHEMA);
		createEOperation(operationEClass, OPERATION___GET_PRODUCED_SCHEMA);
		createEOperation(operationEClass, OPERATION___IS_PRODUCING_LIST);
		createEOperation(operationEClass, OPERATION___GET_METHOD);

		externalDocsEClass = createEClass(EXTERNAL_DOCS);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__DESCRIPTION);
		createEAttribute(externalDocsEClass, EXTERNAL_DOCS__URL);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__LOCATION);
		createEAttribute(parameterEClass, PARAMETER__REQUIRED);
		createEAttribute(parameterEClass, PARAMETER__ALLOW_EMPLY_VALUE);
		createEReference(parameterEClass, PARAMETER__DECLARING_CONTEXT);
		createEAttribute(parameterEClass, PARAMETER__EXAMPLE);

		itemsDefinitionEClass = createEClass(ITEMS_DEFINITION);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__TITLE);
		createEAttribute(schemaEClass, SCHEMA__MAX_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__MIN_PROPERTIES);
		createEAttribute(schemaEClass, SCHEMA__EXAMPLE);
		createEAttribute(schemaEClass, SCHEMA__DISCRIMINATOR);
		createEAttribute(schemaEClass, SCHEMA__READ_ONLY);
		createEReference(schemaEClass, SCHEMA__PROPERTIES);
		createEReference(schemaEClass, SCHEMA__ALL_OF);
		createEReference(schemaEClass, SCHEMA__ITEMS);
		createEReference(schemaEClass, SCHEMA__XML);
		createEReference(schemaEClass, SCHEMA__ADDITONAL_PROPERTIES);
		createEReference(schemaEClass, SCHEMA__DECLARING_CONTEXT);
		createEReference(schemaEClass, SCHEMA__REQUIRED);
		createEAttribute(schemaEClass, SCHEMA__ADDITONAL_PROPERTIES_ALLOWED);
		createEOperation(schemaEClass, SCHEMA___GET_PROPERTY_BY_NAME__STRING);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__DESCRIPTION);
		createEReference(responseEClass, RESPONSE__HEADERS);
		createEReference(responseEClass, RESPONSE__EXAMPLES);
		createEAttribute(responseEClass, RESPONSE__CODE);
		createEReference(responseEClass, RESPONSE__DECLARING_CONTEXT);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__NAME);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__DESCRIPTION);

		securitySchemeEClass = createEClass(SECURITY_SCHEME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__TYPE);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__DESCRIPTION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__NAME);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__LOCATION);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__FLOW);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__AUTHORIZATION_URL);
		createEAttribute(securitySchemeEClass, SECURITY_SCHEME__TOKEN_URL);
		createEReference(securitySchemeEClass, SECURITY_SCHEME__SCOPES);
		createEOperation(securitySchemeEClass, SECURITY_SCHEME___GET_SECURITY_SCOPE_BY_NAME__STRING);

		exampleEClass = createEClass(EXAMPLE);
		createEAttribute(exampleEClass, EXAMPLE__MIME_TYPE);
		createEAttribute(exampleEClass, EXAMPLE__VALUE);

		xmlElementEClass = createEClass(XML_ELEMENT);
		createEAttribute(xmlElementEClass, XML_ELEMENT__NAME);
		createEAttribute(xmlElementEClass, XML_ELEMENT__NAMESPACE);
		createEAttribute(xmlElementEClass, XML_ELEMENT__PREFIX);
		createEAttribute(xmlElementEClass, XML_ELEMENT__ATTRIBUTE);
		createEAttribute(xmlElementEClass, XML_ELEMENT__WRAPPED);

		securityScopeEClass = createEClass(SECURITY_SCOPE);
		createEAttribute(securityScopeEClass, SECURITY_SCOPE__NAME);
		createEAttribute(securityScopeEClass, SECURITY_SCOPE__DESCRIPTION);

		parameterDeclaringContextEClass = createEClass(PARAMETER_DECLARING_CONTEXT);

		schemaDeclaringContextEClass = createEClass(SCHEMA_DECLARING_CONTEXT);

		responseDeclaringContextEClass = createEClass(RESPONSE_DECLARING_CONTEXT);

		securityContextEClass = createEClass(SECURITY_CONTEXT);
		createEReference(securityContextEClass, SECURITY_CONTEXT__SECURITY);

		parameterContextEClass = createEClass(PARAMETER_CONTEXT);
		createEReference(parameterContextEClass, PARAMETER_CONTEXT__PARAMETERS);

		schemaContextEClass = createEClass(SCHEMA_CONTEXT);
		createEReference(schemaContextEClass, SCHEMA_CONTEXT__SCHEMA);

		externalDocsContextEClass = createEClass(EXTERNAL_DOCS_CONTEXT);
		createEReference(externalDocsContextEClass, EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS);

		arrayContextEClass = createEClass(ARRAY_CONTEXT);
		createEAttribute(arrayContextEClass, ARRAY_CONTEXT__COLLECTION_FORMAT);
		createEReference(arrayContextEClass, ARRAY_CONTEXT__ITEMS);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_SCOPES);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_SCHEME);

		referenceableElementEClass = createEClass(REFERENCEABLE_ELEMENT);
		createEAttribute(referenceableElementEClass, REFERENCEABLE_ELEMENT__REFERENCE_NAME);
		createEOperation(referenceableElementEClass, REFERENCEABLE_ELEMENT___GET_REF);

		propertyEClass = createEClass(PROPERTY);

		// Create enums
		schemeTypeEEnum = createEEnum(SCHEME_TYPE);
		parameterLocationEEnum = createEEnum(PARAMETER_LOCATION);
		collectionFormatEEnum = createEEnum(COLLECTION_FORMAT);
		oAuth2FlowTypeEEnum = createEEnum(OAUTH2_FLOW_TYPE);
		apiKeyLocationEEnum = createEEnum(API_KEY_LOCATION);
		securitySchemeTypeEEnum = createEEnum(SECURITY_SCHEME_TYPE);
		jsonDataTypeEEnum = createEEnum(JSON_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apiEClass.getESuperTypes().add(this.getParameterDeclaringContext());
		apiEClass.getESuperTypes().add(this.getSchemaDeclaringContext());
		apiEClass.getESuperTypes().add(this.getSecurityContext());
		apiEClass.getESuperTypes().add(this.getParameterContext());
		apiEClass.getESuperTypes().add(this.getExternalDocsContext());
		apiEClass.getESuperTypes().add(this.getResponseDeclaringContext());
		pathEClass.getESuperTypes().add(this.getParameterDeclaringContext());
		pathEClass.getESuperTypes().add(this.getParameterContext());
		operationEClass.getESuperTypes().add(this.getParameterDeclaringContext());
		operationEClass.getESuperTypes().add(this.getSecurityContext());
		operationEClass.getESuperTypes().add(this.getParameterContext());
		operationEClass.getESuperTypes().add(this.getExternalDocsContext());
		operationEClass.getESuperTypes().add(this.getResponseDeclaringContext());
		parameterEClass.getESuperTypes().add(this.getSchemaDeclaringContext());
		parameterEClass.getESuperTypes().add(this.getSchemaContext());
		parameterEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		parameterEClass.getESuperTypes().add(this.getArrayContext());
		parameterEClass.getESuperTypes().add(this.getReferenceableElement());
		itemsDefinitionEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		itemsDefinitionEClass.getESuperTypes().add(this.getArrayContext());
		schemaEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		schemaEClass.getESuperTypes().add(this.getSchemaDeclaringContext());
		schemaEClass.getESuperTypes().add(this.getExternalDocsContext());
		schemaEClass.getESuperTypes().add(this.getReferenceableElement());
		responseEClass.getESuperTypes().add(this.getSchemaDeclaringContext());
		responseEClass.getESuperTypes().add(this.getSchemaContext());
		responseEClass.getESuperTypes().add(this.getReferenceableElement());
		headerEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		headerEClass.getESuperTypes().add(this.getArrayContext());
		tagEClass.getESuperTypes().add(this.getExternalDocsContext());
		securitySchemeEClass.getESuperTypes().add(this.getReferenceableElement());
		propertyEClass.getESuperTypes().add(this.getReferenceableElement());
		propertyEClass.getESuperTypes().add(this.getSchemaContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(jsonSchemaSubsetEClass, JSONSchemaSubset.class, "JSONSchemaSubset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONSchemaSubset_Type(), this.getJSONDataType(), "type", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Format(), ecorePackage.getEString(), "format", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Description(), ecorePackage.getEString(), "description", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Maximum(), ecorePackage.getEDoubleObject(), "maximum", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_ExclusiveMaximum(), ecorePackage.getEBooleanObject(), "exclusiveMaximum", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Minimum(), ecorePackage.getEDoubleObject(), "minimum", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_ExclusiveMinimum(), ecorePackage.getEBooleanObject(), "exclusiveMinimum", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MinLength(), ecorePackage.getEIntegerObject(), "minLength", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MaxItems(), ecorePackage.getEIntegerObject(), "maxItems", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MinItems(), ecorePackage.getEIntegerObject(), "minItems", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_UniqueItems(), ecorePackage.getEBooleanObject(), "uniqueItems", "false", 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Enum(), ecorePackage.getEString(), "enum", null, 0, -1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Default(), ecorePackage.getEString(), "default", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MultipleOf(), ecorePackage.getEDoubleObject(), "multipleOf", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Api(), this.getAPI(), null, "api", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Paramters(), this.getParameter(), null, "paramters", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Schemas(), this.getSchema(), null, "schemas", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Responses(), this.getResponse(), null, "responses", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, edu.uoc.som.openapi.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPI_Swagger(), ecorePackage.getEString(), "swagger", null, 0, 1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Info(), this.getInfo(), null, "info", null, 0, 1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Host(), ecorePackage.getEString(), "host", null, 0, 1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Paths(), this.getPath(), this.getPath_Api(), "paths", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Definitions(), this.getSchema(), null, "definitions", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Responses(), this.getResponse(), null, "responses", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_SecurityDefinitions(), this.getSecurityScheme(), null, "securityDefinitions", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Tags(), this.getTag(), null, "tags", null, 0, -1, edu.uoc.som.openapi.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAPI__PathsIsSet(), ecorePackage.getEBoolean(), "pathsIsSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAPI__GetAllOperations(), this.getOperation(), "getAllOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAPI__GetSchemaByReference__String(), this.getSchema(), "getSchemaByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetOperationById__String(), this.getOperation(), "getOperationById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "operationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetPathByRelativePath__String(), this.getPath(), "getPathByRelativePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "relativePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetSchemaByName__String(), this.getSchema(), "getSchemaByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetParameterByRef__String(), this.getParameter(), "getParameterByRef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetSecuritySchemaByName__String(), this.getSecurityScheme(), "getSecuritySchemaByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(infoEClass, Info.class, "Info", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfo_Title(), ecorePackage.getEString(), "title", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_TermsOfService(), ecorePackage.getEString(), "termsOfService", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_Contact(), this.getContact(), null, "contact", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfo_License(), this.getLicense(), null, "license", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfo_Version(), ecorePackage.getEString(), "version", null, 0, 1, Info.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Url(), ecorePackage.getEString(), "url", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Email(), ecorePackage.getEString(), "email", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(licenseEClass, License.class, "License", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLicense_Name(), ecorePackage.getEString(), "name", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLicense_Url(), ecorePackage.getEString(), "url", null, 0, 1, License.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_RelativePath(), ecorePackage.getEString(), "relativePath", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Get(), this.getOperation(), null, "get", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Put(), this.getOperation(), null, "put", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Post(), this.getOperation(), null, "post", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Delete(), this.getOperation(), null, "delete", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Options(), this.getOperation(), null, "options", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Head(), this.getOperation(), null, "head", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Patch(), this.getOperation(), null, "patch", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Api(), this.getAPI(), this.getAPI_Paths(), "api", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPath__GetOperationByMethod__String(), this.getOperation(), "getOperationByMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_TagReferences(), ecorePackage.getEString(), "tagReferences", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OperationId(), ecorePackage.getEString(), "operationId", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Responses(), this.getResponse(), null, "responses", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperation__GetFullPath(), ecorePackage.getEString(), "getFullPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__GetConsumedSchema(), this.getSchema(), "getConsumedSchema", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__GetProducedSchema(), this.getSchema(), "getProducedSchema", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__IsProducingList(), ecorePackage.getEBoolean(), "IsProducingList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__GetMethod(), ecorePackage.getEString(), "getMethod", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalDocsEClass, ExternalDocs.class, "ExternalDocs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDocs_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDocs_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Location(), this.getParameterLocation(), "location", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_AllowEmplyValue(), ecorePackage.getEBooleanObject(), "allowEmplyValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DeclaringContext(), this.getParameterDeclaringContext(), null, "declaringContext", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Example(), ecorePackage.getEString(), "example", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemsDefinitionEClass, ItemsDefinition.class, "ItemsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_Title(), ecorePackage.getEString(), "title", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MaxProperties(), ecorePackage.getEIntegerObject(), "maxProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_MinProperties(), ecorePackage.getEIntegerObject(), "minProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Example(), ecorePackage.getEString(), "example", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_Discriminator(), ecorePackage.getEString(), "discriminator", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_ReadOnly(), ecorePackage.getEBooleanObject(), "readOnly", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Properties(), this.getProperty(), null, "properties", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AllOf(), this.getSchema(), null, "allOf", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Items(), this.getSchema(), null, "items", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Xml(), this.getXMLElement(), null, "xml", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_AdditonalProperties(), this.getSchema(), null, "additonalProperties", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_DeclaringContext(), this.getSchemaDeclaringContext(), null, "declaringContext", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Required(), this.getProperty(), null, "required", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_AdditonalPropertiesAllowed(), ecorePackage.getEBooleanObject(), "additonalPropertiesAllowed", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSchema__GetPropertyByName__String(), this.getProperty(), "getPropertyByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Description(), ecorePackage.getEString(), "description", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Headers(), this.getHeader(), null, "headers", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Examples(), this.getExample(), null, "examples", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Code(), ecorePackage.getEString(), "code", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_DeclaringContext(), this.getResponseDeclaringContext(), null, "declaringContext", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, Header.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securitySchemeEClass, SecurityScheme.class, "SecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScheme_Type(), this.getSecuritySchemeType(), "type", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Location(), this.getAPIKeyLocation(), "location", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_Flow(), this.getOAuth2FlowType(), "flow", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_AuthorizationUrl(), ecorePackage.getEString(), "authorizationUrl", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScheme_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 0, 1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityScheme_Scopes(), this.getSecurityScope(), null, "scopes", null, 0, -1, SecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSecurityScheme__GetSecurityScopeByName__String(), this.getSecurityScope(), "getSecurityScopeByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exampleEClass, Example.class, "Example", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExample_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_Value(), ecorePackage.getEString(), "value", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlElementEClass, XMLElement.class, "XMLElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, XMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLElement_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLElement_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, XMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLElement_Attribute(), ecorePackage.getEBooleanObject(), "attribute", null, 0, 1, XMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLElement_Wrapped(), ecorePackage.getEBooleanObject(), "wrapped", null, 0, 1, XMLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityScopeEClass, SecurityScope.class, "SecurityScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityScope_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityScope_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDeclaringContextEClass, ParameterDeclaringContext.class, "ParameterDeclaringContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaDeclaringContextEClass, SchemaDeclaringContext.class, "SchemaDeclaringContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseDeclaringContextEClass, ResponseDeclaringContext.class, "ResponseDeclaringContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityContextEClass, SecurityContext.class, "SecurityContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityContext_Security(), this.getSecurityRequirement(), null, "security", null, 0, -1, SecurityContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterContextEClass, ParameterContext.class, "ParameterContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterContext_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaContextEClass, SchemaContext.class, "SchemaContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaContext_Schema(), this.getSchema(), null, "schema", null, 0, 1, SchemaContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDocsContextEClass, ExternalDocsContext.class, "ExternalDocsContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalDocsContext_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, ExternalDocsContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayContextEClass, ArrayContext.class, "ArrayContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayContext_CollectionFormat(), this.getCollectionFormat(), "collectionFormat", null, 0, 1, ArrayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayContext_Items(), this.getItemsDefinition(), null, "items", null, 0, 1, ArrayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirement_SecurityScopes(), this.getSecurityScope(), null, "securityScopes", null, 0, -1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityRequirement_SecurityScheme(), this.getSecurityScheme(), null, "securityScheme", null, 0, 1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceableElementEClass, ReferenceableElement.class, "ReferenceableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceableElement_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 1, 1, ReferenceableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReferenceableElement__GetRef(), ecorePackage.getEString(), "getRef", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(schemeTypeEEnum, SchemeType.class, "SchemeType");
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTP);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.HTTPS);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.WS);
		addEEnumLiteral(schemeTypeEEnum, SchemeType.WSS);

		initEEnum(parameterLocationEEnum, ParameterLocation.class, "ParameterLocation");
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.UNSPECIFIED);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.QUERY);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.HEADER);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.PATH);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.FORM_DATA);
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.BODY);

		initEEnum(collectionFormatEEnum, CollectionFormat.class, "CollectionFormat");
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.UNSPECIFIED);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.CSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.SSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.TSV);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.PIPES);
		addEEnumLiteral(collectionFormatEEnum, CollectionFormat.MULTI);

		initEEnum(oAuth2FlowTypeEEnum, OAuth2FlowType.class, "OAuth2FlowType");
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.UNSPECIFIED);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.IMPLICIT);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.PASSWORD);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.APPLICATION);
		addEEnumLiteral(oAuth2FlowTypeEEnum, OAuth2FlowType.ACCESS_CODE);

		initEEnum(apiKeyLocationEEnum, APIKeyLocation.class, "APIKeyLocation");
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.UNSPECIFIED);
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.QUERY);
		addEEnumLiteral(apiKeyLocationEEnum, APIKeyLocation.HEADER);

		initEEnum(securitySchemeTypeEEnum, SecuritySchemeType.class, "SecuritySchemeType");
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.UNSPECIFIED);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.BASIC);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.API_KEY);
		addEEnumLiteral(securitySchemeTypeEEnum, SecuritySchemeType.OAUTH2);

		initEEnum(jsonDataTypeEEnum, JSONDataType.class, "JSONDataType");
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.UNSPECIFIED);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.BOOLEAN);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.INTEGER);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.NUMBER);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.STRING);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.OBJECT);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.ARRAY);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.FILE);
		addEEnumLiteral(jsonDataTypeEEnum, JSONDataType.NULL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (apiEClass,
		   source,
		   new String[] {
			   "constraints", "requiredSwaggerVersion correctSwaggerVersion requiredInfoReference requiredPaths"
		   });
		addAnnotation
		  (infoEClass,
		   source,
		   new String[] {
			   "constraints", "requiredTitle requiredAPIVerison"
		   });
		addAnnotation
		  (licenseEClass,
		   source,
		   new String[] {
			   "constraints", "requiredName"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "constraints", "oneBodyParameterAllowed oneFormDataParameterAllowed hasUniqueParameters xorFormAndBody requiredResponses"
		   });
		addAnnotation
		  (externalDocsEClass,
		   source,
		   new String[] {
			   "constraints", "requiredURL"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "constraints", "requiredName requiredLocation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (apiEClass,
		   source,
		   new String[] {
			   "requiredSwaggerVersion", "not self.swagger.oclIsUndefined()",
			   "requiredInfoReference", "not self.info.oclIsUndefined()",
			   "correctSwaggerVersion", "self.swagger = \'2.0\'",
			   "requiredPaths", "pathsIsSet()"
		   });
		addAnnotation
		  (infoEClass,
		   source,
		   new String[] {
			   "requiredTitle", "not self.title.oclIsUndefined()",
			   "requiredAPIVerison", "not self.version.oclIsUndefined()"
		   });
		addAnnotation
		  (licenseEClass,
		   source,
		   new String[] {
			   "requiredName", "not self.name.oclIsUndefined()"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "oneBodyParameterAllowed", "self.parameters-> select(e | e.location = ParameterLocation::\'_body\') -> size() <= 1",
			   "oneFormDataParameterAllowed", "self.parameters-> select(e | e.location = ParameterLocation::\'_formData\') -> size() <= 1",
			   "hasUniqueParameters", "self.parameters -> collect(t | Tuple{name : String = t.name,location : ParameterLocation = t.location})->asSet() -> size() = self.parameters -> size()",
			   "xorFormAndBody", "(parameters-> select(e | e.location =  ParameterLocation::_\'body\') -> size()=1 and parameters-> select(e | e.location =  ParameterLocation::_\'formData\') -> size()=0)\r\n\tor \r\n\t(parameters-> select(e | e.location =  ParameterLocation::_\'body\') -> size()=0 and parameters-> select(e | e.location =  ParameterLocation::_\'formData\') -> size()=1)\r\n\tor \r\n\t(parameters-> select(e | e.location =  ParameterLocation::_\'body\') -> size()=0 and parameters-> select(e | e.location =  ParameterLocation::_\'formData\') -> size()=0)\r\n\t",
			   "requiredResponses", "self.responses -> size() <> 0"
		   });
		addAnnotation
		  (externalDocsEClass,
		   source,
		   new String[] {
			   "requiredURL", "not self.url.oclIsUndefined()"
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "requiredName", "not name.oclIsUndefined()",
			   "requiredLocation", "not location = ParameterLocation::unspecified"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (apiEClass,
		   source,
		   new String[] {
			   "name", "API"
		   });
	}

} //OpenAPIPackageImpl
