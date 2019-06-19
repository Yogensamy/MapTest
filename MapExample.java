import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class MapExample {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, String> mapValues = new HashMap<>();
		mapValues.put("C", "cat");
		mapValues.put("B", "bat");
		mapValues.put("A", "apple");
		
		List<String> list = new ArrayList<>();
		list.add("D");
		list.add("C");
		list.add("A");
		
		System.out.println("Sorting before..."+mapValues);
		
		Map<String, String> Sorted = mapValues.entrySet().stream().
				sorted(Map.Entry.comparingByKey()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		System.out.println("Sorted..."+Sorted);
		
		List<String> sortList = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortList);
		
		//Map<String, String> sorted = mapValues .entrySet() .stream() .sorted(java.util.Collections.reverseOrder(Map.Entry.comparingByKey())) .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap<String,String>::new));

	}

}
