package math_expression;
import java.util.function.IntSupplier;
public class Test01 {

	public int x;

	private External external;
	public void compute () {
		x = 42;
	}


	public Test01(External external) {
		this.external = external;
	}

	interface External {


	}
}
