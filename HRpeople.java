class HRpeople
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Start Testing");
		
		//Employee obj1 = new Employee("Fname", "Lname", null, "City", "State");
		//obj1.ToString();
		
		Employee obj2 = new Employee("Reddit", "Reddit", null, "Reddit Ville", "Reddit World");
		System.out.println(obj2.toString());
		
		//obj1.boss = obj2;
		//obj1.ToString();
		
		Employee obj1 = new Employee("Cortana", "Siri", obj2, "HTTP", "WWW");
		System.out.println(obj1.toString());
		
		System.out.println("Stop Testing");
	}
}

class Employee
{
	String fname;
	String lname;
	Employee boss;
	Address addr;
	
	public Employee(String fname, String lname, Employee emp, String city, String state) {
        this.fname = fname;
        this.lname = lname;
        this.boss = emp;
        addr = new Address(city, state);
     }
     
     @Override
     public String toString() {
     	if(boss != null)
  			return String.format(
     		"%s, %s, Boss: %s, %s, City: %s, State: %s"
     		, fname, lname, boss.fname, boss.lname, addr.city, addr.state);
 		else
 			return String.format(
     		"%s, %s, Boss: None, City: %s, State: %s"
     		, fname, lname, addr.city, addr.state);
     }
}

// Not how I would do it, but it helped demo an example for somebody
class Address {
	String city;
	String state;
	
	public Address(String city, String state){
		this.city = city;
		this.state = state;
	}
}
