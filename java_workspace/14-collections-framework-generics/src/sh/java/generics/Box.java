package sh.java.generics;

public class Box<T> {
	private T[] elems;
	private int index;
	
	public Box() {
		this.elems = (T[]) new Object[16];
	}
	
	public void add(T t) {
		this.elems[index++] = t;
	}
	
	public T get(int index) {
		return this.elems[index];
	}

	public int size() {
		return this.index;
	}

	public int indexOf(T t) {
		
		for(int i = 0; i < index; i++) {
			// 반복문을 통해 elems배열에서 T를 검색해서 찾으면 해당 인덱스 반환
			if(this.elems[i].equals(t)) {
				return i;
			}
			
		}
		// 못 찾으면 -1 반환
		return -1;
		
	}
	
	
}
