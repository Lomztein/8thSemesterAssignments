package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioNegativeScenario extends Scenario {
	
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("Is this for real, or are you just trying to see the answer for every possible path?");
					nextInteraction = "Ending";
					break;
				case "Ending":
					System.out.println("Oh well, this is up to you, I guess");
					return "Ending";
			}
		}
	}
}
