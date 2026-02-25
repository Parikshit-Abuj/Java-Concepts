//class and objects
//creating class, methods and objects for cirlce
//for every class in program java will create a seprate class files
public class Circle{
double radius;
double area(){
return Math.PI*radius*radius;
}
double circumference(){
return  2*Math.PI*radius;
}
double perimeter(){
return circumference();
}
public static void main(String args[]){
Circle ci = new Circle();
Circle ci2 = new Circle();
ci.radius=7;
ci2.radius=8;
System.out.println(ci.area());
System.out.println(ci.circumference());
System.out.println(ci.perimeter());
System.out.println(" ");
System.out.println(ci2.area());
System.out.println(ci2.circumference());
System.out.println(ci2.perimeter());
}}

//for rectangle
public class Rectangle {
    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 6;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
}

//for student
public class Student {

    int m1, m2, m3;
    String name;
    int roll;
    String course;

    int total() {
        return m1 + m2 + m3;
    }

    float average() {
        return (float) total() / 3;
    }

    char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString() {
        return "Roll No: " + roll + "\n" +
               "Name: " + name + "\n" +
               "Course: " + course + "\n" +
               "Marks: " + m1 + ", " + m2 + ", " + m3 + "\n" +
               "Total: " + total() + "\n" +
               "Average: " + average() + "\n" +
               "Grade: " + grade();
    }

    public static void main(String[] args) {

        Student s = new Student();   // Object creation (no constructor used)

        // Assigning values
        s.roll = 1;
        s.name = "Chiku";
        s.course = "CS";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        // Printing details
        System.out.println(s);
    }
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


