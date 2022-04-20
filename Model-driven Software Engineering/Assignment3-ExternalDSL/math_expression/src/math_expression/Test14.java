package math_expression;
import java.util.function.IntSupplier;
public class Test14 {

	public int x;
	public int y;
	public int z;

	private External external;
	public void compute () {
		x = 42;
		y = 100 + 20 + 10 + 3;
		z = 100 + 20 + 10 + 3;
	}


	public Test14(External external) {
		this.external = external;
	}

	interface External {


	}
}
