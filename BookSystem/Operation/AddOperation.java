package BookSystem.Operation;

import BookSystem.BookList;

public class AddOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("添加书籍");
    }
}
