package app;

public class Main {
    static int orderNumber;
    static int day;
    static String total;
    static String sales;
    static String productName;
    static double prise;
    static double cost;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        orderNumber = 1;
        day = 5;
        productName = "smartphone";
        total = "total sales for 5 days is";
        sales = "sales by day is";
        prise = 2430.68;
        cost = day*prise;
        System.out.println("Product No" + " " + orderNumber + ":" + " " + productName + ",");
        System.out.println(total + " " + CURRENCY + " " + cost + ",");
        System.out.println(sales + " " + CURRENCY + " " + prise + ".");

        orderNumber = 2;
        day = 7;
        productName = "laptop";
        total = "total sales for 7 days is";
        sales = "sales by day is";
        prise = 1498.12;
        cost = day*prise;
        System.out.println("Product No" + " " + orderNumber + ":" + " " + productName + ",");
        System.out.println(total + " " + CURRENCY + " " + cost + ",");
        System.out.println(sales + " " + CURRENCY + " " + prise + ".");

    }
}
