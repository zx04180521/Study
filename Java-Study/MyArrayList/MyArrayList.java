package MyArrayList;


import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    List<Integer> list=new ArrayList<>();
    private String[] array = null;
    private int size = 0;
    private int capcity = 100;

    public MyArrayList() {
        array = new String[capcity];
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < size; i++) {
            stringBuffer.append(array[i]);
            if (i != size - 1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void expand() {
        String[] newArr = new String[capcity * 2];
        for (int i = 0; i < capcity; i++) {
            newArr[i] = array[i];
        }
        array = newArr;
    }

    public void add(String str) {
        if (size >= capcity) {
            expand();
        }
        array[size++] = str;
    }

    public void add(int index, String str) {
        if (index > size || index < 0) {
            System.out.println("下标不正确！！！");
            return;
        }
        if (size >= capcity) {
            expand();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = str;
        size++;
    }

    public String remove(int index) {
        if (index > size || index < 0) {
            System.out.println("下标不正确！！！");
            return null;
        }
        String result = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return result;
    }

    public boolean remove(String str) {
        for (int i = 0; i < size; i++) {
            if (str.equals(array[i])) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(String str) {
        for (int i = 0; i < size; i++) {
            if (str.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(String str){
        for (int i = 0; i < size; i++) {
            if (str.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(String str){
        for (int i = size-1; i >=0; i--) {
            if (str.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public String get(int index) {
        return array[index];
    }

    public String set(int index, String str) {
        return array[index] = str;
    }

    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("c");
        myArrayList.add("c++");

        myArrayList.add("java");
        myArrayList.add("c");
        System.out.println(myArrayList);
//        myArrayList.add(2, "python");
//        System.out.println(myArrayList);
//        myArrayList.remove(1);
//        System.out.println(myArrayList);
//        myArrayList.remove("c");
//        System.out.println(myArrayList);
//        System.out.println(myArrayList.get(0));
//        myArrayList.set(1, "hello");
//        System.out.println(myArrayList);
//        System.out.println(myArrayList.contains("c++"));
//        System.out.println(myArrayList.indexOf("c"));
//        System.out.println(myArrayList.lastIndexOf("c"));
    }
}
