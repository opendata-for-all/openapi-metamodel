/**
 */
package flow;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://som.uoc.edu/openapi/2.0.0/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link flow.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.SequenceImpl
	 * @see flow.impl.FlowPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STEPS = 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flow.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.StepImpl
	 * @see flow.impl.FlowPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flow.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.RequestImpl
	 * @see flow.impl.FlowPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__OPERATION = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PropertyImpl
	 * @see flow.impl.FlowPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flow.impl.PropertyTransferImpl <em>Property Transfer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PropertyTransferImpl
	 * @see flow.impl.FlowPackageImpl#getPropertyTransfer()
	 * @generated
	 */
	int PROPERTY_TRANSFER = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__SOURCE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER__TARGET = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Transfer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TRANSFER_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.InputPropertyImpl <em>Input Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.InputPropertyImpl
	 * @see flow.impl.FlowPackageImpl#getInputProperty()
	 * @generated
	 */
	int INPUT_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PROPERTY__REQUEST = PROPERTY__REQUEST;

	/**
	 * The number of structural features of the '<em>Input Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.OutputPropertyImpl <em>Output Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.OutputPropertyImpl
	 * @see flow.impl.FlowPackageImpl#getOutputProperty()
	 * @generated
	 */
	int OUTPUT_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PROPERTY__REQUEST = PROPERTY__REQUEST;

	/**
	 * The number of structural features of the '<em>Output Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.HeaderPropertyImpl <em>Header Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.HeaderPropertyImpl
	 * @see flow.impl.FlowPackageImpl#getHeaderProperty()
	 * @generated
	 */
	int HEADER_PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PROPERTY__REQUEST = OUTPUT_PROPERTY__REQUEST;

	/**
	 * The number of structural features of the '<em>Header Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PROPERTY_FEATURE_COUNT = OUTPUT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Header Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_PROPERTY_OPERATION_COUNT = OUTPUT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.ResponsePropertyImpl <em>Response Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.ResponsePropertyImpl
	 * @see flow.impl.FlowPackageImpl#getResponseProperty()
	 * @generated
	 */
	int RESPONSE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PROPERTY__REQUEST = OUTPUT_PROPERTY__REQUEST;

	/**
	 * The feature id for the '<em><b>Schema Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PROPERTY__SCHEMA_PROPERTY = OUTPUT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Response Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PROPERTY_FEATURE_COUNT = OUTPUT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Response Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PROPERTY_OPERATION_COUNT = OUTPUT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.ParameterPropertyImpl <em>Parameter Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.ParameterPropertyImpl
	 * @see flow.impl.FlowPackageImpl#getParameterProperty()
	 * @generated
	 */
	int PARAMETER_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTY__REQUEST = INPUT_PROPERTY__REQUEST;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTY__PARAMETER = INPUT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTY_FEATURE_COUNT = INPUT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PROPERTY_OPERATION_COUNT = INPUT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flow.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FlowImpl
	 * @see flow.impl.FlowPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 10;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SEQUENCES = 0;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link flow.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see flow.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference list '{@link flow.Sequence#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steps</em>'.
	 * @see flow.Sequence#getSteps()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Steps();

	/**
	 * Returns the meta object for class '{@link flow.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see flow.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link flow.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see flow.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the reference '{@link flow.Request#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see flow.Request#getOperation()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Operation();

	/**
	 * Returns the meta object for class '{@link flow.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see flow.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link flow.Property#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see flow.Property#getRequest()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Request();

	/**
	 * Returns the meta object for class '{@link flow.PropertyTransfer <em>Property Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Transfer</em>'.
	 * @see flow.PropertyTransfer
	 * @generated
	 */
	EClass getPropertyTransfer();

	/**
	 * Returns the meta object for the reference '{@link flow.PropertyTransfer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see flow.PropertyTransfer#getSource()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_Source();

	/**
	 * Returns the meta object for the reference '{@link flow.PropertyTransfer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see flow.PropertyTransfer#getTarget()
	 * @see #getPropertyTransfer()
	 * @generated
	 */
	EReference getPropertyTransfer_Target();

	/**
	 * Returns the meta object for class '{@link flow.InputProperty <em>Input Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Property</em>'.
	 * @see flow.InputProperty
	 * @generated
	 */
	EClass getInputProperty();

	/**
	 * Returns the meta object for class '{@link flow.OutputProperty <em>Output Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Property</em>'.
	 * @see flow.OutputProperty
	 * @generated
	 */
	EClass getOutputProperty();

	/**
	 * Returns the meta object for class '{@link flow.HeaderProperty <em>Header Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Property</em>'.
	 * @see flow.HeaderProperty
	 * @generated
	 */
	EClass getHeaderProperty();

	/**
	 * Returns the meta object for class '{@link flow.ResponseProperty <em>Response Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Property</em>'.
	 * @see flow.ResponseProperty
	 * @generated
	 */
	EClass getResponseProperty();

	/**
	 * Returns the meta object for the reference '{@link flow.ResponseProperty#getSchemaProperty <em>Schema Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema Property</em>'.
	 * @see flow.ResponseProperty#getSchemaProperty()
	 * @see #getResponseProperty()
	 * @generated
	 */
	EReference getResponseProperty_SchemaProperty();

	/**
	 * Returns the meta object for class '{@link flow.ParameterProperty <em>Parameter Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Property</em>'.
	 * @see flow.ParameterProperty
	 * @generated
	 */
	EClass getParameterProperty();

	/**
	 * Returns the meta object for the reference '{@link flow.ParameterProperty#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see flow.ParameterProperty#getParameter()
	 * @see #getParameterProperty()
	 * @generated
	 */
	EReference getParameterProperty_Parameter();

	/**
	 * Returns the meta object for class '{@link flow.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see flow.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.Flow#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see flow.Flow#getSequences()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sequences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flow.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.SequenceImpl
		 * @see flow.impl.FlowPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__STEPS = eINSTANCE.getSequence_Steps();

		/**
		 * The meta object literal for the '{@link flow.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.StepImpl
		 * @see flow.impl.FlowPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link flow.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.RequestImpl
		 * @see flow.impl.FlowPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__OPERATION = eINSTANCE.getRequest_Operation();

		/**
		 * The meta object literal for the '{@link flow.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PropertyImpl
		 * @see flow.impl.FlowPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__REQUEST = eINSTANCE.getProperty_Request();

		/**
		 * The meta object literal for the '{@link flow.impl.PropertyTransferImpl <em>Property Transfer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PropertyTransferImpl
		 * @see flow.impl.FlowPackageImpl#getPropertyTransfer()
		 * @generated
		 */
		EClass PROPERTY_TRANSFER = eINSTANCE.getPropertyTransfer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__SOURCE = eINSTANCE.getPropertyTransfer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TRANSFER__TARGET = eINSTANCE.getPropertyTransfer_Target();

		/**
		 * The meta object literal for the '{@link flow.impl.InputPropertyImpl <em>Input Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.InputPropertyImpl
		 * @see flow.impl.FlowPackageImpl#getInputProperty()
		 * @generated
		 */
		EClass INPUT_PROPERTY = eINSTANCE.getInputProperty();

		/**
		 * The meta object literal for the '{@link flow.impl.OutputPropertyImpl <em>Output Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.OutputPropertyImpl
		 * @see flow.impl.FlowPackageImpl#getOutputProperty()
		 * @generated
		 */
		EClass OUTPUT_PROPERTY = eINSTANCE.getOutputProperty();

		/**
		 * The meta object literal for the '{@link flow.impl.HeaderPropertyImpl <em>Header Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.HeaderPropertyImpl
		 * @see flow.impl.FlowPackageImpl#getHeaderProperty()
		 * @generated
		 */
		EClass HEADER_PROPERTY = eINSTANCE.getHeaderProperty();

		/**
		 * The meta object literal for the '{@link flow.impl.ResponsePropertyImpl <em>Response Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.ResponsePropertyImpl
		 * @see flow.impl.FlowPackageImpl#getResponseProperty()
		 * @generated
		 */
		EClass RESPONSE_PROPERTY = eINSTANCE.getResponseProperty();

		/**
		 * The meta object literal for the '<em><b>Schema Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PROPERTY__SCHEMA_PROPERTY = eINSTANCE.getResponseProperty_SchemaProperty();

		/**
		 * The meta object literal for the '{@link flow.impl.ParameterPropertyImpl <em>Parameter Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.ParameterPropertyImpl
		 * @see flow.impl.FlowPackageImpl#getParameterProperty()
		 * @generated
		 */
		EClass PARAMETER_PROPERTY = eINSTANCE.getParameterProperty();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_PROPERTY__PARAMETER = eINSTANCE.getParameterProperty_Parameter();

		/**
		 * The meta object literal for the '{@link flow.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FlowImpl
		 * @see flow.impl.FlowPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SEQUENCES = eINSTANCE.getFlow_Sequences();

	}

} //FlowPackage
