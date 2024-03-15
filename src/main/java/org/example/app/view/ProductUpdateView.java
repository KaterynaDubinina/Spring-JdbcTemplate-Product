package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Component
public class ProductUpdateView {

    public Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String title = "\u270F\uFE0F   Введіть назву продукту: ";
        System.out.print(title);
        map.put("name", scanner.nextLine().trim());
        title = "\u270F\uFE0F   Введіть кількіть у штуках: ";
        System.out.print(title);
        map.put("quota", scanner.nextLine().trim());
        title = "\u270F\uFE0F   Введіть вартість у гривнях: ";
        System.out.print(title);
        map.put("price", scanner.nextLine().trim());
        title = "\u27A1\uFE0F   Введіть ідентифікатор продукту: ";
        System.out.print(title);
        map.put("id", scanner.nextLine().trim());
        return map;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
