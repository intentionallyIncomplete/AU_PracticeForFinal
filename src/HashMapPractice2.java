import java.util.HashMap;
import java.util.Map;

/**
 * @author no_char
 * @version December 11th, 2018.
 */
public class HashMapPractice2 {
    
    @SuppressWarnings("javadoc")
    public static void main(String[] args) {
	Map<String,Integer> m1 = new HashMap<String,Integer>();
	Map<String, Integer> m2 = new HashMap<String,Integer>();
	
	m1.put("Janet", 87);
	m1.put("Logan", 62);
	m1.put("Whitaker", 46);
	m1.put("Alyssa", 100);
	m1.put("Stefani", 80);
	m1.put("Jeff", 88);
	m1.put("Kim", 52);
	m1.put("Sylvia", 95);
	
	m2.put("Logan", 62);
	m2.put("Kim", 52);
	m2.put("Whitaker", 52);
	m2.put("Jeff", 88);
	m2.put("Stefani", 80);
	m2.put("Brian", 60);
	m2.put("Lisa", 53);
	m2.put("Sylvia", 87);
	
	HashMapPractice2 hmp2 = new HashMapPractice2();
	System.out.println("intersect: " + hmp2.intersect(m1,m2));
    }

    /**
     * @param m1 - A Map with pairs from Strings to Integers.
     * @param m2 - A Map with pairs from Strings to Integers with different and same
     * values as m1.
     * @return - Returns a new HashMap of keys and values that are "intersections" (a.k.a
     * duplicates) from m1 and m2
     */
    public Map<String,Integer> intersect(Map<String,Integer> m1, Map<String,Integer> m2){
	Map<String,Integer> m3 = new HashMap<String,Integer>();
	
	for(Map.Entry<String,Integer> p1 : m1.entrySet()) {
	    for(Map.Entry<String,Integer> p2 : m2.entrySet()) {
		if(p2.getKey().equalsIgnoreCase(p1.getKey())) {
		    if(p2.getValue() == p1.getValue()) {
			m3.put(p2.getKey(), p2.getValue());
		    }
		}
	    }
	}
	
	return m3;
    }
}
