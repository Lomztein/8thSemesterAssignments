package interactive_fiction.first_interaction;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioAlternatePaths extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioAlternatePaths() { 
	}
	
	public ScenarioAlternatePaths(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("So, you really want to interact...");
						nextInteraction = "S1";
						break;
					case "S1":
						System.out.println("This is interesting, so, tell me, is it fun to interact with me?");
						__last_input = br.readLine();
						String __this_S1 = __last_input.toString();
						if (__this_S1.equals("yes")) {
							nextInteraction = "YesAnswer";
							break;
						}
						if (__this_S1.equals("no")) {
							nextInteraction = "NoAnswer";
							break;
						}
						nextInteraction = "WrongAnswerEnd";
						break;
					case "YesAnswer":
						System.out.println("I am glad you find this fun. I do like to spend time here");
						nextInteraction = "NumberQuestion";
						break;
					case "NoAnswer":
						System.out.println("Oh no, I am sorry you are stuck with me but believe me, it will get fun!");
						nextInteraction = "NumberQuestion";
						break;
					case "NumberQuestion":
						System.out.println("Now, I really want to know your favorite number, which is?");
						__last_input = br.readLine();
						int __this_NumberQuestion = Integer.parseInt(__last_input);
						if (__this_NumberQuestion > 0) {
							nextInteraction = "PositiveAnswer";
							break;
						}
						if (__this_NumberQuestion <= 0) {
							nextInteraction = "NegativeAnswer";
							break;
						}
						break;
					case "PositiveAnswer":
						System.out.println("So we have a positive person here, good to know. I hope your next game will be as fun as this one");
						return "PositiveAnswer";
					case "NegativeAnswer":
						System.out.println("Really? Do you try to be smart, or do you really like a number like that? We are going to have so much fun from now on...");
						return "NegativeAnswer";
					case "WrongAnswerEnd":
						System.out.println("Oh, so you like to play outside the rules? Well, I do not like how you play...");
						return "WrongAnswerEnd";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
