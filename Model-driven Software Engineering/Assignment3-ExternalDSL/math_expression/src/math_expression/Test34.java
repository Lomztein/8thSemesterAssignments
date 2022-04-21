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
		sideA = 3;
		sideB = 4;
		int powAsideC = this.external.pow(sideA, 2);
		int powBpowAsideC = this.external.pow(sideB, 2);
		sideC = this.external.sqrt(powAsideC + powBpowAsideC);
		perimeterTriangle = sideA + sideB + sideC;
		radius = 5;
		int diameterperimeterCircle = 2 * radius;
		perimeterCircle = diameterperimeterCircle * this.external.pi();
	}

	public interface External {

		public int pow(int a, int b);
		public int sqrt(int a);
		public int pi();

	}
}
