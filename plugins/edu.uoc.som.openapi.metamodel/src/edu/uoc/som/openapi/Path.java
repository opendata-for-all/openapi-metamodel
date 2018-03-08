/**
 */
package edu.uoc.som.openapi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi.Path#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getGet <em>Get</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getPut <em>Put</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getPost <em>Post</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getDelete <em>Delete</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getOptions <em>Options</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getHead <em>Head</em>}</li>
 *   <li>{@link edu.uoc.som.openapi.Path#getPatch <em>Patch</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends ParamterDeclaringContext, ParameterContext {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.uoc.som.openapi.Operation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Get()
	 * @see edu.uoc.som.openapi.Operation#getPath
	 * @model opposite="path" containment="true"
	 * @generated
	 */
	Operation getGet();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(Operation value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Put</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Put()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPut();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(Operation value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Post()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPost();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Operation value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Delete()
	 * @model containment="true"
	 * @generated
	 */
	Operation getDelete();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(Operation value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Options()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOptions();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(Operation value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Head()
	 * @model containment="true"
	 * @generated
	 */
	Operation getHead();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Operation value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(Operation)
	 * @see edu.uoc.som.openapi.OpenAPIPackage#getPath_Patch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getPatch();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi.Path#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(Operation value);

} // Path
