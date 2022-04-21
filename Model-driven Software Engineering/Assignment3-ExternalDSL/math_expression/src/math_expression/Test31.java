package math_expression;
import java.util.function.IntSupplier;
public class Test31 {

	public int x;
	public int y;

	private External external;

	public Test31() { }


	public Test31(External external) {
		this.external = external;
	}

	public void compute () {
		x = 5;
		int iy = x;
		y = 2 + this.external.pow(iy - 3, 3 * 2);
	}

	public interface External {

		public int pow(int a, int b);

	}
}
