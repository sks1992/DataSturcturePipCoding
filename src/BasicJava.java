public class BasicJava {
    //How to Print a line
    public static void main(String[] args) {
        System.out.print("Sandeep Kumar\n");
        System.out.println("Sandeep Kumar");
    }
}

//Print a Triangle of stars
class PrintStar {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}

//Print a Triangle of stars
class PrintStar1 {
    public static void main(String[] args) {
        System.out.println("*\n**\n***\n****\n*****");

    }
}

//print Z in Java
class PrintZInJava {
    public static void main(String[] args) {
        System.out.println("*****\n   *\n  *\n *\n*****");
    }
}

//DataType in Java
class BasicVariable {
    public static void main(String[] args) {
        int x = 15;
        int y = 12;
        int sum = x + y;
        System.out.println("sum of " + x + " and " + y + " is " + sum);

        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;//to get Reminder
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        var exp = x * y / x + y;
        System.out.println(exp);
        var exp1 = (x * y) / (x + y);
        System.out.println(exp1);
    }
}