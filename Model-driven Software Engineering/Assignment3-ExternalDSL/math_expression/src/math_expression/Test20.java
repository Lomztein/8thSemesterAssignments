package math_expression;
import java.util.function.IntSupplier;
public class Test20 {

	public int x;

	private External external;
	public void compute () {
		IntSupplier lety = () -> { int y = 2; return lety.getAsInt() + y;};
		x = lety.getAsInt() + 76;
	}


	public Test20(External external) {
		this.external = external;
	}

	interface External {


	}
}
