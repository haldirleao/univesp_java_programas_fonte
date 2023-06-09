// Estudo: THIS keword

public class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() { 
        // O construtor Rectangle(int x, int y, int width, int height), linha 12, define a sequencia de atribuição.
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    
    // ESte construtor Rectangle define a sequencia de atribuição do construtor com código  this(0, 0, 1, 1).
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

public static void main(String[] args){
 
 Rectangle a = new Rectangle();
 
 System.out.println("Point X: " + a.x + "\nPoint Y: " + a.y + "\nWidth: " + a.width + "\nHeight: " + a.height );
} 
}