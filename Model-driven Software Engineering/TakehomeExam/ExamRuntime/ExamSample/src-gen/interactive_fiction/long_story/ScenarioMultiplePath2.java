package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioMultiplePath2 extends Scenario {
	
	External external;
	String __last_input;
	
	String __var_name;
	
	public ScenarioMultiplePath2() { 
	}
	
	public ScenarioMultiplePath2(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("This will be our last game, and I do not want to forget you, my friend, ever again");
						nextInteraction = "AskName";
						break;
					case "AskName":
						System.out.println("Can you tell me your name again?");
						__last_input = br.readLine();
						String __this_AskName = __last_input.toString();
						__var_name = __last_input.toString();
						nextInteraction = "AfterName";
						break;
					case "AfterName":
						System.out.println("Thank you again, " + __var_name);
						nextInteraction = "AskNumber";
						break;
					case "AskNumber":
						System.out.println("I want a number again. It can be anything you like (or dislike if you are that kind of person)");
						__last_input = br.readLine();
						int __this_AskNumber = Integer.parseInt(__last_input);
						if (__this_AskNumber > 0) {
							calledScenarioEnd = new ScenarioPositiveScenario(__var_name,__this_AskNumber, external).interact();
							if (calledScenarioEnd.equals("Ending")) {
								nextInteraction = "Ending";
								break;
							}
							break;
						}
						if (__this_AskNumber <= 0) {
							calledScenarioEnd = new ScenarioNegativeScenario(__var_name, external).interact();
							if (calledScenarioEnd.equals("Ending")) {
								nextInteraction = "Ending";
								break;
							}
							break;
						}
						break;
					case "Ending":
						System.out.println("I am glad to be able to play with you, " + __var_name + "! I hope we can do this again in the future");
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
