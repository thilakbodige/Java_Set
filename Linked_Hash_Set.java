package Set;
import java.util.*;
public class Linked_Hash_Set
{
	public static void main(String[] args) 
	{
	  LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
	  lhs.add(10);
	  lhs.add(30);
	  lhs.add(20);
	  lhs.add(50);
	  System.out.println(lhs);
	  lhs.add(30);
	  lhs.add(100);
	  lhs.add(10);
	  System.out.println(lhs);

	}

}
