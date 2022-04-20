package math_expression;
import java.util.function.IntSupplier;
public class Test10 {

	public int x;

	private External external;
	public void compute () {
		x = 20 + 4;
	}


	public Test10(External external) {
		this.external = external;
	}

	interface External {


	}
}
