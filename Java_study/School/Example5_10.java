package five;
/**
 * �������
 * @author ����
 *
 */
public class Example5_10 {public static void main(String[] args) {
		    Area tuxing;
		    Pillar pillar;
		    tuxing=new Lader(11,22,100);
		    System.out.println("���ε�����ǣ�"+tuxing.getArea());
		    pillar=new Pillar(tuxing,58);
		    System.out.println("���ε׵����������"+pillar.getVolume());
		    tuxing=new Circle(10);			
			System.out.println("�뾶��10��Բ������ǣ�"+tuxing.getArea());
			pillar.changeBottom(tuxing);
	        System.out.println("Բ��������ǣ�"+pillar.getVolume());
	        
	        
	        
	        
	}

}
