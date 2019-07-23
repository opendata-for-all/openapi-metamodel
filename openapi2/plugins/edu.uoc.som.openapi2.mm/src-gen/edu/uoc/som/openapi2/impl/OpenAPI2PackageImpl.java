/**
 */
package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.APIKeyLocation;
import edu.uoc.som.openapi2.ArrayContainer;
import edu.uoc.som.openapi2.CollectionFormat;
import edu.uoc.som.openapi2.Contact;
import edu.uoc.som.openapi2.ContainedCollections;
import edu.uoc.som.openapi2.Example;
import edu.uoc.som.openapi2.ExternalDocs;
import edu.uoc.som.openapi2.ExternalDocsContainer;
import edu.uoc.som.openapi2.Header;
import edu.uoc.som.openapi2.Info;
import edu.uoc.som.openapi2.ItemsDefinition;
import edu.uoc.som.openapi2.JSONDataType;
import edu.uoc.som.openapi2.JSONPointer;
import edu.uoc.som.openapi2.JSONSchemaSubset;
import edu.uoc.som.openapi2.License;
import edu.uoc.som.openapi2.OAuth2FlowType;
import edu.uoc.som.openapi2.OpenAPI2Factory;
import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.Operation;
import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.ParameterContainer;
import edu.uoc.som.openapi2.ParameterLocation;
import edu.uoc.som.openapi2.Path;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.RequiredSecurityScheme;
import edu.uoc.som.openapi2.Response;
import edu.uoc.som.openapi2.ResponseContainer;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.SchemaContainer;
import edu.uoc.som.openapi2.SchemeType;
import edu.uoc.som.openapi2.SecurityContainer;
import edu.uoc.som.openapi2.SecurityRequirement;
import edu.uoc.som.openapi2.SecurityScheme;
import edu.uoc.som.openapi2.SecuritySchemeType;
import edu.uoc.som.openapi2.SecurityScope;
import edu.uoc.som.openapi2.Tag;
import edu.uoc.som.openapi2.XMLElement;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPI2PackageImpl extends EPackageImpl implements OpenAPI2Package {
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
	private EClass containedCollectionsEClass = null;

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
	private EClass parameterContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDocsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayContainerEClass = null;

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
	private EClass jsonPointerEClass = null;

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
	private EClass responseEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDefinitionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securitySchemeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredSecuritySchemeEClass = null;

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
	 * @see edu.uoc.som.openapi2.OpenAPI2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpenAPI2PackageImpl() {
		super(eNS_URI, OpenAPI2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpenAPI2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpenAPI2Package init() {
		if (isInited) return (OpenAPI2Package)EPackage.Registry.INSTANCE.getEPackage(OpenAPI2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenAPI2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpenAPI2PackageImpl theOpenAPI2Package = registeredOpenAPI2Package instanceof OpenAPI2PackageImpl ? (OpenAPI2PackageImpl)registeredOpenAPI2Package : new OpenAPI2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOpenAPI2Package.createPackageContents();

		// Initialize created meta-data
		theOpenAPI2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenAPI2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpenAPI2Package.eNS_URI, theOpenAPI2Package);
		return theOpenAPI2Package;
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
	public EClass getContainedCollections() {
		return containedCollectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainedCollections_Paramters() {
		return (EReference)containedCollectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainedCollections_Schemas() {
		return (EReference)containedCollectionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainedCollections_Responses() {
		return (EReference)containedCollectionsEClass.getEStructuralFeatures().get(2);
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
	public EReference getAPI_Info() {
		return (EReference)apiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Host() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_BasePath() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Schemes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Consumes() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAPI_Produces() {
		return (EAttribute)apiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Paths() {
		return (EReference)apiEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Definitions() {
		return (EReference)apiEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Responses() {
		return (EReference)apiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_SecurityDefinitions() {
		return (EReference)apiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Tags() {
		return (EReference)apiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Parameters() {
		return (EReference)apiEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_ContainedCollections() {
		return (EReference)apiEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetAllOperations() {
		return apiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetSchemaByReference__String() {
		return apiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetOperationById__String() {
		return apiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetPathByRelativePath__String() {
		return apiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetParameterByReference__String() {
		return apiEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAPI__GetResponseDefinitionByReference__String() {
		return apiEClass.getEOperations().get(5);
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
	public EReference getPath_Parameters() {
		return (EReference)pathEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPath__GetOperationByHTTPMethod__String() {
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
	public EReference getOperation_Parameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
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
	public EOperation getOperation__GetHTTPMethod() {
		return operationEClass.getEOperations().get(1);
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
	public EReference getParameter_Schema() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getSchema_AdditonalPropertiesAllowed() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(12);
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
	public EReference getResponse_DeclaringContext() {
		return (EReference)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Schema() {
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
	public EClass getParameterContainer() {
		return parameterContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaContainer() {
		return schemaContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseContainer() {
		return responseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalDocsContainer() {
		return externalDocsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalDocsContainer_ExternalDocs() {
		return (EReference)externalDocsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayContainer() {
		return arrayContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayContainer_CollectionFormat() {
		return (EAttribute)arrayContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayContainer_Items() {
		return (EReference)arrayContainerEClass.getEStructuralFeatures().get(1);
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
	public EReference getSecurityRequirement_SecuritySchemes() {
		return (EReference)securityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSONPointer() {
		return jsonPointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJSONPointer_Ref() {
		return (EAttribute)jsonPointerEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getProperty_Required() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_Schema() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseEntry() {
		return responseEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseEntry_Key() {
		return (EAttribute)responseEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseEntry_Value() {
		return (EReference)responseEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaEntry() {
		return schemaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchemaEntry_Key() {
		return (EAttribute)schemaEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchemaEntry_Value() {
		return (EReference)schemaEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseDefinitionEntry() {
		return responseDefinitionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseDefinitionEntry_Key() {
		return (EAttribute)responseDefinitionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseDefinitionEntry_Value() {
		return (EReference)responseDefinitionEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterEntry() {
		return parameterEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterEntry_Key() {
		return (EAttribute)parameterEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterEntry_Value() {
		return (EReference)parameterEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityContainer() {
		return securityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityContainer_Security() {
		return (EReference)securityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecuritySchemeEntry() {
		return securitySchemeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecuritySchemeEntry_Key() {
		return (EAttribute)securitySchemeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecuritySchemeEntry_Value() {
		return (EReference)securitySchemeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredSecurityScheme() {
		return requiredSecuritySchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredSecurityScheme_SecurityScopes() {
		return (EReference)requiredSecuritySchemeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredSecurityScheme_SecurityScheme() {
		return (EReference)requiredSecuritySchemeEClass.getEStructuralFeatures().get(1);
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
	public OpenAPI2Factory getOpenAPI2Factory() {
		return (OpenAPI2Factory)getEFactoryInstance();
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

		containedCollectionsEClass = createEClass(CONTAINED_COLLECTIONS);
		createEReference(containedCollectionsEClass, CONTAINED_COLLECTIONS__PARAMTERS);
		createEReference(containedCollectionsEClass, CONTAINED_COLLECTIONS__SCHEMAS);
		createEReference(containedCollectionsEClass, CONTAINED_COLLECTIONS__RESPONSES);

		apiEClass = createEClass(API);
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
		createEReference(apiEClass, API__PARAMETERS);
		createEReference(apiEClass, API__CONTAINED_COLLECTIONS);
		createEOperation(apiEClass, API___GET_ALL_OPERATIONS);
		createEOperation(apiEClass, API___GET_SCHEMA_BY_REFERENCE__STRING);
		createEOperation(apiEClass, API___GET_OPERATION_BY_ID__STRING);
		createEOperation(apiEClass, API___GET_PATH_BY_RELATIVE_PATH__STRING);
		createEOperation(apiEClass, API___GET_PARAMETER_BY_REFERENCE__STRING);
		createEOperation(apiEClass, API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING);

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
		createEReference(pathEClass, PATH__PARAMETERS);
		createEOperation(pathEClass, PATH___GET_OPERATION_BY_HTTP_METHOD__STRING);

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
		createEReference(operationEClass, OPERATION__PARAMETERS);
		createEOperation(operationEClass, OPERATION___GET_FULL_PATH);
		createEOperation(operationEClass, OPERATION___GET_HTTP_METHOD);

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
		createEReference(parameterEClass, PARAMETER__SCHEMA);

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
		createEAttribute(schemaEClass, SCHEMA__ADDITONAL_PROPERTIES_ALLOWED);
		createEOperation(schemaEClass, SCHEMA___GET_PROPERTY_BY_NAME__STRING);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__DESCRIPTION);
		createEReference(responseEClass, RESPONSE__HEADERS);
		createEReference(responseEClass, RESPONSE__EXAMPLES);
		createEReference(responseEClass, RESPONSE__DECLARING_CONTEXT);
		createEReference(responseEClass, RESPONSE__SCHEMA);

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

		parameterContainerEClass = createEClass(PARAMETER_CONTAINER);

		schemaContainerEClass = createEClass(SCHEMA_CONTAINER);

		responseContainerEClass = createEClass(RESPONSE_CONTAINER);

		externalDocsContainerEClass = createEClass(EXTERNAL_DOCS_CONTAINER);
		createEReference(externalDocsContainerEClass, EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS);

		arrayContainerEClass = createEClass(ARRAY_CONTAINER);
		createEAttribute(arrayContainerEClass, ARRAY_CONTAINER__COLLECTION_FORMAT);
		createEReference(arrayContainerEClass, ARRAY_CONTAINER__ITEMS);

		securityRequirementEClass = createEClass(SECURITY_REQUIREMENT);
		createEReference(securityRequirementEClass, SECURITY_REQUIREMENT__SECURITY_SCHEMES);

		jsonPointerEClass = createEClass(JSON_POINTER);
		createEAttribute(jsonPointerEClass, JSON_POINTER__REF);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__REQUIRED);
		createEReference(propertyEClass, PROPERTY__SCHEMA);
		createEAttribute(propertyEClass, PROPERTY__NAME);

		responseEntryEClass = createEClass(RESPONSE_ENTRY);
		createEAttribute(responseEntryEClass, RESPONSE_ENTRY__KEY);
		createEReference(responseEntryEClass, RESPONSE_ENTRY__VALUE);

		schemaEntryEClass = createEClass(SCHEMA_ENTRY);
		createEAttribute(schemaEntryEClass, SCHEMA_ENTRY__KEY);
		createEReference(schemaEntryEClass, SCHEMA_ENTRY__VALUE);

		responseDefinitionEntryEClass = createEClass(RESPONSE_DEFINITION_ENTRY);
		createEAttribute(responseDefinitionEntryEClass, RESPONSE_DEFINITION_ENTRY__KEY);
		createEReference(responseDefinitionEntryEClass, RESPONSE_DEFINITION_ENTRY__VALUE);

		parameterEntryEClass = createEClass(PARAMETER_ENTRY);
		createEAttribute(parameterEntryEClass, PARAMETER_ENTRY__KEY);
		createEReference(parameterEntryEClass, PARAMETER_ENTRY__VALUE);

		securityContainerEClass = createEClass(SECURITY_CONTAINER);
		createEReference(securityContainerEClass, SECURITY_CONTAINER__SECURITY);

		securitySchemeEntryEClass = createEClass(SECURITY_SCHEME_ENTRY);
		createEAttribute(securitySchemeEntryEClass, SECURITY_SCHEME_ENTRY__KEY);
		createEReference(securitySchemeEntryEClass, SECURITY_SCHEME_ENTRY__VALUE);

		requiredSecuritySchemeEClass = createEClass(REQUIRED_SECURITY_SCHEME);
		createEReference(requiredSecuritySchemeEClass, REQUIRED_SECURITY_SCHEME__SECURITY_SCOPES);
		createEReference(requiredSecuritySchemeEClass, REQUIRED_SECURITY_SCHEME__SECURITY_SCHEME);

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
		apiEClass.getESuperTypes().add(this.getExternalDocsContainer());
		apiEClass.getESuperTypes().add(this.getSecurityContainer());
		pathEClass.getESuperTypes().add(this.getParameterContainer());
		operationEClass.getESuperTypes().add(this.getParameterContainer());
		operationEClass.getESuperTypes().add(this.getExternalDocsContainer());
		operationEClass.getESuperTypes().add(this.getSecurityContainer());
		operationEClass.getESuperTypes().add(this.getResponseContainer());
		parameterEClass.getESuperTypes().add(this.getSchemaContainer());
		parameterEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		parameterEClass.getESuperTypes().add(this.getArrayContainer());
		parameterEClass.getESuperTypes().add(this.getJSONPointer());
		itemsDefinitionEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		itemsDefinitionEClass.getESuperTypes().add(this.getArrayContainer());
		schemaEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		schemaEClass.getESuperTypes().add(this.getSchemaContainer());
		schemaEClass.getESuperTypes().add(this.getExternalDocsContainer());
		schemaEClass.getESuperTypes().add(this.getJSONPointer());
		responseEClass.getESuperTypes().add(this.getSchemaContainer());
		responseEClass.getESuperTypes().add(this.getJSONPointer());
		headerEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		headerEClass.getESuperTypes().add(this.getArrayContainer());
		tagEClass.getESuperTypes().add(this.getExternalDocsContainer());
		propertyEClass.getESuperTypes().add(this.getJSONPointer());
		propertyEClass.getESuperTypes().add(this.getSchemaContainer());
		schemaEntryEClass.getESuperTypes().add(this.getSchemaContainer());
		responseDefinitionEntryEClass.getESuperTypes().add(this.getResponseContainer());
		parameterEntryEClass.getESuperTypes().add(this.getParameterContainer());

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
		initEAttribute(getJSONSchemaSubset_UniqueItems(), ecorePackage.getEBooleanObject(), "uniqueItems", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Enum(), ecorePackage.getEString(), "enum", null, 0, -1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_Default(), ecorePackage.getEString(), "default", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJSONSchemaSubset_MultipleOf(), ecorePackage.getEDoubleObject(), "multipleOf", null, 0, 1, JSONSchemaSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containedCollectionsEClass, ContainedCollections.class, "ContainedCollections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainedCollections_Paramters(), this.getParameter(), null, "paramters", null, 0, -1, ContainedCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainedCollections_Schemas(), this.getSchema(), null, "schemas", null, 0, -1, ContainedCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainedCollections_Responses(), this.getResponse(), null, "responses", null, 0, -1, ContainedCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, edu.uoc.som.openapi2.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPI_Info(), this.getInfo(), null, "info", null, 0, 1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Host(), ecorePackage.getEString(), "host", null, 0, 1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Paths(), this.getPath(), this.getPath_Api(), "paths", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Definitions(), this.getSchemaEntry(), null, "definitions", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Responses(), this.getResponseDefinitionEntry(), null, "responses", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_SecurityDefinitions(), this.getSecuritySchemeEntry(), null, "securityDefinitions", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Tags(), this.getTag(), null, "tags", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Parameters(), this.getParameterEntry(), null, "parameters", null, 0, -1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_ContainedCollections(), this.getContainedCollections(), null, "containedCollections", null, 0, 1, edu.uoc.som.openapi2.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAPI__GetAllOperations(), this.getOperation(), "getAllOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAPI__GetSchemaByReference__String(), this.getSchema(), "getSchemaByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetOperationById__String(), this.getOperation(), "getOperationById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "operationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetPathByRelativePath__String(), this.getPath(), "getPathByRelativePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "relativePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetParameterByReference__String(), this.getParameter(), "getParameterByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetResponseDefinitionByReference__String(), this.getResponse(), "getResponseDefinitionByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getPath_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPath__GetOperationByHTTPMethod__String(), this.getOperation(), "getOperationByHTTPMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_TagReferences(), ecorePackage.getEString(), "tagReferences", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OperationId(), ecorePackage.getEString(), "operationId", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Responses(), this.getResponseEntry(), null, "responses", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperation__GetFullPath(), ecorePackage.getEString(), "getFullPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__GetHTTPMethod(), ecorePackage.getEString(), "getHTTPMethod", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(externalDocsEClass, ExternalDocs.class, "ExternalDocs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDocs_Description(), ecorePackage.getEString(), "description", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDocs_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExternalDocs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Location(), this.getParameterLocation(), "location", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_AllowEmplyValue(), ecorePackage.getEBooleanObject(), "allowEmplyValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_DeclaringContext(), this.getParameterContainer(), null, "declaringContext", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Example(), ecorePackage.getEString(), "example", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Schema(), this.getSchema(), null, "schema", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getSchema_DeclaringContext(), this.getSchemaContainer(), null, "declaringContext", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_AdditonalPropertiesAllowed(), ecorePackage.getEBooleanObject(), "additonalPropertiesAllowed", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSchema__GetPropertyByName__String(), this.getProperty(), "getPropertyByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Description(), ecorePackage.getEString(), "description", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Headers(), this.getHeader(), null, "headers", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Examples(), this.getExample(), null, "examples", null, 0, -1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_DeclaringContext(), this.getResponseContainer(), null, "declaringContext", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Schema(), this.getSchema(), null, "schema", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(parameterContainerEClass, ParameterContainer.class, "ParameterContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schemaContainerEClass, SchemaContainer.class, "SchemaContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseContainerEClass, ResponseContainer.class, "ResponseContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalDocsContainerEClass, ExternalDocsContainer.class, "ExternalDocsContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalDocsContainer_ExternalDocs(), this.getExternalDocs(), null, "externalDocs", null, 0, 1, ExternalDocsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayContainerEClass, ArrayContainer.class, "ArrayContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayContainer_CollectionFormat(), this.getCollectionFormat(), "collectionFormat", null, 0, 1, ArrayContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayContainer_Items(), this.getItemsDefinition(), null, "items", null, 0, 1, ArrayContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRequirementEClass, SecurityRequirement.class, "SecurityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityRequirement_SecuritySchemes(), this.getRequiredSecurityScheme(), null, "securitySchemes", null, 0, -1, SecurityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonPointerEClass, JSONPointer.class, "JSONPointer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJSONPointer_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, JSONPointer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Schema(), this.getSchema(), null, "schema", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEntryEClass, Map.Entry.class, "ResponseEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseEntry_Value(), this.getResponse(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEntryEClass, Map.Entry.class, "SchemaEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaEntry_Value(), this.getSchema(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseDefinitionEntryEClass, Map.Entry.class, "ResponseDefinitionEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDefinitionEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDefinitionEntry_Value(), this.getResponse(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEntryEClass, Map.Entry.class, "ParameterEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterEntry_Value(), this.getParameter(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityContainerEClass, SecurityContainer.class, "SecurityContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityContainer_Security(), this.getSecurityRequirement(), null, "security", null, 0, -1, SecurityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securitySchemeEntryEClass, Map.Entry.class, "SecuritySchemeEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecuritySchemeEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecuritySchemeEntry_Value(), this.getSecurityScheme(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredSecuritySchemeEClass, RequiredSecurityScheme.class, "RequiredSecurityScheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredSecurityScheme_SecurityScopes(), this.getSecurityScope(), null, "securityScopes", null, 0, -1, RequiredSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequiredSecurityScheme_SecurityScheme(), this.getSecurityScheme(), null, "securityScheme", null, 0, 1, RequiredSecurityScheme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	}

} //OpenAPI2PackageImpl
