
public class AreaOfParallelogram extends GeometricFigure{
		private double lengthA;
		private double height;
		
		public AreaOfParallelogram(double lengthA, double height){
			this.lengthA = lengthA;
			this.height = height;
		}
			
		public double getLengthA() {
			return lengthA;
		}

		public void setLengthA(double lengthA) {
			this.lengthA = lengthA;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		@Override
		void area() {
			// TODO Auto-generated method stub
			double areaOfParallelogram = lengthA*height;
			System.out.println("Area Of Parallelogram is"+  " " + areaOfParallelogram + " " + "m2");
		}

}
