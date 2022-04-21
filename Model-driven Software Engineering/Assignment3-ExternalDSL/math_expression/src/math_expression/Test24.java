package math_expression;
import java.util.function.IntSupplier;
public class Test24 {

	public int x;
	public int y;

	private External external;

	public Test24() { }


	public Test24(External external) {
		this.external = external;
	}

	public void compute () {
		x = 21;
		int iy = x;
		y = iy * 2;
	}

	public interface External {


	}
}
