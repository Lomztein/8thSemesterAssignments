/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lomzt.mdsd.exam.iF22.NotEquals#getLeft <em>Left</em>}</li>
 *   <li>{@link lomzt.mdsd.exam.iF22.NotEquals#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see lomzt.mdsd.exam.iF22.IF22Package#getNotEquals()
 * @model
 * @generated
 */
public interface NotEquals extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see lomzt.mdsd.exam.iF22.IF22Package#getNotEquals_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link lomzt.mdsd.exam.iF22.NotEquals#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see lomzt.mdsd.exam.iF22.IF22Package#getNotEquals_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link lomzt.mdsd.exam.iF22.NotEquals#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // NotEquals
