package MapAndSet;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {


        Map<String, String> m = new HashMap<>();
        m.put("豹子头","林冲");
        m.put("及时雨","宋江");
        m.put("行者","武松");
        m.put("小李广","花荣");
        System.out.println(m);//打印所有的键值对
//        System.out.println(m.size());//打印m大小，既有多少对键值对
//        System.out.println(m.get("豹子头"));//返回该key对应的value，如果不存在则返回null
//        System.out.println(m.get("花和尚"));
//        System.out.println(m.getOrDefault("行者","武松"));//返回key对应的value，如果不存在该key，则返回默认值
//        System.out.println(m.getOrDefault("花和尚","鲁智深"));
//        String res=m.remove("行者");//删除对应的value
//        System.out.println(m);
//        m.replace("及时雨","宋江","变身宋江");
//        System.out.println(m);
        m.put("小李广","变身花荣");
        System.out.println(m);
//        m.clear();//清空所有键值对

        //打印所有的key
//        for(String key:m.keySet()){
//            System.out.println(key);
//        }
//
//        //打印所有的value
//        for(String value:m.values()){
//            System.out.println(value);
//        }

        //遍历打印所有键值对
//        for(Map.Entry<String,String> entry:m.entrySet()){
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }
    }



}
