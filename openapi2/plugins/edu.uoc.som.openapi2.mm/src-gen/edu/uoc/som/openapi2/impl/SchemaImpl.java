/**
 */
package edu.uoc.som.openapi2.impl;

import edu.uoc.som.openapi2.ExternalDocs;
import edu.uoc.som.openapi2.ExternalDocsContainer;
import edu.uoc.som.openapi2.JSONPointer;
import edu.uoc.som.openapi2.OpenAPI2Package;
import edu.uoc.som.openapi2.Property;
import edu.uoc.som.openapi2.Schema;
import edu.uoc.som.openapi2.SchemaContainer;
import edu.uoc.som.openapi2.XMLElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.impl.SchemaImpl#getAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends JSONSchemaSubsetImpl implements Schema {
	/**
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer maxProperties = MAX_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer minProperties = MIN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected String discriminator = DISCRIMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> allOf;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Schema items;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected XMLElement xml;

	/**
	 * The cached value of the '{@link #getAdditonalProperties() <em>Additonal Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditonalProperties()
	 * @generated
	 * @ordered
	 */
	protected Schema additonalProperties;

	/**
	 * The cached value of the '{@link #getDeclaringContext() <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringContext()
	 * @generated
	 * @ordered
	 */
	protected SchemaContainer declaringContext;

	/**
	 * The default value of the '{@link #getAdditonalPropertiesAllowed() <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditonalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditonalPropertiesAllowed() <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditonalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean additonalPropertiesAllowed = ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPI2Package.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDocs getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(ExternalDocs newExternalDocs, NotificationChain msgs) {
		ExternalDocs oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDocs(ExternalDocs newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPI2Package.SCHEMA__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPI2Package.SCHEMA__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProperties(Integer newMaxProperties) {
		Integer oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinProperties(Integer newMinProperties) {
		Integer oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__MIN_PROPERTIES, oldMinProperties, minProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminator(String newDiscriminator) {
		String oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Boolean newReadOnly) {
		Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, OpenAPI2Package.SCHEMA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schema> getAllOf() {
		if (allOf == null) {
			allOf = new EObjectResolvingEList<Schema>(Schema.class, this, OpenAPI2Package.SCHEMA__ALL_OF);
		}
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getItems() {
		if (items != null && items.eIsProxy()) {
			InternalEObject oldItems = (InternalEObject)items;
			items = (Schema)eResolveProxy(oldItems);
			if (items != oldItems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPI2Package.SCHEMA__ITEMS, oldItems, items));
			}
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems(Schema newItems) {
		Schema oldItems = items;
		items = newItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__ITEMS, oldItems, items));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLElement getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(XMLElement newXml, NotificationChain msgs) {
		XMLElement oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXml(XMLElement newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPI2Package.SCHEMA__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPI2Package.SCHEMA__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getAdditonalProperties() {
		if (additonalProperties != null && additonalProperties.eIsProxy()) {
			InternalEObject oldAdditonalProperties = (InternalEObject)additonalProperties;
			additonalProperties = (Schema)eResolveProxy(oldAdditonalProperties);
			if (additonalProperties != oldAdditonalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
			}
		}
		return additonalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetAdditonalProperties() {
		return additonalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditonalProperties(Schema newAdditonalProperties) {
		Schema oldAdditonalProperties = additonalProperties;
		additonalProperties = newAdditonalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchemaContainer getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (SchemaContainer)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPI2Package.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaContainer basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaringContext(SchemaContainer newDeclaringContext) {
		SchemaContainer oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdditonalPropertiesAllowed() {
		return additonalPropertiesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditonalPropertiesAllowed(Boolean newAdditonalPropertiesAllowed) {
		Boolean oldAdditonalPropertiesAllowed = additonalPropertiesAllowed;
		additonalPropertiesAllowed = newAdditonalPropertiesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED, oldAdditonalPropertiesAllowed, additonalPropertiesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getPropertyByName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenAPI2Package.SCHEMA__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case OpenAPI2Package.SCHEMA__XML:
				return basicSetXml(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenAPI2Package.SCHEMA__REF:
				return getRef();
			case OpenAPI2Package.SCHEMA__TITLE:
				return getTitle();
			case OpenAPI2Package.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case OpenAPI2Package.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case OpenAPI2Package.SCHEMA__EXAMPLE:
				return getExample();
			case OpenAPI2Package.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case OpenAPI2Package.SCHEMA__READ_ONLY:
				return getReadOnly();
			case OpenAPI2Package.SCHEMA__PROPERTIES:
				return getProperties();
			case OpenAPI2Package.SCHEMA__ALL_OF:
				return getAllOf();
			case OpenAPI2Package.SCHEMA__ITEMS:
				if (resolve) return getItems();
				return basicGetItems();
			case OpenAPI2Package.SCHEMA__XML:
				return getXml();
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES:
				if (resolve) return getAdditonalProperties();
				return basicGetAdditonalProperties();
			case OpenAPI2Package.SCHEMA__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				return getAdditonalPropertiesAllowed();
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
			case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenAPI2Package.SCHEMA__REF:
				setRef((String)newValue);
				return;
			case OpenAPI2Package.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case OpenAPI2Package.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case OpenAPI2Package.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case OpenAPI2Package.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case OpenAPI2Package.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case OpenAPI2Package.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case OpenAPI2Package.SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case OpenAPI2Package.SCHEMA__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPI2Package.SCHEMA__ITEMS:
				setItems((Schema)newValue);
				return;
			case OpenAPI2Package.SCHEMA__XML:
				setXml((XMLElement)newValue);
				return;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)newValue);
				return;
			case OpenAPI2Package.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaContainer)newValue);
				return;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				setAdditonalPropertiesAllowed((Boolean)newValue);
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
			case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenAPI2Package.SCHEMA__REF:
				setRef(REF_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case OpenAPI2Package.SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case OpenAPI2Package.SCHEMA__ALL_OF:
				getAllOf().clear();
				return;
			case OpenAPI2Package.SCHEMA__ITEMS:
				setItems((Schema)null);
				return;
			case OpenAPI2Package.SCHEMA__XML:
				setXml((XMLElement)null);
				return;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)null);
				return;
			case OpenAPI2Package.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaContainer)null);
				return;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				setAdditonalPropertiesAllowed(ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT);
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
			case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenAPI2Package.SCHEMA__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case OpenAPI2Package.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenAPI2Package.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? maxProperties != null : !MAX_PROPERTIES_EDEFAULT.equals(maxProperties);
			case OpenAPI2Package.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? minProperties != null : !MIN_PROPERTIES_EDEFAULT.equals(minProperties);
			case OpenAPI2Package.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case OpenAPI2Package.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case OpenAPI2Package.SCHEMA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case OpenAPI2Package.SCHEMA__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case OpenAPI2Package.SCHEMA__ALL_OF:
				return allOf != null && !allOf.isEmpty();
			case OpenAPI2Package.SCHEMA__ITEMS:
				return items != null;
			case OpenAPI2Package.SCHEMA__XML:
				return xml != null;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES:
				return additonalProperties != null;
			case OpenAPI2Package.SCHEMA__DECLARING_CONTEXT:
				return declaringContext != null;
			case OpenAPI2Package.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				return ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT == null ? additonalPropertiesAllowed != null : !ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT.equals(additonalPropertiesAllowed);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaContainer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContainer.class) {
			switch (derivedFeatureID) {
				case OpenAPI2Package.SCHEMA__EXTERNAL_DOCS: return OpenAPI2Package.EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case OpenAPI2Package.SCHEMA__REF: return OpenAPI2Package.JSON_POINTER__REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaContainer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContainer.class) {
			switch (baseFeatureID) {
				case OpenAPI2Package.EXTERNAL_DOCS_CONTAINER__EXTERNAL_DOCS: return OpenAPI2Package.SCHEMA__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case OpenAPI2Package.JSON_POINTER__REF: return OpenAPI2Package.SCHEMA__REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenAPI2Package.SCHEMA___GET_PROPERTY_BY_NAME__STRING:
				return getPropertyByName((String)arguments.get(0));
			case OpenAPI2Package.SCHEMA___GET_NAME:
				return getName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", title: ");
		result.append(title);
		result.append(", maxProperties: ");
		result.append(maxProperties);
		result.append(", minProperties: ");
		result.append(minProperties);
		result.append(", example: ");
		result.append(example);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", additonalPropertiesAllowed: ");
		result.append(additonalPropertiesAllowed);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
