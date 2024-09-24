public class SalesTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Input price below ");


        double price = 5;
        double salesTaxRate = 0.05;
        double totalTax = salesTaxRate * price;

        System.out.println("The cost before tax is " + price);
        System.out.println("The total cost after tax is " + (price + totalTax));
    }
}