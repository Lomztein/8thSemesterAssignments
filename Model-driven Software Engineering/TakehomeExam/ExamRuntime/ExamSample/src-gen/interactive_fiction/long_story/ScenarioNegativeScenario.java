package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioNegativeScenario extends Scenario {
	
	External external;
	String __last_input;
	
	String __param_name;
	
	public ScenarioNegativeScenario(String name) { 
		__param_name = name;
	}
	
	public ScenarioNegativeScenario(String name, External external) {
		this.external = external;
		__param_name = name;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("A negative number again, at least the amount of letters in your name is a positive number...");
						nextInteraction = "AskLength";
						break;
					case "AskLength":
						System.out.println("I think the size of your name is " + external.textLength(__param_name) + ", am I right?");
						__last_input = br.readLine();
						String __this_AskLength = __last_input.toString();
						if (__this_AskLength.equals("yes")) {
							nextInteraction = "AnswerYes";
							break;
						}
						nextInteraction = "AnswerNo";
						break;
					case "AnswerYes":
						System.out.println("Well, if I know the answer is thanks to you!");
						nextInteraction = "Ending";
						break;
					case "AnswerNo":
						System.out.println("Oh really? I hope this is my mistake, but deep down, I think it may be yours...");
						nextInteraction = "Ending";
						break;
					case "Ending":
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
