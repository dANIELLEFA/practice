package practice;
import java.io.*;
import java.util.*;
public class name implements Comparator<movie>
{

	public int compare(movie m1,movie m2) {
		return m1.getName().compareTo(m2.getName());
	}

	

}
