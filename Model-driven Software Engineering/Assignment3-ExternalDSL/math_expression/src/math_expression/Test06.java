package math_expression;
import java.util.function.IntSupplier;
public class Test06 {

	public int x;

	private External external;

	public Test06() { }


	public Test06(External external) {
		this.external = external;
	}

	public void compute () {
		x = 42 - 4 - 80;
	}

	public interface External {


	}
}
