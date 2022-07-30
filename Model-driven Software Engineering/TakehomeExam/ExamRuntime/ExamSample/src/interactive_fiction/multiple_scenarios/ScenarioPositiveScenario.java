package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioPositiveScenario extends Scenario {
	String __Question;
	
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("So you are choosing positive numbers this time");
					nextInteraction = "Question";
					break;
				case "Question":
					System.out.println("Are you doing this for me, or do you like positive numbers?");
					__Question = br.readLine();
					if((__Question).equals("yes")){
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
		}
	}
}
