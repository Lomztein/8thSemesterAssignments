package interactive_fiction.external_help;

import java.io.IOException;
import interactive_fiction.common.*;

public class Game{
	public Scenario start;
	
	public Game(External external){
		this.start = new ScenarioExternalHelp(external);
	}
	
	public void play()  throws IOException {
		start.interact();
	}
}
