package BookSystem;

import BookSystem.Operation.IOperation;

abstract public class User {
    protected String name;
    IOperation[] operation;
    abstract public int menu();
    public void doOperation(int choice,BookList bookList){
        this.operation[choice-1].work(bookList);
    }
}
