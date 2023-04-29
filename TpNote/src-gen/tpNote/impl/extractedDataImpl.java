/**
 */
package tpNote.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import tpNote.TpNotePackage;
import tpNote.extractedData;
import tpNote.typeDonnees;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>extracted Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.extractedDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link tpNote.impl.extractedDataImpl#getTypeData <em>Type Data</em>}</li>
 *   <li>{@link tpNote.impl.extractedDataImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class extractedDataImpl extends MinimalEObjectImpl.Container implements extractedData {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeData() <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeData()
	 * @generated
	 * @ordered
	 */
	protected static final typeDonnees TYPE_DATA_EDEFAULT = typeDonnees.INT;

	/**
	 * The cached value of the '{@link #getTypeData() <em>Type Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeData()
	 * @generated
	 * @ordered
	 */
	protected typeDonnees typeData = TYPE_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected extractedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.EXTRACTED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.EXTRACTED_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeDonnees getTypeData() {
		return typeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeData(typeDonnees newTypeData) {
		typeDonnees oldTypeData = typeData;
		typeData = newTypeData == null ? TYPE_DATA_EDEFAULT : newTypeData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.EXTRACTED_DATA__TYPE_DATA, oldTypeData,
					typeData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.EXTRACTED_DATA__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNotePackage.EXTRACTED_DATA__NAME:
			return getName();
		case TpNotePackage.EXTRACTED_DATA__TYPE_DATA:
			return getTypeData();
		case TpNotePackage.EXTRACTED_DATA__INDEX:
			return getIndex();
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
		case TpNotePackage.EXTRACTED_DATA__NAME:
			setName((String) newValue);
			return;
		case TpNotePackage.EXTRACTED_DATA__TYPE_DATA:
			setTypeData((typeDonnees) newValue);
			return;
		case TpNotePackage.EXTRACTED_DATA__INDEX:
			setIndex((Integer) newValue);
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
		case TpNotePackage.EXTRACTED_DATA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TpNotePackage.EXTRACTED_DATA__TYPE_DATA:
			setTypeData(TYPE_DATA_EDEFAULT);
			return;
		case TpNotePackage.EXTRACTED_DATA__INDEX:
			setIndex(INDEX_EDEFAULT);
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
		case TpNotePackage.EXTRACTED_DATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TpNotePackage.EXTRACTED_DATA__TYPE_DATA:
			return typeData != TYPE_DATA_EDEFAULT;
		case TpNotePackage.EXTRACTED_DATA__INDEX:
			return index != INDEX_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", typeData: ");
		result.append(typeData);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //extractedDataImpl
