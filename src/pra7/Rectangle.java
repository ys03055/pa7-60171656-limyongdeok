package pra7;

public class Rectangle extends Shape {
    double X2,Y2;

    public Rectangle(double X1, double Y1,double X2,double Y2) {
    	super(X1,Y1);
        this.X2 = X2;
        this.Y2 = Y2;
    }
    @Override
    public void draw() {
    	
    }
	@Override
	public double getArea() {
		double area = X2*Y2;
		return area;
	}
	@Override
	public double getLength() {
		double length = 2*(X2+Y2);
		return length;
	}

    
}
