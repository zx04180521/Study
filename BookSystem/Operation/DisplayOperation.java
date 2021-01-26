package BookSystem.Operation;

import BookSystem.BookList;

public class DisplayOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("查看书籍列表");
    }
}
