package math_expression;
import java.util.function.IntSupplier;
public class Test06 {

	public int x;

	private External external;
	public void compute () {
		x = 42 + 4 + 80;
	}


	public Test06(External external) {
		this.external = external;
	}

	interface External {


	}
}
