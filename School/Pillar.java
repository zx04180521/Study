package five;

public class Pillar {
Area bottom;
double height;
Pillar(double height){
	this.height=height;
}
public Pillar(Area bottom,double height) {
	this.bottom=bottom;
	this.height=height;
	// TODO 自动生成的构造函数存根
}
void changeBottom(Area bottom) {
	this.bottom=bottom;
}
	public double getVolume() {
		return bottom.getArea()*height;
	}
}
