package math_expression;
import java.util.function.IntSupplier;
public class Test18 {

	public int x;

	private External external;

	public Test18() { }


	public Test18(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letyx = () -> {
			int y = 10 * 8;
			return y + 7;
		};
		x = letyx.getAsInt();
	}

	public interface External {


	}
}
