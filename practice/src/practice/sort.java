package practice;
import java.io.*;
import java.util.*;
public class sort 
{
	static ArrayList<movie> list = new ArrayList<movie>();
	static ArrayList<movie> list2 = new ArrayList<movie>();

	public static void main(String[] args) 
	{
		load();
		
		og();
		name();
		rating();

	}
	public static void load()
	{
		
		list.add(new movie("Awakens", "adventure","fantasy", "Drama", 3.3));
		list.add(new movie("wars", "adventure","Fantasy", "drama", 2.0));
		list.add(new movie("mAn", "drama","Comedy", "drAma", 1.7));
		
		
		
		
	}
	public static void og()
	{
		for(int i = 0; i < list.size(); i++)
		{
			
			list2.add(new movie(list.get(i).getName().toLowerCase(),list.get(i).getType1().toLowerCase(),list.get(i).getType2().toLowerCase(),list.get(i).getType3().toLowerCase(),list.get(i).getRating()));
			
		}
	}
	public static void name()
	{
		
		System.out.println("Sorted names");
		name f = new name();
		Collections.sort(list2, f);
		for(movie m: list2)
		{
			System.out.println(m.getName().substring(0,1).toUpperCase()+ m.getName().substring(1,m.getName().length()));
			
		}
		
		
	}
	public static void rating()
	{
		
		System.out.println("Rating");
		
		rating g = new rating();
		Collections.sort(list2, g);
		for(movie m: list2)
		{
			System.out.println(m.getRating());
			
		}
	}


}
