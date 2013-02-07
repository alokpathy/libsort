package us.aaronweiss.libsort;

/**
 * An object that can be sorted using libsort.
 * 
 * @author Aaron Weiss
 * @version 1.0
 * @since 2/6/13
 */
public interface Sortable {
	/**
	 * Gets the value to use for sorting.
	 * 
	 * @return the sorting value
	 */
	public int sortValue();
}
