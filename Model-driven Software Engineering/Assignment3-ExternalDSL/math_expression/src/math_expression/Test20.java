package math_expression;
import java.util.function.IntSupplier;
public class Test20 {

	public int x;

	private External external;

	public Test20() { }


	public Test20(External external) {
		this.external = external;
	}

	public void compute () {
		int yx = 2;
		int yyx = 3;
		x = yyx * yyx + yx + 76;
	}

	public interface External {


	}
}
