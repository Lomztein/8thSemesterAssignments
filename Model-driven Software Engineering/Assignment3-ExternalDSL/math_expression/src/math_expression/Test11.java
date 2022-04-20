package math_expression;
import java.util.function.IntSupplier;
public class Test11 {

	public int x;

	private External external;
	public void compute () {
		x = 4 + 20;
	}


	public Test11(External external) {
		this.external = external;
	}

	interface External {


	}
}
