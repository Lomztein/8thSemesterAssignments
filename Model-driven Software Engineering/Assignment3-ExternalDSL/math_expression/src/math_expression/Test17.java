package math_expression;
import java.util.function.IntSupplier;
public class Test17 {

	public int x;

	private External external;

	public Test17() { }


	public Test17(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letyx = () -> {
			int y = 42;
			return y;
		};
		x = letyx.getAsInt();
	}

	public interface External {


	}
}
