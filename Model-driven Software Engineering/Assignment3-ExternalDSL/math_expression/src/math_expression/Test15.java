package math_expression;
import java.util.function.IntSupplier;
public class Test15 {

	public int x;

	private External external;

	public Test15() { }


	public Test15(External external) {
		this.external = external;
	}

	public void compute () {
		x = (10 + 3) * 7 - 4;
	}

	public interface External {


	}
}
