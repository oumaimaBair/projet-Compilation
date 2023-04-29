/**
 */
package tpNote.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tpNote.Graph;
import tpNote.TpNotePackage;
import tpNote.extractedData;
import tpNote.typeGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.GraphImpl#getType <em>Type</em>}</li>
 *   <li>{@link tpNote.impl.GraphImpl#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link tpNote.impl.GraphImpl#getYAxis <em>YAxis</em>}</li>
 *   <li>{@link tpNote.impl.GraphImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final typeGraph TYPE_EDEFAULT = typeGraph.BAR_CHART;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected typeGraph type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXAxis() <em>XAxis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxis()
	 * @generated
	 * @ordered
	 */
	protected extractedData xAxis;

	/**
	 * The cached value of the '{@link #getYAxis() <em>YAxis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxis()
	 * @generated
	 * @ordered
	 */
	protected EList<extractedData> yAxis;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeGraph getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(typeGraph newType) {
		typeGraph oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.GRAPH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extractedData getXAxis() {
		if (xAxis != null && xAxis.eIsProxy()) {
			InternalEObject oldXAxis = (InternalEObject) xAxis;
			xAxis = (extractedData) eResolveProxy(oldXAxis);
			if (xAxis != oldXAxis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNotePackage.GRAPH__XAXIS, oldXAxis,
							xAxis));
			}
		}
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extractedData basicGetXAxis() {
		return xAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxis(extractedData newXAxis) {
		extractedData oldXAxis = xAxis;
		xAxis = newXAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.GRAPH__XAXIS, oldXAxis, xAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<extractedData> getYAxis() {
		if (yAxis == null) {
			yAxis = new EObjectResolvingEList<extractedData>(extractedData.class, this, TpNotePackage.GRAPH__YAXIS);
		}
		return yAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.GRAPH__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNotePackage.GRAPH__TYPE:
			return getType();
		case TpNotePackage.GRAPH__XAXIS:
			if (resolve)
				return getXAxis();
			return basicGetXAxis();
		case TpNotePackage.GRAPH__YAXIS:
			return getYAxis();
		case TpNotePackage.GRAPH__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TpNotePackage.GRAPH__TYPE:
			setType((typeGraph) newValue);
			return;
		case TpNotePackage.GRAPH__XAXIS:
			setXAxis((extractedData) newValue);
			return;
		case TpNotePackage.GRAPH__YAXIS:
			getYAxis().clear();
			getYAxis().addAll((Collection<? extends extractedData>) newValue);
			return;
		case TpNotePackage.GRAPH__TITLE:
			setTitle((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TpNotePackage.GRAPH__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TpNotePackage.GRAPH__XAXIS:
			setXAxis((extractedData) null);
			return;
		case TpNotePackage.GRAPH__YAXIS:
			getYAxis().clear();
			return;
		case TpNotePackage.GRAPH__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TpNotePackage.GRAPH__TYPE:
			return type != TYPE_EDEFAULT;
		case TpNotePackage.GRAPH__XAXIS:
			return xAxis != null;
		case TpNotePackage.GRAPH__YAXIS:
			return yAxis != null && !yAxis.isEmpty();
		case TpNotePackage.GRAPH__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
