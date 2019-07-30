/**
 */
package edu.uoc.som.openapi3.impl;

import edu.uoc.som.openapi3.API;
import edu.uoc.som.openapi3.Components;
import edu.uoc.som.openapi3.ExternalDocs;
import edu.uoc.som.openapi3.ExternalDocsContext;
import edu.uoc.som.openapi3.Info;
import edu.uoc.som.openapi3.Openapi3Package;
import edu.uoc.som.openapi3.Operation;
import edu.uoc.som.openapi3.Parameter;
import edu.uoc.som.openapi3.ParameterContext;
import edu.uoc.som.openapi3.Path;
import edu.uoc.som.openapi3.ResponseContainer;
import edu.uoc.som.openapi3.ResponseDefinition;
import edu.uoc.som.openapi3.Schema;
import edu.uoc.som.openapi3.SchemaContainer;
import edu.uoc.som.openapi3.SchemeType;
import edu.uoc.som.openapi3.SecurityRequirement;
import edu.uoc.som.openapi3.Server;
import edu.uoc.som.openapi3.Tag;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getOpenapi <em>Openapi</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getHost <em>Host</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link edu.uoc.som.openapi3.impl.APIImpl#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIImpl extends ParameterContainerImpl implements API {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The default value of the '{@link #getOpenapi() <em>Openapi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenapi()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENAPI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenapi() <em>Openapi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenapi()
	 * @generated
	 * @ordered
	 */
	protected String openapi = OPENAPI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consumes;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> produces;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected Components components;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> security;

	/**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
	protected EList<Server> servers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Openapi3Package.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, Openapi3Package.API__PARAMETERS);
		}
		return parameters;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi3Package.API__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpenapi() {
		return openapi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenapi(String newOpenapi) {
		String oldOpenapi = openapi;
		openapi = newOpenapi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__OPENAPI, oldOpenapi, openapi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi3Package.API__INFO, oldInfo, newInfo);
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
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, Openapi3Package.API__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, Openapi3Package.API__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProduces() {
		if (produces == null) {
			produces = new EDataTypeUniqueEList<String>(String.class, this, Openapi3Package.API__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentWithInverseEList.Unsettable<Path>(Path.class, this, Openapi3Package.API__PATHS, Openapi3Package.PATH__API);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPaths() {
		if (paths != null) ((InternalEList.Unsettable<?>)paths).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPaths() {
		return paths != null && ((InternalEList.Unsettable<?>)paths).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, Openapi3Package.API__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Components getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(Components newComponents, NotificationChain msgs) {
		Components oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Openapi3Package.API__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(Components newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Openapi3Package.API__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openapi3Package.API__COMPONENTS, newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, Openapi3Package.API__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Server> getServers() {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, Openapi3Package.API__SERVERS);
		}
		return servers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operation> getAllOperations() {
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
	public Schema getSchemaByReference(String ref) {
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
	public Operation getOperationById(String operationId) {
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
	public Path getPathByRelativePath(String relativePath) {
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
	public Parameter getParameterByReference(String ref) {
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
	public ResponseDefinition getResponseDefinitionByReference(String ref) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi3Package.API__PATHS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPaths()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Openapi3Package.API__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case Openapi3Package.API__INFO:
				return basicSetInfo(null, msgs);
			case Openapi3Package.API__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case Openapi3Package.API__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case Openapi3Package.API__COMPONENTS:
				return basicSetComponents(null, msgs);
			case Openapi3Package.API__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case Openapi3Package.API__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
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
			case Openapi3Package.API__PARAMETERS:
				return getParameters();
			case Openapi3Package.API__EXTERNAL_DOCS:
				return getExternalDocs();
			case Openapi3Package.API__OPENAPI:
				return getOpenapi();
			case Openapi3Package.API__INFO:
				return getInfo();
			case Openapi3Package.API__HOST:
				return getHost();
			case Openapi3Package.API__BASE_PATH:
				return getBasePath();
			case Openapi3Package.API__SCHEMES:
				return getSchemes();
			case Openapi3Package.API__CONSUMES:
				return getConsumes();
			case Openapi3Package.API__PRODUCES:
				return getProduces();
			case Openapi3Package.API__PATHS:
				return getPaths();
			case Openapi3Package.API__TAGS:
				return getTags();
			case Openapi3Package.API__COMPONENTS:
				return getComponents();
			case Openapi3Package.API__SECURITY:
				return getSecurity();
			case Openapi3Package.API__SERVERS:
				return getServers();
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
			case Openapi3Package.API__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Openapi3Package.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case Openapi3Package.API__OPENAPI:
				setOpenapi((String)newValue);
				return;
			case Openapi3Package.API__INFO:
				setInfo((Info)newValue);
				return;
			case Openapi3Package.API__HOST:
				setHost((String)newValue);
				return;
			case Openapi3Package.API__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case Openapi3Package.API__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case Openapi3Package.API__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case Openapi3Package.API__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case Openapi3Package.API__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
				return;
			case Openapi3Package.API__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case Openapi3Package.API__COMPONENTS:
				setComponents((Components)newValue);
				return;
			case Openapi3Package.API__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case Openapi3Package.API__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
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
			case Openapi3Package.API__PARAMETERS:
				getParameters().clear();
				return;
			case Openapi3Package.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case Openapi3Package.API__OPENAPI:
				setOpenapi(OPENAPI_EDEFAULT);
				return;
			case Openapi3Package.API__INFO:
				setInfo((Info)null);
				return;
			case Openapi3Package.API__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case Openapi3Package.API__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case Openapi3Package.API__SCHEMES:
				getSchemes().clear();
				return;
			case Openapi3Package.API__CONSUMES:
				getConsumes().clear();
				return;
			case Openapi3Package.API__PRODUCES:
				getProduces().clear();
				return;
			case Openapi3Package.API__PATHS:
				unsetPaths();
				return;
			case Openapi3Package.API__TAGS:
				getTags().clear();
				return;
			case Openapi3Package.API__COMPONENTS:
				setComponents((Components)null);
				return;
			case Openapi3Package.API__SECURITY:
				getSecurity().clear();
				return;
			case Openapi3Package.API__SERVERS:
				getServers().clear();
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
			case Openapi3Package.API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Openapi3Package.API__EXTERNAL_DOCS:
				return externalDocs != null;
			case Openapi3Package.API__OPENAPI:
				return OPENAPI_EDEFAULT == null ? openapi != null : !OPENAPI_EDEFAULT.equals(openapi);
			case Openapi3Package.API__INFO:
				return info != null;
			case Openapi3Package.API__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case Openapi3Package.API__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case Openapi3Package.API__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case Openapi3Package.API__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case Openapi3Package.API__PRODUCES:
				return produces != null && !produces.isEmpty();
			case Openapi3Package.API__PATHS:
				return isSetPaths();
			case Openapi3Package.API__TAGS:
				return tags != null && !tags.isEmpty();
			case Openapi3Package.API__COMPONENTS:
				return components != null;
			case Openapi3Package.API__SECURITY:
				return security != null && !security.isEmpty();
			case Openapi3Package.API__SERVERS:
				return servers != null && !servers.isEmpty();
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
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case Openapi3Package.API__PARAMETERS: return Openapi3Package.PARAMETER_CONTEXT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case Openapi3Package.API__EXTERNAL_DOCS: return Openapi3Package.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseContainer.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case Openapi3Package.PARAMETER_CONTEXT__PARAMETERS: return Openapi3Package.API__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case Openapi3Package.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return Openapi3Package.API__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseContainer.class) {
			switch (baseFeatureID) {
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
			case Openapi3Package.API___GET_ALL_OPERATIONS:
				return getAllOperations();
			case Openapi3Package.API___GET_SCHEMA_BY_REFERENCE__STRING:
				return getSchemaByReference((String)arguments.get(0));
			case Openapi3Package.API___GET_OPERATION_BY_ID__STRING:
				return getOperationById((String)arguments.get(0));
			case Openapi3Package.API___GET_PATH_BY_RELATIVE_PATH__STRING:
				return getPathByRelativePath((String)arguments.get(0));
			case Openapi3Package.API___GET_PARAMETER_BY_REFERENCE__STRING:
				return getParameterByReference((String)arguments.get(0));
			case Openapi3Package.API___GET_RESPONSE_DEFINITION_BY_REFERENCE__STRING:
				return getResponseDefinitionByReference((String)arguments.get(0));
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
		result.append(" (openapi: ");
		result.append(openapi);
		result.append(", host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", produces: ");
		result.append(produces);
		result.append(')');
		return result.toString();
	}

} //APIImpl
