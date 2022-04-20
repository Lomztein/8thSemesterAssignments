package math_expression;
import java.util.function.IntSupplier;
public class Test24 {

	public int x;
	public int y;

	private External external;

	public Test24() { }


	public Test24(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letiy = () -> {
			int i = this.x;
			return i * 2;
		};
		x = 21;
		y = letiy.getAsInt();
	}

	public interface External {


	}
}
