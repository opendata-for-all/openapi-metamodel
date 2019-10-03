/**
 */
package mapping;

import edu.uoc.som.openapi2.Parameter;
import edu.uoc.som.openapi2.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property To Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.PropertyToParameter#getSource <em>Source</em>}</li>
 *   <li>{@link mapping.PropertyToParameter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getPropertyToParameter()
 * @model
 * @generated
 */
public interface PropertyToParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Property)
	 * @see mapping.MappingPackage#getPropertyToParameter_Source()
	 * @model
	 * @generated
	 */
	Property getSource();

	/**
	 * Sets the value of the '{@link mapping.PropertyToParameter#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Property value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Parameter)
	 * @see mapping.MappingPackage#getPropertyToParameter_Target()
	 * @model
	 * @generated
	 */
	Parameter getTarget();

	/**
	 * Sets the value of the '{@link mapping.PropertyToParameter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Parameter value);

} // PropertyToParameter
