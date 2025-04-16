package Set;
import java.util.TreeSet;
public class Company 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Akhila",525,50,200000,2025);
		Employee e2=new Employee("Spandana",16,60,600000,1996);
		Employee e3=new Employee("Tilak",80,45,500000,2003);
		Employee e4=new Employee("SaiRam",1,25,25000,2024);
		TreeSet<Employee> t= new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		System.out.println(t);
	}

}
