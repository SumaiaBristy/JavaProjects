package comm.example;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String args[])
	{
		//treeset sorted value store krbe and  duplicate value nt allwed
		
		//hashset unordered
		Set set=new HashSet(); //treeset derive class jeta set k extend krtse,set root or interface and set hcche Set er refenece object
		int i=10;
		//set.add(i); //set.add(new Integer(i)) //here automaticall primitive type i is converted to wrapper type by the jvm that is called autoboxing process
		set.add(i);
		set.add(10.20f);
	//	set.add(new Employee());
		set.add("hello");
		//set alwyas hold object..if we assign primitive type like an integer value then it is automatically converted into wrapper type..this process is called autoboxing
		System.out.println(set);
	
	//jdk 1.8 use krle sudhumatro same type er object send krte prbo sudhu
	}
}
