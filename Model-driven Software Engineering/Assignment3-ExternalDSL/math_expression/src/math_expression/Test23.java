package math_expression;
import java.util.function.IntSupplier;
public class Test23 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 21;
		IntSupplier leti = () -> { int i = 2; return i + x;};
		y = leti.getAsInt();
	}


	public Test23(External external) {
		this.external = external;
	}

	interface External {


	}
}
