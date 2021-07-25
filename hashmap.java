

import java.util.*;
import java.util.Map.Entry;


public class hashmap {
    public static void main(String[] args) {

        Product product1 = new Product("SHIRT", null, (float)10.00, 1);
        Product product2 = new Product("KHAN", null, (float)10.00, 1);
        Product product3 = new Product("PANT", "baggy", (float)20.00, 1);
        Product product4 = new Product("HAT", null, (float)15.00, 1);
        Product product5 = new Product("GLASSS", "sunglass", (float)15.00, 1);
        ArrayList<Product> ListProduct = new ArrayList<>();
        ListProduct.add(product1);
        ListProduct.add(product2);
        ListProduct.add(product3);
        ListProduct.add(product4);
        HashMap<String, Product> productInCart = new HashMap<>();

        //buyer click 1 product vao gio hang
        productInCart.put("KHAN", product2);

        //Buyer click thêm 3 product trên vào giỏ hàng
        product2.setQuantity(product2.quantity + 3);

        //Buyer giảm số lượng của product trên trong giỏ hàng còn 2
        product2.setQuantity(product2.quantity - 2);

        //Buyer tiếp tục thêm mới 1 product khác:
        productInCart.put("SHIRT", product1);

        //In ra màn hình tất cả các product có trong giỏ hàng
        System.out.println(productInCart);
    }
}
