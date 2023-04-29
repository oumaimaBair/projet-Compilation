/**
 */
package tpNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Boolean Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.BinaryBooleanExp#getOperator <em>Operator</em>}</li>
 *   <li>{@link tpNote.BinaryBooleanExp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link tpNote.BinaryBooleanExp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getBinaryBooleanExp()
 * @model
 * @generated
 */
public interface BinaryBooleanExp extends filterCondition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link tpNote.comOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see tpNote.comOperator
	 * @see #setOperator(comOperator)
	 * @see tpNote.TpNotePackage#getBinaryBooleanExp_Operator()
	 * @model
	 * @generated
	 */
	comOperator getOperator();

	/**
	 * Sets the value of the '{@link tpNote.BinaryBooleanExp#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see tpNote.comOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(comOperator value);

	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(filterCondition)
	 * @see tpNote.TpNotePackage#getBinaryBooleanExp_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	filterCondition getLhs();

	/**
	 * Sets the value of the '{@link tpNote.BinaryBooleanExp#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(filterCondition value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(filterCondition)
	 * @see tpNote.TpNotePackage#getBinaryBooleanExp_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	filterCondition getRhs();

	/**
	 * Sets the value of the '{@link tpNote.BinaryBooleanExp#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(filterCondition value);

} // BinaryBooleanExp
