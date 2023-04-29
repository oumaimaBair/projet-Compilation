/**
 */
package tpNote.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tpNote.BinaryBooleanExp;
import tpNote.TpNotePackage;
import tpNote.comOperator;
import tpNote.filterCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Boolean Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.BinaryBooleanExpImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link tpNote.impl.BinaryBooleanExpImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link tpNote.impl.BinaryBooleanExpImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryBooleanExpImpl extends filterConditionImpl implements BinaryBooleanExp {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final comOperator OPERATOR_EDEFAULT = comOperator.INF;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected comOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected filterCondition lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected filterCondition rhs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryBooleanExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.BINARY_BOOLEAN_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(comOperator newOperator) {
		comOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.BINARY_BOOLEAN_EXP__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterCondition getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(filterCondition newLhs, NotificationChain msgs) {
		filterCondition oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNotePackage.BINARY_BOOLEAN_EXP__LHS, oldLhs, newLhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(filterCondition newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.BINARY_BOOLEAN_EXP__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject) newLhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.BINARY_BOOLEAN_EXP__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.BINARY_BOOLEAN_EXP__LHS, newLhs,
					newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filterCondition getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(filterCondition newRhs, NotificationChain msgs) {
		filterCondition oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNotePackage.BINARY_BOOLEAN_EXP__RHS, oldRhs, newRhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(filterCondition newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject) rhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.BINARY_BOOLEAN_EXP__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject) newRhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.BINARY_BOOLEAN_EXP__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.BINARY_BOOLEAN_EXP__RHS, newRhs,
					newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNotePackage.BINARY_BOOLEAN_EXP__LHS:
			return basicSetLhs(null, msgs);
		case TpNotePackage.BINARY_BOOLEAN_EXP__RHS:
			return basicSetRhs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TpNotePackage.BINARY_BOOLEAN_EXP__OPERATOR:
			return getOperator();
		case TpNotePackage.BINARY_BOOLEAN_EXP__LHS:
			return getLhs();
		case TpNotePackage.BINARY_BOOLEAN_EXP__RHS:
			return getRhs();
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
		case TpNotePackage.BINARY_BOOLEAN_EXP__OPERATOR:
			setOperator((comOperator) newValue);
			return;
		case TpNotePackage.BINARY_BOOLEAN_EXP__LHS:
			setLhs((filterCondition) newValue);
			return;
		case TpNotePackage.BINARY_BOOLEAN_EXP__RHS:
			setRhs((filterCondition) newValue);
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
		case TpNotePackage.BINARY_BOOLEAN_EXP__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case TpNotePackage.BINARY_BOOLEAN_EXP__LHS:
			setLhs((filterCondition) null);
			return;
		case TpNotePackage.BINARY_BOOLEAN_EXP__RHS:
			setRhs((filterCondition) null);
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
		case TpNotePackage.BINARY_BOOLEAN_EXP__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case TpNotePackage.BINARY_BOOLEAN_EXP__LHS:
			return lhs != null;
		case TpNotePackage.BINARY_BOOLEAN_EXP__RHS:
			return rhs != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryBooleanExpImpl
