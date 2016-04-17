package lab2;

/**
 * Generic singlebuffer
 * 
 * @author 
 * @param <T>
 */
public class SingleBuffer<T> {

	private T element = null;

	public boolean put(T value) {

		if (!is_empty())
			return false;

		element = value;
		return true;
	}

	public T get() {
		T temp = element;
		element = null;
		return temp;
	}

	private boolean is_empty() {
		return element == null;
	}
}