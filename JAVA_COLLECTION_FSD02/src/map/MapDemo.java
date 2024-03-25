package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("platform1", "JAVASE");
		map.put("platform1", "JAVASE");
		map.put("platform1", "JAVASE");
		map.put("platform1", "JAVASE");
		map.put("platform2", "JAVAEE");
		map.put("platform3", "JAVAME");
		System.out.println(map);
	}

}
