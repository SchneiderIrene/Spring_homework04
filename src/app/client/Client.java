package app.client;

import app.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");

        ProductController controller = (ProductController) context.getBean("productController");
        System.out.println(controller.getID(3L));
    }
}
