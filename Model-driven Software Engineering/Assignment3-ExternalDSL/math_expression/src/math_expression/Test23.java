package math_expression;
import java.util.function.IntSupplier;
public class Test23 {

	public int x;
	public int y;

	private External external;

	public Test23() { }


	public Test23(External external) {
		this.external = external;
	}

	public void compute () {
		x = 21;
		int iy = 2;
		y = iy * x;
	}

	public interface External {


	}
}
