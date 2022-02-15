package main.metamodel;

public class Transition {

	private String eventName;
	private String targetName;
	
	private boolean hasSetOperation;
	private boolean hasIncrementOperation;
	private boolean hasDecrementOperation;
	private Object operationVariableName;	
	private boolean isConditional;
	private Object conditionalVariableName;
	private Integer conditionalComparedValue;
	private Integer setOperationValue;
	private boolean isConditionEqual;
	private boolean isConditionGreaterThan;
	private boolean isConditionLessThan;
	private boolean hasOperation;


	public String getEvent() {
		// TODO Auto-generated method stub
		return eventName;
	}

	public String getTarget() {
		// TODO Auto-generated method stub
		return targetName;
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		return hasSetOperation;
	}
	
	public void setSetOperationValue (Integer value) {
		setOperationValue = value;
	}
	
	public Integer getSetOperationValue () {
		return setOperationValue;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return hasIncrementOperation;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return hasDecrementOperation;
	}


	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		return operationVariableName;
	}


	public boolean isConditional() {
		// TODO Auto-generated method stub
		return isConditional;
	}

	
	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return conditionalVariableName;
	}

	
	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return conditionalComparedValue;
	}

	
	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return isConditionEqual;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return isConditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return isConditionLessThan;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return hasOperation;
	}

	public boolean isHasSetOperation() {
		return hasSetOperation;
	}

	public void setHasSetOperation(boolean hasSetOperation) {
		this.hasSetOperation = hasSetOperation;
	}

	public boolean isHasIncrementOperation() {
		return hasIncrementOperation;
	}

	public void setHasIncrementOperation(boolean hasIncrementOperation) {
		this.hasIncrementOperation = hasIncrementOperation;
	}

	public boolean isHasDecrementOperation() {
		return hasDecrementOperation;
	}

	public void setHasDecrementOperation(boolean hasDecrementOperation) {
		this.hasDecrementOperation = hasDecrementOperation;
	}

	public Object getConditionalVariableName() {
		return conditionalVariableName;
	}

	public void setConditionalVariableName(Object conditionalVariableName) {
		this.conditionalVariableName = conditionalVariableName;
	}

	public Integer getConditionalComparedValue() {
		return conditionalComparedValue;
	}

	public void setConditionalComparedValue(Integer conditionalComparedValue) {
		this.conditionalComparedValue = conditionalComparedValue;
	}

	public boolean isHasOperation() {
		return hasOperation;
	}

	public void setHasOperation(boolean hasOperation) {
		this.hasOperation = hasOperation;
	}

	public void setEvent(String event) {
		this.eventName = event;
	}

	public void setTarget(String target) {
		this.targetName = target;
	}

	public void setOperationVariableName(Object operationVariableName) {
		this.operationVariableName = operationVariableName;
	}

	public void setConditional(boolean isConditional) {
		this.isConditional = isConditional;
	}

	public void setConditionEqual(boolean isConditionEqual) {
		this.isConditionEqual = isConditionEqual;
	}

	public void setConditionGreaterThan(boolean isConditionGreaterThan) {
		this.isConditionGreaterThan = isConditionGreaterThan;
	}

	public void setConditionLessThan(boolean isConditionLessThan) {
		this.isConditionLessThan = isConditionLessThan;
	}

}
