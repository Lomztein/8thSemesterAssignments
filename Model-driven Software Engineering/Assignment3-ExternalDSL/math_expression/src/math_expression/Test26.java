package math_expression;
import java.util.function.IntSupplier;
public class Test26 {

	public int x;
	public int y;

	private External external;

	public Test26() { }


	public Test26(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letxy = () -> {
			int x = this.x + 1;
			return x * 2;
		};
		x = 21;
		y = letxy.getAsInt();
	}

	public interface External {


	}
}
