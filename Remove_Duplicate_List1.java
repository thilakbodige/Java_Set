package Set;
import java.util.*;
public class Remove_Duplicate_List1 
{
	public static void main(String[] args) 
	{
        int[] a = {1, 2, 3, 2, 4, 3, 1, 5, 5};
        LinkedHashSet<Integer> li = new LinkedHashSet<>();
        for (int i : a) 
        {
            li.add(i);
        }
        System.out.println(li);
        Object[] a1 = li.toArray();
        for (Object o : a1)
        {
            System.out.println(o);
        }
    }
}