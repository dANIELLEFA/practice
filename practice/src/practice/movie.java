package practice;
import java.io.*;
import java.util.*;
public class movie 
{

	private String name;
	private String type1;
	private String type2;
	private String type3;
	private double rating;
	
	public movie(String n, String t1, String t2, String t3, double r)
	{
		this.name =n;
		this.type1 =t1;
		this.type2 =t2;
		this.type3 = t3;
		this.rating = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getType3() {
		return type3;
	}

	public void setType3(String type3) {
		this.type3 = type3;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	

}
