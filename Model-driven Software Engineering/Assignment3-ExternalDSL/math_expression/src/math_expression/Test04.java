package math_expression;
import java.util.function.IntSupplier;
public class Test04 {

	public int x;

	private External external;
	public void compute () {
		x = 46 + 4;
	}


	public Test04(External external) {
		this.external = external;
	}

	interface External {


	}
}
