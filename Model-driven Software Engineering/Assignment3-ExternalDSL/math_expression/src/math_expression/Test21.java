package math_expression;
import java.util.function.IntSupplier;
public class Test21 {

	public int x;
	public int y;

	private External external;

	public Test21() { }


	public Test21(External external) {
		this.external = external;
	}

	public void compute () {
		x = 42;
		y = x;
	}

	public interface External {


	}
}
