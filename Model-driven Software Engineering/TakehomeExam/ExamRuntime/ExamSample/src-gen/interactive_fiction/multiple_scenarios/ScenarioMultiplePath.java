package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioMultiplePath extends Scenario {
	
	External external;
	String __last_input;
	
	String __var_favThing;
	
	public ScenarioMultiplePath() { 
	}
	
	public ScenarioMultiplePath(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("Finally, we are going to stick together for a long time");
						nextInteraction = "AskNumber";
						break;
					case "AskNumber":
						System.out.println("To start, you have to give me a number (it does not need to be your favorite number this time)");
						__last_input = br.readLine();
						int __this_AskNumber = Integer.parseInt(__last_input);
						if (__this_AskNumber > 0) {
							calledScenarioEnd = new ScenarioPositiveScenario(external).interact();
							if (calledScenarioEnd.equals("YesEnding")) {
								nextInteraction = "End1";
								break;
							}
							if (calledScenarioEnd.equals("NoEnding")) {
								nextInteraction = "End2";
								break;
							}
							break;
						}
						if (__this_AskNumber <= 0) {
							calledScenarioEnd = new ScenarioNegativeScenario(external).interact();
							if (calledScenarioEnd.equals("Ending")) {
								nextInteraction = "End3";
								break;
							}
							break;
						}
						break;
					case "End1":
						System.out.println("This was fun. Next time, I will remember better!");
						return "End1";
					case "End2":
						System.out.println("Next time, we will have more fun!");
						return "End2";
					case "End3":
						System.out.println("I hope you like the next game...");
						return "End3";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
