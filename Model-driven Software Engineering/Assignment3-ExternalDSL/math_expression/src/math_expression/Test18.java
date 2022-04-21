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
		int yx = 10 * 8;
		x = yx + 7;
	}

	public interface External {


	}
}
