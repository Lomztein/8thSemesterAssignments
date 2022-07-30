package interactive_fiction.book;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioLinear extends Scenario {
	
	External external;
	String __last_input;
	
	
	public ScenarioLinear() { 
	}
	
	public ScenarioLinear(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "A1";
		while(true){
			try {
				switch(nextInteraction){
					case "A1":
						System.out.println("Some stories can be longer");
						nextInteraction = "A2";
						break;
					case "A2":
						System.out.println("But that does not mean they would be better");
						nextInteraction = "A3";
						break;
					case "A3":
						System.out.println("Our goal is for you to choose a path");
						nextInteraction = "A4";
						break;
					case "A4":
						System.out.println("But here, there is no path...");
						nextInteraction = "A5";
						break;
					case "A5":
						System.out.println("If no path can be chosen, can this still be called 'interactive'?");
						nextInteraction = "A6";
						break;
					case "A6":
						System.out.println("Probably not, but then again, that does not mean this is a bad story");
						nextInteraction = "End";
						break;
					case "End":
						System.out.println("You would not call a book 'bad' because you cannot choose how to read it, right?");
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
