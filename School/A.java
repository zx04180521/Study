package zhangxin2;

public class A {

	public static void main(String args[ ]){
		
		Student s1=new Student(1002,"ÕÅéª",90,80 );
		Student s2=new Student(1001, "ÍõÆ½" , 80 ,70);
		double m1=s1.ary(),m2=s2.ary();
		if (m1<m2) {
			System.out.println(s1.stuID+s1.name+"  testMark  "+s1.testMark+" examMark "+s1.examMark);
			System.out.println(s2.stuID+s2.name+"  testMark  "+s2.testMark+" examMark "+s2.examMark);
			
		}
		else {
			System.out.println(s2.stuID+s2.name+" testMark "+s2.testMark+" examMark "+s2.examMark);
			System.out.println(s1.stuID+s1.name+" testMark "+s1.testMark+" examMark "+s1.examMark);
		}
	}
}
class Student
{
	int stuID;
	String name;
	double testMark;
	double examMark;
	double d;
	Student(int s,String string,double t,double e){
		stuID=s;
		name=string;
		testMark=t;
		examMark=e;	
	}
	public double ary() {
		return d=(testMark+examMark)/2;
		
	}

void set(double d) 
{this.d=d;
	}
double get() {
	return d;
}

}
