package math_expression;
import java.util.function.IntSupplier;
public class Test23 {

	public int x;
	public int y;

	private External external;

	public Test23() { }


	public Test23(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letiy = () -> {
			int i = 2;
			return i * x;
		};
		x = 21;
		y = letiy.getAsInt();
	}

	public interface External {


	}
}
