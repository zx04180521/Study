package shiyan2;


/**
 * @author 软件1801张鑫
 * @ID 1806050126
 * Date 2020.5.14
 */
public class TestDriver {
	/**
	 * 在图书馆中增加重复项目和不同项目的测试
	 * 如果增加不同项目，期望的结果是增加成功且能在图书馆中找到
	 * 如果增加重复项目，期望的结果是抛出重复添加异常
	 */

	public void runTestAddItem() {		
		System.out.println("***Testing addItem***");

		//by putting {} around each test we throw away all the variables created inside the braces when you get to the end of the test.   
		//Like a self cleaning mode.
		{
			System.out.println("-Test add an item and see if it is in the list-");
			String expected = "Found";
			System.out.println("Expected <"+expected+">");
			//Do the Test
			Library l1 = new Library();
			Item retrieved = null;
			String result = "";
			try {
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID001","Vanity Not So Faire", false,"New York", null, 5.95));
				retrieved = l1.findItem("ID001");
				//This will always come out true in this test as if there is an exception it will skip this line anyway.
				//It is in here for completeness and if someone writes another tests and uses this as an example.
				//The findItem should never return null but this will cover an event when something goes wrong in the library code 
				result = retrieved != null? "Found":"Not Found";
			} catch (DuplicateItemException e) {
				result = "Failed Duplicate Found";
			} catch (Exception e) {
				result = "Failed Exception Thrown";
			}			
			System.out.println("Got <"+result+">");	
			if (result.equals(expected)) {
				System.out.println("Success");
			} else {
				System.out.println("Failed");
			}
		}

		{
			System.out.println("-Test add an item with a duplicate see if it throws an exception-");
			String expected = "Failed Duplicate Found";
			System.out.println("Expected <"+expected+">");
			//Do the Test
			Library l1 = new Library();
			Item retrieved = null;
			String result = "";
			try {
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID001","Vanity Not So Faire", false, "New York",null, 5.95));
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID001","Vanity Not So Faire", false,"New Jersey", null, 5.95));
				retrieved = l1.findItem("ID001");
				result = retrieved != null? "Found":"Not Found";
			} catch (DuplicateItemException e) {
				result = "Failed Duplicate Found";
			} catch (Exception e) {
				result = "Failed Exception Thrown";
			}			
			System.out.println("Got <"+result+">");	
			if (result.equals(expected)) {
				System.out.println("Success");
			} else {
				System.out.println("Failed");
			}
		}

		//You need to write lots of tests here. 

	}
	/**
	 * 测试借阅类，判断是否可以成功被借阅
	 */
	public void runTestAddBorrower() {
		System.out.println("***Testing addBorrower***");
		{
			//use the first test as a template on how to write more
			String temp;
			Library l1=new Library();
			try {
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID001","Vanity Not So Faire", false, "New York",null, 5.95));
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID002","Vanity Not So Faire", false, "New York",null, 5.95));
			}catch (DuplicateItemException e){
				return;
			}
		}
	}


	/**
	 * 计算借出数量的类，判断借出数量是否正确
	 */
	public void runTestCountBorrowed() {
		System.out.println("***Testing countBorrowed***");
		String temp;
		Library l1=new Library();
		try {
			l1.addItem(new Magazine(Magazine.Frequency.day, "ID001","Vanity Not So Faire", false, "New York",null, 5.95));
			l1.addItem(new Magazine(Magazine.Frequency.day, "ID002","Vanity Not So Faire", false, "New York",null, 5.95));
		}catch (DuplicateItemException e){
			return;
		}
		temp=l1.toString();
		System.out.println(temp);
	}
	/**
	 * 测试可否正确寻找图书馆中的项目
	 */
	public void runTestFindItem() {
		System.out.println("***Testing runTestFindItem***");
		{

			Library l1 = new Library();
			Item item = new Item();
			String result = "";
			try {
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID0021","Madrid", false, "San Andreas",null, 5.95));
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID0022","Renovate", false, "San Andreas",null, 5.95));
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID0023","Hello", false, "San Andreas",null, 5.95));
//				System.out.println(l1);
				item = l1.findItem("ID0021");
				System.out.println(item);
				
			} catch (ItemNotFoundException e) {
				result = "Failed NotFoundException Found";
			} catch (Exception e) {
				result = "Failed Exception Thrown";
			}			

		}
		
	}
	
	
	/**
	 * 测试还书类，判断可否正确还书
	 */
	public void runTestReturnItem() {
		System.out.println("***Testing runTestReturnItem***");
		{
			String expected = "true";
			System.out.println("Expected <"+expected+">");
			//Do the Test
			Library l1 = new Library();
			String result = "";
			Person Mike = new Person("Mike", "Beijing");
			try {
				l1.addItem(new Magazine(Magazine.Frequency.day, "ID0021","Madrid", false, "San Andreas",null, 5.95));
				l1.loanItem("ID0021", Mike);
				l1.returnItem("ID0021");
				if(l1.isBorrowed("ID0021") == false) {
					result = "true";
				}

			} catch (ItemNotFoundException e) {
				result = "Failed NotFoundException Found";
			} catch (Exception e) {
				result = "Failed Exception Thrown";
			}			
			System.out.println("Got <"+result+">");	
			if (result.equals(expected)) {
				System.out.println("Success");
			} else {
				System.out.println("Failed");
			}
		}
		
	}


	public static void main(String[] args) {
		TestDriver td = new TestDriver();
		
		td.runTestAddItem();//测试增加类
		td.runTestAddBorrower();//测试借阅者类
		td.runTestCountBorrowed();//测试计算借阅量类
		td.runTestReturnItem();
		td.runTestFindItem();
		//you need to add more

	}



	/**
	 * This method just contains some dummy test code to check that basic functionality is working and also fail if the API is not created correctly in the Library file and Item file.
<pre>
This method should output 
Magazine [magazineFrequency=day, distributionCity=San Andreas, toString()=Item [id=ID000, name=Vanity Not So Faire, loaned=false, borrower=null, cost=5.95]]
Magazine [magazineFrequency=day, distributionCity=San Andreas, toString()=Item [id=ID001, name=Click, loaned=false, borrower=null, cost=5.95]]
Magazine [magazineFrequency=day, distributionCity=San Andreas, toString()=Item [id=ID002, name=Renovate, loaned=false, borrower=null, cost=5.95]]
Magazine [magazineFrequency=day, distributionCity=San Andreas, toString()=Item [id=ID003, name=Madrid, loaned=false, borrower=null, cost=5.95]]
Magazine [magazineFrequency=day, distributionCity=San Andreas, toString()=Item [id=ID004, name=Bikes, loaned=false, borrower=null, cost=5.95]]
MusicCD [composer=Rudy Vale, artist=Valen, toString()=Item [id=ID005, name=Gatewars Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale The Third, artist=Valen, toString()=Item [id=ID006, name=Gatewars 2 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale Sr, artist=Valen, toString()=Item [id=ID007, name=Gatewars 3 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale Jr, artist=Valen, toString()=Item [id=ID008, name=Gatewars 4 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Not Rudy Vale, artist=Valen, toString()=Item [id=ID009, name=Gatewars 5 Soundtrack, loaned=false, borrower=null, cost=19.95]]
MusicCD [composer=Rudy Vale, artist=Not Valen, toString()=Item [id=ID0010, name=Gatewars 6 Soundtrack, loaned=false, borrower=null, cost=19.95]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0011, name=Gatewars 1 Revenge of the Fallen, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0012, name=Gatewars 2 Ponies Are Ridden, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0013, name=Gatewars 3 Sequels are Lame, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0014, name=Gatewars 3 But They Keep Making Them, loaned=false, borrower=null, cost=29.95]]]
Bluray [region=c, toString()=Movie [genre=drama, toString()=Item [id=ID0015, name=Gatewars 5 They Make More Than is Reasonable, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0016, name=Darth Yobbit and the Range Runners, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0017, name=Darth Yobbit and the Long Jumpers, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0018, name=Darth Yobbit and the Domain Walkers, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0019, name=Darth Yobbit and the KiloByte, loaned=false, borrower=null, cost=29.95]]]
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0020, name=Darth Yobbit and the Rabbits, loaned=false, borrower=null, cost=29.95]]]
Book [author=Arthur C Clarke, toString()=Item [id=ID0021, name=The City and The Stars, loaned=false, borrower=null, cost=14.5]]
Book [author=Arthur C Clarke, toString()=Item [id=ID0022, name=Rendevous With Rama, loaned=false, borrower=null, cost=14.5]]
Book [author=Arthur C Clarke, toString()=Item [id=ID0023, name=2001, loaned=false, borrower=null, cost=14.5]]

Should say false false
Should say true true
Should say Stewart Stewart
Should say Mawson Lakes Mawson Lakes
	 ******
Darth Yobbit and the Rabbits
ID0020
29.95
null
Should be false false
Should be false false
DVD [region=1, toString()=Movie [genre=scifi, toString()=Item [id=ID0020, name=Changed Name, loaned=false, borrower=Person [name=AAA, address=ADDRESS, toString()=unisa.library.Person@24a37368], cost=99.98999786376953]]]
	 ******
MusicCD [composer=Rudy Vale The Third, artist=Valen, toString()=Item [id=ID006, name=Gatewars 2 Soundtrack, loaned=false, borrower=null, cost=19.95]]
	 ******
Number Borrowed 1
Percentage Borrowed  4.17% 
	 ******
Number Borrowed Should say 5 5
Percentage Borrowed 20.83% 
Should say 10 10
</pre>
	 */
	public void arbitraryTestCode() {
		Library l1 = new Library();
		Person p1 = null;
		try {
			p1 = new Person("Stewart","Mawson Lakes Blvd");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		int id=0;
		try {
			Item[] testSubjects = {
					new Magazine(Magazine.Frequency.day, "ID00"+id++,"Vanity Not So Faire", false, "San Andreas",null, 5.95),
					new Magazine(Magazine.Frequency.day, "ID00"+id++,"Click", false, "San Andreas",null, 5.95),
					new Magazine(Magazine.Frequency.day, "ID00"+id++,"Renovate", false, "San Andreas",null, 5.95),
					new Magazine(Magazine.Frequency.day, "ID00"+id++,"Madrid", false, "San Andreas",null, 5.95),
					new Magazine(Magazine.Frequency.day, "ID00"+id++,"Bikes", false, "San Andreas",null, 5.95),
					new MusicCD("Rudy Vale","Valen","ID00"+id++,"Gatewars Soundtrack",false,null,19.95),
					new MusicCD("Rudy Vale The Third","Valen","ID00"+id++,"Gatewars 2 Soundtrack",false,null,19.95),
					new MusicCD("Rudy Vale Sr","Valen","ID00"+id++,"Gatewars 3 Soundtrack",false,null,19.95),
					new MusicCD("Rudy Vale Jr","Valen","ID00"+id++,"Gatewars 4 Soundtrack",false,null,19.95),
					new MusicCD("Not Rudy Vale","Valen","ID00"+id++,"Gatewars 5 Soundtrack",false,null,19.95),
					new MusicCD("Rudy Vale","Not Valen","ID00"+id++,"Gatewars 6 Soundtrack",false,null,19.95),
					new Bluray('c',Bluray.Genre.drama,"ID00"+id++,"Gatewars 1 Revenge of the Fallen",false,null,29.95),
					new Bluray('c',Bluray.Genre.drama,"ID00"+id++,"Gatewars 2 Ponies Are Ridden",false,null,29.95),
					new Bluray('c',Bluray.Genre.drama,"ID00"+id++,"Gatewars 3 Sequels are Lame",false,null,29.95),
					new Bluray('c',Bluray.Genre.drama,"ID00"+id++,"Gatewars 3 But They Keep Making Them",false,null,29.95),
					new Bluray('c',Bluray.Genre.drama,"ID00"+id++,"Gatewars 5 They Make More Than is Reasonable",false,null,29.95),
					new DVD(1,DVD.Genre.scifi,"ID00"+id++,"Darth Yobbit and the Range Runners",false,null,29.95),
					new DVD(1,DVD.Genre.scifi,"ID00"+id++,"Darth Yobbit and the Long Jumpers",false,null,29.95),		
					new DVD(1,DVD.Genre.scifi,"ID00"+id++,"Darth Yobbit and the Domain Walkers",false,null,29.95),		
					new DVD(1,DVD.Genre.scifi,"ID00"+id++,"Darth Yobbit and the KiloByte",false,null,29.95),		
					new DVD(1,DVD.Genre.scifi,"ID00"+id++,"Darth Yobbit and the Rabbits",false,null,29.95),		
					new Book("Arthur C Clarke","ID00"+id++,"The City and The Stars",false,null,14.50),
					new Book("Arthur C Clarke","ID00"+id++,"Rendevous With Rama",false,null,14.50),
					new Book("Arthur C Clarke","ID00"+id++,"2001",false,null,14.50)
			};

			for (int i=0;i<testSubjects.length;i++) {
				try {
					l1.addItem(testSubjects[i]);
				} catch(DuplicateItemException ex) {
					System.err.println(ex);
				}
			}
			System.out.println("******");


			l1.loanItem("ID0022", new Person("Stewart","Mawson Lakes"));
			System.out.println("Should say false "+l1.isBorrowed("ID0020"));
			System.out.println("Should say true "+l1.isBorrowed("ID0022"));
			System.out.println("Should say Stewart " + l1.getBorrower("ID0022").getName());
			System.out.println("Should say Mawson Lakes " + l1.getBorrower("ID0022").getAddress());

			System.out.println("******");

			//Various get datas from items
			System.out.println(l1.findItem("ID0020").getName());
			System.out.println(l1.findItem("ID0020").getId());
			System.out.println(l1.findItem("ID0020").getCost());
			System.out.println(l1.findItem("ID0020").getBorrower());
			System.out.println("Should be false "+l1.findItem("ID0020").isLoaned());
			l1.findItem("ID0020").setBorrower(new Person("AAA","ADDRESS"));
			//Corrected this.   BTW in normal operation this should not occur that there
			//is a borrower but not loaned.  This code is here to ensure that you have all 
			//The appropriate methods I need to check your code later.
			System.out.println("Should be false "+l1.findItem("ID0020").isLoaned());
			l1.findItem("ID0020").setCost(99.99f);
			l1.findItem("ID0020").setLoaned(false);
			l1.findItem("ID0020").setName("Changed Name");
			System.out.println(l1.findItem("ID0020"));

			System.out.println("******");


			try {
				System.out.println(l1.findItem("ID006"));
			} catch (ItemNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("******");

			System.out.println("Number Borrowed "+l1.countBorrowed());
			System.out.printf("Percentage Borrowed %5.2f%% \n",l1.percentageBorrowed());
			try {
				l1.loanItem("ID001", p1);
				l1.loanItem("ID003", p1);
				l1.loanItem("ID004", p1);
				l1.loanItem("ID009", p1);
			} catch (ItemNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("******");


			System.out.println("Number Borrowed Should say 5 "+l1.countBorrowed());
			System.out.printf("Percentage Borrowed %5.2f%% \n",l1.percentageBorrowed());

			System.out.println("Should say 10 "+l1.countMovies());
		} catch (Exception ex) {
			System.err.println("Exception Found in Input "+ex.getMessage());
		}

	}
}
