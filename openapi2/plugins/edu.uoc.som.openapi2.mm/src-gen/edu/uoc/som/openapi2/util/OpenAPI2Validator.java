/**
 */
package edu.uoc.som.openapi2.util;

import edu.uoc.som.openapi2.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.openapi2.OpenAPI2Package
 * @generated
 */
public class OpenAPI2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OpenAPI2Validator INSTANCE = new OpenAPI2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.uoc.som.openapi2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPI2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OpenAPI2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OpenAPI2Package.JSON_SCHEMA_SUBSET:
				return validateJSONSchemaSubset((JSONSchemaSubset)value, diagnostics, context);
			case OpenAPI2Package.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			case OpenAPI2Package.API:
				return validateAPI((API)value, diagnostics, context);
			case OpenAPI2Package.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case OpenAPI2Package.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case OpenAPI2Package.LICENSE:
				return validateLicense((License)value, diagnostics, context);
			case OpenAPI2Package.PATH:
				return validatePath((Path)value, diagnostics, context);
			case OpenAPI2Package.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case OpenAPI2Package.EXTERNAL_DOCS:
				return validateExternalDocs((ExternalDocs)value, diagnostics, context);
			case OpenAPI2Package.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case OpenAPI2Package.ITEMS_DEFINITION:
				return validateItemsDefinition((ItemsDefinition)value, diagnostics, context);
			case OpenAPI2Package.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case OpenAPI2Package.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case OpenAPI2Package.HEADER:
				return validateHeader((Header)value, diagnostics, context);
			case OpenAPI2Package.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_SCHEME:
				return validateSecurityScheme((SecurityScheme)value, diagnostics, context);
			case OpenAPI2Package.EXAMPLE:
				return validateExample((Example)value, diagnostics, context);
			case OpenAPI2Package.XML_ELEMENT:
				return validateXMLElement((XMLElement)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_SCOPE:
				return validateSecurityScope((SecurityScope)value, diagnostics, context);
			case OpenAPI2Package.PARAMETER_CONTAINER:
				return validateParameterContainer((ParameterContainer)value, diagnostics, context);
			case OpenAPI2Package.SCHEMA_CONTAINER:
				return validateSchemaContainer((SchemaContainer)value, diagnostics, context);
			case OpenAPI2Package.RESPONSE_CONTAINER:
				return validateResponseContainer((ResponseContainer)value, diagnostics, context);
			case OpenAPI2Package.EXTERNAL_DOCS_CONTAINER:
				return validateExternalDocsContainer((ExternalDocsContainer)value, diagnostics, context);
			case OpenAPI2Package.ARRAY_CONTAINER:
				return validateArrayContainer((ArrayContainer)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_REQUIREMENT:
				return validateSecurityRequirement((SecurityRequirement)value, diagnostics, context);
			case OpenAPI2Package.JSON_POINTER:
				return validateJSONPointer((JSONPointer)value, diagnostics, context);
			case OpenAPI2Package.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case OpenAPI2Package.RESPONSE_ENTRY:
				return validateResponseEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case OpenAPI2Package.SCHEMA_ENTRY:
				return validateSchemaEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case OpenAPI2Package.RESPONSE_DEFINITION_ENTRY:
				return validateResponseDefinitionEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case OpenAPI2Package.PARAMETER_ENTRY:
				return validateParameterEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_CONTAINER:
				return validateSecurityContainer((SecurityContainer)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_SCHEME_ENTRY:
				return validateSecuritySchemeEntry((Map.Entry<?, ?>)value, diagnostics, context);
			case OpenAPI2Package.SCHEME_TYPE:
				return validateSchemeType((SchemeType)value, diagnostics, context);
			case OpenAPI2Package.PARAMETER_LOCATION:
				return validateParameterLocation((ParameterLocation)value, diagnostics, context);
			case OpenAPI2Package.COLLECTION_FORMAT:
				return validateCollectionFormat((CollectionFormat)value, diagnostics, context);
			case OpenAPI2Package.OAUTH2_FLOW_TYPE:
				return validateOAuth2FlowType((OAuth2FlowType)value, diagnostics, context);
			case OpenAPI2Package.API_KEY_LOCATION:
				return validateAPIKeyLocation((APIKeyLocation)value, diagnostics, context);
			case OpenAPI2Package.SECURITY_SCHEME_TYPE:
				return validateSecuritySchemeType((SecuritySchemeType)value, diagnostics, context);
			case OpenAPI2Package.JSON_DATA_TYPE:
				return validateJSONDataType((JSONDataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONSchemaSubset(JSONSchemaSubset jsonSchemaSubset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jsonSchemaSubset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(api, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(info, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfo_requiredTitle(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfo_requiredAPIVerison(info, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredTitle constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo_requiredTitle(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "requiredTitle", getObjectLabel(info, context) },
						 new Object[] { info },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredAPIVerison constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo_requiredAPIVerison(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "requiredAPIVerison", getObjectLabel(info, context) },
						 new Object[] { info },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense(License license, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(license, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(license, diagnostics, context);
		if (result || diagnostics != null) result &= validateLicense_requiredName(license, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredName constraint of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense_requiredName(License license, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "requiredName", getObjectLabel(license, context) },
						 new Object[] { license },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(path, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocs(ExternalDocs externalDocs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDocs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemsDefinition(ItemsDefinition itemsDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemsDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityScheme(SecurityScheme securityScheme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityScheme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample(Example example, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLElement(XMLElement xmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityScope(SecurityScope securityScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterContainer(ParameterContainer parameterContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaContainer(SchemaContainer schemaContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseContainer(ResponseContainer responseContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocsContainer(ExternalDocsContainer externalDocsContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDocsContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayContainer(ArrayContainer arrayContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityRequirement(SecurityRequirement securityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONPointer(JSONPointer jsonPointer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jsonPointer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseEntry(Map.Entry<?, ?> responseEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)responseEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaEntry(Map.Entry<?, ?> schemaEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)schemaEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDefinitionEntry(Map.Entry<?, ?> responseDefinitionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)responseDefinitionEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterEntry(Map.Entry<?, ?> parameterEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)parameterEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityContainer(SecurityContainer securityContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchemeEntry(Map.Entry<?, ?> securitySchemeEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)securitySchemeEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemeType(SchemeType schemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterLocation(ParameterLocation parameterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionFormat(CollectionFormat collectionFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2FlowType(OAuth2FlowType oAuth2FlowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIKeyLocation(APIKeyLocation apiKeyLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchemeType(SecuritySchemeType securitySchemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONDataType(JSONDataType jsonDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OpenAPI2Validator
