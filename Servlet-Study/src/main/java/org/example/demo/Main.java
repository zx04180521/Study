package org.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, JsonProcessingException {
//        Class<Main> c = Main.class;
//        Class c2 = Class.forName("java.lang.String");
//        //基于Class对象可以实例化一个对象
//        Object o = c.newInstance();
        //反射：运行时动态的获取类信息，方法，字段的信息

//        Parent p = new Child();
//        p.service("GET");
//        p.service("POST");
        //涉及多态中，父类子类的方法调用，从下向上查找方法

        //序列化操作：java对象转变为json字符串
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUsername("猴哥");
        user.setPassword("悟空，快来救我");
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        //反序列化：把json字符串转变为java对象
        String s = "{\"username\":\"猴哥和八戒\",\"password\":\"悟空，快来救我\"}";
        User u2 = mapper.readValue(s, User.class);
        System.out.println(u2);

        //反序列化时，json键必须对应类中的成员变量，找不到就会报错
        String s3 = "{\"username1\":\"猴哥和八戒\",\"password\":\"悟空，快来救我\"}";
        User u3 = mapper.readValue(s3, User.class);
        System.out.println(u3);
    }
}
