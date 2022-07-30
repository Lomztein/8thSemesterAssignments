package interactive_fiction.false_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioFreewill extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioFreewill() { 
	}
	
	public ScenarioFreewill(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("Now, I want you to 'interact'");
						nextInteraction = "S1";
						break;
					case "S1":
						System.out.println("Please, just type anything you want");
						__last_input = br.readLine();
						String __this_S1 = __last_input.toString();
						nextInteraction = "S2";
						break;
					case "S2":
						System.out.println("Now, answer me, what is your favorite number?");
						__last_input = br.readLine();
						int __this_S2 = Integer.parseInt(__last_input);
						nextInteraction = "S3";
						break;
					case "S3":
						System.out.println("Yes! Now you are interacting. This is fun! isn't it?");
						nextInteraction = "S4";
						break;
					case "S4":
						System.out.println("Probably, that is not the best question... maybe you should ask yourself if it makes a story interactive if your questions are not going to be taken into consideration, what do you think?");
						__last_input = br.readLine();
						String __this_S4 = __last_input.toString();
						nextInteraction = "End";
						break;
					case "End":
						System.out.println("Yes, exactly... I think you are right. Or you may not. Who knows, I probably did not read your answer either");
						return "End";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
