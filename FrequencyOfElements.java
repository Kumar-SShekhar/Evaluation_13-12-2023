import java.util.*;
public class FrequencyOfElements
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> al= Arrays.asList(4,2,8,3,1,1,4,4,6,6,6);
		
		LinkedHashMap <Integer, Integer> lhm = new LinkedHashMap<>();
		for(int n: al){
		  lhm.put(n,lhm.getOrDefault(n,0)+1);  
		}
		Collections.sort(al ,(a,b) -> lhm.get(b) - lhm.get(a));
		System.out.println(al);

	}

}
