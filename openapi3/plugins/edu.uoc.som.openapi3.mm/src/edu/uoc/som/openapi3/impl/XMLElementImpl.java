/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.XMLElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.XMLElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.XMLElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.XMLElementImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.XMLElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.XMLElementImpl#getWrapped <em>Wrapped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLElementImpl extends MinimalEObjectImpl.Container implements XMLElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Boolean attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WRAPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapped()
	 * @generated
	 * @ordered
	 */
	protected Boolean wrapped = WRAPPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.XML_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.XML_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.XML_ELEMENT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.XML_ELEMENT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Boolean newAttribute) {
		Boolean oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.XML_ELEMENT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWrapped() {
		return wrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrapped(Boolean newWrapped) {
		Boolean oldWrapped = wrapped;
		wrapped = newWrapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.XML_ELEMENT__WRAPPED, oldWrapped, wrapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openapi3Package.XML_ELEMENT__NAME:
				return getName();
			case Openapi3Package.XML_ELEMENT__NAMESPACE:
				return getNamespace();
			case Openapi3Package.XML_ELEMENT__PREFIX:
				return getPrefix();
			case Openapi3Package.XML_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case Openapi3Package.XML_ELEMENT__WRAPPED:
				return getWrapped();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Openapi3Package.XML_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Openapi3Package.XML_ELEMENT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case Openapi3Package.XML_ELEMENT__PREFIX:
				setPrefix((String)newValue);
				return;
			case Openapi3Package.XML_ELEMENT__ATTRIBUTE:
				setAttribute((Boolean)newValue);
				return;
			case Openapi3Package.XML_ELEMENT__WRAPPED:
				setWrapped((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Openapi3Package.XML_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Openapi3Package.XML_ELEMENT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case Openapi3Package.XML_ELEMENT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case Openapi3Package.XML_ELEMENT__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case Openapi3Package.XML_ELEMENT__WRAPPED:
				setWrapped(WRAPPED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Openapi3Package.XML_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Openapi3Package.XML_ELEMENT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case Openapi3Package.XML_ELEMENT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case Openapi3Package.XML_ELEMENT__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case Openapi3Package.XML_ELEMENT__WRAPPED:
				return WRAPPED_EDEFAULT == null ? wrapped != null : !WRAPPED_EDEFAULT.equals(wrapped);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", wrapped: ");
		result.append(wrapped);
		result.append(')');
		return result.toString();
	}

} //XMLElementImpl
