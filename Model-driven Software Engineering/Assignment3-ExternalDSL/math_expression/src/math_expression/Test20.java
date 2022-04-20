package math_expression;
import java.util.function.IntSupplier;
public class Test20 {

	public int x;

	private External external;

	public Test20() { }


	public Test20(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letyx = () -> {
			int y = 2;
			IntSupplier letyyx = () -> {
				int y = 3;
				return y * y;
			};
			return letyyx.getAsInt() + y;
		};
		x = letyx.getAsInt() + 76;
	}

	public interface External {


	}
}
