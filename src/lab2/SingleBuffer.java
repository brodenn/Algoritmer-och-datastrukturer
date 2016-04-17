package lab2;

/**
 * Generic singlebuffer
 * 
 * @author 
 * @param <T>
 */
public class SingleBuffer<T> {

	private T element = null;

	/**
	 * Adds a value to the buffer ( if empty )
	 * 
	 * @param value
	 * @return true if successful, false if buffer already full
	 */
	public boolean put(T value) {

		if (!is_empty())
			return false;

		element = value;
		return true;
	}

	/**
	 * Returns and removes element from the buffer
	 * 
	 * @return null if empty, else the element currently in the buffer
	 */
	public T get() {
		T temp = element;
		element = null;
		return temp;
	}

	/**
	 * @return true if buffer is empty, else false
	 */
	private boolean is_empty() {
		return element == null;
	}
}