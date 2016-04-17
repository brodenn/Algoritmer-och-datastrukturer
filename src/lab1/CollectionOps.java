package lab1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author
 */
public class CollectionOps {

	/**
	 * Prints a collection
	 * 
	 * @param l
	 *            collection of some type (elements must have .toString)
	 */
	public static <T> void print(Collection<T> l) {
		// StringBuilder used for iterative building of string
		StringBuilder sB = new StringBuilder();
		for (T element : l) {
			if (sB.length() > 0)
				sB.append(",");
			sB.append(element.toString());
		}

		System.out.format("[%s]", sB);
	}

	/**
	 * Reverses the order of elements in a list
	 * Puts the elements of a list in reverse order
	 * 
	 * @param l
	 *            list that will get reversed
	 * @return l (the reversed list)
	 */
	public static <T> List<T> reverse(List<T> l) {

		// Swap places in list for pairs ( skips the center element if odd size)
		for (int a = 0; a < l.size() / 2; a++) {
			// Index for element at the end of the list
			int b = l.size() - 1 - a;

			// Swap places in list for element i and j
			T temp = l.get(a);
			l.set(b, l.get(b));
			l.set(b, temp);
		}

		// returns list
		return l;
	}

	/**
	 * @param c1
	 * @param c2
	 * @param comp
	 * @return true if all elms of c1 is smaller than all of c2
	 */
	public static <T> boolean less(Collection<T> c1, Collection<T> c2, Comparator<T> comp) {
		// If max of c1 is less than min of c2 then all elms of c1 is strictly
		// less than all of c2
		return comp.compare(Collections.max(c1, comp), Collections.min(c2, comp)) < 0;
	}

	// Example
	public static <T, R> Collection<R> map(UnaryOp<T, R> functor, Collection<T> l) {
		// Determine the dynamic type of the collection
		Class<? extends Collection> collections = l.getClass();
		try {
			// Create an object of the same dynamic type as c
			Collection<R> result = collections.newInstance();
			// Copy the elements and apply op to them
			for (T x : l)
				result.add(functor.op(x));
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Filter a collection
	 * 
	 * @param functor
	 *            logic for what stays and what goes
	 * @param c
	 *           collection that will get filtered
	 * @return a new collection with the filtered elements
	 */
	public static <T> Collection<T> filter(UnaryPred<T> functor, Collection<T> c) {
		// Determine the dynamic type of the collection
		Class<? extends Collection> cls = c.getClass();
		try {
			// Create an object of the same dynamic type as c
			Collection<T> result = cls.newInstance();
			// Copy only the elements who passes the filter
			for (T x : c) {
				if (functor.pred(x))
					result.add(x);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}