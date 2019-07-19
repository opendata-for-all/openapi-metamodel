/**
 */
package edu.uoc.som.openapi2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.Parameter#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredName requiredLocation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL requiredName='not name.oclIsUndefined()' requiredLocation='not location = ParameterLocation::unspecified'"
 * @generated
 */
public interface Parameter extends SchemaDeclaringContext, SchemaContext, JSONSchemaSubset, ArrayContext, ReferenceableElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.uoc.som.openapi2.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi2.ParameterLocation
	 * @see #setLocation(ParameterLocation)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_Location()
	 * @model
	 * @generated
	 */
	ParameterLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.uoc.som.openapi2.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_Required()
	 * @model
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Emply Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #setAllowEmplyValue(Boolean)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_AllowEmplyValue()
	 * @model
	 * @generated
	 */
	Boolean getAllowEmplyValue();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getAllowEmplyValue <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Emply Value</em>' attribute.
	 * @see #getAllowEmplyValue()
	 * @generated
	 */
	void setAllowEmplyValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(ParameterDeclaringContext)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_DeclaringContext()
	 * @model
	 * @generated
	 */
	ParameterDeclaringContext getDeclaringContext();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(ParameterDeclaringContext value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi2.OpenAPIPackage#getParameter_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.Parameter#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

} // Parameter