import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Metodes_Ex8_9 {

	public static class Methods {

		// Method to remove cars with an asked displacement
		public static boolean removeCars(SortedMap<String, Cotxe> map, int cilindrada) {
			ArrayList<String> clau = new ArrayList<String>();
			for (Entry<String, Cotxe> entry : map.entrySet()) {
				if (entry.getValue().getCilindrada() >= cilindrada)
					clau.add(entry.getKey());
			}
			if (clau.size() != 0) {
				for (String st : clau) {
					map.remove(st);
				}
				return true;
			} else {
				return false;
			}
		}
		// Method to get cars with a certain cilindres
		public static ArrayList<Cotxe> getCotxesPerCilindres(SortedMap<String, Cotxe> map, int cilindres) {
			ArrayList<Cotxe> llistaCotxesAmbXCilindres = new ArrayList<Cotxe>();
			for (Entry<String, Cotxe> entry : map.entrySet()) {
				if (entry.getValue().getCilindres() == cilindres) 
					llistaCotxesAmbXCilindres.add(entry.getValue());
			}
			if (!llistaCotxesAmbXCilindres.isEmpty())
				return llistaCotxesAmbXCilindres;
			else 
				return null;
		}
		
		// Method that returns a list of cars depending on its mark
		public static SortedMap<String, ArrayList<Cotxe>> cotxesPerMarca(SortedMap<String, Cotxe> map) {
			ArrayList<String> llistaMarques = new ArrayList<String>();
			for (Entry<String, Cotxe> entry : map.entrySet()) {
				Cotxe marca = entry.getValue();
				if (!llistaMarques.contains(marca.getMarca()))
					llistaMarques.add(marca.getMarca());
			}
			SortedMap<String, ArrayList<Cotxe>> mapaCotxes = new TreeMap<String, ArrayList<Cotxe>>();
			for (int i = 0; i < llistaMarques.size(); i++) {
				String marca = llistaMarques.get(i);
				ArrayList<Cotxe> llistatCotxes = new ArrayList<Cotxe>();
				for (Entry<String, Cotxe> cotxe : map.entrySet()) {
					if (cotxe.getValue().getMarca() == marca)
						llistatCotxes.add(cotxe.getValue());
				}
				mapaCotxes.put(marca, llistatCotxes);
			}
			return mapaCotxes;
		}
	}

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

		// Use the remove method
		System.out.println(Methods.removeCars(map, 2500));
		for (Entry<String, Cotxe> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		// Use the getCotxesPerCilindres Method
		System.out.println("---------------------------------");
		System.out.println(Methods.getCotxesPerCilindres(map, 4));
		
		// Use the cotxesPerMarca Method
		System.out.println("---------------------------------");
		System.out.println(Methods.cotxesPerMarca(map));
	}
}
