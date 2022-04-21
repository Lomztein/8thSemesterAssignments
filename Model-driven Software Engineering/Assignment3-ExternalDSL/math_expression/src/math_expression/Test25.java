package math_expression;
import java.util.function.IntSupplier;
public class Test25 {

	public int x;
	public int y;

	private External external;

	public Test25() { }


	public Test25(External external) {
		this.external = external;
	}

	public void compute () {
		x = 20;
		int xy = 21;
		y = xy * 2;
	}

	public interface External {


	}
}
