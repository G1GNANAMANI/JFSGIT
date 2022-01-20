package COLLECTIONS;
import java.util.Map;
import java.util.TreeMap;
public class HashMap {
public static void main(String[] args) {
	//gettingStarted();
	//merge();
}
	//@SuppressWarnings({ "unused", "unchecked" })
	private static void gettingStarted() {
	//@SuppressWarnings("rawtypes")
	Map dictionaryMap = (Map) new HashMap();
    dictionaryMap.put("GARGANTUAN","SOMETHING VERY BIG");
	dictionaryMap.put("AEONIAN","LASTING FOR AN IDEFINITE PERIOD OF TIME");
	dictionaryMap.put("PHILATELIST","A PERSON WHO STUDIES ABOUT STAMPS");
	dictionaryMap.put("ABCDEF",null);
// dictionaryMap.put(null,"no-worries");
	System.out.println("DICTIONARYMAP");
	System.out.println("SIZE : "+ dictionaryMap.size());
//ternary operator
	String searchResult = dictionaryMap.containsKey("GARGANTUAN") ? "FOUND!!" : " KEY NOT FOUND!!!";
	System.out.print(searchResult);
	searchResult = dictionaryMap.containsKey("SOMETHING VERY BIG") ? "FOUND VALUE !!" : "VALUE NOT FOUND !!!";
	System.out.println(searchResult);
	if (dictionaryMap.isEmpty()) {
		System.out.println("EMPTY...");
	}
	else {
		System.out.println("COLLECTION NOT EMPTY..");
	}
	dictionaryMap.clear();
	System.out.println(dictionaryMap);
	if (dictionaryMap.isEmpty()) {
		System.out.println("EMPTY");
	}
	else
	{
		System.out.println("COLLECTION NOT EMPTY...");
	}
	System.out.println("SIZE :" + dictionaryMap.size());
}


public  static void merge()
{
	TreeMap<String,Integer> treeMap = new TreeMap<String, Integer>();
	//treeMap.put("BARBIE",1);
	//treeMap.put("BARBIE",4);
	treeMap.merge("BARBIE",1,(oldvalue,newvalue) -> oldvalue + newvalue);
	treeMap.merge("BARBIE",2,(oldvalue,newvalue) -> oldvalue + newvalue);
	System.out.println(treeMap);
	
	TreeMap<String,Integer> treeMap1 = new TreeMap<String, Integer>();
	treeMap1.put("ACCOUNT", 1000);
	System.out.println(treeMap1);
	treeMap1.merge("ACCOUNT",100,(oldvalue,newvalue) -> oldvalue + newvalue);
	System.out.println(treeMap1);
	treeMap1.merge("ACCOUNT",200,(oldvalue,newvalue) -> oldvalue + newvalue);
	System.out.println(treeMap1);
}
}
