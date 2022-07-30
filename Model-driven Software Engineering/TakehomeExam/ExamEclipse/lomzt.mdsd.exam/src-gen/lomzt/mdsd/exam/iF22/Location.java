/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.iF22;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lomzt.mdsd.exam.iF22.Location#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see lomzt.mdsd.exam.iF22.IF22Package#getLocation()
 * @model
 * @generated
 */
public interface Location extends Targetable
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Expression)
   * @see lomzt.mdsd.exam.iF22.IF22Package#getLocation_Text()
   * @model containment="true"
   * @generated
   */
  Expression getText();

  /**
   * Sets the value of the '{@link lomzt.mdsd.exam.iF22.Location#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Expression value);

} // Location
