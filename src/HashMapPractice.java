import java.util.HashMap;
import java.util.Map;

/**
 * @author no_char
 * @version December 11th, 2018.
 *  
 * From question 1 on practice final of CS143.
 */
public class HashMapPractice {

    @SuppressWarnings("javadoc")
    public static void main(String[] args) {
	HashMap<Integer,String> intsToStrings = new HashMap<Integer,String>();
	intsToStrings.put(42,"Marty");
	intsToStrings.put(81, "Sue");
	intsToStrings.put(17, "Ed");
	intsToStrings.put(31, "Dave");
	intsToStrings.put(56, "Ed");
	intsToStrings.put(3, "Marty");
	intsToStrings.put(29, "Ed");
	
//	HashMap<String, Integer> hm1 = new HashMap<>();
//	System.out.println("Current Mappings: " + hm1.toString());
//	System.out.println("Size: " + hm1.size());
//	hm1.put("one", 1);
//	hm1.put("two", 2);
//	
//	for(Map.Entry<String, Integer> mapping : hm1.entrySet()) {
//	    System.out.println("current mapped pair: [k]" + mapping.getKey() + " [v]" + mapping.getValue());
//	}
//	
//	Object hm2 = hm1.clone();
//	System.out.println("hm2: " + hm2.toString());
	
	HashMapPractice hmp = new HashMapPractice();
	System.out.println("reverse --> " + hmp.reverse(intsToStrings));
    }
    
    /**
     * @param intsToStrings - A set of mappings of Integers <i>to</i> Strings
     * @return - Returns a new HashMap with the previous keys now the values and
     * the old values as the new keys.
     */
    public HashMap<String,Integer> reverse(HashMap<Integer,String> intsToStrings){
	HashMap<String,Integer> stringsToInts = new HashMap<String,Integer>();
	System.out.println("forwards");
	for(Map.Entry<Integer, String> mapping : intsToStrings.entrySet()) {
	    System.out.println(mapping.getKey() + " = " + mapping.getValue());
	    stringsToInts.put(mapping.getValue(), mapping.getKey());
	}
	return stringsToInts;
    }
}