package interactive_fiction.short_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioSimple extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioSimple() { 
	}
	
	public ScenarioSimple(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "End";
		while(true){
			try {
				switch(nextInteraction){
					case "End":
						System.out.println("This is the ending for a very short story");
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
