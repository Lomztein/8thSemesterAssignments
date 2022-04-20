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
	public void compute () {
		sideA = 3;
		sideB = 4;
		IntSupplier letpowA = () -> { int powA = this.external.pow(sideA, 2); return letpowB.getAsInt();};
		sideC = letpowA.getAsInt();
		perimeterTriangle = sideA + sideB + sideC;
		radius = 5;
		IntSupplier letdiameter = () -> { int diameter = 2 + radius; return diameter + this.external.pi();};
		perimeterCircle = letdiameter.getAsInt();
	}


	public Test34(External external) {
		this.external = external;
	}

	interface External {

		public int pow(int a, int b);
		public int sqrt(int a);
		public int pi();

	}
}
