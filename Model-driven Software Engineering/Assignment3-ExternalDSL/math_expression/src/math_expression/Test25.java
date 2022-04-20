package math_expression;
import java.util.function.IntSupplier;
public class Test25 {

	public int x;
	public int y;

	private External external;

	public Test25() { }


	public Test25(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letxy = () -> {
			int x = 21;
			return x * 2;
		};
		x = 20;
		y = letxy.getAsInt();
	}

	public interface External {


	}
}
