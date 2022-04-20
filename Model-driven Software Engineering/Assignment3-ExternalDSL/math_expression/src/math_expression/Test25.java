package math_expression;
import java.util.function.IntSupplier;
public class Test25 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 20;
		IntSupplier letx = () -> { int x = 21; return x + 2;};
		y = letx.getAsInt();
	}


	public Test25(External external) {
		this.external = external;
	}

	interface External {


	}
}
