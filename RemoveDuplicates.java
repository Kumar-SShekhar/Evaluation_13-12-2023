
import java.util.*;
public class RemoveDuplicates
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList <Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(4);
		System.out.println(al);
		HashSet <Integer> hs = new HashSet<>(al);
		al.clear();
		al.addAll(hs);
		System.out.println(al);


	}
}
