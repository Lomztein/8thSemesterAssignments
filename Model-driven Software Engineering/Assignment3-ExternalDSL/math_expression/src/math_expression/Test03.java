package math_expression;
import java.util.function.IntSupplier;
public class Test03 {

	public int x;

	private External external;
	public void compute () {
		x = 22 + 18 + 2;
	}


	public Test03(External external) {
		this.external = external;
	}

	interface External {


	}
}
