package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioMultiplePath2 extends Scenario {
	String name;
	String __AskName;
	int __AskNumber;
	
	External external;
	
	ScenarioMultiplePath2(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("This will be our last game, and I do not want to forget you, my friend, ever again");
					nextInteraction = "AskName";
					break;
				case "AskName":
					System.out.println("Can you tell me your name again?");
					__AskName = br.readLine();
					name = __AskName;
					nextInteraction = "AfterName";
					break;
				case "AfterName":
					System.out.println(("Thank you again, " + name));
					nextInteraction = "AskNumber";
					break;
				case "AskNumber":
					System.out.println("I want a number again. It can be anything you like (or dislike if you are that kind of person)");
					try {
						__AskNumber = Integer.parseInt(br.readLine());
						if((__AskNumber > 0)){
							calledScenarioEnd = new ScenarioPositiveScenario(name, __AskNumber, external).interact();
							if(calledScenarioEnd.equals("Ending")){
								nextInteraction = "Ending";
								break;
							}
							break;
						}
						if((__AskNumber <= 0)){
							calledScenarioEnd = new ScenarioNegativeScenario(name, external).interact();
							if(calledScenarioEnd.equals("Ending")){
								nextInteraction = "Ending";
								break;
							}
							break;
						}
					} catch (Exception ex) {
						break;
					}
				case "Ending":
					System.out.println((("I am glad to be able to play with you, " + name) + "! I hope we can do this again in the future"));
					return "Ending";
			}
		}
	}
}
