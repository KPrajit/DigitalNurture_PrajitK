public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
        new Product(101, "Laptop", "Electronics"),
        new Product(102, "Phone", "Electronics"),
        new Product(103, "Shoes", "Fashion"),
        new Product(104, "Watch", "Accessories"),
        new Product(105, "Bag", "Fashion")
    };
        Product result1 =
            Product.linearSearch(products,104);
        Product result2 =
            Product.binarySearch(products,104);
        System.out.println(
                result1.productName);
        System.out.println(
                result2.productName);
    }
} 
    

