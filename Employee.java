package Set;
public class Employee implements Comparable<Employee> 
{
	String emp_Name;
    int emp_Id;
    int emp_Age;
    double emp_Sal;
    int emp_Join_Year;

    public Employee(String emp_Name, int emp_Id, int emp_Age, double emp_Sal, int emp_Join_Year)
    {
        this.emp_Name = emp_Name;
        this.emp_Id = emp_Id;
        this.emp_Age = emp_Age;
        this.emp_Sal = emp_Sal;
        this.emp_Join_Year = emp_Join_Year;
    }
    @Override
    public int compareTo(Employee o) 
    {
        if (this.emp_Sal > o.emp_Sal) 
        {
            return 1;
        } else if (this.emp_Sal < o.emp_Sal) 
        {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() 
    {
        return "Name: " + emp_Name + "\n Id : " + emp_Id + "\n Age: " + emp_Age + "\n Salary: " + emp_Sal + "\n Year of Joining: " + emp_Join_Year + "\n********************\n";
    }
}