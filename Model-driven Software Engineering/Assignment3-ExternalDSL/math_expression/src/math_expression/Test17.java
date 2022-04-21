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
		int yx = 42;
		x = yx;
	}

	public interface External {


	}
}
