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
		CollectionOps.print(names);
		System.out.println();

		// Test print for a list containing one element
		names.add("a");
		CollectionOps.print(names);
		System.out.println();

		// Test print for a list containing more than one element
		names.add("b");
		names.add("c");
		CollectionOps.print(names);
		System.out.println();

		// Test the return value from reverse
		CollectionOps.print(CollectionOps.reverse(names));
		System.out.println();
		// Test that reverse mutates its argument
		CollectionOps.print(names);
		System.out.println();

		// Assignment 4: Write code to test less here

		System.out.println();
		System.out.println("less: ");
		IntegerComparator intcomp = new IntegerComparator();
		StringComparator stringcomp = new StringComparator();

		ArrayList<Integer> li1 = new ArrayList<Integer>();
		li1.add(4);
		li1.add(2);
		li1.add(5);
		li1.add(1);
		li1.add(3);
		CollectionOps.print(li1);
		System.out.println();

		ArrayList<Integer> li2 = new ArrayList<Integer>();
		li2.add(8);
		li2.add(6);
		li2.add(7);
		li2.add(9);
		CollectionOps.print(li2);
		System.out.println();

		ArrayList<Integer> li3 = new ArrayList<Integer>();
		li3.add(97);
		li3.add(5);
		li3.add(123);
		li3.add(18);
		CollectionOps.print(li3);
		System.out.println();

		ArrayList<String> johanneberg = new ArrayList<String>();
		johanneberg.add("HC2");
		johanneberg.add("ED");
		johanneberg.add("HC3");
		CollectionOps.print(johanneberg);
		System.out.println();

		List<String> lindholmen = new ArrayList<String>();
		lindholmen.add("Saga");
		lindholmen.add("Svea");
		lindholmen.add("Jupiter");
		CollectionOps.print(lindholmen);
		System.out.println();

		System.out.println(CollectionOps.less(li1, li2, intcomp));
		System.out.println(CollectionOps.less(li1, li3, intcomp));
		System.out.println(CollectionOps.less(johanneberg, lindholmen, stringcomp));

		// Assignment 5: Write code to test map here

		Collection<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(-42);
		l1.add(88);
		l1.add(19);
		l1.add(-37);
		l1.add(0);
		l1.add(18);
		// Collection<Integer> l2 = CollectionOps.map(new Sign(), l1); //Förstår
		// inte vad som är problemet
		System.out.println();
		System.out.println("map: ");
		// CollectionOps.print(l2);

		// Assignment 5: Write code to test filter here
		Collection<Integer> l3 = new ArrayList<Integer>();
		l3.add(3);
		l3.add(-42);
		l3.add(88);
		l3.add(19);
		l3.add(-37);
		l3.add(0);
		l3.add(18);
		Collection<Integer> l4 = CollectionOps.filter(new IsEven(), l3);
		System.out.println();
		System.out.println("filter: ");
		CollectionOps.print(l4);
		System.out.println();

		ArrayList<Person> pl = new ArrayList<>();
		pl.add(new Person("Nisse", "nisse@hipnet.moc", "male", 23));
		pl.add(new Person("Lisa", "lisa@shipnet.sea", "female", 67));
		pl.add(new Person("Ada", "ada@jahuu.vanu", "female", 49));
		pl.add(new Person("Kal", "karl@gotnet.vg", "male", 78));
		pl.add(new Person("Beda", "beda@fishnet.cod", "female", 102));

		// Assignment 6: Write code using lambdas here

		ArrayList<String> oldWomenEmail = new ArrayList<>();
		CollectionOps.map(x -> {
			if (x.getAge() >= 65 && x.getGender() == "female")
				return oldWomenEmail.add(x.getEmail());
			else
				return null;
		} , pl);
		System.out.println("lamda: ");
		CollectionOps.print(oldWomenEmail);

	}
}
