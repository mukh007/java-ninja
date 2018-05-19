package collection;
import java.util.ArrayList;
public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> seriaNo = new ArrayList<Integer>();
		seriaNo.add(3);
		seriaNo.add(2);
		seriaNo.add(1);
		System.out.println(seriaNo);
		for(Integer i:seriaNo) {
			System.out.println(i);
			//System.out.print(i);
		}
		seriaNo.remove(0);
		//for(Integer i:Serialno) {
			System.out.println(seriaNo);
		//}
			//Sorting current ArrayList as [1,2,3]
			
			Integer temp = seriaNo.remove(0);
			//System.out.print(Serialno);
			seriaNo.add(temp);
			seriaNo.add(3);
			System.out.println(seriaNo);
			int totalno = seriaNo.size();
			System.out.println("Strength of ArraYList is" +totalno);
			Boolean k= seriaNo.contains(3);
			System.out.println(k);
			seriaNo.clear();
			System.out.println(seriaNo);
			int totalno1 = seriaNo.size();
			System.out.println("Strength of ArraYList is" +totalno1);
	}
}
