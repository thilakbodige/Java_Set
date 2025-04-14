package Set;
import java.util.Comparator;
class Student implements Comparable<Student> 
{
    String Std_Name;
    int Std_Age;
    int Std_RollNo;
    String Std_Grade;
    String Std_Gender;

    public Student(String std_Name, int std_Age, int std_RollNo, String std_Grade, String std_Gender) 
    {
        Std_Name = std_Name;
        Std_Age = std_Age;
        Std_RollNo = std_RollNo;
        Std_Grade = std_Grade;
        Std_Gender = std_Gender;
    }

    @Override
    public String toString()
    {
        return "Name: " + Std_Name + ", Age: " + Std_Age + ", Roll No: " + Std_RollNo + ", Grade: " + Std_Grade + ", Gender: " + Std_Gender + "\n";
    }
    public int compareTo(Student o) 
    {
        return this.Std_Name.compareTo(o.Std_Name);
    }
}

class SortByRollNumber implements Comparator<Student> 
{
    @Override
    public int compare(Student s1, Student s2) 
    {
        return Integer.compare(s1.Std_RollNo, s2.Std_RollNo);
    }
}