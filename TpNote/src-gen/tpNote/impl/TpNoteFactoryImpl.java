/**
 */
package tpNote.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tpNote.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TpNoteFactoryImpl extends EFactoryImpl implements TpNoteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TpNoteFactory init() {
		try {
			TpNoteFactory theTpNoteFactory = (TpNoteFactory) EPackage.Registry.INSTANCE
					.getEFactory(TpNotePackage.eNS_URI);
			if (theTpNoteFactory != null) {
				return theTpNoteFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TpNoteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNoteFactoryImpl() {
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
		case TpNotePackage.PROGRAMME:
			return createProgramme();
		case TpNotePackage.FILE:
			return createFile();
		case TpNotePackage.GRAPH:
			return createGraph();
		case TpNotePackage.EXTRACTED_DATA:
			return createextractedData();
		case TpNotePackage.NEW_ECLASS5:
			return createNewEClass5();
		case TpNotePackage.HTML_FILE:
			return createHTMLFile();
		case TpNotePackage.CONSTANT:
			return createConstant();
		case TpNotePackage.BINARY_BOOLEAN_EXP:
			return createBinaryBooleanExp();
		case TpNotePackage.COL_REF:
			return createcolRef();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TpNotePackage.TYPE_GRAPH:
			return createtypeGraphFromString(eDataType, initialValue);
		case TpNotePackage.TYPE_DONNEES:
			return createtypeDonneesFromString(eDataType, initialValue);
		case TpNotePackage.COM_OPERATOR:
			return createcomOperatorFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TpNotePackage.TYPE_GRAPH:
			return converttypeGraphToString(eDataType, instanceValue);
		case TpNotePackage.TYPE_DONNEES:
			return converttypeDonneesToString(eDataType, instanceValue);
		case TpNotePackage.COM_OPERATOR:
			return convertcomOperatorToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extractedData createextractedData() {
		extractedDataImpl extractedData = new extractedDataImpl();
		return extractedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass5 createNewEClass5() {
		NewEClass5Impl newEClass5 = new NewEClass5Impl();
		return newEClass5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLFile createHTMLFile() {
		HTMLFileImpl htmlFile = new HTMLFileImpl();
		return htmlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBooleanExp createBinaryBooleanExp() {
		BinaryBooleanExpImpl binaryBooleanExp = new BinaryBooleanExpImpl();
		return binaryBooleanExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public colRef createcolRef() {
		colRefImpl colRef = new colRefImpl();
		return colRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeGraph createtypeGraphFromString(EDataType eDataType, String initialValue) {
		typeGraph result = typeGraph.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeGraphToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeDonnees createtypeDonneesFromString(EDataType eDataType, String initialValue) {
		typeDonnees result = typeDonnees.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeDonneesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comOperator createcomOperatorFromString(EDataType eDataType, String initialValue) {
		comOperator result = comOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcomOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TpNotePackage getTpNotePackage() {
		return (TpNotePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TpNotePackage getPackage() {
		return TpNotePackage.eINSTANCE;
	}

} //TpNoteFactoryImpl
