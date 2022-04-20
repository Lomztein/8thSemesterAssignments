package math_expression;
import java.util.function.IntSupplier;
public class Test34 {

	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;

	private External external;

	public Test34() { }


	public Test34(External external) {
		this.external = external;
	}

	public void compute () {
		IntSupplier letpowAsideC = () -> {
			int powA = this.external.pow(this.sideA, 2);
			IntSupplier letdiameterperimeterCircle = () -> {
				int diameter = 2 * this.radius;
				IntSupplier letpowBpowAsideC = () -> {
					int powB = this.external.pow(this.sideB, 2);
					return this.external.sqrt(powA + powB);
				};
				return diameter * this.external.pi();
			};
			IntSupplier letpowBpowAsideC = () -> {
				int powB = this.external.pow(this.sideB, 2);
				return this.external.sqrt(powA + powB);
			};
			return letpowBpowAsideC.getAsInt();
		};
		IntSupplier letdiameterperimeterCircle = () -> {
			int diameter = 2 * this.radius;
			return diameter * this.external.pi();
		};
		sideA = 3;
		sideB = 4;
		sideC = letpowAsideC.getAsInt();
		perimeterTriangle = this.sideA + this.sideB + this.sideC;
		radius = 5;
		perimeterCircle = letdiameterperimeterCircle.getAsInt();
	}

	public interface External {

		public int pow(int a, int b);
		public int sqrt(int a);
		public int pi();

	}
}
