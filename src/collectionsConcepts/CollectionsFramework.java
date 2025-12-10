package collectionsConcepts;

public class CollectionsFramework {
	
	public static void main(String[] args) {
		
		//Array: Array is a non-primitive datatype. Array can store multiple values with similar datatypes together at one place.
		
		String[] empNames = new String[3];
		empNames[0] = "Bharath Reddy";
		empNames[1] = "Mayuri";
		empNames[2] = "Ravi";

		System.out.println(empNames.length);
		
		/**********CHALLENGES WITH ARRAYS**********/
		
		//1. Fixed Size: Once the array is created, we cannot change its size.
		//2. Homogeneous Data: Arrays can only store elements of the same datatype.
		//3. An array follows static memory allocation, and it can consume memory at the very beginning itself.
		//4. Array won't allow modifications to structure during runtime.
		
		/**********COLLECTIONS FRAMEWORK**********/
		
		//Benefits of Collections Framework over Arrays:
		
		//1. Dynamic Size: Collections can grow and shrink in size as needed.
		//2. Heterogeneous Data: Collections can store elements of different datatypes together.
		//3. Collections follow dynamic memory allocation, and memory is allocated as needed during runtime.
		//4. Collections allow modifications to structure during runtime.
		
		//Major 3  categories of collections that we are going to use in our day-to-day automation life cycle.
		
		//1. List ==> ArrayList, LinkedList
		//   List can store multiple values with similar datatypes together at one place dynamically.
		//   List allows duplicate values.
		//   List follows dynamic memory allocation.
		//   List allows modifications to structure during runtime.		
		
		//2. Set ==> HashSet, LinkedHashSet, TreeSet
		//   Set can store multiple values with similar datatypes together at one place dynamically.
		//   Set won't allow duplicate values.
		//   Set follows dynamic memory allocation.
		//   Set allows modifications to structure during runtime.	
				
		//3. Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
		//   Map can store multiple values with different datatypes together in key-value pairs at one place dynamically.
		//   Map won't allow duplicate keys but allows duplicate values.
		//   Map follows dynamic memory allocation.
		//   Map allows modifications to structure during runtime.
		
		

	}

}
