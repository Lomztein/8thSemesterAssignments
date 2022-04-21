package math_expression;
import java.util.function.IntSupplier;
public class Test33 {

	public int a;
	public int b;
	public int c;
	public int d;

	private External external;

	public Test33() { }


	public Test33(External external) {
		this.external = external;
	}

	public void compute () {
		a = 40;
		int ib = 2;
		b = a * ib;
		c = b * 3;
		int id = 4;
		d = c + id;
	}

	public interface External {


	}
}
