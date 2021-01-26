package BookSystem.Operation;

import BookSystem.BookList;

public class BorrowOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("借阅书籍");
    }
}
