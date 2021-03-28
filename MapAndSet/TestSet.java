package MapAndSet;


import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("C");
        set.add("C++");
        set.add("Java");
        set.add("Java");
        set.add("Python");
        System.out.println(set);
        System.out.println(set.contains("C"));
        for(String s:set){
            System.out.print(s+" ");
        }
        System.out.println();
        Set<String> set1=new HashSet<>();
        set1.add("瑶");
        set1.add("鑫");
        set.addAll(set1);
        System.out.println(set);

        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }

}
