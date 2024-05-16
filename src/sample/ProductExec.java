package sample;

import java.time.LocalDate;

/**
 * ProductExec
 */
public class ProductExec {
    public static void main(String[] args) {
        Product p1 = new Product("A001", "XenPad", 1000, LocalDate.of(2024, 5, 16), true);
        int quantity = 5;
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1);
        System.out.println(p1.TotalPrice(quantity));
    }
}