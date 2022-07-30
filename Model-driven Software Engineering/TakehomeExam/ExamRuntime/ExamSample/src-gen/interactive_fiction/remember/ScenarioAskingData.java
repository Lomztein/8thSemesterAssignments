package interactive_fiction.remember;

import java.io.IOException;
import interactive_fiction.common.*;

class ScenarioAskingData extends Scenario {
	
	External external;
	String __last_input;
	
	String __var_name;
	int __var_favNumber;
	
	public ScenarioAskingData() { 
	}
	
	public ScenarioAskingData(External external) {
		this.external = external;
	}
	
	public String interact() throws IOException {
		String calledScenarioEnd = null;
		nextInteraction = "Start";
		while(true){
			try {
				switch(nextInteraction){
					case "Start":
						System.out.println("I have a confession to make");
						nextInteraction = "Confession";
						break;
					case "Confession":
						System.out.println("In our previous game, you chose your own path, but...");
						nextInteraction = "Forget";
						break;
					case "Forget":
						System.out.println("But I totally forget your answers. I am sorry, my memory has never been so good");
						nextInteraction = "Improving";
						break;
					case "Improving":
						System.out.println("I am trying to improve, I will do better, I promise!");
						nextInteraction = "AskName";
						break;
					case "AskName":
						System.out.println("Look, I am going to prove it to you. Just let me know what your name is");
						__last_input = br.readLine();
						String __this_AskName = __last_input.toString();
						__var_name = __last_input.toString();
						nextInteraction = "RepeatName";
						break;
					case "RepeatName":
						System.out.println("So, your name is " + __var_name + ". I told you I would remember it!");
						nextInteraction = "AskNumber";
						break;
					case "AskNumber":
						System.out.println("Now, your favorite number is?");
						__last_input = br.readLine();
						int __this_AskNumber = Integer.parseInt(__last_input);
						__var_favNumber = Integer.parseInt(__last_input);
						if (__var_favNumber == 0) {
							nextInteraction = "NumberZero";
							break;
						}
						if (__var_favNumber < 0) {
							nextInteraction = "NumberNegative";
							break;
						}
						if (__var_favNumber > 0) {
							nextInteraction = "NumberPositive";
							break;
						}
						break;
					case "NumberZero":
						System.out.println("0... Zero... Nul... such a problematic number, but I will make this work... somehow");
						nextInteraction = "MathOperation";
						break;
					case "NumberNegative":
						System.out.println("A negative person... do not worry, we still will have fun!");
						nextInteraction = "MathOperation";
						break;
					case "NumberPositive":
						System.out.println("I like positive numbers too. I think they are so much fun, and I can think of so many ways to have fun");
						nextInteraction = "MathOperation";
						break;
					case "MathOperation":
						System.out.println("I want to add a number to your favorite number. How much should we add to it?");
						__last_input = br.readLine();
						int __this_MathOperation = Integer.parseInt(__last_input);
						if (__this_MathOperation + __var_favNumber > 100) {
							nextInteraction = "BigNumber";
							break;
						}
						if (__this_MathOperation > 0) {
							nextInteraction = "PositiveAdd";
							break;
						}
						nextInteraction = "NegativeAdd";
						break;
					case "BigNumber":
						System.out.println("We ended up with a very big number, eh? I like it. This will be my favorite number");
						nextInteraction = "End";
						break;
					case "PositiveAdd":
						System.out.println("I kind of like this new number. I will make it my favorite number from now on");
						nextInteraction = "End";
						break;
					case "NegativeAdd":
						System.out.println("Oh, we did not even get a positive number. Well, what can we do, right? Sometimes life does not give you what you want...");
						nextInteraction = "End";
						break;
					case "End":
						System.out.println("This was so much fun, " + __var_name + " (yes, I did this so you can know that I still remember your name). I hope we can play soon!");
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
