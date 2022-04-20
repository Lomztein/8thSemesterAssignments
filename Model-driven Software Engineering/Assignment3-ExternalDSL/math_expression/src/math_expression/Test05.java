package math_expression;
import java.util.function.IntSupplier;
public class Test05 {

	public int x;

	private External external;

	public Test05() { }


	public Test05(External external) {
		this.external = external;
	}

	public void compute () {
		x = 4 - 46;
	}

	public interface External {


	}
}
