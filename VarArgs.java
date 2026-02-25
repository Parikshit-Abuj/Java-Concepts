public class Varags {
static void show(int... A) {
for(int x:A) {
System.out.println(x); }
}
public static void main( String args [] ) {
show();
show(1,2,3,4);
show(new int[] {1,3,4,5,6});
}
}

public class Varags {
	static void show(int A[]) {
		for(int x:A) {
		System.out.println(x); }
	}
	public static void main(String args []){
	// show(null);
	show(new int [] {2,3,4,5,6});
	show(new int[]{3,4,5,6,6,43});
	}
}

public class Varags{
	static void showList(String... S) {
		for(int i= 0; i<S.length; i++) {
		System.out.println((i + 1) + " " + S[i]); 
	}
	}
	public static void main( String args []){
		showList("Parikshit", "Ajay", "Sanjay");
	}
}

public class Varags{
	static void showList(int start, String... S) {  //variable arguements ex String... S must be last
		for(int i= 0; i<S.length; i++) {
		System.out.println(start + " " + S[i]);
        start++;		
	}
	}
	public static void main( String args []){  // we can also write as (String ...args)
		showList(5, "Parikshit", "Ajay", "Sanjay");
	}
}