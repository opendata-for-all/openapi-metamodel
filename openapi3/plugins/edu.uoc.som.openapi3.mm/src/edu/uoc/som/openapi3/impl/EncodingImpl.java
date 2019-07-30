/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.Encoding;
import edu.uoc.som.openapi3.Header;
import edu.uoc.som.openapi3.Openapi3Package;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.EncodingImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.EncodingImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.EncodingImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.EncodingImpl#getExplode <em>Explode</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.EncodingImpl#getAllowReserved <em>Allow Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncodingImpl extends MinimalEObjectImpl.Container implements Encoding {
	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<String, Header>> headers;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplode() <em>Explode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPLODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplode() <em>Explode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplode()
	 * @generated
	 * @ordered
	 */
	protected Boolean explode = EXPLODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowReserved() <em>Allow Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowReserved() <em>Allow Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowReserved()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowReserved = ALLOW_RESERVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.ENCODING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.ENCODING__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<String, Header>> getHeaders() {
		if (headers == null) {
			headers = new EObjectResolvingEList<Map.Entry<String, Header>>(Entry.class, this, Openapi3Package.ENCODING__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.ENCODING__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExplode() {
		return explode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplode(Boolean newExplode) {
		Boolean oldExplode = explode;
		explode = newExplode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.ENCODING__EXPLODE, oldExplode, explode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowReserved() {
		return allowReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowReserved(Boolean newAllowReserved) {
		Boolean oldAllowReserved = allowReserved;
		allowReserved = newAllowReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.ENCODING__ALLOW_RESERVED, oldAllowReserved, allowReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Openapi3Package.ENCODING__CONTENT_TYPE:
				return getContentType();
			case Openapi3Package.ENCODING__HEADERS:
				return getHeaders();
			case Openapi3Package.ENCODING__STYLE:
				return getStyle();
			case Openapi3Package.ENCODING__EXPLODE:
				return getExplode();
			case Openapi3Package.ENCODING__ALLOW_RESERVED:
				return getAllowReserved();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Openapi3Package.ENCODING__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case Openapi3Package.ENCODING__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Map.Entry<String, Header>>)newValue);
				return;
			case Openapi3Package.ENCODING__STYLE:
				setStyle((String)newValue);
				return;
			case Openapi3Package.ENCODING__EXPLODE:
				setExplode((Boolean)newValue);
				return;
			case Openapi3Package.ENCODING__ALLOW_RESERVED:
				setAllowReserved((Boolean)newValue);
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
			case Openapi3Package.ENCODING__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case Openapi3Package.ENCODING__HEADERS:
				getHeaders().clear();
				return;
			case Openapi3Package.ENCODING__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Openapi3Package.ENCODING__EXPLODE:
				setExplode(EXPLODE_EDEFAULT);
				return;
			case Openapi3Package.ENCODING__ALLOW_RESERVED:
				setAllowReserved(ALLOW_RESERVED_EDEFAULT);
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
			case Openapi3Package.ENCODING__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case Openapi3Package.ENCODING__HEADERS:
				return headers != null && !headers.isEmpty();
			case Openapi3Package.ENCODING__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Openapi3Package.ENCODING__EXPLODE:
				return EXPLODE_EDEFAULT == null ? explode != null : !EXPLODE_EDEFAULT.equals(explode);
			case Openapi3Package.ENCODING__ALLOW_RESERVED:
				return ALLOW_RESERVED_EDEFAULT == null ? allowReserved != null : !ALLOW_RESERVED_EDEFAULT.equals(allowReserved);
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
		result.append(" (contentType: ");
		result.append(contentType);
		result.append(", style: ");
		result.append(style);
		result.append(", explode: ");
		result.append(explode);
		result.append(", allowReserved: ");
		result.append(allowReserved);
		result.append(')');
		return result.toString();
	}

} //EncodingImpl
