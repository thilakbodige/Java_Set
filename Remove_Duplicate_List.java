package Set;
import java.util.*;
public class Remove_Duplicate_List 
{
	public static void main(String[] args)
	{
	  int a[]= {1,2,1,3,1,4,2,7,4,3}; 
	  LinkedHashSet<Integer>l=new LinkedHashSet<>();
	  for(Integer integer:a)
	  {
		  l.add(integer);
	  }
	  System.out.println(l);
	  }
	}
