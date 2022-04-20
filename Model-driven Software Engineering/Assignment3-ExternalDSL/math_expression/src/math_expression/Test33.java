package math_expression;
import java.util.function.IntSupplier;
public class Test33 {

	public int a;
	public int b;
	public int c;
	public int d;

	private External external;
	public void compute () {
		a = 40;
		IntSupplier leti = () -> { int i = 2; return a + i;};
		b = leti.getAsInt();
		c = b + 3;
		IntSupplier leti = () -> { int i = 4; return c + i;};
		d = leti.getAsInt();
	}


	public Test33(External external) {
		this.external = external;
	}

	interface External {


	}
}
