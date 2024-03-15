package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductDeleteView {

    public String getData() {
        Scanner scanner = new Scanner(System.in);
        String title = "\u27A1\uFE0F   Введіть ідентифікатор продукту: ";
        System.out.print(title);
        return scanner.nextLine().trim();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
