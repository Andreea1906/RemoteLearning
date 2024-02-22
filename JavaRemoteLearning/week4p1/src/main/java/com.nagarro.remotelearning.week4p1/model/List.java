package week4p1.src.main.java;

public interface List<T> {

	void add(T element);
	
	T get(int position);
	
	boolean contains(T element);
	
	boolean containsAll(List<T> foreignList);
	
	int size();
}
