/**
 */
package tpNote.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tpNote.BinaryBooleanExp;
import tpNote.Constant;
import tpNote.File;
import tpNote.Graph;
import tpNote.HTMLFile;
import tpNote.NewEClass5;
import tpNote.Programme;
import tpNote.TpNoteFactory;
import tpNote.TpNotePackage;
import tpNote.colRef;
import tpNote.comOperator;
import tpNote.extractedData;
import tpNote.filterCondition;
import tpNote.typeDonnees;
import tpNote.typeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpNotePackageImpl extends EPackageImpl implements TpNotePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extractedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newEClass5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryBooleanExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGraphEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDonneesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tpNote.TpNotePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TpNotePackageImpl() {
		super(eNS_URI, TpNoteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TpNotePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TpNotePackage init() {
		if (isInited)
			return (TpNotePackage) EPackage.Registry.INSTANCE.getEPackage(TpNotePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTpNotePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TpNotePackageImpl theTpNotePackage = registeredTpNotePackage instanceof TpNotePackageImpl
				? (TpNotePackageImpl) registeredTpNotePackage
				: new TpNotePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTpNotePackage.createPackageContents();

		// Initialize created meta-data
		theTpNotePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTpNotePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TpNotePackage.eNS_URI, theTpNotePackage);
		return theTpNotePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramme() {
		return programmeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Input() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Output() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramme_Filtercondition() {
		return (EReference) programmeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Keep() {
		return (EReference) fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Path() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Delimiter() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Type() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_XAxis() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_YAxis() {
		return (EReference) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Title() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getextractedData() {
		return extractedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getextractedData_Name() {
		return (EAttribute) extractedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getextractedData_TypeData() {
		return (EAttribute) extractedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getextractedData_Index() {
		return (EAttribute) extractedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewEClass5() {
		return newEClass5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLFile() {
		return htmlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTMLFile_Graph() {
		return (EReference) htmlFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfilterCondition() {
		return filterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Type() {
		return (EAttribute) constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute) constantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryBooleanExp() {
		return binaryBooleanExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryBooleanExp_Operator() {
		return (EAttribute) binaryBooleanExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryBooleanExp_Lhs() {
		return (EReference) binaryBooleanExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryBooleanExp_Rhs() {
		return (EReference) binaryBooleanExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcolRef() {
		return colRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcolRef_Extracteddata() {
		return (EReference) colRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeGraph() {
		return typeGraphEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeDonnees() {
		return typeDonneesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getcomOperator() {
		return comOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteFactory getTpNoteFactory() {
		return (TpNoteFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programmeEClass = createEClass(PROGRAMME);
		createEReference(programmeEClass, PROGRAMME__INPUT);
		createEReference(programmeEClass, PROGRAMME__OUTPUT);
		createEReference(programmeEClass, PROGRAMME__FILTERCONDITION);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__KEEP);
		createEAttribute(fileEClass, FILE__PATH);
		createEAttribute(fileEClass, FILE__DELIMITER);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__TYPE);
		createEReference(graphEClass, GRAPH__XAXIS);
		createEReference(graphEClass, GRAPH__YAXIS);
		createEAttribute(graphEClass, GRAPH__TITLE);

		extractedDataEClass = createEClass(EXTRACTED_DATA);
		createEAttribute(extractedDataEClass, EXTRACTED_DATA__NAME);
		createEAttribute(extractedDataEClass, EXTRACTED_DATA__TYPE_DATA);
		createEAttribute(extractedDataEClass, EXTRACTED_DATA__INDEX);

		newEClass5EClass = createEClass(NEW_ECLASS5);

		htmlFileEClass = createEClass(HTML_FILE);
		createEReference(htmlFileEClass, HTML_FILE__GRAPH);

		filterConditionEClass = createEClass(FILTER_CONDITION);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__TYPE);
		createEAttribute(constantEClass, CONSTANT__VALUE);

		binaryBooleanExpEClass = createEClass(BINARY_BOOLEAN_EXP);
		createEAttribute(binaryBooleanExpEClass, BINARY_BOOLEAN_EXP__OPERATOR);
		createEReference(binaryBooleanExpEClass, BINARY_BOOLEAN_EXP__LHS);
		createEReference(binaryBooleanExpEClass, BINARY_BOOLEAN_EXP__RHS);

		colRefEClass = createEClass(COL_REF);
		createEReference(colRefEClass, COL_REF__EXTRACTEDDATA);

		// Create enums
		typeGraphEEnum = createEEnum(TYPE_GRAPH);
		typeDonneesEEnum = createEEnum(TYPE_DONNEES);
		comOperatorEEnum = createEEnum(COM_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constantEClass.getESuperTypes().add(this.getfilterCondition());
		binaryBooleanExpEClass.getESuperTypes().add(this.getfilterCondition());
		colRefEClass.getESuperTypes().add(this.getfilterCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(programmeEClass, Programme.class, "Programme", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramme_Input(), this.getFile(), null, "input", null, 1, 1, Programme.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProgramme_Output(), this.getHTMLFile(), null, "output", null, 1, 1, Programme.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramme_Filtercondition(), this.getfilterCondition(), null, "filtercondition", null, 0, -1,
				Programme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_Keep(), this.getextractedData(), null, "keep", null, 1, -1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFile_Path(), ecorePackage.getEString(), "path", null, 0, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, File.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Type(), this.gettypeGraph(), "type", null, 0, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_XAxis(), this.getextractedData(), null, "xAxis", null, 1, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGraph_YAxis(), this.getextractedData(), null, "yAxis", null, 0, -1, Graph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_Title(), ecorePackage.getEString(), "title", null, 0, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractedDataEClass, extractedData.class, "extractedData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getextractedData_Name(), ecorePackage.getEString(), "name", null, 0, 1, extractedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getextractedData_TypeData(), this.gettypeDonnees(), "typeData", null, 0, 1, extractedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getextractedData_Index(), ecorePackage.getEInt(), "index", null, 0, 1, extractedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newEClass5EClass, NewEClass5.class, "NewEClass5", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(htmlFileEClass, HTMLFile.class, "HTMLFile", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTMLFile_Graph(), this.getGraph(), null, "graph", null, 1, -1, HTMLFile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(filterConditionEClass, filterCondition.class, "filterCondition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Type(), this.gettypeDonnees(), "type", "int", 0, 1, Constant.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, Constant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryBooleanExpEClass, BinaryBooleanExp.class, "BinaryBooleanExp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryBooleanExp_Operator(), this.getcomOperator(), "operator", null, 0, 1,
				BinaryBooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryBooleanExp_Lhs(), this.getfilterCondition(), null, "lhs", null, 1, 1,
				BinaryBooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryBooleanExp_Rhs(), this.getfilterCondition(), null, "rhs", null, 1, 1,
				BinaryBooleanExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colRefEClass, colRef.class, "colRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcolRef_Extracteddata(), this.getextractedData(), null, "extracteddata", null, 0, 1,
				colRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeGraphEEnum, typeGraph.class, "typeGraph");
		addEEnumLiteral(typeGraphEEnum, typeGraph.BAR_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.AREA_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.BUBBLE_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.LINE_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.SCATTER_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.RADAR_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.MIXED_CHART_TYPES);
		addEEnumLiteral(typeGraphEEnum, typeGraph.POLAR_AREA_CHART);
		addEEnumLiteral(typeGraphEEnum, typeGraph.DOUGHNUT);
		addEEnumLiteral(typeGraphEEnum, typeGraph.PIE);

		initEEnum(typeDonneesEEnum, typeDonnees.class, "typeDonnees");
		addEEnumLiteral(typeDonneesEEnum, typeDonnees.INT);
		addEEnumLiteral(typeDonneesEEnum, typeDonnees.STRING);
		addEEnumLiteral(typeDonneesEEnum, typeDonnees.FLOAT);
		addEEnumLiteral(typeDonneesEEnum, typeDonnees.DATE);

		initEEnum(comOperatorEEnum, comOperator.class, "comOperator");
		addEEnumLiteral(comOperatorEEnum, comOperator.INF);
		addEEnumLiteral(comOperatorEEnum, comOperator.SUP);
		addEEnumLiteral(comOperatorEEnum, comOperator.EQUAL);

		// Create resource
		createResource(eNS_URI);
	}

} //TpNotePackageImpl
