public class Book
{
  private String title;
  private int numberofpage;
  private String authorName;
  
  public Book()
  {
  }
  
  public Book(String title)
  {
    this.title = title;
  }
  
  public Book(String title,int numberofpage)
  {
    this.title = title;
    this.numberofpage = numberofpage;
  }
  
  public Book(String title,int numberofpage,String authorName)
  {
    this.title = title;
    this.numberofpage = numberofpage;
    this.authorName = authorName;
  }
  
  public String gettitle()
  {
    return this.title;
  }
  
  public int getnumberofpage()
  {
    return this.numberofpage;
  }
  
  public String getauthorName()
  {
    return this.authorName;
  }
  
  public void settitle(String title)
  {
    this.title = title;
  }
  
  public void setnumberofpage(int numberofpage)
  {
    this.numberofpage = numberofpage;
  }
  
  public void setauthorName(String authorName)
  {
    this.authorName = authorName;
  }

  public boolean isSameBook(Book book)
  {
  if(this.title == book.gettitle()&&this.numberofpage == book.getnumberofpage()&&this.authorName == book.getauthorName())
    return true;
  return false;
  }
}