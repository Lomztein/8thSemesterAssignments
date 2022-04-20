package math_expression;
import java.util.function.IntSupplier;
public class Test30 {

	public int x;

	private External external;

	public Test30() { }


	public Test30(External external) {
		this.external = external;
	}

	public void compute () {
		x = this.external.sqrt(this.external.pow(this.external.pi(), 2));
	}

	public interface External {

		public int pow(int a, int b);
		public int sqrt(int a);
		public int pi();

	}
}
