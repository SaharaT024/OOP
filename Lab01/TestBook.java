import java.io.*;
  
public class TestBook
{ 
  public static void main(String args[])
  {
    Book mybook1,mybook2;
    mybook1 = new Book("Java Application",300,"JK");
    mybook2 = new Book("Java Application",300,"JK");
    System.out.println("Book1 Title is "+mybook1.gettitle() +",Number of Pages is "
                        +mybook1.getnumberofpage() +",Author Name is " 
                        +mybook1.getauthorName());
    System.out.println("Book2 Title is "+mybook2.gettitle() +",Number of Pages is "
                        +mybook2.getnumberofpage() +",Author Name is " 
                        +mybook2.getauthorName());
    System.out.println("Are Book1 and Book2 is True or False ? --> "+ mybook1.isSameBook(mybook2));
    mybook2.setnumberofpage(400);
    System.out.println("Book1 Title is"+mybook1.gettitle() +",Number of Pages is "
                        +mybook1.getnumberofpage() +",Author Name is " 
                        +mybook1.getauthorName());
    System.out.println("Book2 Title is"+mybook2.gettitle() +",Number of Pages is "
                        +mybook2.getnumberofpage() +",Author Name is " 
                        +mybook2.getauthorName());
    System.out.println("Are Book1 and Book2 is True or False ? --> "+ mybook1.isSameBook(mybook2));
  }
}

