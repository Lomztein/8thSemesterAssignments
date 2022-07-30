package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioNegativeScenario extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioNegativeScenario() { 
	}
	
	public ScenarioNegativeScenario(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("Is this for real, or are you just trying to see the answer for every possible path?");
						nextInteraction = "Ending";
						break;
					case "Ending":
						System.out.println("Oh well, this is up to you, I guess");
						return "Ending";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
