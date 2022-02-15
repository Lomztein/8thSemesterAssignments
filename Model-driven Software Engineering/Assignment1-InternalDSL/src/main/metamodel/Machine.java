package main.metamodel;

import java.util.List;
import java.util.Map;

public class Machine {
	
	private State initialState;
	private List<State> states;
	private Map<String, Integer> integers;
	
	public Machine (State initialState, List<State> states, Map<String, Integer> integers) {
		this.initialState = initialState;
		this.states = states;
		this.integers = integers;
	}

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getState(String string) {
		// TODO Auto-generated method stub
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return integers.size();
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return integers.containsKey(string);
	}
	
	public void setInteger (String integer, Integer value) {
		integers.replace(integer, value);
	}
	
	public Integer getInteger (String integer) {
		return integers.get(integer);
	}

}
