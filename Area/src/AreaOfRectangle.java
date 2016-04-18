
public class AreaOfRectangle extends GeometricFigure{
		private double lengthA;
		private double lengthB;
		
		public AreaOfRectangle(double lengthA, double lengthB){
			this.lengthA = lengthA;
			this.lengthB = lengthB;
		}
			
		public double getLengthA() {
			return lengthA;
		}

		public void setLengthA(double lengthA) {
			this.lengthA = lengthA;
		}

		public double getLengthB() {
			return lengthB;
		}

		public void setLengthB(double lengthB) {
			this.lengthB = lengthB;
		}

		@Override
		void area() {
			// TODO Auto-generated method stub
			double areaOfRectangle = lengthA*lengthB;
			System.out.println("Area Of Rectangle is"+  " " + areaOfRectangle + " " + "m2");
		}
	}
