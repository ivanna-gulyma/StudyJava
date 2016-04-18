
public class AreaOfSquare extends GeometricFigure{
	private double lengthA;
	
	
	public AreaOfSquare(double lengthA) {
		this.lengthA = lengthA;
	}
		
	public double getLengthA() {
		return lengthA;
	}

	public void setLengthA(double lengthA) {
		this.lengthA = lengthA;
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double areaOfSquare = lengthA*lengthA;
		System.out.println("Area Of Square is"+  " " + areaOfSquare + " " + "m2");
	}

}