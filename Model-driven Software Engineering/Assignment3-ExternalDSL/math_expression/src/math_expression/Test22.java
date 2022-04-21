package math_expression;
import java.util.function.IntSupplier;
public class Test22 {

	public int x;
	public int y;

	private External external;

	public Test22() { }


	public Test22(External external) {
		this.external = external;
	}

	public void compute () {
		x = 40 + 2;
		y = x * 2;
	}

	public interface External {


	}
}
