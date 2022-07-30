package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioMultiplePath extends Scenario {
	String favThing;
	int __AskNumber;
	
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("Finally, we are going to stick together for a long time");
					nextInteraction = "AskNumber";
					break;
				case "AskNumber":
					System.out.println("To start, you have to give me a number (it does not need to be your favorite number this time)");
					try {
						__AskNumber = Integer.parseInt(br.readLine());
						if((__AskNumber > 0)){
							calledScenarioEnd = new ScenarioPositiveScenario().interact();
							if(calledScenarioEnd.equals("YesEnding")){
								nextInteraction = "End1";
								break;
							}
							if(calledScenarioEnd.equals("NoEnding")){
								nextInteraction = "End2";
								break;
							}
							break;
						}
						if((__AskNumber <= 0)){
							calledScenarioEnd = new ScenarioNegativeScenario().interact();
							if(calledScenarioEnd.equals("Ending")){
								nextInteraction = "End3";
								break;
							}
							break;
						}
					} catch (Exception ex) {
						break;
					}
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
		}
	}
}
