public class Main {
    public static void main(String[] args) {

        //Problem 1 Test Cases
        Clothing clt1 = new Clothing();

        clt1.details();
        clt1.increasePrice();
        clt1.details();
        clt1.increasePrice(7);
        clt1.details();

        Clothing clt2 = new Clothing(31.2, "Jeans", "Small");

        clt2.details();
        clt2.increasePrice();
        clt2.increasePrice();
        clt2.details();
        clt2.increasePrice(4);
        clt2.details();


        //Problem 2
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        System.out.print("The distance from " + p1.toString() + " to " + p2.toString() + " is: ");
        System.out.println(p1.distance(p2));
        System.out.println();


        p1.setPoint(1, 4);
        System.out.println("P1 new coordinates are:");
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());

        p2.setPoint(2, 3);
        System.out.println("P2 new coordinates are:");
        System.out.println("x = " + p2.getX());
        System.out.println("y = " + p2.getY());
        System.out.println();

        System.out.print("The distance from " + p1.toString() + " to " + p2.toString() + " is: ");
        System.out.println(p1.distance(p2));

        //problem 3
        Account accJohn = new Account("S93203", "John", 2534.31);
        System.out.println(accJohn.getId());
        System.out.println(accJohn.getName());
        System.out.println(accJohn.getBalance());
        accJohn.debit(5000);
        System.out.println(accJohn.getBalance());
        accJohn.debit(200);
        System.out.println(accJohn.getBalance());
        accJohn.credit(600);
        System.out.println(accJohn.accountDetails());
        System.out.println("-----------------------------------------------------------------");

        Account accSarah = new Account("C45442", "Sarah");
        accSarah.credit(340.97);

        accJohn.transferTo(accSarah, 100000);
        accJohn.transferTo(accSarah, 500);

        System.out.println(accJohn.accountDetails());
        System.out.println(accSarah.accountDetails());
        System.out.println("-----------------------------------------------------------------");
    }
}