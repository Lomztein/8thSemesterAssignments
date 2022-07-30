package interactive_fiction.external_help;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioExternalHelp extends Scenario {
	String favThing;
	int __AskNumber;
	String __AskFavorite;
	
	External external;
	
	ScenarioExternalHelp(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		nextInteraction = "Start";
		while(true){
			switch(nextInteraction){
				case "Start":
					System.out.println("This time, you have to work a bit more before we can play, I hope you did your homework!");
					nextInteraction = "AskNumber";
					break;
				case "AskNumber":
					System.out.println("Can you tell me your number again? (as you can notice, I forget easily)");
					try {
						__AskNumber = Integer.parseInt(br.readLine());
						if(!(__AskNumber > 0)){
							break;
						}
						if(external.isEven(__AskNumber)){
							nextInteraction = "EvenNumber";
							break;
						}
						nextInteraction = "OddNumber";
						break;
					} catch (Exception ex) {
						break;
					}
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
					__AskFavorite = br.readLine();
					favThing = __AskFavorite;
					if(!external.isFavorite(__AskFavorite)){
						break;
					}
					if((external.textLength(favThing) > 0)){
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
					System.out.println((("Cool! so one of your favorite things is " + favThing) + ". You have a refined taste"));
					return "ShowOff";
			}
		}
	}
}
