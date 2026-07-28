public class SimpleOperatorsDemo {

    public static void main(String[] args) {

        int a = 10, b = 3;

        
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction

       
        System.out.println("a > b ? " + (a > b)); // Greater than

        
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y)); // Logical AND

        a += 5; // a = a + 5
        System.out.println("a after += 5 : " + a);

      
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}