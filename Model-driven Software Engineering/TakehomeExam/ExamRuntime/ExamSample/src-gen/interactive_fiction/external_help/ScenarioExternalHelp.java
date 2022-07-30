package interactive_fiction.external_help;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioExternalHelp extends Scenario {
	
	External external;
	String __last_input;
	
	String __var_favThing;
	
	public ScenarioExternalHelp() { 
	}
	
	public ScenarioExternalHelp(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("This time, you have to work a bit more before we can play, I hope you did your homework!");
						nextInteraction = "AskNumber";
						break;
					case "AskNumber":
						System.out.println("Can you tell me your number again? (as you can notice, I forget easily)");
						__last_input = br.readLine();
						int __this_AskNumber = Integer.parseInt(__last_input);
						if (!(__this_AskNumber > 0)) {
							throw new Exception("Invalid input, please try again.");
						}
						if (external.isEven(__this_AskNumber)) {
							nextInteraction = "EvenNumber";
							break;
						}
						nextInteraction = "OddNumber";
						break;
					case "EvenNumber":
						System.out.println("See? now I can know that your number is even!");
						nextInteraction = "AskFavorite";
						break;
					case "OddNumber":
						System.out.println("Now I can know a lot of cool stuff, like that your number is odd");
						nextInteraction = "AskFavorite";
						break;
					case "AskFavorite":
						System.out.println("I will show you more! For this, just let me know one of your favorite things (yes, like the song, but only one!)");
						__last_input = br.readLine();
						String __this_AskFavorite = __last_input.toString();
						if (!(external.isFavorite(__this_AskFavorite))) {
							throw new Exception("Invalid input, please try again.");
						}
						__var_favThing = __last_input.toString();
						if (external.textLength(__var_favThing) > 0) {
							nextInteraction = "LongText";
							break;
						}
						nextInteraction = "ShowOff";
						break;
					case "LongText":
						System.out.println("Oh, that is why you took so long, that is a long name for a thing...");
						nextInteraction = "ShowOff";
						break;
					case "ShowOff":
						System.out.println("Cool! so one of your favorite things is " + __var_favThing + ". You have a refined taste");
						return "ShowOff";
				}
			} catch (Exception ex) {
				System.out.println("An error occured, please try again..");
				break;
			}
		}
		
		return null;
	}
}
