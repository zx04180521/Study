package BookSystem.Operation;

import BookSystem.BookList;

public class DisplayOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("查看书籍列表");
        for(int i=0;i<bookList.getSize();i++){
            System.out.println(bookList.getBook(i));
        }
    }
}
