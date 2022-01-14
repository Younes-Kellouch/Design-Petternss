package org.example;


import org.example.model.Category;
import org.example.model.Product;

public class App
{
    public static void main( String[] args ) throws Exception {
        Category category1 = new Category("category1");
        Category category11 = new Category("category11");
        Category category12 = new Category("category12");
        Product product13 = new Product("product13");

        Category category121 = new Category("category121");
        Product product1211 = new Product("product1211");


        category1.addComponent(category11);
        category1.addComponent(category12);
        category1.addComponent(product13);

        category12.addComponent(category121);
        category121.addComponent(product1211);

        System.out.println("Tree from root category : ");
        category1.view();

        category12.deleteCategory();

        System.out.println("\nTree from root category after delete: ");
        category1.view();
    }
}
