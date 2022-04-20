package math_expression;
import java.util.function.IntSupplier;
public class Test19 {

	public int x;

	private External external;
	public void compute () {
		IntSupplier lety = () -> { int y = 2; return letz.getAsInt() + y;};
		x = lety.getAsInt() + 79;
	}


	public Test19(External external) {
		this.external = external;
	}

	interface External {


	}
}
