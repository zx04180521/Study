public class test {
    public static void main(String[] args) {
//        Date d=new Date() ;
//        System.out.println(d);
        int res=t();
        System.out.println(res);
    }
    public static int t(){
        try{
            System.out.println(1);
//            int i=1/0;
            System.out.println(2);
            return 8;
        }catch (Exception e){
            System.out.println(3);
            return 3;
        }finally {
            System.out.println(4);
            return 7;
        }

    }
}
