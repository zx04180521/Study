package BookSystem.Operation;

import BookSystem.Book;
import BookSystem.BookList;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookList bookList){
        Scanner sc=new Scanner(System.in);
        System.out.println("添加书籍");
        System.out.println("请输入您要添加的书名：");
        String name=sc.nextLine();
        System.out.println("请输入该书籍的作者：");
        String author=sc.nextLine();
        System.out.println("请输入该书的价格：");
        double price=sc.nextDouble();
        System.out.println("请输入该书的类型：");
        String type=sc.next();
        Book book=new Book(name,author,price,type);
        bookList.setBook(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
        System.out.println("添加成功！");
    }
}
