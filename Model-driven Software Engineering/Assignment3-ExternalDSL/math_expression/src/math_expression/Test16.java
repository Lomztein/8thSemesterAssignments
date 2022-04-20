package math_expression;
import java.util.function.IntSupplier;
public class Test16 {

	public int x;

	private External external;
	public void compute () {
		x = 10 + 3 + 4 + 12 + 3 + 3;
	}


	public Test16(External external) {
		this.external = external;
	}

	interface External {


	}
}
