/**
 */
package edu.uoc.som.openapi2.flow.impl;

import edu.uoc.som.openapi2.flow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPI2FlowFactoryImpl extends EFactoryImpl implements OpenAPI2FlowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenAPI2FlowFactory init() {
		try {
			OpenAPI2FlowFactory theOpenAPI2FlowFactory = (OpenAPI2FlowFactory)EPackage.Registry.INSTANCE.getEFactory(OpenAPI2FlowPackage.eNS_URI);
			if (theOpenAPI2FlowFactory != null) {
				return theOpenAPI2FlowFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenAPI2FlowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPI2FlowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenAPI2FlowPackage.SEQUENCE: return createSequence();
			case OpenAPI2FlowPackage.REQUEST: return createRequest();
			case OpenAPI2FlowPackage.PROPERTY_TRANSFER: return createPropertyTransfer();
			case OpenAPI2FlowPackage.HEADER_PROPERTY: return createHeaderProperty();
			case OpenAPI2FlowPackage.RESPONSE_PROPERTY: return createResponseProperty();
			case OpenAPI2FlowPackage.PARAMETER_PROPERTY: return createParameterProperty();
			case OpenAPI2FlowPackage.FLOW: return createFlow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyTransfer createPropertyTransfer() {
		PropertyTransferImpl propertyTransfer = new PropertyTransferImpl();
		return propertyTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeaderProperty createHeaderProperty() {
		HeaderPropertyImpl headerProperty = new HeaderPropertyImpl();
		return headerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseProperty createResponseProperty() {
		ResponsePropertyImpl responseProperty = new ResponsePropertyImpl();
		return responseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterProperty createParameterProperty() {
		ParameterPropertyImpl parameterProperty = new ParameterPropertyImpl();
		return parameterProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAPI2FlowPackage getOpenAPI2FlowPackage() {
		return (OpenAPI2FlowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenAPI2FlowPackage getPackage() {
		return OpenAPI2FlowPackage.eINSTANCE;
	}

} //OpenAPI2FlowFactoryImpl
