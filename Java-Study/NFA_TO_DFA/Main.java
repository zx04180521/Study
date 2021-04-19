//package NFA_TO_DFA;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.SortedSet;
//import java.util.TreeSet;
//
//public class Main {
//    public static void main(String[] args) {
//        nfatodfa n=new nfatodfa();
//        n.wjGet_Nfa();
//        n.GetDfaFirst();
//        n.KongJi();
//        n.xhdfahanshu(dfachutai);
//        System.out.println(konghu);
//        System.out.println(zifuhu);
//        System.out.println(dfachutai);
//        System.out.println(kongji);
//        System.out.println(dfahanshu);
//    }
//}
//    public class nfatodfa {
//        private static String chushizhuangtai = null;
//        public static ArrayList<String> zifuji = new ArrayList<>(); // 字符集
//        private static ArrayList<String> nfazhuangtai = new ArrayList<>(); // NFA状态集
//        public static ArrayList<String> jieshuzhuangtai = new ArrayList<>(); // 结束状态集
//        private static ArrayList<String> zifuhu = new ArrayList<>(); // 字符弧
//        private static ArrayList<String> konghu = new ArrayList<>(); // 空弧
//        private static HashMap<String, String> kongji = new HashMap<>();
//        public static HashMap<String, String> dfahanshu = new HashMap<>();
//        private static String dfachutai = null; // DFA初始状态
//        public static ArrayList<String> a4 = new ArrayList<>(); //保存dfa每个状态
//
//        //这个可以自行修改，本来还有个图形化界面，不过还不成熟，
//        //就没有放上来
//        public nfatodfa(String chushizhuangtai2,
//                        ArrayList<String> jieshuzhuangtai1, ArrayList<String> zifuji1,
//                        ArrayList<String> nfazhuangtai1, ArrayList<String> konghu2,
//                        ArrayList<String> zifuhu2) {
//            // TODO Auto-generated constructor stub
//            this.chushizhuangtai=chushizhuangtai2;
//            this.jieshuzhuangtai=jieshuzhuangtai1;
//            this.zifuji=zifuji1;
//            this.nfazhuangtai=nfazhuangtai1;
//            this.konghu=konghu2;
//            this.zifuhu=zifuhu2;
//        }
//
//        // 从开始状态开始获取下一个DFA函数状态，并保存下来
//        // s5  初始状态
//        public static void xhdfahanshu(String s5) {
//            ArrayList<String> aaaaaa = new ArrayList<>();
//            String s6 = "";
//            a4.add(s5);
//            int i = 0;
//            while (i != a4.size()) {
//                int m = a4.size();
//                String[] si = (String[]) a4.toArray(new String[m]);
//                for (String zifu : zifuji) {   //遍历每一个字符
//                    String s1 = getzifu(si[i], zifu);
//                    for (int j = 0; j < s1.length(); j++) {
//                        char c2 = s1.charAt(j);
//                        String s2 = String.valueOf(c2);
//                        String s3 = kongji.get(s2);
//                        aaaaaa.add(s3);
//                    }
//                    if (!aaaaaa.isEmpty()) {
//                        String s4 = strxiangjia(aaaaaa);
//                        aaaaaa.clear();
//                        if (!a4.contains(s4)) {
//                            a4.add(s4);
//                        }
//                        s6 = si[i].toString();
//                        s6 += ":" + zifu;
//                        dfahanshu.put(s6, s4);
//                    }
//
//                }
//                i++;
//            }
//        }
//
//        // 把N个集合进行合并
//        //  每一个value都是一个集合
//        // 合并后的集合
//        public static String strxiangjia(ArrayList<String> arr) {
//            SortedSet<Character> sd = new TreeSet<>();
//            String ss = "";
//            for (String s : arr) {
//                for (int i = 0; i < s.length(); i++) {
//                    sd.add(s.charAt(i));
//                }
//            }
//            for (char c : sd) {
//                ss += c;
//            }
//            return ss;
//        }
//
//        //准备工作
//        // 获取S中每一个状态经过zifu生达到的状态
//        public static String getzifu(String s, String zifu) {
//            int i = s.length();
//            String s1 = "";
//
//            for (int j = 0; j < i; j++) {
//                char c = s.charAt(j);
//                String ss = String.valueOf(c);
//                for (String sss : zifuhu) {
//                    if (sss.startsWith(ss) && sss.charAt(1) == zifu.charAt(0)) {
//                        s1 += sss.charAt(2);
//                    }
//                }
//            }
//            return s1;
//
//        }
//
//        //NFA中的每一个状态经过空弧后到达的状态
//        public static void KongJi() {
//
//            for (String s : nfazhuangtai) {
//                String sss = "";
//                tranji.add(s);
//                Get_ztj(s);
//                for (String ss : tranji)
//                    sss += ss;
//                kongji.put(s, sss); // 某一字符经过空弧到达的状态集
//                tranji.clear();
//
//            }
//        }
//
//        // 对每一个状态遍历空弧找到等状态 在110行中使用
//        private static SortedSet<String> tranji = new TreeSet<>();
//        public static void Get_ztj(String zt) {
//            for (String s : konghu) {
//                if (s.startsWith(zt)) {
//                    tranji.add(s.substring(2));
//                    Get_ztj(s.substring(2));
//                }
//            }
//        }
//
//        public static void Get_DfaFirst(String cszt) {
//            for (String s : konghu) {
//                if (s.startsWith(cszt)) {
//                    dfachutai += s.substring(2);
//                    Get_DfaFirst(s.substring(2));
//                }
//            }
//        }
//
//        public static void GetDfaFirst() {
//            dfachutai = chushizhuangtai;
//            Get_DfaFirst(chushizhuangtai);
//        }
//
//        public static void wjGet_Nfa(){
//            File file = new File("E:/ceshi.txt");
//            String s =null;
//            try {
//                BufferedReader br = new BufferedReader(new FileReader(file));
//                while((s=br.readLine())!=null){
//                    char c = s.charAt(0);
//                    switch (c) {
//                        case '0':
//                            chushizhuangtai=s.substring(1);
//                            break;
//                        case '1':
//                            jieshuzhuangtai.add(s.substring(1));
//                            break;
//                        case '2':
//                            zifuji.add(s.substring(1));
//                            break;
//                        case '3':
//                            nfazhuangtai.add(s.substring(1));
//                            break;
//                        case '4':
//                            if(s.charAt(2)=='#')
//                                konghu.add(s.substring(1));
//                            else
//                                zifuhu.add(s.substring(1));
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        public static void Get_Nfa() {
//            System.out.print("输入初始状态：");
//            Scanner s = new Scanner(System.in);
//            chushizhuangtai = s.next(); // 初始状态
//            System.out.println("输入结束状态：");
//            Scanner sc5 = new Scanner(System.in);
//            while (true) {
//                String jieshu = sc5.next();
//                if (jieshu.equals("over"))
//                    break;
//                else {
//                    jieshuzhuangtai.add(jieshu);
//                }
//            }
//            System.out.println("输入字符集："); // 字符集
//            Scanner s1 = new Scanner(System.in);
//            while (true) {
//                String ss1 = s1.next();
//                if (ss1.equals("over")) {
//                    break;
//                } else {
//                    zifuji.add(ss1);
//                }
//            }
//
//            System.out.println("输入NFA状态集：");
//            Scanner s2 = new Scanner(System.in);
//            while (true) {
//                String ss2 = s2.next();
//                if (ss2.equals("over")) {
//                    break;
//                } else {
//                    nfazhuangtai.add(ss2);
//                }
//            }
//
//            System.out.println("输入函数集："); // 函数集
//            Scanner sc = new Scanner(System.in);
//            while (true) {
//                String nfa = sc.next();
//                if (nfa.equals("over"))
//                    break;
//                else if (nfa.charAt(1) == '#')
//                    konghu.add(nfa);
//                else
//                    zifuhu.add(nfa);
//            }
//
//        }
//
//
