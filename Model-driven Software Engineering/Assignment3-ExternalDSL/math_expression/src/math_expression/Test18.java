package math_expression;
import java.util.function.IntSupplier;
public class Test18 {

	public int x;

	private External external;
	public void compute () {
		IntSupplier lety = () -> { int y = 10 + 8; return y + 7;};
		x = lety.getAsInt();
	}


	public Test18(External external) {
		this.external = external;
	}

	interface External {


	}
}
