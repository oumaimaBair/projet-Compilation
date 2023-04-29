/**
 */
package tpNote;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.Programme#getInput <em>Input</em>}</li>
 *   <li>{@link tpNote.Programme#getOutput <em>Output</em>}</li>
 *   <li>{@link tpNote.Programme#getFiltercondition <em>Filtercondition</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(File)
	 * @see tpNote.TpNotePackage#getProgramme_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getInput();

	/**
	 * Sets the value of the '{@link tpNote.Programme#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(File value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(HTMLFile)
	 * @see tpNote.TpNotePackage#getProgramme_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTMLFile getOutput();

	/**
	 * Sets the value of the '{@link tpNote.Programme#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(HTMLFile value);

	/**
	 * Returns the value of the '<em><b>Filtercondition</b></em>' containment reference list.
	 * The list contents are of type {@link tpNote.filterCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtercondition</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getProgramme_Filtercondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<filterCondition> getFiltercondition();

} // Programme
