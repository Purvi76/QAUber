import java.util.ArrayList;

public class addSalaryHMWK4 {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList <Employee>();
		Employee e1 = new Employee("Geta",100,1);
		Employee e2 = new Employee("Joe",500,2);
        Employee e3 = new Employee("Mita",200,3);
	    Employee e4 = new Employee("Nikita",300,4);
		Employee e5 = new Employee("Koel",400,5);
		Employee e6 = new Employee("Jill",500,6);
		Employee e7 = new Employee("Avani",500,7);
		Employee e8 = new Employee("Kian",200,8);
		Employee e9 = new Employee("Zian",600,9);
		Employee e10 = new Employee("Jack",800,10);
		
		Manager m1 = new Manager("Ziang",3000,2,500);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
	    employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(m1);
		
		double totalSalary = 0;
		
		for(Employee e : employees){
			totalSalary = totalSalary + e.getSalary();
			
		}
		System.out.println(totalSalary);
		
	}

}
