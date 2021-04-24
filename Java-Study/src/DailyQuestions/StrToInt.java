package DailyQuestions;

public class StrToInt {
    public int StrToInt(String str) {
        if(str.length()==0){
            return 0;
        }
        int flag=1;//标记正负数
        int i=0;//遍历开始的位置
        char[] chars=str.toCharArray();
        if(chars[0]=='-'){
            //首位是负号
            flag=-1;
            i++;
        }else if(chars[0]=='+'){
            //首位是正号
            i++;
        }
        int num=0;//保存转化后的整数
        for(;i<chars.length;i++){
            if(!Character.isDigit(chars[i])){
                //某一个字符不是数字
                return 0;
            }
            num=10*num+(chars[i]-'0');
        }
        if(flag==-1){
            //是负数
            return 0-num;
        }
        return num;
    }
}
