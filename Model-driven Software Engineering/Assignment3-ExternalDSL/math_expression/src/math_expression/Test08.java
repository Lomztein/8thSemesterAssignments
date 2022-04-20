package math_expression;
import java.util.function.IntSupplier;
public class Test08 {

	public int x;

	private External external;

	public Test08() { }


	public Test08(External external) {
		this.external = external;
	}

	public void compute () {
		x = 5 * 4;
	}

	public interface External {


	}
}
