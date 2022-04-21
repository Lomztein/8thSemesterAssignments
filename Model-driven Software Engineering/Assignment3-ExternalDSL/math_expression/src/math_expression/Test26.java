package math_expression;
import java.util.function.IntSupplier;
public class Test26 {

	public int x;
	public int y;

	private External external;

	public Test26() { }


	public Test26(External external) {
		this.external = external;
	}

	public void compute () {
		x = 21;
		int xy = x + 1;
		y = xy * 2;
	}

	public interface External {


	}
}
