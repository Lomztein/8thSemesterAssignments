package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String name;
	private List<Transition> transitions = new ArrayList<Transition>();

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public List<Transition> getTransitionsByEvent(String string) {
		List<Transition> results = new ArrayList<Transition>();
		for (Transition trans : getTransitions()) {
			if (trans.getEvent().equals(string)) {
				results.add(trans);
			}
		}
		return results;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void addTransition (Transition transition) {
		transitions.add(transition);
	}

}
 