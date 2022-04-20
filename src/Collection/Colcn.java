package Collection;
import java.util.*;
public class Colcn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList l = new LinkedList();
        //HashSet hs = new HashSet();  no duplication of data and no order of data
        //LinkedHashSet lhs = new LinkedHashSet();  no duplication but sorted order
        //Set s = new Set();  no duplication of data
//        l.add(10);
//        l.add(30);
//        l.addFirst(true);
//        l.add("ashok");
//        l.add('k');
//        l.add(49.56);
//        l.add(3, "bera");
//        //l.clear();
//        
//        System.out.println(l);
//        Iterator i = l.iterator();
//        while(i.hasNext())
//        {
//        	System.out.println(i.next());
//        }
//        
        
       // TreeMap t = new TreeMap();  ordered plus remove duplication
        HashMap t = new HashMap();
        t.put(1, "ash");
        t.put(2, "ok");
        t.put(4, "asj");
        t.put(2, 34);
        t.put(3, true);
        
        Set s = t.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
	}

}
