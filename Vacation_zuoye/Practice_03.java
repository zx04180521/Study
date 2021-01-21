package Vacation_zuoye;

public class Practice_03 {
    public static void main(String[] args) {
        //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入1 次或多次。你将会检查
        // 键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True
        System.out.println(isLongPressedName("zhang", "zzhhaanngg"));
    }
    //你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入1 次或多次。你将会检查
    // 键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True

    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            //字符串相等
            return true;
        }
        if (typed.length() < name.length()) {
            //长度小于name
            return false;
        }
        if(typed.charAt(0)!=name.charAt(0)){
            //首元素不同
            return false;
        }
        if (typed.charAt((typed.length() - 1)) != name.charAt((name.length() - 1))) {
            //尾元素不同
            return false;
        }
        int num=0;
        int count=0;
        for(int i=0;i<typed.length();i++){
            if(name.charAt(num)==typed.charAt(i)){
                if(num==(name.length()-1)){
                    //如果num自增到尾元素下标不再自增，否则上一条if语句数组下标越界
                    num=num;
                    count++;
                }else{
                    num++;
                }
            }else if(typed.charAt(i)==typed.charAt(i-1)){
                count++;
            }else{
                return false;
            }

        }
        if((typed.length()-count+1)!=name.length())return false;
        return true;
    }
}
