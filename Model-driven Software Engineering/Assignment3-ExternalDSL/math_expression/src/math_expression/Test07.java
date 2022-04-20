package math_expression;
import java.util.function.IntSupplier;
public class Test07 {

	public int x;

	private External external;

	public Test07() { }


	public Test07(External external) {
		this.external = external;
	}

	public void compute () {
		x = 100 - 20 + 10 - 3;
	}

	public interface External {


	}
}
