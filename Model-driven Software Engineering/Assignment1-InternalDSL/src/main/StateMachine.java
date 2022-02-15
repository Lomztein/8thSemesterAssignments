package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	
	// Machine attributes
	private State initialState;
	private Map<String, Integer> integers = new HashMap<String, Integer>();
	private Map<String, State> states = new HashMap<String, State>();
	
	private State currentState;
	private Transition currentTransition;
	
	public Machine build() {
		
		commitCurrentTransition();
		List<State> statesList = new ArrayList<State>();
		for (State state : states.values()) {
			statesList.add(state);
		}
		
		return new Machine (initialState, statesList, integers);
	}
	
	private void commitCurrentTransition () {
		if (currentTransition != null && currentState != null) {
			currentState.addTransition(currentTransition);
			currentTransition = null;
		}
	}

	public StateMachine state(String string) {
		commitCurrentTransition();
		if (states.containsKey(string)) {
			currentState = states.get(string);
		}else {
			currentState = new State();
			currentState.setName(string);
			states.put(string, currentState);
		}
		return this;
	}

	public StateMachine initial() {
		initialState = currentState;
		return this;
	}

	public StateMachine when(String string) {
		
		commitCurrentTransition ();
		currentTransition = new Transition();
		currentTransition.setEvent(string);
		
		return this;
	}

	public StateMachine to(String string) {
		currentTransition.setTarget(string);
		return this;
	}

	public StateMachine integer(String string) {
		integers.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTransition.setHasOperation(true);
		currentTransition.setHasSetOperation(true);
		currentTransition.setOperationVariableName(string);
		currentTransition.setSetOperationValue(i);
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		currentTransition.setHasOperation(true);
		currentTransition.setOperationVariableName(string);
		currentTransition.setHasIncrementOperation(true);
		return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		currentTransition.setHasOperation(true);
		currentTransition.setOperationVariableName(string);
		currentTransition.setHasDecrementOperation(true);
		return this;
	}
	
	private void setCurrentTransitionToBeConditional (String conditionalVariableName, Integer conditionalVariableValue) {
		currentTransition.setConditional(true);
		currentTransition.setConditionalComparedValue(conditionalVariableValue);
		currentTransition.setConditionalVariableName(conditionalVariableName);
	}

	public StateMachine ifEquals(String string, int i) {
		setCurrentTransitionToBeConditional(string, i);
		currentTransition.setConditionEqual(true);
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		setCurrentTransitionToBeConditional(string, i);
		currentTransition.setConditionGreaterThan(true);
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		setCurrentTransitionToBeConditional(string, i);
		currentTransition.setConditionLessThan(true);
		return this;
	}
}
