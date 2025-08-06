interface myInter1

{

     public void display();
     static void display2()    //Static block
	{
	  System.out.println("inside the static method");
	}
 
     default void display1()

	{

	   System.out.println("Default method from interface");

	}

}
 
interface myInter2

{

    default void display1()

	{

	 System.out.println("Default method from interface2");

	}

}
 
 
class sample implements myInter1,myInter2

{

    @Override

     public void display()

	{

	  System.out.println("display here");

	}
 
    public void display1()

	{

	   System.out.println("inside default");

	   myInter2.super.display1();   //**note

	   myInter1.super.display1();   //**note

	}
 
}
 
class demointerface
{

    public static void main(String asd[])

	{

	   sample obj=new sample();

	   obj.display();

	   obj.display1();
           myInter1.display2();

	} 

}
 