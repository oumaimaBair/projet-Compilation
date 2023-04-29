/**
 */
package tpNote;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.HTMLFile#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getHTMLFile()
 * @model
 * @generated
 */
public interface HTMLFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference list.
	 * The list contents are of type {@link tpNote.Graph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference list.
	 * @see tpNote.TpNotePackage#getHTMLFile_Graph()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Graph> getGraph();

} // HTMLFile
