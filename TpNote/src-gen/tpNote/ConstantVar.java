/**
 */
package tpNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.ConstantVar#getType <em>Type</em>}</li>
 *   <li>{@link tpNote.ConstantVar#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getConstantVar()
 * @model
 * @generated
 */
public interface ConstantVar extends filterCondition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link tpNote.typeDonnees}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tpNote.typeDonnees
	 * @see #setType(typeDonnees)
	 * @see tpNote.TpNotePackage#getConstantVar_Type()
	 * @model default="int"
	 * @generated
	 */
	typeDonnees getType();

	/**
	 * Sets the value of the '{@link tpNote.ConstantVar#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tpNote.typeDonnees
	 * @see #getType()
	 * @generated
	 */
	void setType(typeDonnees value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see tpNote.TpNotePackage#getConstantVar_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link tpNote.ConstantVar#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ConstantVar
