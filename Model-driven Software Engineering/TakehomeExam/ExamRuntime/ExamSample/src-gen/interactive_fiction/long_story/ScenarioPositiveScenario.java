package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioPositiveScenario extends Scenario {
	
	External external;
	String __last_input;
	
	String __param_name;
	int __param_num;
	
	public ScenarioPositiveScenario(String name, int num) { 
		__param_name = name;
		__param_num = num;
	}
	
	public ScenarioPositiveScenario(String name, int num, External external) {
		this.external = external;
		__param_name = name;
		__param_num = num;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("With this number I can actually check something myself, for example");
						if (external.isEven(__param_num)) {
							nextInteraction = "EvenNumber";
							break;
						}
						nextInteraction = "OddNumber";
						break;
					case "EvenNumber":
						System.out.println("You choose an even number! And wait! I can do more!");
						if (external.textLength(__param_name) == __param_num) {
							nextInteraction = "SameLength";
							break;
						}
						nextInteraction = "DifferentLength";
						break;
					case "OddNumber":
						System.out.println("You choose an odd number! And wait! I can do more!");
						if (external.textLength(__param_name) == __param_num) {
							nextInteraction = "SameLength";
							break;
						}
						nextInteraction = "DifferentLength";
						break;
					case "SameLength":
						System.out.println("The number you gave me is actually the length of your name!");
						nextInteraction = "Ending";
						break;
					case "DifferentLength":
						System.out.println("The difference between the length of your name and the number you gave me is " + external.absolute(external.textLength(__param_name) - __param_num) + ". I am amazing, am I?");
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
