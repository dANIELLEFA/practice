package practice;
import java.io.*;
import java.util.*;
public class rating implements Comparator<movie>
{

	@Override
	public int compare(movie m1, movie m2) {
		if(m1.getRating() < m2.getRating())
		{
			return 1;
		}
		if(m1.getRating() > m2.getRating())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
