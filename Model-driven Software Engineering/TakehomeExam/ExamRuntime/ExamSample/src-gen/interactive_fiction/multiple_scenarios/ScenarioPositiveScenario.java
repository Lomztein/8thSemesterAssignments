package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioPositiveScenario extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioPositiveScenario() { 
	}
	
	public ScenarioPositiveScenario(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("So you are choosing positive numbers this time");
						nextInteraction = "Question";
						break;
					case "Question":
						System.out.println("Are you doing this for me, or do you like positive numbers?");
						__last_input = br.readLine();
						String __this_Question = __last_input.toString();
						if (__this_Question.equals("yes")) {
							nextInteraction = "YesEnding";
							break;
						}
						nextInteraction = "NoEnding";
						break;
					case "YesEnding":
						return "YesEnding";
					case "NoEnding":
						return "NoEnding";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
