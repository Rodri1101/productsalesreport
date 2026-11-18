public class PrintProduct {
    public void PrintTotalProductSales(IProduct product) {
        System.out.println("TOTAL PRODUCT SALES : " + (int) product.GetTotalProductsSold());
    }

    public void PrintTotalAverageProductSales(IProduct product) {
        System.out.println("AVERAGE PRODUCT SALES: " + product.GetAverageProductsSold());
    }
    public void PrintTotalPopularProduct(IProduct product) {
        System.out.println("MOST POPULAR PRODUCT: " +  product.GetMostPopularProduct());
    }
}
