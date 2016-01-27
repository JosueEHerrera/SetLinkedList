

/**
 * @author Josue Herrera
 *
 */

public class SetRegistry { 
	
	 public static void main(String[] args) {
		 SetRegistry sr = new SetRegistry();
		 sr.run();		
	 }
	 
	 public void run(){
		 partOne();
		 partTwo();
	 }
	 
	 /*
	  * Show off the Methods of Contain, Remove, AddElement, 
	  * Size and toString by printing the List.
	  */
	 public void partOne(){
		 Set setA = new Set();
		 Set setB = new Set();
		 Set setC = new Set();
		 System.out.printf("%20s \n","--Part One--");
		 System.out.println();
		 setA.add(1); setB.add(3);
		 setA.add("Hello"); setB.add(4);
		 setA.add(5); setB.add(5);
		 setA.add(7); 
		 System.out.println("Contents of Set A:"+setA+ "\n Size: " + setA.size());
		 System.out.println("Contents of Set B:"+setB+"\n Size: " + setB.size());
		 System.out.println("Contents of Set C:"+setC+"\n Size: " + setC.size());
		 System.out.println("\nDoes Set A contain (1): " + setA.contain(1));
		 System.out.println("Is Set A a subset of Set A: "+setA.subsetOf(setB));
		 System.out.println("Is Set A a equal to Set A: "+setA.isEqual(setB));
		 System.out.println("\nAdding a new Element to Set A: " + setA.add(9));
		 System.out.println("Contents of Set A:"+setA);
		 System.out.println("Removing a new Element to Set A: " + setA.remove(5));
		 System.out.println("Contents of Set A:"+setA);
		 
	 }
	 
	 public void partTwo(){
		 System.out.println();
		 System.out.printf("%20s \n","--Part Two--");
		 case1(); case2();
		 case3(); case4();
		 case5();
	 }
	 
	 public void baseCases(Set setA,Set setB){
		 System.out.println("Contents of Set A:"+setA);
		 System.out.println("Contents of Set B:"+setB);
		 System.out.println("Is Set A a subset of Set B: "+setA.subsetOf(setB));
		 System.out.println("Set A Union Set B: " + setA.union(setB));
		 System.out.println("Set A Intersection Set B: " + setA.intersection(setB));
		 System.out.println("Set A Complement Set B: " + setA.complement(setB));
		 System.out.println();
	 }
	 public void case1(){
		 Set setA = new Set();
		 Set setB = new Set();
		 System.out.printf("%19s \n","--Case 1--");
		 setA.add(1); setB.add(2);
		 setA.add(2); setB.add(1);
		 setA.add(3); setB.add(3);
		 baseCases(setA,setB);
		 
	 }
	 public void case2(){
		 Set setA = new Set();
		 Set setB = new Set();
		 System.out.printf("%19s \n","--Case 2--");
		 setA.add(1);
		 setB.add(1);
		 setB.add(2); 
		 baseCases(setA,setB);
	 }
	 public void case3(){
		 Set setA = new Set();
		 Set setB = new Set();
		 System.out.printf("%19s \n","--Case 3--");
		 setA.add(1); setB.add(2);
		 setA.add(2); setB.add(3);
		 setA.add(3); setB.add(4);
		 setB.add(5);
		 baseCases(setA,setB);
	 }	 
	 public void case4(){
		 Set setA = new Set();
		 Set setB = new Set();
		 System.out.printf("%19s \n","--Case 4--");
		 setA.add(1);
		 setB.add(2);
		 setB.add(3);
		 baseCases(setA,setB);
	 }
	 public void case5(){
		 Set setA = new Set();
		 Set setB = new Set();
		 System.out.printf("%19s \n","--Case 5--");
		 setA.add(1); setA.add(9);
		 setA.add(2); setA.add(8);
		 baseCases(setA,setB);
	 }
	
	 
}