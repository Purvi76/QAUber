
public class Manager extends Employee{
	private double bonus;
	
	 public Manager(String name,double salary,int employeeID,double bonus){
		 super(name,salary,employeeID);
		 this.bonus = bonus;
		 
	 }
       public double getSalary(){
    	   return super.getSalary() + bonus;
    	   
       }
}
