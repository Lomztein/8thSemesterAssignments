package math_expression;
import java.util.function.IntSupplier;
public class Test21 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 42;
		y = x;
	}


	public Test21(External external) {
		this.external = external;
	}

	interface External {


	}
}
