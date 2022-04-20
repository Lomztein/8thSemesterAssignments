package math_expression;
import java.util.function.IntSupplier;
public class Test32 {

	public int a;
	public int b;
	public int c;
	public int d;
	public int e;

	private External external;

	public Test32() { }


	public Test32(External external) {
		this.external = external;
	}

	public void compute () {
		a = 40;
		b = 40 + 2;
		c = 40 + 5 - 10 - 8;
		d = 40 + 2 * 4 + 80;
		e = (40 + 2) * (4 + 80);
	}

	public interface External {


	}
}
