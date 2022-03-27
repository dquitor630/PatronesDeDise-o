package activity1;

import java.util.ArrayList;
import java.util.List;

public enum SingletonDatabase {
	INSTANCE;

	List<Integer> numericList = new ArrayList<>();
	List<String> strList = new ArrayList<>();

	private SingletonDatabase() {
		numericList.add(1);
		numericList.add(2);
		numericList.add(3);
		strList.add("a");
		strList.add("b");
		strList.add("c");
	}

	public List<Integer> queryAllNumbers() {
		return numericList;
	}

	public List<String> queryAllNames() {
		return strList;
	}
}
