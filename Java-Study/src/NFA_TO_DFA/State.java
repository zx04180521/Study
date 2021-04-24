package NFA_TO_DFA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class State {
    /**
     * @param name,状态名称
     * @param paths，从状态到字符串的映射
     * @param flag，该状态是否被标记 *
     */
    private String name;
    private Map<String, List<String>> paths;
    private boolean flag;

    /**
     * 生成默认状态
     */
    State() {
        this.setName("-1");
        this.paths = new HashMap<String, List<String>>();
        List<String> list = new LinkedList<>();
        paths.put("a", list);
        flag = false;
    }

    /**
     * 生成指定名称，包含特定数目字符串的状态
     *
     * @param name，状态名称
     * @param sigma,字母表，用于构建映射
     * @param n,字母表中的字符串数目     *
     */
    State(String name, String[] sigma, int n) {
        this.setName(name);
        this.paths = new HashMap<String, List<String>>();
        for (int i = 0; i < n; i++) {
            List<String> list = new LinkedList<>();
            paths.put(sigma[i], list);
        }
        flag = false;
    }

    /**
     * @return name，返回当前状态名称*
     */
    public String name() {
        return name;
    }

    /**
     * @param name，要设定的状态名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 当前状态是否被标记
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * @param flag，标记当前状态为指定状态
     */
    public void markFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * 设置当前状态中指定字母和状态集合的映射
     *
     * @param signal，指定的字母
     * @param list,要设置的对应映射的集合
     */
    void put(String signal, List<String> list) {
        paths.put(signal, list);
    }

    /**
     * 设置当前状态中状态和指定字符串之间的映射
     *
     * @param signal,被映射的指定字符串
     * @param string，映射后的字符串   *
     */
    public void put(String signal, String string) {
        List<String> list = new LinkedList<>();
        list.add(string);
        paths.put(signal, list);
    }

    /**
     * 获取当前状态的映射关系
     *
     * @return 获取后的键值对 *
     */
    Object get(String key) {
        return paths.get(key);
    }

    /**
     * 判断两个状态是否相等
     *
     * @param obj，要判断是否相等的状态
     * @return 是否相等 *
     */
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((State) obj).name) && this.paths.equals(((State) obj).paths);
    }

    /**
     * 输出格式控制函数
     *
     * @return 当前状态信息的字符串
     */
    @Override
    public String toString() {
        String path = paths.toString().replaceAll("=", "->");
        path = path.replace(',', ' ');
        path = path.replace('{', ' ');
        path = path.replace('}', ' ');
        path = path.replace('[', '{');
        path = path.replaceAll("]", "} ");
        String[] paths = path.toString().split("}");
        int m = 0;
        path = "";
        for (int i = 0; i < paths.length; i++) {
            if (i != paths.length - 1) paths[i] += "}";
            paths[i] = "|" + paths[i];
            m = 15 - paths[i].length();
            if (m > 3)
                for (int k = 0; k < m; k++) {
                    paths[i] = paths[i] + " ";
                }
            else {
                m = 40 - paths[i].length();
                if (m > 0)
                    for (int k = 0; k < m; k++) {
                        paths[i] = paths[i] + " ";
                    }
            }
            path = path + paths[i];
        }
        int j = name.length();
        String name = this.name.toString();
        if (j == 1) {
            j = 10 - j;
        } else {
            j = 30 - j;
        }
        for (int k = 0; k < j; k++) {
            name = name + " ";
        }
        name = name.replace('[', '{');
        name = name.replaceAll("]", "} ");
        return "|" + name + "|" + flag + "       " + path;
    }
}



