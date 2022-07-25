import java.util.*;
public class alltypecollections{

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		TreeSet<String> ts=new TreeSet<>();
		LinkedHashSet<String> lh=new LinkedHashSet<>();
		hs.add("Beta");
		hs.add("Charlie");
		hs.add("Alpha");
		hs.add("Alpha");
		hs.add("Alpha");
		hs.add(null);
		ts.add("Alpha");
		ts.add("Charlie");
		ts.add("Beta");
		//ts.add(null);
		lh.add("Charlie");
		lh.add("Alpha");
		lh.add("Beta");
		lh.add(null);
		System.out.println("HashSet elements :"+hs);
		System.out.println("TreeSet elements :"+ts);
		System.out.println("LinkedHashSet elements :"+lh);
	}

}