// Using the THIS ketword. https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html

public class Point {
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) {
        this.x = x; // Using the THIS ketword. https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
        this.y = y;
    }

public static void main(String[] args){
 Point a = new Point(5,10);
 System.out.println("Point X: " + a.x + "\tPoint Y: " + a.y);
} 
}