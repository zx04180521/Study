package shiyan2;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @author 软件1801张鑫
 * @ID 1806050126
 * Date 2020.5.14
 */


public class Library {  
    /**
     * itemList contains the List of all items in the library.
     */
    @SuppressWarnings("rawtypes")
	private ArrayList itemList = new ArrayList();
    /**
     * count of all the items in the library.
     */
    private int count=0;
    
    
    /**
     * Changes the status of the named item to borrowed 
     * and adds the Person to the borrowed 
     * 
     * @param id The ID of the item to be borrowed
     * @param newPerson The borrower of the item
     * @throws ItemNotFoundException thrown if the id is not found.
     */
    public void loanItem(String id, Person newPerson) throws ItemNotFoundException {
        //TODO:  Finish this method
        Iterator<Item> it=itemList.iterator();
        int count=-1;
        Item temp=new Item();
        while(it.hasNext()){
            temp=it.next();
            count++;
            if (id.equals(temp.ID)){
                temp.ID=id;
                temp.loaned=true;
                temp.borrower=newPerson;
                temp.cost=temp.cost;
                temp.name=temp.name;
                itemList.set(count,temp);
            }
        }
    }
    
    /**
     * Changes the status of the named item to not borrowed and removes the user from the item.
     * The borrower (person) is returned to the caller
     * 
     * @param id The id of the item
     * @return The person who borrowed the item
     * @throws ItemNotFoundException thrown if the id is not found.
     */
    public Person returnItem(String id) throws ItemNotFoundException {
        //TODO:  Finish this method
        //return null so the code still compiles.  You will need to change it
        Iterator<Item> it = itemList.iterator();
        Item temp = new Item();
        while (it.hasNext()) {
            temp=it.next();
            if (id == temp.ID) {
                return temp.borrower;
            } else {
                temp = it.next();
            }
        }
        return null;
    }
    
    /**
     * 查找商品
     * @param id The item to be returned
     * @return The item searched for.
     * @throws ItemNotFoundException thrown if the id is not found.
     */
    public Item findItem(String id) throws ItemNotFoundException {
        //TODO:  Finish this method
        //return null so the code still compiles.  You will need to change it
        Item temp=new Item();
        Iterator<Item> it=itemList.iterator();
        while(it.hasNext()){
            temp=it.next();
            if (id.equals(temp.ID)){
                return temp;
            }
        }
        return null;
    }
    
    /**
     * Gets the borrower of an item.  If the item is not found throw ItemNotFoundException.
     * 
     * @param id the id of the item
     * @return the borrower of the item.  returns null if the item exists but is not borrowed.
     * @throws ItemNotFoundException thrown if the id is not found
     */
    public Person getBorrower(String id) throws ItemNotFoundException {
        //TODO:  Finish this method
        //return null so the code still compiles.  You will need to change it
        Item temp=new Item();
        Iterator<Item> it=itemList.iterator();
        while(it.hasNext()) {
            temp = it.next();
            if (id.equals( temp.ID)) {
                return temp.borrower;
            }

        }
        return null;
    }
    
    
    
    /**
     * Look up the name of the library item based on the ID given.
     * @param id The id of item searched for. 
     * @return The name of the item blank if not found.
     */
    public String nameForID(String id) {
        //TODO:  Finish this method
        //return null so the code still compiles.  You will need to change it
        Iterator<Item> it = itemList.iterator();
        Item temp = new Item();
        while (it.hasNext()) {
            temp=it.next();
            if (id == temp.ID) {
                return temp.name;
            } else { temp = it.next(); }
        }
        return null;
    }
    
    /**
     * Returns the id of the library item based on the name given.
     * 
     * @param name the name of the item
     * @return the id of the item blank if not found.
     */
    public String IDForName(String name) {
        //TODO:  Finish this method
        //return null so the code still compiles.  You will need to change it
        Item temp = new Item();
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            temp = it.next();
            if (name == temp.name) {
                return temp.ID;
            } else {
                temp = it.next();
            }
        }
        return null;
    }
    
    /**
     * Add a new item to the list of library items.
     * 
     * @param newItem The new item to be added to the list.
     * @throws DuplicateItemException thrown if the item is already in the list.
     */
    /**
     * @param newItem
     * 增加商品
     */
    public void addItem(Item newItem) throws DuplicateItemException{
      //TODO:  Finish this method
        DuplicateItemException e=new DuplicateItemException("wrong");
        Item temp=new Item();
        Iterator<Item> it = itemList.iterator();
        while (it.hasNext()) {
            temp=it.next();
            if (newItem.ID .equals( temp.ID)) {
                throw e;
            }
        }
        itemList.add(newItem);
        count++;
    }
    
    /**
     * Return the number of Items that are either Blurays or DVDs
     * 
     * @return the number of blurays and DVDs
     */
    /**
     * 电影计数
     * @return  数目
     */
    public int countMovies() {
        //TODO:  Finish this method
        //return -99999 so the code still compiles.  You will need to change it
        int Count=0;
        Movie m=new Movie();
        Iterator<Item> it=itemList.iterator();
        while(it.hasNext()){
            if (it.next() instanceof Movie)
                Count++;
        }
        return Count;
    }

    
    /**
     * Convert the entire library to a string.  This should call the appropriate toString methods of each item in the ArrayList.
     * 
     * Should be in the format
     * 
     <pre>
Magazine [magazineFrequency=day, distributionCity=San Andreas]Item [id=ID000, name=Vanity Not So Faire, loaned=false, borrower=null, cost=5.95]
Magazine [magazineFrequency=day, distributionCity=San Andreas]Item [id=ID001, name=Click, loaned=false, borrower=null, cost=5.95]
Magazine [magazineFrequency=day, distributionCity=San Andreas]Item [id=ID002, name=Renovate, loaned=false, borrower=null, cost=5.95]
Magazine [magazineFrequency=day, distributionCity=San Andreas]Item [id=ID003, name=Madrid, loaned=false, borrower=null, cost=5.95]
Magazine [magazineFrequency=day, distributionCity=San Andreas]Item [id=ID004, name=Bikes, loaned=false, borrower=null, cost=5.95]
MusicCD [composer=Rudy Vale, artist=ValenItem [id=ID005, name=Gatewars Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale The Third, artist=ValenItem [id=ID006, name=Gatewars 2 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale Sr, artist=ValenItem [id=ID007, name=Gatewars 3 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale Jr, artist=ValenItem [id=ID008, name=Gatewars 4 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Not Rudy Vale, artist=ValenItem [id=ID009, name=Gatewars 5 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale, artist=Not ValenItem [id=ID0010, name=Gatewars 6 Soundtrack, loaned=false, borrower=null, cost=19.95]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0011, name=Gatewars 1 Revenge of the Fallen, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0012, name=Gatewars 2 Ponies Are Ridden, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0013, name=Gatewars 3 Sequels are Lame, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0014, name=Gatewars 3 But They Keep Making Them, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0015, name=Gatewars 5 They Make More Than is Reasonable, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0016, name=Darth Yobbit and the Range Runners, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0017, name=Darth Yobbit and the Long Jumpers, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0018, name=Darth Yobbit and the Domain Walkers, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0004, name=Darth Yobbit and the KiloByte, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0019, name=Darth Yobbit and the Rabbits, loaned=false, borrower=null, cost=29.95]]]
Book [author=Arthur C Clarke]Item [id=ID0020, name=The City and The Stars, loaned=false, borrower=null, cost=14.5]
Book [author=Arthur C Clarke]Item [id=ID0021, name=Rendevous With Rama, loaned=false, borrower=null, cost=14.5]
Book [author=Arthur C Clarke]Item [id=ID0022, name=2001, loaned=false, borrower=null, cost=14.5]
     </pre>
     * 
     */
    public String toString() {
      //TODO:  Finish this method
      //return null so the code still compiles.  You will need to change it
        Iterator<Item> it=itemList.iterator();
        Item temp=new Item();
        int i=0;
        String our=new String();
        String temp1=new String();
        our=null;
        while(it.hasNext()) {
            temp=it.next();
            temp1=temp.tostring();
            our=our+'\n'+temp1;
        }
        return our;
    }
    
    
    /**
     * Checks if a specific library item is borrowed.
     * 
     * @param id The id of the item that is to be checked.
     * @return the status of the item whether it is borrowed or not.
     * @throws ItemNotFoundException thrown if the id is not found.
     */
    public boolean isBorrowed(String id) throws ItemNotFoundException {
        //TODO:  Finish this method
        //return false so the code still compiles.  You will need to change it
        Iterator<Item> it=itemList.iterator();
        Item temp=new Item();
        while(it.hasNext()) {
            temp=it.next();
            if (temp.ID.equals(id)){
                return temp.loaned;
            }
        }
        return false;
    }
    
    /**
     * Return the total number of items out on loan.
     * 
     * @return The number representing the number of items currently on loan
     */
    public int countBorrowed() {
        //TODO:  Finish this method
        //return -99999 so the code still compiles.  You will need to change it
        int Count=0;
        Iterator<Item> it=itemList.iterator();
        Item temp=new Item();
        while(it.hasNext()) {
            if (it.next().isLoaned()){
                Count++;
            }
        }
        return Count;
    }
    
    /**
     * The percentage of the number of items that are out on loan.  Expressed as a percentage of borrowed to total number of items.
     * @return the percentage borrowed.
     */
    public double percentageBorrowed() {
        //TODO:  Finish this method
        //return -0 so the code still compiles.  You will need to change it
        int Count;
        Count=countBorrowed();
        return ((double) Count/(double)count)*100;
    }
}
class Item{
	/**
	 * 编号
	 */
    String ID;
    /**
     * 商品名
     */
    String name;
    /**
     * 已借出
     */
    boolean loaned;
    /**
     * 借出者
     */
    Person borrower;
    /**
     * 费用
     */
    double cost;
    Item(){}
    Item(String id,String n,boolean l,Person b,double c ){
        ID=id;
        name=n;
        loaned=l;
        borrower=b;
        cost=c;
    }
    String getName(){
        return name;
    }
    String getId(){return ID;}
    double getCost(){return cost;}
    Person getBorrower(){return borrower;}
    boolean isLoaned(){return loaned;}
    void setID(String id){ID=id;}
    void setName(String n){name=n;}
    void setLoaned(boolean l){loaned=l;}
    void setBorrower(Person p){}
    void setCost(double c){cost=c;}
    String tostring(){
        String name1;
        name1=this.getClass().getName();
        if (borrower!=null)
        {
            name1=name1+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower.Name+','+"cost"+cost+']';
        }
        else{name1=name1+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower+','+"cost"+cost+']';}
        return name1;
    }
}
class Person{
    String Name;
    String Adress;
    Person(){}
    Person(String name,String adress){
        Name=name;
        Adress=adress;
    }
    String getName(){
        return Name;
    }
    String getAddress(){return Adress;}

}
class MusicCD extends Item{
    String Composername;
    String Artistname;
    MusicCD(){}
    MusicCD(String composername,String artistname,String ID,String name,boolean loaned,Person brrrower,double cost){
        super(ID,name,loaned,brrrower,cost);
        Composername=composername;
        Artistname=artistname;
    }
    String tostring(){
        String name1;
        name1=this.getClass().getSimpleName();
        if (borrower!=null)
        {
            name1=name1+'['+"Composer"+'='+Composername+','+"Artist"+'='+Artistname+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower.Name+','+"cost"+cost+']'+']';
        }
        else{name1=name1+'['+"Composer"+'='+Composername+','+"Artist"+'='+Artistname+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower+','+"cost"+cost+']'+']';}
        return name1;
    }

}
class Magazine extends Item{
    Frequency frequency;
    String distributionCity;
    Magazine(){}
    Magazine( Frequency f,String ID,String Name,boolean loaned,String Aderess,Person borrower,double cost){
        super(ID,Name,loaned,borrower,cost);
        frequency=f;
        distributionCity=Aderess;
    }
    enum Frequency{day, week,monthly, quarterly,yearly}
    String tostring(){
        String name1=new String();
        String name2=new String();
        name1=this.getClass().getSimpleName();
        if (borrower==null)
        {
            name2=name1+'['+"magazineFrequency"+'='+frequency+','+"distributionCity"+'='+distributionCity+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+'='+borrower+','+"cost"+cost+']'+']';
        }
        else{name2=name1+'['+"magazineFrequency"+'='+frequency+','+"distributionCity"+'='+distributionCity+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+'='+borrower.Name+','+"cost"+cost+']'+']';}
        return name2;
    }

}
enum Genre { scifi, action, drama ,romance};
class Bluray extends Movie{
    char Region;
    Bluray(){}
    Bluray(char region,Genre genre,String id,String name,boolean loaned,Person borrower,double cost){
        super(genre,id,name,loaned,borrower,cost);
        Region=region;
    }
    String tostring(){
        String name1;
        name1=this.getClass().getSimpleName();
        if (borrower!=null)
        {
            name1=name1+'['+"region"+'='+Region+','+'='+"Movie"+'['+"genre"+'='+Gen+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower.Name+','+"cost"+cost+']'+']'+']';
        }
        else{
            name1=name1+'['+"region"+'='+Region+','+'='+"Movie"+'['+"genre"+'='+Gen+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower+','+"cost"+cost+']'+']'+']';
        }
        return name1;
    }
}
class DVD extends Movie{
    int Region;
    DVD(){}
    DVD(int region,Genre genre,String id,String name,boolean loaned,Person borrower,double cost){
        super(genre,id,name,loaned,borrower,cost);
        Region=region;
    }
    String tostring(){
        String name1;
        name1=this.getClass().getName();
        if (borrower!=null)
        {
            name1=name1+'['+"region"+'='+Region+','+'='+"Movie"+'['+"genre"+'='+Gen+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower.Name+','+"cost"+cost+']'+']'+']';
        }
        else {
            name1=name1+'['+"region"+'='+Region+','+'='+"Movie"+'['+"genre"+'='+Gen+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower+','+"cost"+cost+']'+']'+']';
        }
        return name1;
    }

}
class Book extends Item{
    String Author;
    Book(){}
    Book(String author,String id,String name,boolean loaned,Person borrower,double cost){
        super(id,name,loaned,borrower,cost);
        Author=author;
    }
    String tostring(){
        String name1;
        name1=this.getClass().getName();
        if (borrower!=null)
        {
            name1=name1+'['+"Author"+'='+Author+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower.Name+','+"cost"+cost+']'+']';
        }
        else {
            name1=name1+'['+"Author"+'='+Author+','+"Item"+'['+"id"+'='+ID+','+"name"+'='+name+"loaned"+'='+loaned+','+"borrower"+borrower+','+"cost"+cost+']'+']';
        }
        return name1;
    }
}
class Movie extends Item{
    enum Genre { scifi, action, drama ,romance};
    Genre Gen;
    Movie(){}
    Movie(Genre genre,String id,String name,boolean loaned,Person borrower,double cost){
        super(id,name,loaned,borrower,cost);
        Gen=genre;
    }
}