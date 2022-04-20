package math_expression;
import java.util.function.IntSupplier;
public class Test26 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 21;
		IntSupplier letx = () -> { int x = x + 1; return x + 2;};
		y = letx.getAsInt();
	}


	public Test26(External external) {
		this.external = external;
	}

	interface External {


	}
}
