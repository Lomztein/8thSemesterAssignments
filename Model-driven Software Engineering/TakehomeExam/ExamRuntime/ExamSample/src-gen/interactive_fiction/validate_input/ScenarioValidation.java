package interactive_fiction.validate_input;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioValidation extends Scenario {
	
	External external;
	String __last_input;
	
	String __var_name;
	int __var_favNumber;
	
	public ScenarioValidation() { 
	}
	
	public ScenarioValidation(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("Hi again! This is going to be a short game, as I am just testing something out");
						nextInteraction = "Promise";
						break;
					case "Promise":
						System.out.println("I promise this will be worthy for a future game");
						nextInteraction = "AskNumber";
						break;
					case "AskNumber":
						System.out.println("What was your favorite number?");
						__last_input = br.readLine();
						int __this_AskNumber = Integer.parseInt(__last_input);
						if (!(__this_AskNumber > 0)) {
							throw new Exception("Invalid input, please try again.");
						}
						nextInteraction = "End";
						break;
					case "End":
						System.out.println("I am sorry if you like negative numbers more, but positive numbers are going to give us a much better experience");
						return "End";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
