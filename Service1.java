 import java.util.Scanner;
  abstract class Employee
   {
     String name,Designation;
     int age,sal;
    Scanner sc=new Scanner(System.in);
      public Employee(){
          System.out.println("Enter your name:");
         name=sc.next();
        System.out.println("Enter your age:");
         age=sc.nextInt();
        }
        public void display()
         {
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Sal:"+sal);
        System.out.println("Job:"+Designation);
         }
       public abstract void raiseSal();
          }
    final class Clerk extends Employee
     {
        
   public Clerk()
     {
     
      sal=20000;
       Designation="Clerk";
     }
    public void raiseSal()
     {
        sal=sal+(sal*10)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 10%");
      }
  }   
 final class Manager extends Employee
{
     
   public Manager()
     {
        sal=50000;
     Designation="Manager";
     }
  
    public void raiseSal()
     {
        sal=sal+(sal*20)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 20%");
      }
  } 
   final class Programmer extends Employee
   {
   
   public Programmer ()
    {
       sal=100000;
       Designation="Programmer";
     }
   
    public void raiseSal()
     {
        sal=sal+(sal*25)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 25%");
    }
      }
   public class Service1
  {
  public static void main(String[]args)
  {    
     Scanner sc=new Scanner(System.in);
     int no=0;
     int choice=0;
     boolean b=false;
     int d=0;  
      int i=0;

       Employee[] c=new Employee[100];
   
   
    do
   {
    
     System.out.println("\n 1.create\n 2.Display\n 3.Raise Sal\n 4.Exit\n Enter choice");

     choice=sc.nextInt();
    
       
    switch(choice)
     {
     case 1:   do{
                System.out.println("\n 1.Clerk \n 2.Manager \n 3.Programmer\n 4.Exit\n choose");
                d=sc.nextInt();
              
              switch(d)
                {
               case 1:     c[i]=new Clerk();
                            i++;
                             break;
                           
                case 2:    c[i]=new Manager();
                            i++;
                            
                            break;      
                    
                 case 3:
                         c[i]=new Programmer();
                           i++;
                            
                          break;
                           
                   case 4:
                    System.out.println("exiting----");
                   }   
               }while(d!=4);
                break;
                        
     case 2: try
            {
                   int j=0;
                  do
                  {
                 c[j].display();                  
                  j++;
                  }
                while(c[j]!=null);
              }
           catch(NullPointerException ne) {
             System.out.println("no records");
             break;
            }
             
     case 3:try {
           
                  int j=0;
                  do
                  {
                  c[j].raiseSal();
                   j++;
                    }
                 while(c[j]!=null);
                   
               }
             catch(NullPointerException ne)
             {
              System.out.println("no records");
               break;
              }
             
     case 4:System.out.println("exiting..");
     default:System.out.println("Invalid choice");
     }

   }
while(choice>0 && choice<4);

}
}