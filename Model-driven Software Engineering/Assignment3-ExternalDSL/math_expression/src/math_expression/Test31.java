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
		IntSupplier letiy = () -> {
			int i = this.x;
			return i - 3;
		};
		x = 5;
		y = 2 + this.external.pow(letiy.getAsInt(), 3 * 2);
	}

	public interface External {

		public int pow(int a, int b);

	}
}
