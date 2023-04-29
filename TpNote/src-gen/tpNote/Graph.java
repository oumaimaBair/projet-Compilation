/**
 */
package tpNote;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tpNote.Graph#getType <em>Type</em>}</li>
 *   <li>{@link tpNote.Graph#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link tpNote.Graph#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link tpNote.Graph#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see tpNote.TpNotePackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tpNote.typeGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tpNote.typeGraph
	 * @see #setType(typeGraph)
	 * @see tpNote.TpNotePackage#getGraph_Type()
	 * @model
	 * @generated
	 */
	typeGraph getType();

	/**
	 * Sets the value of the '{@link tpNote.Graph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tpNote.typeGraph
	 * @see #getType()
	 * @generated
	 */
	void setType(typeGraph value);

	/**
	 * Returns the value of the '<em><b>XAxis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' reference.
	 * @see #setXAxis(extractedData)
	 * @see tpNote.TpNotePackage#getGraph_XAxis()
	 * @model required="true"
	 * @generated
	 */
	extractedData getXAxis();

	/**
	 * Sets the value of the '{@link tpNote.Graph#getXAxis <em>XAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' reference.
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(extractedData value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' reference list.
	 * The list contents are of type {@link tpNote.extractedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' reference list.
	 * @see tpNote.TpNotePackage#getGraph_YAxis()
	 * @model
	 * @generated
	 */
	EList<extractedData> getYAxis();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see tpNote.TpNotePackage#getGraph_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link tpNote.Graph#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Graph
