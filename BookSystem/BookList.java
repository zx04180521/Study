package BookSystem;

import java.util.Arrays;

public class BookList {
    private Book[] books=new Book[100];
    private int size;


    public BookList() {
        books[0]=new Book("三国演义","罗贯中",100,"历史名著");
        books[1]=new Book("水浒传","施耐庵",100,"历史名著");
        books[2]=new Book("西游记","吴承恩",100,"历史名著");
        size=3;
    }

    public Book getBook(int index){
        return books[index];
    }
    public void setBook(int index,Book book){

        books[index]=book;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {

        return size;
    }
}
