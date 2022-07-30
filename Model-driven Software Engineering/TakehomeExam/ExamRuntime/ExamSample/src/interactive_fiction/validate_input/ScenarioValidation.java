package interactive_fiction.validate_input;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioValidation extends Scenario {
	String name;
	int favNumber;
	int __AskNumber;
	
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
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
					try {
						__AskNumber = Integer.parseInt(br.readLine());
						if(!(__AskNumber > 0)){
							break;
						}
						nextInteraction = "End";
						break;
					} catch (Exception ex) {
						break;
					}
				case "End":
					System.out.println("I am sorry if you like negative numbers more, but positive numbers are going to give us a much better experience");
					return "End";
			}
		}
	}
}
