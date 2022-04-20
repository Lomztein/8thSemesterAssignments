package math_expression;
import java.util.function.IntSupplier;
public class Test02 {

	public int x;

	private External external;
	public void compute () {
		x = 40 + 2;
	}


	public Test02(External external) {
		this.external = external;
	}

	interface External {


	}
}
