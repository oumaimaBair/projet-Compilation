/**
 */
package tpNote.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tpNote.TpNotePackage;
import tpNote.colRef;
import tpNote.extractedData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>col Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.colRefImpl#getExtracteddata <em>Extracteddata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class colRefImpl extends filterConditionImpl implements colRef {
	/**
	 * The cached value of the '{@link #getExtracteddata() <em>Extracteddata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtracteddata()
	 * @generated
	 * @ordered
	 */
	protected extractedData extracteddata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected colRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.COL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extractedData getExtracteddata() {
		if (extracteddata != null && extracteddata.eIsProxy()) {
			InternalEObject oldExtracteddata = (InternalEObject) extracteddata;
			extracteddata = (extractedData) eResolveProxy(oldExtracteddata);
			if (extracteddata != oldExtracteddata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TpNotePackage.COL_REF__EXTRACTEDDATA,
							oldExtracteddata, extracteddata));
			}
		}
		return extracteddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public extractedData basicGetExtracteddata() {
		return extracteddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtracteddata(extractedData newExtracteddata) {
		extractedData oldExtracteddata = extracteddata;
		extracteddata = newExtracteddata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.COL_REF__EXTRACTEDDATA,
					oldExtracteddata, extracteddata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNotePackage.COL_REF__EXTRACTEDDATA:
			if (resolve)
				return getExtracteddata();
			return basicGetExtracteddata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TpNotePackage.COL_REF__EXTRACTEDDATA:
			setExtracteddata((extractedData) newValue);
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
		case TpNotePackage.COL_REF__EXTRACTEDDATA:
			setExtracteddata((extractedData) null);
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
		case TpNotePackage.COL_REF__EXTRACTEDDATA:
			return extracteddata != null;
		}
		return super.eIsSet(featureID);
	}

} //colRefImpl
