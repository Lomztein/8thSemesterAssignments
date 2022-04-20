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
		IntSupplier letib = () -> {
			int i = 2;
			IntSupplier letid = () -> {
				int i = 4;
				return c + i;
			};
			return a * i;
		};
		IntSupplier letid = () -> {
			int i = 4;
			return c + i;
		};
		a = 40;
		b = letib.getAsInt();
		c = this.b * 3;
		d = letid.getAsInt();
	}

	public interface External {


	}
}
