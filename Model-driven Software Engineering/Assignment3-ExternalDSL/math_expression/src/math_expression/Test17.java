package math_expression;
import java.util.function.IntSupplier;
public class Test17 {

	public int x;

	private External external;
	public void compute () {
		IntSupplier lety = () -> { int y = 42; return y;};
		x = lety.getAsInt();
	}


	public Test17(External external) {
		this.external = external;
	}

	interface External {


	}
}
