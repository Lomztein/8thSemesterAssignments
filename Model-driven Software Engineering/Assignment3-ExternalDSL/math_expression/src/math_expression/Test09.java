package math_expression;
import java.util.function.IntSupplier;
public class Test09 {

	public int x;

	private External external;

	public Test09() { }


	public Test09(External external) {
		this.external = external;
	}

	public void compute () {
		x = 5 * 4 * 6;
	}

	public interface External {


	}
}
