package BookSystem.Operation;

import BookSystem.BookList;

public class DeleteOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除书籍");
    }
}
