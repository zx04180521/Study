package five;

public class  Circle extends Area {
	double r;
	Circle(double r){
		this.r=r;
	}
public double getArea() {
	return (3.14*r*r);
}
}
