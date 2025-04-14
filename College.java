package Set;
import java.util.TreeSet;
public class College 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Spandana", 21, 1, "C", "Female");
		Student s2 = new Student("SaiRam", 24, 2, "A", "Male");
		Student s3 = new Student("Thilak", 25, 3, "B", "Male");
		Student s4 = new Student("Akhila", 22, 4, "D", "FeMale");
		TreeSet<Student> t= new TreeSet<>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		System.out.println("Students sorted by Alphabet Order using Comparator:");
		System.out.print(t);
		 }

	}
