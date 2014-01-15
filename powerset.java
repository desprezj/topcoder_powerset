import java.util.ArrayList;
import java.util.List;


public class powerset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);// list.add(3);// list.add(4); list.add(5); 
		
		
		List<List<Integer>> ps = new ArrayList<List<Integer>>();
		  ps.add(new ArrayList<Integer>());   // add the empty set
		 
		  // for every item in the original list
		  for (Integer item : list) {
		    List<List<Integer>> newPs = new ArrayList<List<Integer>>();
		    
		    for (List<Integer> subset : ps) {
		      // copy all of the current powerset's subsets
		      newPs.add(subset);
		 
		      // plus the subsets appended with the current item
		      List<Integer> newSubset = new ArrayList<Integer>(subset);
		      newSubset.add(item);
		      newPs.add(newSubset);
		    }
		 
		    // powerset is now powerset of list.subList(0, list.indexOf(item)+1)
		    ps = newPs;
		  }
		
		
		for(int i=0;i< ps.size();i++){
			System.out.print("{");
			for(int j=0; j< ps.get(i).size();j++){
				System.out.print(ps.get(i).get(j) +",");
			}
			System.out.print("} ,");
		}
	}

}
