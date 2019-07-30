/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.APIKeyLocation;
import edu.uoc.som.openapi3.ArrayContext;
import edu.uoc.som.openapi3.Callback;
import edu.uoc.som.openapi3.CollectionFormat;
import edu.uoc.som.openapi3.Components;
import edu.uoc.som.openapi3.Contact;
import edu.uoc.som.openapi3.ContainedCollections;
import edu.uoc.som.openapi3.Encoding;
import edu.uoc.som.openapi3.Example;
import edu.uoc.som.openapi3.ExternalDocs;
import edu.uoc.som.openapi3.ExternalDocsContext;
import edu.uoc.som.openapi3.Header;
import edu.uoc.som.openapi3.Info;
import edu.uoc.som.openapi3.ItemsDefinition;
import edu.uoc.som.openapi3.JSONDataType;
import edu.uoc.som.openapi3.JSONSchemaSubset;
import edu.uoc.som.openapi3.License;
import edu.uoc.som.openapi3.MediaType;
import edu.uoc.som.openapi3.OAuth2FlowType;
import edu.uoc.som.openapi3.Openapi3Factory;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Operation;
import edu.uoc.som.openapi3.Parameter;
import edu.uoc.som.openapi3.ParameterContainer;
import edu.uoc.som.openapi3.ParameterContext;
import edu.uoc.som.openapi3.ParameterLocation;
import edu.uoc.som.openapi3.Path;
import edu.uoc.som.openapi3.Property;
import edu.uoc.som.openapi3.RequestBody;
import edu.uoc.som.openapi3.Response;
import edu.uoc.som.openapi3.ResponseContainer;
import edu.uoc.som.openapi3.ResponseDefinition;
import edu.uoc.som.openapi3.RuntimeExpression;
import edu.uoc.som.openapi3.Schema;
import edu.uoc.som.openapi3.SchemaContainer;
import edu.uoc.som.openapi3.SchemaContext;
import edu.uoc.som.openapi3.SchemeType;
import edu.uoc.som.openapi3.SecurityRequirement;
import edu.uoc.som.openapi3.SecurityScheme;
import edu.uoc.som.openapi3.SecuritySchemeType;
import edu.uoc.som.openapi3.SecurityScope;
import edu.uoc.som.openapi3.Server;
import edu.uoc.som.openapi3.ServerContainer;
import edu.uoc.som.openapi3.ServerVariable;
import edu.uoc.som.openapi3.Tag;
import edu.uoc.som.openapi3.XMLElement;
import edu.uoc.som.openapi3.link;

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
public class Openapi3PackageImpl extends EPackageImpl implements Openapi3Package {
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
	private EClass responseDefinitionEClass = null;

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
	private EClass propertyEClass = null;

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
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverVariableEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsEClass = null;

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
	private EClass exampleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestBodyEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEntryEClass = null;

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
	private EClass linkEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callbackEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaTypeEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionToPathEClass = null;

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
	 * @see edu.uoc.som.openapi3.Openapi3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Openapi3PackageImpl() {
		super(eNS_URI, Openapi3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Openapi3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Openapi3Package init() {
		if (isInited) return (Openapi3Package)EPackage.Registry.INSTANCE.getEPackage(Openapi3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredOpenapi3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Openapi3PackageImpl theOpenapi3Package = registeredOpenapi3Package instanceof Openapi3PackageImpl ? (Openapi3PackageImpl)registeredOpenapi3Package : new Openapi3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOpenapi3Package.createPackageContents();

		// Initialize created meta-data
		theOpenapi3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpenapi3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Openapi3Package.eNS_URI, theOpenapi3Package);
		return theOpenapi3Package;
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
	public EAttribute getAPI_Openapi() {
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
	public EReference getAPI_Tags() {
		return (EReference)apiEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Components() {
		return (EReference)apiEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Security() {
		return (EReference)apiEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAPI_Servers() {
		return (EReference)apiEClass.getEStructuralFeatures().get(11);
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
	public EReference getPath_Servers() {
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
	public EReference getOperation_Security() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_RequestBody() {
		return (EReference)operationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Callbacks() {
		return (EReference)operationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperation_Servers() {
		return (EReference)operationEClass.getEStructuralFeatures().get(12);
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
	public EAttribute getParameter_Style() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Explode() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_AllowReserved() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Examples() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Schema() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Content() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(11);
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
	public EClass getResponseDefinition() {
		return responseDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseDefinition_Description() {
		return (EAttribute)responseDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseDefinition_Headers() {
		return (EReference)responseDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseDefinition_Examples() {
		return (EReference)responseDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseDefinition_Code() {
		return (EAttribute)responseDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseDefinition_DeclaringContext() {
		return (EReference)responseDefinitionEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getExample_Summary() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_Description() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_Value() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_ExternalValue() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(3);
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
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Code() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_ResponseDefinition() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponse_Default() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Url() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServer_Description() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServer_Variables() {
		return (EReference)serverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerVariableEntry() {
		return serverVariableEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerVariableEntry_Key() {
		return (EAttribute)serverVariableEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerVariableEntry_Value() {
		return (EReference)serverVariableEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerVariable() {
		return serverVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerVariable_Enum() {
		return (EAttribute)serverVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerVariable_Default() {
		return (EAttribute)serverVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerVariable_Description() {
		return (EAttribute)serverVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponents() {
		return componentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Schemas() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Responses() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Parameters() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Examples() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_RequestBodies() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_SecuritySchemes() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_Links() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponents_CallBacks() {
		return (EReference)componentsEClass.getEStructuralFeatures().get(7);
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
	public EClass getExampleEntry() {
		return exampleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExampleEntry_Key() {
		return (EAttribute)exampleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExampleEntry_Value() {
		return (EReference)exampleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestBodyEntry() {
		return requestBodyEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestBodyEntry_Key() {
		return (EAttribute)requestBodyEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestBodyEntry_Value() {
		return (EReference)requestBodyEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeaderEntry() {
		return headerEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeaderEntry_Key() {
		return (EAttribute)headerEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHeaderEntry_Value() {
		return (EReference)headerEntryEClass.getEStructuralFeatures().get(1);
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
	public EClass getLinkEntry() {
		return linkEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinkEntry_Key() {
		return (EAttribute)linkEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkEntry_Value() {
		return (EReference)linkEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallbackEntry() {
		return callbackEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallbackEntry_Key() {
		return (EAttribute)callbackEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallbackEntry_Value() {
		return (EReference)callbackEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestBody() {
		return requestBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestBody_Description() {
		return (EAttribute)requestBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestBody_Content() {
		return (EReference)requestBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestBody_Required() {
		return (EAttribute)requestBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getlink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getlink_Operation() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getlink_Server() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallback() {
		return callbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallback_Callbacks() {
		return (EReference)callbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerContainer() {
		return serverContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerContainer_Servers() {
		return (EReference)serverContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediaType() {
		return mediaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaType_Schema() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaType_Example() {
		return (EAttribute)mediaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaType_Examples() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaType_Encoding() {
		return (EReference)mediaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMediaTypeEntry() {
		return mediaTypeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMediaTypeEntry_Key() {
		return (EAttribute)mediaTypeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMediaTypeEntry_Value() {
		return (EReference)mediaTypeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncoding() {
		return encodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncoding_ContentType() {
		return (EAttribute)encodingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncoding_Headers() {
		return (EReference)encodingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncoding_Style() {
		return (EAttribute)encodingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncoding_Explode() {
		return (EAttribute)encodingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncoding_AllowReserved() {
		return (EAttribute)encodingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncodingEntry() {
		return encodingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncodingEntry_Key() {
		return (EAttribute)encodingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncodingEntry_Value() {
		return (EReference)encodingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuntimeExpression() {
		return runtimeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionToPath() {
		return expressionToPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionToPath_Key() {
		return (EAttribute)expressionToPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionToPath_Value() {
		return (EReference)expressionToPathEClass.getEStructuralFeatures().get(1);
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
	public Openapi3Factory getOpenapi3Factory() {
		return (Openapi3Factory)getEFactoryInstance();
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
		createEAttribute(apiEClass, API__OPENAPI);
		createEReference(apiEClass, API__INFO);
		createEAttribute(apiEClass, API__HOST);
		createEAttribute(apiEClass, API__BASE_PATH);
		createEAttribute(apiEClass, API__SCHEMES);
		createEAttribute(apiEClass, API__CONSUMES);
		createEAttribute(apiEClass, API__PRODUCES);
		createEReference(apiEClass, API__PATHS);
		createEReference(apiEClass, API__TAGS);
		createEReference(apiEClass, API__COMPONENTS);
		createEReference(apiEClass, API__SECURITY);
		createEReference(apiEClass, API__SERVERS);
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
		createEReference(pathEClass, PATH__SERVERS);
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
		createEReference(operationEClass, OPERATION__SECURITY);
		createEReference(operationEClass, OPERATION__REQUEST_BODY);
		createEReference(operationEClass, OPERATION__CALLBACKS);
		createEReference(operationEClass, OPERATION__SERVERS);
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
		createEAttribute(parameterEClass, PARAMETER__STYLE);
		createEAttribute(parameterEClass, PARAMETER__EXPLODE);
		createEAttribute(parameterEClass, PARAMETER__ALLOW_RESERVED);
		createEReference(parameterEClass, PARAMETER__EXAMPLES);
		createEReference(parameterEClass, PARAMETER__SCHEMA);
		createEReference(parameterEClass, PARAMETER__CONTENT);

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

		responseDefinitionEClass = createEClass(RESPONSE_DEFINITION);
		createEAttribute(responseDefinitionEClass, RESPONSE_DEFINITION__DESCRIPTION);
		createEReference(responseDefinitionEClass, RESPONSE_DEFINITION__HEADERS);
		createEReference(responseDefinitionEClass, RESPONSE_DEFINITION__EXAMPLES);
		createEAttribute(responseDefinitionEClass, RESPONSE_DEFINITION__CODE);
		createEReference(responseDefinitionEClass, RESPONSE_DEFINITION__DECLARING_CONTEXT);

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
		createEAttribute(exampleEClass, EXAMPLE__SUMMARY);
		createEAttribute(exampleEClass, EXAMPLE__DESCRIPTION);
		createEAttribute(exampleEClass, EXAMPLE__VALUE);
		createEAttribute(exampleEClass, EXAMPLE__EXTERNAL_VALUE);

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

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__REQUIRED);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__CODE);
		createEReference(responseEClass, RESPONSE__RESPONSE_DEFINITION);
		createEAttribute(responseEClass, RESPONSE__DEFAULT);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__URL);
		createEAttribute(serverEClass, SERVER__DESCRIPTION);
		createEReference(serverEClass, SERVER__VARIABLES);

		serverVariableEntryEClass = createEClass(SERVER_VARIABLE_ENTRY);
		createEAttribute(serverVariableEntryEClass, SERVER_VARIABLE_ENTRY__KEY);
		createEReference(serverVariableEntryEClass, SERVER_VARIABLE_ENTRY__VALUE);

		serverVariableEClass = createEClass(SERVER_VARIABLE);
		createEAttribute(serverVariableEClass, SERVER_VARIABLE__ENUM);
		createEAttribute(serverVariableEClass, SERVER_VARIABLE__DEFAULT);
		createEAttribute(serverVariableEClass, SERVER_VARIABLE__DESCRIPTION);

		componentsEClass = createEClass(COMPONENTS);
		createEReference(componentsEClass, COMPONENTS__SCHEMAS);
		createEReference(componentsEClass, COMPONENTS__RESPONSES);
		createEReference(componentsEClass, COMPONENTS__PARAMETERS);
		createEReference(componentsEClass, COMPONENTS__EXAMPLES);
		createEReference(componentsEClass, COMPONENTS__REQUEST_BODIES);
		createEReference(componentsEClass, COMPONENTS__SECURITY_SCHEMES);
		createEReference(componentsEClass, COMPONENTS__LINKS);
		createEReference(componentsEClass, COMPONENTS__CALL_BACKS);

		schemaEntryEClass = createEClass(SCHEMA_ENTRY);
		createEAttribute(schemaEntryEClass, SCHEMA_ENTRY__KEY);
		createEReference(schemaEntryEClass, SCHEMA_ENTRY__VALUE);

		responseDefinitionEntryEClass = createEClass(RESPONSE_DEFINITION_ENTRY);
		createEAttribute(responseDefinitionEntryEClass, RESPONSE_DEFINITION_ENTRY__KEY);
		createEReference(responseDefinitionEntryEClass, RESPONSE_DEFINITION_ENTRY__VALUE);

		parameterEntryEClass = createEClass(PARAMETER_ENTRY);
		createEAttribute(parameterEntryEClass, PARAMETER_ENTRY__KEY);
		createEReference(parameterEntryEClass, PARAMETER_ENTRY__VALUE);

		exampleEntryEClass = createEClass(EXAMPLE_ENTRY);
		createEAttribute(exampleEntryEClass, EXAMPLE_ENTRY__KEY);
		createEReference(exampleEntryEClass, EXAMPLE_ENTRY__VALUE);

		requestBodyEntryEClass = createEClass(REQUEST_BODY_ENTRY);
		createEAttribute(requestBodyEntryEClass, REQUEST_BODY_ENTRY__KEY);
		createEReference(requestBodyEntryEClass, REQUEST_BODY_ENTRY__VALUE);

		headerEntryEClass = createEClass(HEADER_ENTRY);
		createEAttribute(headerEntryEClass, HEADER_ENTRY__KEY);
		createEReference(headerEntryEClass, HEADER_ENTRY__VALUE);

		securitySchemeEntryEClass = createEClass(SECURITY_SCHEME_ENTRY);
		createEAttribute(securitySchemeEntryEClass, SECURITY_SCHEME_ENTRY__KEY);
		createEReference(securitySchemeEntryEClass, SECURITY_SCHEME_ENTRY__VALUE);

		linkEntryEClass = createEClass(LINK_ENTRY);
		createEAttribute(linkEntryEClass, LINK_ENTRY__KEY);
		createEReference(linkEntryEClass, LINK_ENTRY__VALUE);

		callbackEntryEClass = createEClass(CALLBACK_ENTRY);
		createEAttribute(callbackEntryEClass, CALLBACK_ENTRY__KEY);
		createEReference(callbackEntryEClass, CALLBACK_ENTRY__VALUE);

		requestBodyEClass = createEClass(REQUEST_BODY);
		createEAttribute(requestBodyEClass, REQUEST_BODY__DESCRIPTION);
		createEReference(requestBodyEClass, REQUEST_BODY__CONTENT);
		createEAttribute(requestBodyEClass, REQUEST_BODY__REQUIRED);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__OPERATION);
		createEReference(linkEClass, LINK__SERVER);

		callbackEClass = createEClass(CALLBACK);
		createEReference(callbackEClass, CALLBACK__CALLBACKS);

		serverContainerEClass = createEClass(SERVER_CONTAINER);
		createEReference(serverContainerEClass, SERVER_CONTAINER__SERVERS);

		mediaTypeEClass = createEClass(MEDIA_TYPE);
		createEReference(mediaTypeEClass, MEDIA_TYPE__SCHEMA);
		createEAttribute(mediaTypeEClass, MEDIA_TYPE__EXAMPLE);
		createEReference(mediaTypeEClass, MEDIA_TYPE__EXAMPLES);
		createEReference(mediaTypeEClass, MEDIA_TYPE__ENCODING);

		mediaTypeEntryEClass = createEClass(MEDIA_TYPE_ENTRY);
		createEAttribute(mediaTypeEntryEClass, MEDIA_TYPE_ENTRY__KEY);
		createEReference(mediaTypeEntryEClass, MEDIA_TYPE_ENTRY__VALUE);

		encodingEClass = createEClass(ENCODING);
		createEAttribute(encodingEClass, ENCODING__CONTENT_TYPE);
		createEReference(encodingEClass, ENCODING__HEADERS);
		createEAttribute(encodingEClass, ENCODING__STYLE);
		createEAttribute(encodingEClass, ENCODING__EXPLODE);
		createEAttribute(encodingEClass, ENCODING__ALLOW_RESERVED);

		encodingEntryEClass = createEClass(ENCODING_ENTRY);
		createEAttribute(encodingEntryEClass, ENCODING_ENTRY__KEY);
		createEReference(encodingEntryEClass, ENCODING_ENTRY__VALUE);

		runtimeExpressionEClass = createEClass(RUNTIME_EXPRESSION);

		expressionToPathEClass = createEClass(EXPRESSION_TO_PATH);
		createEAttribute(expressionToPathEClass, EXPRESSION_TO_PATH__KEY);
		createEReference(expressionToPathEClass, EXPRESSION_TO_PATH__VALUE);

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
		apiEClass.getESuperTypes().add(this.getParameterContainer());
		apiEClass.getESuperTypes().add(this.getSchemaContainer());
		apiEClass.getESuperTypes().add(this.getParameterContext());
		apiEClass.getESuperTypes().add(this.getExternalDocsContext());
		apiEClass.getESuperTypes().add(this.getResponseContainer());
		pathEClass.getESuperTypes().add(this.getParameterContainer());
		pathEClass.getESuperTypes().add(this.getParameterContext());
		operationEClass.getESuperTypes().add(this.getParameterContainer());
		operationEClass.getESuperTypes().add(this.getParameterContext());
		operationEClass.getESuperTypes().add(this.getExternalDocsContext());
		parameterEClass.getESuperTypes().add(this.getSchemaContainer());
		parameterEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		parameterEClass.getESuperTypes().add(this.getArrayContext());
		itemsDefinitionEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		itemsDefinitionEClass.getESuperTypes().add(this.getArrayContext());
		schemaEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		schemaEClass.getESuperTypes().add(this.getSchemaContainer());
		schemaEClass.getESuperTypes().add(this.getExternalDocsContext());
		responseDefinitionEClass.getESuperTypes().add(this.getSchemaContainer());
		responseDefinitionEClass.getESuperTypes().add(this.getSchemaContext());
		headerEClass.getESuperTypes().add(this.getJSONSchemaSubset());
		headerEClass.getESuperTypes().add(this.getArrayContext());
		tagEClass.getESuperTypes().add(this.getExternalDocsContext());
		propertyEClass.getESuperTypes().add(this.getSchemaContext());
		propertyEClass.getESuperTypes().add(this.getSchemaContainer());
		responseEClass.getESuperTypes().add(this.getResponseContainer());
		schemaEntryEClass.getESuperTypes().add(this.getSchemaContainer());

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
		initEReference(getContainedCollections_Responses(), this.getResponseDefinition(), null, "responses", null, 0, -1, ContainedCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiEClass, edu.uoc.som.openapi3.API.class, "API", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPI_Openapi(), ecorePackage.getEString(), "openapi", null, 0, 1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Info(), this.getInfo(), null, "info", null, 0, 1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Host(), ecorePackage.getEString(), "host", null, 0, 1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_BasePath(), ecorePackage.getEString(), "basePath", null, 0, 1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPI_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Paths(), this.getPath(), this.getPath_Api(), "paths", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Tags(), this.getTag(), null, "tags", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Components(), this.getComponents(), null, "components", null, 0, 1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Security(), this.getSecurityRequirement(), null, "security", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPI_Servers(), this.getServer(), null, "servers", null, 0, -1, edu.uoc.som.openapi3.API.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAPI__GetAllOperations(), this.getOperation(), "getAllOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getAPI__GetSchemaByReference__String(), this.getSchema(), "getSchemaByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetOperationById__String(), this.getOperation(), "getOperationById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "operationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetPathByRelativePath__String(), this.getPath(), "getPathByRelativePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "relativePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetParameterByReference__String(), this.getParameter(), "getParameterByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ref", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAPI__GetResponseDefinitionByReference__String(), this.getResponseDefinition(), "getResponseDefinitionByReference", 0, 1, IS_UNIQUE, IS_ORDERED);
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
		initEReference(getPath_Servers(), this.getServer(), null, "servers", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPath__GetOperationByHTTPMethod__String(), this.getOperation(), "getOperationByHTTPMethod", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_TagReferences(), ecorePackage.getEString(), "tagReferences", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OperationId(), ecorePackage.getEString(), "operationId", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Consumes(), ecorePackage.getEString(), "consumes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Produces(), ecorePackage.getEString(), "produces", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Responses(), this.getResponse(), null, "responses", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Schemes(), this.getSchemeType(), "schemes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Deprecated(), ecorePackage.getEBooleanObject(), "deprecated", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Security(), this.getSecurityRequirement(), null, "security", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RequestBody(), this.getRequestBody(), null, "requestBody", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Callbacks(), this.getCallbackEntry(), null, "callbacks", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Servers(), this.getServer(), null, "servers", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getParameter_Style(), ecorePackage.getEString(), "style", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Explode(), ecorePackage.getEBooleanObject(), "explode", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_AllowReserved(), ecorePackage.getEBooleanObject(), "allowReserved", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Examples(), this.getExampleEntry(), null, "examples", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Schema(), this.getSchema(), null, "schema", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Content(), this.getMediaTypeEntry(), null, "content", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(responseDefinitionEClass, ResponseDefinition.class, "ResponseDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResponseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDefinition_Headers(), this.getHeader(), null, "headers", null, 0, -1, ResponseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDefinition_Examples(), this.getExample(), null, "examples", null, 0, -1, ResponseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseDefinition_Code(), ecorePackage.getEString(), "code", null, 0, 1, ResponseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDefinition_DeclaringContext(), this.getResponseContainer(), null, "declaringContext", null, 0, 1, ResponseDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getExample_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_Description(), ecorePackage.getEString(), "description", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_Value(), ecorePackage.getEString(), "value", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_ExternalValue(), ecorePackage.getEString(), "externalValue", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Code(), ecorePackage.getEIntegerObject(), "code", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_ResponseDefinition(), this.getResponseDefinition(), null, "responseDefinition", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Default(), ecorePackage.getEBooleanObject(), "default", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_Url(), ecorePackage.getEString(), "url", null, 1, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServer_Description(), ecorePackage.getEString(), "description", null, 0, 1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServer_Variables(), this.getServerVariableEntry(), null, "variables", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverVariableEntryEClass, Map.Entry.class, "ServerVariableEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerVariableEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerVariableEntry_Value(), this.getServerVariable(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverVariableEClass, ServerVariable.class, "ServerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerVariable_Enum(), ecorePackage.getEString(), "enum", null, 0, -1, ServerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerVariable_Default(), ecorePackage.getEString(), "default", null, 1, 1, ServerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, ServerVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentsEClass, Components.class, "Components", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponents_Schemas(), this.getSchemaEntry(), null, "schemas", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Responses(), this.getResponseDefinitionEntry(), null, "responses", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Parameters(), this.getParameterEntry(), null, "parameters", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Examples(), this.getExampleEntry(), null, "examples", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_RequestBodies(), this.getRequestBodyEntry(), null, "requestBodies", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_SecuritySchemes(), this.getSecuritySchemeEntry(), null, "securitySchemes", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Links(), this.getLinkEntry(), null, "links", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_CallBacks(), this.getCallbackEntry(), null, "callBacks", null, 0, -1, Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEntryEClass, Map.Entry.class, "SchemaEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaEntry_Value(), this.getSchema(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseDefinitionEntryEClass, Map.Entry.class, "ResponseDefinitionEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDefinitionEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseDefinitionEntry_Value(), this.getResponseDefinition(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEntryEClass, Map.Entry.class, "ParameterEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterEntry_Value(), this.getParameter(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleEntryEClass, Map.Entry.class, "ExampleEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExampleEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleEntry_Value(), this.getExample(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestBodyEntryEClass, Map.Entry.class, "RequestBodyEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestBodyEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestBodyEntry_Value(), this.getRequestBody(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headerEntryEClass, Map.Entry.class, "HeaderEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeaderEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHeaderEntry_Value(), this.getHeader(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securitySchemeEntryEClass, Map.Entry.class, "SecuritySchemeEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecuritySchemeEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecuritySchemeEntry_Value(), this.getSecurityScheme(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEntryEClass, Map.Entry.class, "LinkEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkEntry_Value(), this.getlink(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callbackEntryEClass, Map.Entry.class, "CallbackEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallbackEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallbackEntry_Value(), this.getCallback(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestBodyEClass, RequestBody.class, "RequestBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestBody_Description(), ecorePackage.getEString(), "description", null, 0, 1, RequestBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequestBody_Content(), this.getMediaTypeEntry(), null, "content", null, 0, -1, RequestBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestBody_Required(), ecorePackage.getEBooleanObject(), "required", null, 0, 1, RequestBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, link.class, "link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlink_Operation(), this.getOperation(), null, "operation", null, 0, 1, link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlink_Server(), this.getServer(), null, "server", null, 0, 1, link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callbackEClass, Callback.class, "Callback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallback_Callbacks(), this.getExpressionToPath(), null, "callbacks", null, 0, -1, Callback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverContainerEClass, ServerContainer.class, "ServerContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerContainer_Servers(), this.getServer(), null, "servers", null, 0, -1, ServerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeEClass, MediaType.class, "MediaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaType_Schema(), this.getSchema(), null, "schema", null, 0, 1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMediaType_Example(), ecorePackage.getEString(), "example", null, 0, 1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaType_Examples(), this.getExampleEntry(), null, "examples", null, 0, -1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaType_Encoding(), this.getEncodingEntry(), null, "encoding", null, 0, -1, MediaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaTypeEntryEClass, Map.Entry.class, "MediaTypeEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMediaTypeEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMediaTypeEntry_Value(), this.getMediaType(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodingEClass, Encoding.class, "Encoding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncoding_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, Encoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncoding_Headers(), this.getHeaderEntry(), null, "headers", null, 0, -1, Encoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncoding_Style(), ecorePackage.getEString(), "style", null, 0, 1, Encoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncoding_Explode(), ecorePackage.getEBooleanObject(), "explode", null, 0, 1, Encoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncoding_AllowReserved(), ecorePackage.getEBooleanObject(), "allowReserved", null, 0, 1, Encoding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encodingEntryEClass, Map.Entry.class, "EncodingEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncodingEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncodingEntry_Value(), this.getEncoding(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeExpressionEClass, RuntimeExpression.class, "RuntimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionToPathEClass, Map.Entry.class, "ExpressionToPath", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionToPath_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionToPath_Value(), this.getPath(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		addEEnumLiteral(parameterLocationEEnum, ParameterLocation.COOKIE);

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

} //Openapi3PackageImpl
