package interactive_fiction.multiple_scenarios;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(){
		this.start = new ScenarioMultiplePath();
	}
	
	public void play()  throws IOException {
		start.interact();
	}
}
