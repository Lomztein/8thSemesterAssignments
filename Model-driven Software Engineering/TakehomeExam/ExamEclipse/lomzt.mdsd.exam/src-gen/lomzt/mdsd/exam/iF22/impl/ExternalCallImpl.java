/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.iF22.impl;

import java.util.Collection;

import lomzt.mdsd.exam.iF22.Expression;
import lomzt.mdsd.exam.iF22.ExternalCall;
import lomzt.mdsd.exam.iF22.ExternalImport;
import lomzt.mdsd.exam.iF22.IF22Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lomzt.mdsd.exam.iF22.impl.ExternalCallImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link lomzt.mdsd.exam.iF22.impl.ExternalCallImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallImpl extends ExpressionImpl implements ExternalCall
{
  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected ExternalImport func;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<Expression> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IF22Package.Literals.EXTERNAL_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalImport getFunc()
  {
    if (func != null && func.eIsProxy())
    {
      InternalEObject oldFunc = (InternalEObject)func;
      func = (ExternalImport)eResolveProxy(oldFunc);
      if (func != oldFunc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IF22Package.EXTERNAL_CALL__FUNC, oldFunc, func));
      }
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalImport basicGetFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunc(ExternalImport newFunc)
  {
    ExternalImport oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IF22Package.EXTERNAL_CALL__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<Expression>(Expression.class, this, IF22Package.EXTERNAL_CALL__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IF22Package.EXTERNAL_CALL__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IF22Package.EXTERNAL_CALL__FUNC:
        if (resolve) return getFunc();
        return basicGetFunc();
      case IF22Package.EXTERNAL_CALL__ARGS:
        return getArgs();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IF22Package.EXTERNAL_CALL__FUNC:
        setFunc((ExternalImport)newValue);
        return;
      case IF22Package.EXTERNAL_CALL__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends Expression>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IF22Package.EXTERNAL_CALL__FUNC:
        setFunc((ExternalImport)null);
        return;
      case IF22Package.EXTERNAL_CALL__ARGS:
        getArgs().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IF22Package.EXTERNAL_CALL__FUNC:
        return func != null;
      case IF22Package.EXTERNAL_CALL__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExternalCallImpl
