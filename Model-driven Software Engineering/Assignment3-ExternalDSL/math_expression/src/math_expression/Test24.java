package math_expression;
import java.util.function.IntSupplier;
public class Test24 {

	public int x;
	public int y;

	private External external;
	public void compute () {
		x = 21;
		IntSupplier leti = () -> { int i = x; return i + 2;};
		y = leti.getAsInt();
	}


	public Test24(External external) {
		this.external = external;
	}

	interface External {


	}
}
