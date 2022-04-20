package math_expression;
import java.util.function.IntSupplier;
public class Test22 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 40 + 2;
		y = x + 2;
	}


	public Test22(External external) {
		this.external = external;
	}

	interface External {


	}
}
