package com.driver;

public class Main {
    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p= new Product();

        // int a, int b
        int res1= p.product(5,6);
        System.out.println("product of 5 and 6 is "+res1);

        // int a, int b, int c
        int res2= p.product(9,8,7);
        System.out.println("product of 5 and 6 is "+res2);

        double res3= p.product(100.00, 399.00);
        System.out.println("product of 100.00 and 399.00 is "+res3);

    }
}