package DailyQuestions;

import java.util.Scanner;

public class Mp3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int count=sc.nextInt();
            String cmd=sc.next();
            int cur=1;//当前光标的位置
            int first=1;//当前页面的第一首歌曲序号
            if(count<=4){
                //当歌曲数小于等于4
                for(int i=0;i<cmd.length();i++){
                    if(cmd.charAt(i)=='U'){
                        //指令U
                        cur--;
                        if(cur==0){
                            cur=count;
                        }
                    }else{
                        //指令D
                        cur++;
                        if(cur==count+1){
                            cur=1;
                        }
                    }
                }
            }else{
                //歌曲数大于4
                for(int i=0;i<cmd.length();i++){
                    if(cmd.charAt(i)=='U'){
                        //指令U
                        cur--;
                        if(cur==0){
                            //切换页面
                            cur=count;
                            first=count-3;
                        }
                        if(cur==first-1){
                            //向上更新第一首歌曲页面
                            first--;
                        }
                    }else{
                        //指令D
                        cur++;
                        if(cur==count+1){
                            //切换至第一首歌曲
                            cur=1;
                            first=1;
                        }
                        if(cur==first+4){
                            //向下更新一首歌曲页面
                            first++;
                        }
                    }
                }
            }
            if(count<=4){
                for(int i=0;i<count;i++){
                    System.out.print(first+++" ");
                }
            }else{
                System.out.print(first+" "+(first+1)+" "+(first+2)+" "+(first+3));
            }
            System.out.println();
            System.out.println(cur);
        }
    }
}
