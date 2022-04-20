package math_expression;
import java.util.function.IntSupplier;
public class Test12 {

	public int x;

	private External external;

	public Test12() { }


	public Test12(External external) {
		this.external = external;
	}

	public void compute () {
		x = 120 / 6 / 5;
	}

	public interface External {


	}
}
