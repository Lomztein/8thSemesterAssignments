package math_expression;
import java.util.function.IntSupplier;
public class Test29 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = this.external.pow(4, 2);
		y = x + 2;
	}


	public Test29(External external) {
		this.external = external;
	}

	interface External {

		public int pow(int a, int b);

	}
}
