package math_expression;
import java.util.function.IntSupplier;
public class Test31 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 5;
		IntSupplier leti = () -> { int i = x; return i + 3;};
		y = 2 + this.external.pow(leti.getAsInt(), 3 + 2);
	}


	public Test31(External external) {
		this.external = external;
	}

	interface External {

		public int pow(int a, int b);

	}
}
