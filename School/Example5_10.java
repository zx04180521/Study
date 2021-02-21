package five;
/**
 * 面向抽象
 * @author 张鑫
 *
 */
public class Example5_10 {public static void main(String[] args) {
		    Area tuxing;
		    Pillar pillar;
		    tuxing=new Lader(11,22,100);
		    System.out.println("梯形的面积是："+tuxing.getArea());
		    pillar=new Pillar(tuxing,58);
		    System.out.println("梯形底的柱体体积："+pillar.getVolume());
		    tuxing=new Circle(10);			
			System.out.println("半径是10的圆的面积是："+tuxing.getArea());
			pillar.changeBottom(tuxing);
	        System.out.println("圆柱的体积是："+pillar.getVolume());
	        
	        
	        
	        
	}

}
