package lab2;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {    
   	
       ArrayList<String> names = new ArrayList<String>();

         // Test print for an empty list
         CollectionOps.print(names); System.out.println();

         // Test print for a list containing one element
         names.add("a");
         CollectionOps.print(names); System.out.println();

         // Test print for a list containing more than one element
         names.add("b");
         names.add("c");
         CollectionOps.print(names); System.out.println();
         
         // Test the return value from reverse
         CollectionOps.print(CollectionOps.reverse(names));
         System.out.println();
         // Test that reverse mutates its argument
         CollectionOps.print(names);
         System.out.println();

         // Assignment 4: Write code to test less here 
         
         
 		
         // Assignment 5: Write code to test map here
		
         
         
         
 		Comparator<Integer> intcomp = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a.compareTo(b);
			}
		};
		
		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		li1.addAll(Arrays.asList(1, 2, 3, 5, 10));
		li2.addAll(Arrays.asList(11, 12, 100, 1000, 10000));

		System.out.format("List1 < List2: %b\n", CollectionOps.less(li1, li2, intcomp));
		System.out.format("List1 > List2: %b\n", CollectionOps.less(li2, li1, intcomp));
		
		
        // Assignment 5: Write code to test filter here
		CollectionOps.print(li1);
	//	CollectionOps.print(CollectionOps.filter(new IsEvenFunctor(), li1));
		CollectionOps.print(li1);
		System.out.println();
		CollectionOps.print(li2);
	//	CollectionOps.print(CollectionOps.filter(new IsEvenFunctor(), li2));
		CollectionOps.print(li2);
		
		
         ArrayList<Person> pl = new ArrayList<>();
         pl.add(new Person("Nisse","nisse@hipnet.moc","male",23));
         pl.add(new Person("Lisa","lisa@shipnet.sea","female",67));
         pl.add(new Person("Ada","ada@jahuu.vanu","female",49));
         pl.add(new Person("Kal","karl@gotnet.vg","male",78));
         pl.add(new Person("Beda","beda@fishnet.cod","female",102));
        
         // Assignment 6: Write code using lambdas here
          
     
    }
}














