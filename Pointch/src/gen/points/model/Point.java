package gen.points.model;

public class Point {

	public double x;
	public double y;
	public double z;
	public double r;
	public double g;
	public double b;
	public double s;
	

	public Point(double x, double y, double z, double r, double g, double b, double s) {

		this.x = x;
		this.y = y;
		this.z = z;
		this.r = r;
		this.g = g;
		this.b = b;
		this.s = s;

	}

	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + r + " " + g + " " + b + " " + s + " ";
	}

}
