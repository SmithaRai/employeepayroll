package com.bridgelabz.employeepayroll;
 import java.util.*;
 import java.io.*;
 
public class EmployeePayRoll implements Serializable {
	private  int id;
	private  String name;
	private  double salary;
		
    public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	static List<EmployeePayRoll> list = new ArrayList<>();

	
     public EmployeePayRoll() {
		// TODO Auto-generated constructor stub
	}
	public EmployeePayRoll(int id , String name , double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name ;
		this.salary = salary ;
	}
	
	public  void getdata() throws Exception, IOException
    {
	 Scanner in = new Scanner(System.in);
	 
	 System.out.println("ENTER NO.OF ENTRIES TO BE ENTERED : ");
	 int n = in.nextInt();
	 
	     for(int i = 0 ; i < n; i++ )
	     {  System.out.println("ENTER EMPLOYEE ID : ");
	       id = in.nextInt();
	       System.out.println("ENTER EMPLOYEE NAME : ");
	       name = in.next();
	       System.out.println("ENTER EMPLOYEE SALARY : ");
	       salary = in.nextDouble(); 
	       
	      list.add(new EmployeePayRoll(id , name ,salary));
	      
	     }
     }
	
   public void display()
   {
      for(int i = 0 ; i < list.size() ; i++ )
      { 
    	System.out.println("employee id : "+list.get(i).getId());
	    System.out.println("employee name : "+list.get(i).getName());
        System.out.println("employee salary : "+list.get(i).getSalary());
        System.out.println(" ");
      }
   }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("------------***EMPLOYEE PAY ROLL USING FILE HANDLING***-----------------");
		
		Scanner in = new Scanner(System.in);	
		ObjectOutputStream oos = null ;
		EmployeePayRoll employee = new EmployeePayRoll();
	
		int a ;
		do {
			
		    System.out.println("******enter your choice******** ");
		    System.out.println("1.INSERT \n 2.DISPLAY ");
		    int choice = in.nextInt();
		   
		         switch(choice)
		              {
			              case 1:
				                employee.getdata();
				                break;
				 
			              case 2:
				                employee.display();
				                break;
				 
		                  default :
		    	               System.out.println("invalid input");
		               }
		         
	        System.out.println("enter 4 to continue : ");
	        a = in.nextInt();
	        
	     }while( a == 4);
	
	}
  }

