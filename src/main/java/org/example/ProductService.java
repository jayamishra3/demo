package org.example;
public class ProductService {

    public Product getMaxPriceProduct(Product[] products) {
        Product maxPriceProduct = products[0];
        for (Product product : products) {
            if (product.getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct;
    }

    public Product[] getProductsByCategory(Product[] products, Product.Category category) {
        Product[] productsByCategory = new Product[products.length];
        int index = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                productsByCategory[index] = product;
                index++;
            }
        }
        return productsByCategory;
    }

    public double getAveragePrice(Product[] products, Product.Category category) {
        double sum = 0;
        int count = 0;
        for (Product product : products) {
            if (product.getCategory() == category) {
                sum += product.getPrice();
                count++;
            }
        }
        return sum / count;
    }
}
