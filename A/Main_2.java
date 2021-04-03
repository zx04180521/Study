package A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            set.add(str);
        }
        System.out.println(set.size());
    }

}
