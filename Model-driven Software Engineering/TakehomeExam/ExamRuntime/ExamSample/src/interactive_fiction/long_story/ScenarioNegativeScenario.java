package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioNegativeScenario extends Scenario {
	String __AskLength;
	
	String name;
	External external;
	
	ScenarioNegativeScenario(String name,External external) {
		this.name = name;
		this.external = external;
	}
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("A negative number again, at least the amount of letters in your name is a positive number...");
					nextInteraction = "AskLength";
					break;
				case "AskLength":
					System.out.println((("I think the size of your name is " + external.textLength(name)) + ", am I right?"));
					__AskLength = br.readLine();
					if((__AskLength).equals("yes")){
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
		}
	}
}
