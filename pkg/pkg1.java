package pkg;
public class pkg1{
int length,breadth;
  
//Set Constructor as public so that other classes can also use constructors.
public pkg1()
{	
System.out.println("Default Constructor Called");
}

public pkg1(int l,int b){
length=l;
breadth=b;
System.out.println("Parameterized Constructor Called");
}
//Normal Method with the same name as that of a class
public void pkg1(int l,int b){
System.out.println("This is a Normal Method with the same name as a Parameterized Constructor");
length=l;
breadth=b;
}

public void display(){
System.out.println(length+" "+breadth);
}

public void add(int l,int r){
length+=l;
breadth+=r;
}
}
