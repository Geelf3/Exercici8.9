import java.util.SortedMap;
import java.util.TreeMap;

public class Metodes_Ex8_9 {
	
	public static void main(String[] args) {
		// 1: Create an object who uses methods of SortedMap.
		SortedMap<String, Cotxe> map = new TreeMap<String, Cotxe>();
		
		// 2: fill the objects.
		map.put(new String("1234 AAA"), new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		map.put(new String("2321 BBB"), new Cotxe("Seat", "Ibiza", 1600, 4));
		map.put(new String("8232 FFF"), new Cotxe("Ford", "Focus", 2000, 4));
		map.put(new String("3311 FFF"), new Cotxe("Ford", "Mondeo", 2200, 4));
		map.put(new String("9381 LLL"), new Cotxe("Seat", "Leon", 1600, 4));
		map.put(new String("B 9011 XC"), new Cotxe("Hyundai", "Atos", 1500, 3));
		map.put(new String("9234 BHG"), new Cotxe("Hyundai", "Santa Fe", 3000, 6));
		map.put(new String("9216 CKK"), new Cotxe("Hyundai", "Accent", 2000, 4));
	}
		
	public static class Methods {
		public boolean RemoveCars() {
			
			return false;
		}
	}
}
