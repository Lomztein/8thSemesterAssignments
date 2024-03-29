/*
 * generated by Xtext 2.26.0
 */
package lomzt.mdsd.exam.ui;

import com.google.inject.Injector;
import lomzt.mdsd.exam.ui.internal.ExamActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class IF22ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ExamActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ExamActivator activator = ExamActivator.getInstance();
		return activator != null ? activator.getInjector(ExamActivator.LOMZT_MDSD_EXAM_IF22) : null;
	}

}
