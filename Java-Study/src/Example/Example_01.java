package Example;

public class Example_01 {

        String str=new String("hello");
        char[]ch={'a','b'};

        public static void main(String args[]){
            Example_01 ex=new Example_01();
            ex.change(ex.str,ex.ch);
            System.out.print(ex.str+" and ");
            System.out.print(ex.ch);

        }
        public void change(String str,char ch[]){
            str="test ok";
            ch[0]='c';
        }
    }
