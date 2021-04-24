package NFA_TO_DFA;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Lex {
    public static void main(String[] args) throws FileNotFoundException {
        /** -----------------初始化开始--------------- **/
        List<String> stateList;//原始状态列表
        List<State> transState;//转换后的状态列表
        List<List<String>> transTable;//得到的新的状态集合
        File file = new File("src/TE0413/data.txt");
        Scanner reader = new Scanner(file);
        int totalSignals = Integer.parseInt(reader.nextLine());// 获取字符总数（包含空串）
        String[] sigma = new String[totalSignals];
        String newLine = reader.nextLine();//获取所有字符串（空串以$表示）,以空格划分
        sigma = newLine.split(" ");
        int totalStates = Integer.parseInt(reader.nextLine());// 获取状态总数
        State[] states = new State[totalStates];
        for (int i = 0; i < totalStates; i++) {
            states[i] = new State("" + i, sigma, totalSignals);
        }
        for (int i = 0; i < totalStates; i++) {
            // 获取每个状态在对应字母转换后的状态表，没有状态用#
            for (int j = 0; j < totalSignals; j++) {
                newLine = reader.nextLine();
                String[] lines = newLine.split(" ");
                stateList = new LinkedList<>();
                for (int m = 0; m < lines.length; m++) {
                    stateList.add(lines[m]);
                }
                states[i].put(sigma[j], stateList);
            }
        }
        System.out.println("\n原始状态转换表为：");
        int k = states[0].toString().length();
        while (k >= 15) {
            System.out.print("_");	k--;
        }
        System.out.println();//控制输出
        for (int i = 0; i < totalStates; i++) {
            System.out.println(states[i]);
        }
        k = states[0].toString().length();
        while (k >= 15) {
            System.out.print("_");	k--;
        }
        System.out.println();
        reader.close();
        /** -----------------初始化结束-------------- **/
        transState = new LinkedList<State>();
        stateList = new LinkedList<String>();//
        transTable = new LinkedList<List<String>>();
        /** -------------------找开始状态T0-------------- **/
        String[] temp = closure(states, totalStates, 0, "$");
        for (String m : temp)   stateList.add(m);
        State tState = new State(stateList.toString(), sigma, totalSignals);
        tState.put("$", "#");
        transState.add(tState);
        transTable.add(stateList);
        /** ------------------将T0加入状态转换列表-------------- **/
        System.out.println("\n转换过程：");//输出格式控制
        k = states[0].toString().length();
        while (k >= -5) {
            System.out.print("_");	k--;
        }
        boolean flag = tState.isFlag();//循环控制变量
        /** ----------------------计算DFA--------------------- **/
        System.out.println();
        while (!flag)
        {
            tState.markFlag(true);
            List<String> state = new LinkedList<String>();
            for (int i = 0; i < transTable.size(); i++)
            {
                state = transTable.get(i);
                if (state.toString().equals(tState.name())) {

                    break;
                }
            }
            // 找到当前状态的原始转换列表
            String[] path = new String[state.size()];
            k = 0;
            for (String m : state) {
                path[k++] = m;
            }
            // 取到当前状态
            for (String s : sigma)
            {
                // 按字母表填转换表
                if (s.equals("$")) {
                    break;
                }
                String[] move = new String[state.size()];
                move = move(states, totalStates, path, s);
                // 第一次move
                // 如果这个状态得到这个字符串，执行e-closure运算
                if (!move[0].equals("#")) {
                    move = move(states, totalStates, move, "$");
                }
                stateList = new LinkedList<>();
                for (String q : move) {
                    stateList.add(q);
                }
                tState.put(s, stateList);// 将得到的状态填入对应的状态
                System.out.println(tState);
                if (!transTable.contains(stateList) && !stateList.contains("#"))
                {
                    transTable.add(stateList);//扩充状态转换列表
                    State sa = new State(stateList.toString(), sigma,	totalSignals);
                    sa.put("$", "#");
                    transState.add(sa);
                }
                // 找下一个状态，改变对应flag的值用以控制循环
                for (State t : transState)
                {
                    if (!t.isFlag())
                    {
                        tState = t;flag = tState.isFlag();
                        break;
                    } else {
                        flag = true;
                    }
                }
            }
        }

        k = states[0].toString().length();
        while (k >= -5) {
            System.out.print("_");	k--;
        }
        /**----------------状态转换结束，将结果输出------------------**/
        System.out.println("\n处理结束,新的状态转换表为：");
        k = transState.get(0).toString().length();
        while (k >= 15) {
            System.out.print("_");	k--;
        }
        System.out.println();
        for (int i = 0; i < transState.size(); i++) {
            System.out.println(transState.get(i));
        }
        k = transState.get(0).toString().length();
        while (k >= 15) {
            System.out.print("_");	k--;
        }
        System.out.println();
        /**------------将转换后的状态列表写入对应的文件result.txt------------**/
        try {
            file = new File("result.txt");
            FileWriter newFile = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(newFile);
            for (int i = 0; i < transState.size(); i++) {
                writer.write(transState.get(i).toString());
                writer.newLine();
                writer.flush();
            }	writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    /**算法描述：（1）将T中所有状态压入栈stack; 将closure (T) 初始化为T;
     * （2）若stack不空 将栈顶元素t弹出栈;
     * （3）对每个从t到u有一条标记为 ε的边的状态u：
     如果 u 不在ε-closure ( T ) do 将u 添加到closure ( T );
     * （4）将u压入栈stack中 closure算法
     * @param states 状态列表
     * @param totalStates，所有状态数
     * @param location，待转换状态在原始状态列表中的位置
     * @param str，将要执行对该字符串的闭包运算
     * @return 转换后的字符串集合 */
    public static String[] closure(State[] states, int totalStates,	int location, String str)
    {
        LinkedList<String> list = (LinkedList<String>) states[location].get(str);
        LinkedList<String> current = new LinkedList<String>();
        Stack<String> stack = new Stack<>();
        if (list.contains("#"))
        {
            if (str.equals("$")) {
                current.add(states[location].name());
            }
        }
        else
        {
            stack.push(states[location].name());
            for (String i : list) {
                stack.push(i);
            }
            while (!stack.empty())
            {
                String temp = stack.pop();
                for (int n = 0; n < totalStates; n++)
                {
                    if (stack.empty()) {
                        break;
                    }
                    if ((states[n].name()).equals(temp))
                        for (String j : (LinkedList<String>) states[n].get(str))
                            if (!(j.equals("#")) && !(stack.contains(j))&& !stack.empty()) {
                                stack.push(j);
                            }
                }
                if (!current.contains(temp)){
                    current.add(temp);
                }
            }
        }
        if (current.isEmpty()) {
            current.add("#");
        }
        String[] res = new String[current.size()];
        int t = 0;
        for (String i : current) {
            res[t++] = i;
        }
        return res;
    }

    /**算法描述：实质是对传入集合中所有的元素做对相应字母的闭包运算
     * @param states 状态列表
     * @param totalStates，所有状态数
     * @param tSet，待转换状态列表
     * @param str，将要执行对该字符串的闭包运算
     * @return 当前闭包转换后的字符串集合**/
    public static String[] move(State[] states, int totalStates, String[] tSet, String str) {
        LinkedList<String> list = new LinkedList<String>();
        String[] temp = new String[tSet.length];
        for (int i = 0; i < tSet.length; i++) {
            if (tSet[i].equals("#")) {
                break;
            }
            int location = (Integer.parseInt(tSet[i]));
            temp = closure(states, totalStates, location, str);
            for (String m : temp)
                if (!list.contains(m)) {
                    list.add(m);
                }
        }
        if (list.size() == 1 && list.contains("#")) {
            tSet = new String[1];
            tSet[0] = "#";
            return tSet;
        }
        list.remove("#");
        int k = 0;
        if (list.size() != 0) {
            tSet = new String[list.size()];
            for (String m : list)
                tSet[k++] = m;
        } else {
            tSet = new String[1];
            tSet[0] = "#";
        }
        return tSet;
    }
}
