import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

class apples{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // // use newline-character for delimitting stdin-inputs
        // scanner.useDelimiter("\n");

        // int n1 = scanner.nextInt();
        // /*nextInt method from the scanner class
        // scans till the integer finished, thus stopping just before the newline
        // character of the line where the integer was entered.
        // To omit that character, and then take the String as an
        // input in the following line thus requires this: */
        // scanner.nextLine();

        // /* Read the complete line as String
        // and convert it to integer
        // This could be done instead of the above */
        // // int var = Integer.parseInt(sc.nextLine());

        // String s1 = scanner.nextLine(); // reads all characters till newline is met
        // double n2 = scanner.nextDouble();
        
        // hasNext usage
        /* while(scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(s);
        }
        scanner.close(); */
        // // string formatting for different datatypes
        // String op = String.format("%d\n%s\n%f", n1, s1, n2);
        // System.out.println(op);

        // currency exchange
        double payment = scanner.nextDouble();
        scanner.close();
        // NumberFormat us_nf = NumberFormat.getCurrencyInstance(Locale.US);
        // String currency_value = nf.getCurrency().getDisplayName();
        // System.out.println(currency_value);
        // System.out.println(us_nf.format(payment));

        Locale india = new Locale("en", "IN");
        NumberFormat india_nf = NumberFormat.getCurrencyInstance(india);
        System.out.printf("India: %s\n", india_nf.format(payment));

        String s1 = "akshay", s2="bkshay";
        System.out.println(s2.compareTo(s1));



    }
}