package Set;
import java.util.*;

public class TreeSet_Sorting 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(2);
        t.add(1);
        t.add(9);
        Integer num1 = 2;
        Integer num2 = 10;
        int a = num1.compareTo(num2);
        if (a< 0) 
        {
         System.out.println(num1+" TO from compare "+num2);
        } 
        else if (a > 0)
        {
            System.out.println(num1+num2);
        } 
        else 
        {
            System.out.println(num1+num2);
        }

        System.out.println(t);
    }
}
