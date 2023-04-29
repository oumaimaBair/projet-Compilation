/**
 */
package tpNote.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tpNote.File;
import tpNote.HTMLFile;
import tpNote.Programme;
import tpNote.TpNotePackage;
import tpNote.filterCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tpNote.impl.ProgrammeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link tpNote.impl.ProgrammeImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link tpNote.impl.ProgrammeImpl#getFiltercondition <em>Filtercondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected File input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected HTMLFile output;

	/**
	 * The cached value of the '{@link #getFiltercondition() <em>Filtercondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltercondition()
	 * @generated
	 * @ordered
	 */
	protected EList<filterCondition> filtercondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TpNotePackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(File newInput, NotificationChain msgs) {
		File oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNotePackage.PROGRAMME__INPUT, oldInput, newInput);
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
	public void setInput(File newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.PROGRAMME__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.PROGRAMME__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.PROGRAMME__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLFile getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(HTMLFile newOutput, NotificationChain msgs) {
		HTMLFile oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TpNotePackage.PROGRAMME__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(HTMLFile newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.PROGRAMME__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TpNotePackage.PROGRAMME__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TpNotePackage.PROGRAMME__OUTPUT, newOutput,
					newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<filterCondition> getFiltercondition() {
		if (filtercondition == null) {
			filtercondition = new EObjectContainmentEList<filterCondition>(filterCondition.class, this,
					TpNotePackage.PROGRAMME__FILTERCONDITION);
		}
		return filtercondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TpNotePackage.PROGRAMME__INPUT:
			return basicSetInput(null, msgs);
		case TpNotePackage.PROGRAMME__OUTPUT:
			return basicSetOutput(null, msgs);
		case TpNotePackage.PROGRAMME__FILTERCONDITION:
			return ((InternalEList<?>) getFiltercondition()).basicRemove(otherEnd, msgs);
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
		case TpNotePackage.PROGRAMME__INPUT:
			return getInput();
		case TpNotePackage.PROGRAMME__OUTPUT:
			return getOutput();
		case TpNotePackage.PROGRAMME__FILTERCONDITION:
			return getFiltercondition();
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
		case TpNotePackage.PROGRAMME__INPUT:
			setInput((File) newValue);
			return;
		case TpNotePackage.PROGRAMME__OUTPUT:
			setOutput((HTMLFile) newValue);
			return;
		case TpNotePackage.PROGRAMME__FILTERCONDITION:
			getFiltercondition().clear();
			getFiltercondition().addAll((Collection<? extends filterCondition>) newValue);
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
		case TpNotePackage.PROGRAMME__INPUT:
			setInput((File) null);
			return;
		case TpNotePackage.PROGRAMME__OUTPUT:
			setOutput((HTMLFile) null);
			return;
		case TpNotePackage.PROGRAMME__FILTERCONDITION:
			getFiltercondition().clear();
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
		case TpNotePackage.PROGRAMME__INPUT:
			return input != null;
		case TpNotePackage.PROGRAMME__OUTPUT:
			return output != null;
		case TpNotePackage.PROGRAMME__FILTERCONDITION:
			return filtercondition != null && !filtercondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeImpl
