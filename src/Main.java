import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] productNames = {
                "Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"
        };
        int months = 3;
        int[][] sales = new int[productNames.length][months];

        for (int p = 0; p < productNames.length; p++) {
            for (int m = 0;m < months; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + productNames[p] + "mattress: ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }
        Product product = new Product(productNames, sales) {
            @Override
            public String GetAverageProductsSold() {
                return "";
            }
        };
        PrintProduct printer = new PrintProduct();

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(50));
        printer.PrintTotalProductSales(product);
        printer.PrintTotalAverageProductSales(product);
        printer.PrintTotalPopularProduct(product);
    }
}
