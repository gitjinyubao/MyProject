package Yu;

public class Test
{ 
    public static void main(String[] args)
	{   
		Complex c=new Complex(); 
        Complex c1=new Complex(3,7);  
	    Complex c2=new Complex(5,1);
	    c1.showComp();   
		c2.showComp();
	    System.out.println("这两复数和为：");  
	    System.out.println(c.addComp(c1, c2).x+"+"+c.addComp(c1, c2).y+"i");  
	    System.out.println("这两复数差为：");  
	    System.out.println(c.subComp(c1, c2).x+"+"+c.subComp(c1, c2).y+"i");
		System.out.println("这两复数积为："); 
	    System.out.println(c.multiComp(c1, c2).x+"+"+c.multiComp(c1, c2).y+"i");
		if(c.equalComp(c1,c2))
		System.out.println("两个复数相等");
		else
		System.out.println("两个复数不相等");
	
	  }
 } 
 class Complex
{ 
    double x,y;  
	Complex()  
    {}  
  Complex(double i,double j)  
   { 
	   x=i;
	   y=j;
   }  
   Complex addComp(Complex p1,Complex p2)  
   { 
	 Complex p =new Complex(p1.x+p2.x,p1.y+p2.y);  
	 return p;   
   }  
   Complex subComp(Complex p1,Complex p2) 
   {   
	 Complex p =new Complex(p1.x-p2.x,p1.y-p2.y); 
     return p;     
   } 
   Complex multiComp(Complex p1,Complex p2)
   {
	  Complex p=new Complex(p1.x*p2.x+p1.y*p2.y,p1.x*p2.x-p1.y*p2.y);
	  return p;
   }
   public boolean equalComp(Complex p1,Complex p2)
   {
      if((p1.x==p2.x) && (p1.y==p2.y))
	    return true;
	  else
	   return false;
   }

  void showComp() 
  {   
	System.out.println("复数的值为：");   
   if(x!=0)   
	System.out.println(x+"+"+y+"i");  
  else   
	System.out.println(x);    
  } 
}
