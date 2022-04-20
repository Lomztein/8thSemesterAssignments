package math_expression;
import java.util.function.IntSupplier;
public class Test12 {

	public int x;

	private External external;
	public void compute () {
		x = 120 + 6 + 5;
	}


	public Test12(External external) {
		this.external = external;
	}

	interface External {


	}
}
