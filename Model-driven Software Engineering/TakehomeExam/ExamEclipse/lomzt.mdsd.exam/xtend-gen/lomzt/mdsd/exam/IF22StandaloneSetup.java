/**
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class IF22StandaloneSetup extends IF22StandaloneSetupGenerated {
  public static void doSetup() {
    new IF22StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
