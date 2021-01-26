package BookSystem.Operation;

import BookSystem.BookList;

public class ReturnOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("归还书籍");
    }
}
