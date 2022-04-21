package math_expression;
import java.util.function.IntSupplier;
public class Test19 {

	public int x;

	private External external;

	public Test19() { }


	public Test19(External external) {
		this.external = external;
	}

	public void compute () {
		int yx = 2;
		int zyx = 3;
		x = yx * zyx + yx + 79;
	}

	public interface External {


	}
}
