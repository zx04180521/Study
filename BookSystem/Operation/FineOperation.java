package BookSystem.Operation;

import BookSystem.BookList;

public class FineOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查看书籍信息");
    }
}
