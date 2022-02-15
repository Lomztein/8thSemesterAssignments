package main;

import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine currentMachine = null;
	private State currentState;

	public void run(Machine m) {
		// TODO Auto-generated method stub
		currentMachine = m;
		currentState = currentMachine.getInitialState();
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return currentState;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		List<Transition> transitions = currentState.getTransitionsByEvent(string);

		for (Transition transition : transitions) {
			boolean transitioned = false;
			
			if (!transition.isConditional()) {
				transitioned = true;
			}else {
				String valueName = transition.getConditionalVariableName().toString();
				Integer compareValue = transition.getConditionalComparedValue();
				Integer stateValue = currentMachine.getInteger(valueName);
				
				if (transition.isConditionEqual()) {
					if (stateValue == compareValue)
						transitioned = true;
				}
				if (transition.isConditionGreaterThan()) {
					if (stateValue > compareValue)
						transitioned = true;
				}
				if (transition.isConditionLessThan()) {
					if (stateValue < compareValue)
						transitioned = true;
				}
			}
			
			if (transitioned) {
				
				if (transition.hasOperation()) {
					String operationValueName = transition.getOperationVariableName().toString();
					
					if (transition.isHasIncrementOperation()) {
						currentMachine.setInteger(operationValueName, getInteger(operationValueName) + 1);
					}
					if (transition.isHasDecrementOperation()) {
						currentMachine.setInteger(operationValueName, getInteger(operationValueName) - 1);
					}
					if (transition.hasSetOperation()) {
						currentMachine.setInteger(operationValueName, transition.getSetOperationValue());
					}
				}
				
				currentState = currentMachine.getState(transition.getTarget());
				break; // Try each transition until one succeeds.
			}
		}
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return currentMachine.getInteger(string);
	}
}
