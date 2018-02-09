public class Point
{
  private Double x;
  private Double y;
  private Double z;
  
  public Point()
  {
  }
  
  public Point(Double x)
  {
    this.x=x;
  }
  
  public Point(Double x,Double y)
  {
    this.x=x;
    this.y=y;
  }
  
  public Point(Double x,Double y,Double z)
  {
    this.x=x;
    this.y=y;
    this.z=z;
  }

  public Point(Point p)
  {
    this.x=p.x;
    this.y=p.y;
    this.z=p.z;
  }
  
  
  public Double getx()
  {
    return this.x;
  }
  
  public Double gety()
  {
    return this.y;
  }
  
  public Double getz()
  {
    return this.z;
  }
  
  public void setx(Double x)
  {
    this.x = x;
  }
  
  public void sety(Double y)
  {
    this.y = y;
  }
  
  public void setz(Double z)
  {
    this.z = z;
  }
  
   public static void main(String args[])
  {
    Point pt,pt2,pt3;
    pt = new Point(1.0, 2.0, -1.0);
    
    pt.setx(1.3);
    pt.sety(0.2);
    pt.setz(4.0);
    
    pt2 = new Point(pt);
    
    pt3 = new Point();    
    pt3.setx(7.5);
    pt3.sety(4.1);
    pt3.setz(1.8);
    
    System.out.println("Point 1 " + "\nX is " +pt.getx() +"\nY is " +pt.gety()+ "\nZ is " +pt.getz());
    System.out.println("Point 2 " + "\nX is " +pt2.getx() +"\nY is " +pt2.gety()+ "\nZ is " +pt2.getz());
    System.out.println("Point 3 " + "\nX is " +pt3.getx() +"\nY is " +pt3.gety()+ "\nZ is " +pt3.getz());
    
  }
}