 public abstract   class Product implements IProduct {

    private final String[] productNames;
    private final int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSales : productSales) {
                total += monthSales;
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int entries = sales.length * sales[0].length;
        return (double) GetTotalProductsSold() / entries;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = 0;

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int monthSales : sales[i]) {
                productTotal += monthSales;
            }
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = i;
            }
        }
        return productNames[bestIndex] + "(" + bestTotal + ")";
    }
}