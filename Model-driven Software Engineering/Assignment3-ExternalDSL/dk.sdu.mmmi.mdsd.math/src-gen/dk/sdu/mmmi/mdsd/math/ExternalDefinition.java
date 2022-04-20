/**
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalDefinition#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalDefinition#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalDefinition()
 * @model
 * @generated
 */
public interface ExternalDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.ExternalDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.MathNumberType}.
   * The literals are from the enumeration {@link dk.sdu.mmmi.mdsd.math.MathNumberType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see dk.sdu.mmmi.mdsd.math.MathNumberType
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalDefinition_Params()
   * @model unique="false"
   * @generated
   */
  EList<MathNumberType> getParams();

} // ExternalDefinition
