public class Recursion{
static void fun(int n){
if(n>0) {
System.out.print(n);
fun(n-1);
}
}
public static void main(String args [] ){
fun(3);
}
}
OP 3 2 1

public class Recursion{
static void fun(int n){
if(n>0) {
fun(n-1);
System.out.print(n);
}
}
public static void main(String args[]){
fun(3);
}
}
op 1 2 3