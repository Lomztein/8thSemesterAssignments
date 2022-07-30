package interactive_fiction.long_story;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(External external){
		this.start = new ScenarioMultiplePath2(external);
	}
	
	public void play()  throws IOException {
		start.interact();
	}
}
