package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioPositiveScenario extends Scenario {
	
	String name;
	int num;
	External external;
	
	ScenarioPositiveScenario(String name,int num,External external) {
		this.name = name;
		this.num = num;
		this.external = external;
	}
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("With this number I can actually check something myself, for example");
					if(external.isEven(num)){
						nextInteraction = "EvenNumber";
						break;
					}
					nextInteraction = "OddNumber";
					break;
				case "EvenNumber":
					System.out.println("You choose an even number! And wait! I can do more!");
					if((external.textLength(name) == num)){
						nextInteraction = "SameLength";
						break;
					}
					nextInteraction = "DifferentLength";
					break;
				case "OddNumber":
					System.out.println("You choose an odd number! And wait! I can do more!");
					if((external.textLength(name) == num)){
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
					System.out.println((("The difference between the length of your name and the number you gave me is " + external.absolute((external.textLength(name) - num))) + ". I am amazing, am I?"));
					nextInteraction = "Ending";
					break;
				case "Ending":
					return "Ending";
			}
		}
	}
}
