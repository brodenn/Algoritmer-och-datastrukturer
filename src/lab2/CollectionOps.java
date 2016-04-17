package lab2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOps {

	public static <T> void print(Collection<T> l) {
		StringBuilder sB = new StringBuilder();
		for (T element : l) {
			if (sB.length() > 0)
				sB.append(",");
			sB.append(element.toString());
		}

		System.out.format("[%s]", sB);
	}

	public static <T> List<T> reverse(List<T> l) {

		Collections.reverse(l);
		return l;
	}

	public static <T, R> List<R> map(Function<T, R> f, List<T> l) {
		List<R> result = new ArrayList<R>(l.size());
		for (T x : l)
			result.add(f.apply(x));
		return result;
	}

	public static <T> boolean less(Collection<T> c1, Collection<T> c2, Comparator<T> comp) {
		return comp.compare(Collections.max(c1, comp), Collections.min(c2, comp)) < 0;
	}

	// Example
	public static <T, R> Collection<R> map(Function<T, R> f, Collection<T> c) {
		// Determine the dynamic type of the collection
		Class<? extends Collection> cls = c.getClass();
		try {
			// Create an object of the same dynamic type as c
			Collection<R> result = (Collection<R>) cls.newInstance();
			// type.cast(type.newInstance());
			// Copy the elements and apply op to them
			for (T x : c)
				result.add(f.apply(x));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <T> Collection<T> filter(Predicate<T> functor, Collection<T> c) {
		Class<? extends Collection> cls = c.getClass();
		try {
			Collection<T> result = cls.newInstance();
			for (T x : c) {
				if (functor.test(x))
					result.add(x);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}