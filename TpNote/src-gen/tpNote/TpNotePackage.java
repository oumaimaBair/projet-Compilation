/**
 */
package tpNote;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see tpNote.TpNoteFactory
 * @model kind="package"
 * @generated
 */
public interface TpNotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tpNote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tpNote";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tpNote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TpNotePackage eINSTANCE = tpNote.impl.TpNotePackageImpl.init();

	/**
	 * The meta object id for the '{@link tpNote.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.ProgrammeImpl
	 * @see tpNote.impl.TpNotePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Filtercondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__FILTERCONDITION = 2;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.FileImpl
	 * @see tpNote.impl.TpNotePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 1;

	/**
	 * The feature id for the '<em><b>Keep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KEEP = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DELIMITER = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.GraphImpl
	 * @see tpNote.impl.TpNotePackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TYPE = 0;

	/**
	 * The feature id for the '<em><b>XAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__XAXIS = 1;

	/**
	 * The feature id for the '<em><b>YAxis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__YAXIS = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.filterConditionImpl <em>filter Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.filterConditionImpl
	 * @see tpNote.impl.TpNotePackageImpl#getfilterCondition()
	 * @generated
	 */
	int FILTER_CONDITION = 6;

	/**
	 * The meta object id for the '{@link tpNote.impl.extractedDataImpl <em>extracted Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.extractedDataImpl
	 * @see tpNote.impl.TpNotePackageImpl#getextractedData()
	 * @generated
	 */
	int EXTRACTED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTED_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTED_DATA__TYPE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTED_DATA__INDEX = 2;

	/**
	 * The number of structural features of the '<em>extracted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTED_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>extracted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.NewEClass5Impl <em>New EClass5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.NewEClass5Impl
	 * @see tpNote.impl.TpNotePackageImpl#getNewEClass5()
	 * @generated
	 */
	int NEW_ECLASS5 = 4;

	/**
	 * The number of structural features of the '<em>New EClass5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS5_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS5_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.HTMLFileImpl <em>HTML File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.HTMLFileImpl
	 * @see tpNote.impl.TpNotePackageImpl#getHTMLFile()
	 * @generated
	 */
	int HTML_FILE = 5;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FILE__GRAPH = 0;

	/**
	 * The number of structural features of the '<em>HTML File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HTML File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FILE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.ConstantImpl
	 * @see tpNote.impl.TpNotePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.BinaryBooleanExpImpl <em>Binary Boolean Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.BinaryBooleanExpImpl
	 * @see tpNote.impl.TpNotePackageImpl#getBinaryBooleanExp()
	 * @generated
	 */
	int BINARY_BOOLEAN_EXP = 8;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXP__OPERATOR = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXP__LHS = FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXP__RHS = FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXP_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_BOOLEAN_EXP_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpNote.impl.colRefImpl <em>col Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.impl.colRefImpl
	 * @see tpNote.impl.TpNotePackageImpl#getcolRef()
	 * @generated
	 */
	int COL_REF = 9;

	/**
	 * The feature id for the '<em><b>Extracteddata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REF__EXTRACTEDDATA = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>col Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REF_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>col Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_REF_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tpNote.typeGraph <em>type Graph</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.typeGraph
	 * @see tpNote.impl.TpNotePackageImpl#gettypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 10;

	/**
	 * The meta object id for the '{@link tpNote.typeDonnees <em>type Donnees</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.typeDonnees
	 * @see tpNote.impl.TpNotePackageImpl#gettypeDonnees()
	 * @generated
	 */
	int TYPE_DONNEES = 11;

	/**
	 * The meta object id for the '{@link tpNote.comOperator <em>com Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tpNote.comOperator
	 * @see tpNote.impl.TpNotePackageImpl#getcomOperator()
	 * @generated
	 */
	int COM_OPERATOR = 12;

	/**
	 * Returns the meta object for class '{@link tpNote.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see tpNote.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the containment reference '{@link tpNote.Programme#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see tpNote.Programme#getInput()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Input();

	/**
	 * Returns the meta object for the containment reference '{@link tpNote.Programme#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see tpNote.Programme#getOutput()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNote.Programme#getFiltercondition <em>Filtercondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filtercondition</em>'.
	 * @see tpNote.Programme#getFiltercondition()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Filtercondition();

	/**
	 * Returns the meta object for class '{@link tpNote.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see tpNote.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNote.File#getKeep <em>Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keep</em>'.
	 * @see tpNote.File#getKeep()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Keep();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see tpNote.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.File#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter</em>'.
	 * @see tpNote.File#getDelimiter()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Delimiter();

	/**
	 * Returns the meta object for class '{@link tpNote.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see tpNote.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.Graph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tpNote.Graph#getType()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Type();

	/**
	 * Returns the meta object for the reference '{@link tpNote.Graph#getXAxis <em>XAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XAxis</em>'.
	 * @see tpNote.Graph#getXAxis()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_XAxis();

	/**
	 * Returns the meta object for the reference list '{@link tpNote.Graph#getYAxis <em>YAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>YAxis</em>'.
	 * @see tpNote.Graph#getYAxis()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_YAxis();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.Graph#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see tpNote.Graph#getTitle()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Title();

	/**
	 * Returns the meta object for class '{@link tpNote.extractedData <em>extracted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>extracted Data</em>'.
	 * @see tpNote.extractedData
	 * @generated
	 */
	EClass getextractedData();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.extractedData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tpNote.extractedData#getName()
	 * @see #getextractedData()
	 * @generated
	 */
	EAttribute getextractedData_Name();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.extractedData#getTypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Data</em>'.
	 * @see tpNote.extractedData#getTypeData()
	 * @see #getextractedData()
	 * @generated
	 */
	EAttribute getextractedData_TypeData();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.extractedData#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see tpNote.extractedData#getIndex()
	 * @see #getextractedData()
	 * @generated
	 */
	EAttribute getextractedData_Index();

	/**
	 * Returns the meta object for class '{@link tpNote.NewEClass5 <em>New EClass5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass5</em>'.
	 * @see tpNote.NewEClass5
	 * @generated
	 */
	EClass getNewEClass5();

	/**
	 * Returns the meta object for class '{@link tpNote.HTMLFile <em>HTML File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML File</em>'.
	 * @see tpNote.HTMLFile
	 * @generated
	 */
	EClass getHTMLFile();

	/**
	 * Returns the meta object for the containment reference list '{@link tpNote.HTMLFile#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graph</em>'.
	 * @see tpNote.HTMLFile#getGraph()
	 * @see #getHTMLFile()
	 * @generated
	 */
	EReference getHTMLFile_Graph();

	/**
	 * Returns the meta object for class '{@link tpNote.filterCondition <em>filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>filter Condition</em>'.
	 * @see tpNote.filterCondition
	 * @generated
	 */
	EClass getfilterCondition();

	/**
	 * Returns the meta object for class '{@link tpNote.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see tpNote.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tpNote.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Type();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tpNote.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link tpNote.BinaryBooleanExp <em>Binary Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Boolean Exp</em>'.
	 * @see tpNote.BinaryBooleanExp
	 * @generated
	 */
	EClass getBinaryBooleanExp();

	/**
	 * Returns the meta object for the attribute '{@link tpNote.BinaryBooleanExp#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see tpNote.BinaryBooleanExp#getOperator()
	 * @see #getBinaryBooleanExp()
	 * @generated
	 */
	EAttribute getBinaryBooleanExp_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link tpNote.BinaryBooleanExp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see tpNote.BinaryBooleanExp#getLhs()
	 * @see #getBinaryBooleanExp()
	 * @generated
	 */
	EReference getBinaryBooleanExp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link tpNote.BinaryBooleanExp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see tpNote.BinaryBooleanExp#getRhs()
	 * @see #getBinaryBooleanExp()
	 * @generated
	 */
	EReference getBinaryBooleanExp_Rhs();

	/**
	 * Returns the meta object for class '{@link tpNote.colRef <em>col Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>col Ref</em>'.
	 * @see tpNote.colRef
	 * @generated
	 */
	EClass getcolRef();

	/**
	 * Returns the meta object for the reference '{@link tpNote.colRef#getExtracteddata <em>Extracteddata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extracteddata</em>'.
	 * @see tpNote.colRef#getExtracteddata()
	 * @see #getcolRef()
	 * @generated
	 */
	EReference getcolRef_Extracteddata();

	/**
	 * Returns the meta object for enum '{@link tpNote.typeGraph <em>type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Graph</em>'.
	 * @see tpNote.typeGraph
	 * @generated
	 */
	EEnum gettypeGraph();

	/**
	 * Returns the meta object for enum '{@link tpNote.typeDonnees <em>type Donnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Donnees</em>'.
	 * @see tpNote.typeDonnees
	 * @generated
	 */
	EEnum gettypeDonnees();

	/**
	 * Returns the meta object for enum '{@link tpNote.comOperator <em>com Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>com Operator</em>'.
	 * @see tpNote.comOperator
	 * @generated
	 */
	EEnum getcomOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TpNoteFactory getTpNoteFactory();

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
		 * The meta object literal for the '{@link tpNote.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.ProgrammeImpl
		 * @see tpNote.impl.TpNotePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__INPUT = eINSTANCE.getProgramme_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__OUTPUT = eINSTANCE.getProgramme_Output();

		/**
		 * The meta object literal for the '<em><b>Filtercondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__FILTERCONDITION = eINSTANCE.getProgramme_Filtercondition();

		/**
		 * The meta object literal for the '{@link tpNote.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.FileImpl
		 * @see tpNote.impl.TpNotePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Keep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__KEEP = eINSTANCE.getFile_Keep();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__DELIMITER = eINSTANCE.getFile_Delimiter();

		/**
		 * The meta object literal for the '{@link tpNote.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.GraphImpl
		 * @see tpNote.impl.TpNotePackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__TYPE = eINSTANCE.getGraph_Type();

		/**
		 * The meta object literal for the '<em><b>XAxis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__XAXIS = eINSTANCE.getGraph_XAxis();

		/**
		 * The meta object literal for the '<em><b>YAxis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__YAXIS = eINSTANCE.getGraph_YAxis();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__TITLE = eINSTANCE.getGraph_Title();

		/**
		 * The meta object literal for the '{@link tpNote.impl.extractedDataImpl <em>extracted Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.extractedDataImpl
		 * @see tpNote.impl.TpNotePackageImpl#getextractedData()
		 * @generated
		 */
		EClass EXTRACTED_DATA = eINSTANCE.getextractedData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTED_DATA__NAME = eINSTANCE.getextractedData_Name();

		/**
		 * The meta object literal for the '<em><b>Type Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTED_DATA__TYPE_DATA = eINSTANCE.getextractedData_TypeData();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTED_DATA__INDEX = eINSTANCE.getextractedData_Index();

		/**
		 * The meta object literal for the '{@link tpNote.impl.NewEClass5Impl <em>New EClass5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.NewEClass5Impl
		 * @see tpNote.impl.TpNotePackageImpl#getNewEClass5()
		 * @generated
		 */
		EClass NEW_ECLASS5 = eINSTANCE.getNewEClass5();

		/**
		 * The meta object literal for the '{@link tpNote.impl.HTMLFileImpl <em>HTML File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.HTMLFileImpl
		 * @see tpNote.impl.TpNotePackageImpl#getHTMLFile()
		 * @generated
		 */
		EClass HTML_FILE = eINSTANCE.getHTMLFile();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_FILE__GRAPH = eINSTANCE.getHTMLFile_Graph();

		/**
		 * The meta object literal for the '{@link tpNote.impl.filterConditionImpl <em>filter Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.filterConditionImpl
		 * @see tpNote.impl.TpNotePackageImpl#getfilterCondition()
		 * @generated
		 */
		EClass FILTER_CONDITION = eINSTANCE.getfilterCondition();

		/**
		 * The meta object literal for the '{@link tpNote.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.ConstantImpl
		 * @see tpNote.impl.TpNotePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link tpNote.impl.BinaryBooleanExpImpl <em>Binary Boolean Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.BinaryBooleanExpImpl
		 * @see tpNote.impl.TpNotePackageImpl#getBinaryBooleanExp()
		 * @generated
		 */
		EClass BINARY_BOOLEAN_EXP = eINSTANCE.getBinaryBooleanExp();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_BOOLEAN_EXP__OPERATOR = eINSTANCE.getBinaryBooleanExp_Operator();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_BOOLEAN_EXP__LHS = eINSTANCE.getBinaryBooleanExp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_BOOLEAN_EXP__RHS = eINSTANCE.getBinaryBooleanExp_Rhs();

		/**
		 * The meta object literal for the '{@link tpNote.impl.colRefImpl <em>col Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.impl.colRefImpl
		 * @see tpNote.impl.TpNotePackageImpl#getcolRef()
		 * @generated
		 */
		EClass COL_REF = eINSTANCE.getcolRef();

		/**
		 * The meta object literal for the '<em><b>Extracteddata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COL_REF__EXTRACTEDDATA = eINSTANCE.getcolRef_Extracteddata();

		/**
		 * The meta object literal for the '{@link tpNote.typeGraph <em>type Graph</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.typeGraph
		 * @see tpNote.impl.TpNotePackageImpl#gettypeGraph()
		 * @generated
		 */
		EEnum TYPE_GRAPH = eINSTANCE.gettypeGraph();

		/**
		 * The meta object literal for the '{@link tpNote.typeDonnees <em>type Donnees</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.typeDonnees
		 * @see tpNote.impl.TpNotePackageImpl#gettypeDonnees()
		 * @generated
		 */
		EEnum TYPE_DONNEES = eINSTANCE.gettypeDonnees();

		/**
		 * The meta object literal for the '{@link tpNote.comOperator <em>com Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tpNote.comOperator
		 * @see tpNote.impl.TpNotePackageImpl#getcomOperator()
		 * @generated
		 */
		EEnum COM_OPERATOR = eINSTANCE.getcomOperator();

	}

} //TpNotePackage
