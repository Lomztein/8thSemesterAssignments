package math_expression;
import java.util.function.IntSupplier;
public class Test19 {

	public int x;

	private External external;

	public Test19() { }


	public Test19(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letyx = () -> {
			int y = 2;
			IntSupplier letzyx = () -> {
				int z = 3;
				return y * z;
			};
			return letzyx.getAsInt() + y;
		};
		x = letyx.getAsInt() + 79;
	}

	public interface External {


	}
}
