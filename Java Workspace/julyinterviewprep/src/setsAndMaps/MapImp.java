package setsAndMaps;
import java.util.*;
public class MapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Big Basket Software -> Fruit and its quantity.
		HashMap<String,Integer> map = new HashMap<>();//Key-Value pair
		//Keys should be unique
		map.put("Mango",5);
		map.put("Apple",7);
		map.put("Bananas",9);
		map.put("Orange",10);
		System.out.println("Mangos: "+map.get("Mango"));//Pass the key and get the corresponding value
		System.out.println(map.get("Orange"));
		map.put("Mango",3);//Value will get updated
		System.out.println("Mangos: "+map.get("Mango"));
		System.out.println(map.containsKey("Mango"));
		System.out.println(map.containsKey("Kiwi"));
		System.out.println(map.keySet()); //This is a set, because keys are unique.
		System.out.println(map.values()); //This is not a set
		System.out.println(map.containsKey("Mango"));
		map.remove("Mango"); //Pass the key to delete the key-value pair
		System.out.println(map.containsKey("Mango"));
		//Iterator, 5 ways to traverse HashMap - 25mins
	}

}
