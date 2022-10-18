package sh.java.collections.list;

import java.util.Comparator;

public class StudentNameAscComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// String#compareTo
		return o1.getName().compareTo(o2.getName());
	}

	
}
