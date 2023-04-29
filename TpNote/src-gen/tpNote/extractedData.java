/**
 */
package tpNote;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>extracted Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.extractedData#getName <em>Name</em>}</li>
 *   <li>{@link tpNote.extractedData#getTypeData <em>Type Data</em>}</li>
 *   <li>{@link tpNote.extractedData#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getextractedData()
 * @model
 * @generated
 */
public interface extractedData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tpNote.TpNotePackage#getextractedData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tpNote.extractedData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Data</b></em>' attribute.
	 * The literals are from the enumeration {@link tpNote.typeDonnees}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Data</em>' attribute.
	 * @see tpNote.typeDonnees
	 * @see #setTypeData(typeDonnees)
	 * @see tpNote.TpNotePackage#getextractedData_TypeData()
	 * @model
	 * @generated
	 */
	typeDonnees getTypeData();

	/**
	 * Sets the value of the '{@link tpNote.extractedData#getTypeData <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Data</em>' attribute.
	 * @see tpNote.typeDonnees
	 * @see #getTypeData()
	 * @generated
	 */
	void setTypeData(typeDonnees value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see tpNote.TpNotePackage#getextractedData_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link tpNote.extractedData#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // extractedData
