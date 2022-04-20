package math_expression;
import java.util.function.IntSupplier;
public class Test28 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = this.external.sqrt(4);
		y = x + 2;
	}


	public Test28(External external) {
		this.external = external;
	}

	interface External {

		public int sqrt(int a);

	}
}
