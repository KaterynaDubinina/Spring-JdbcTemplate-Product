package org.example.app.view;

import org.example.app.utils.Constants;
import org.springframework.stereotype.Component;

import java.util.InputMismatchException;
import java.util.Scanner;

@Component
public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String getOption() {
        showMenu();
        String option = "";
        try {
            option = scanner.nextLine().trim();
        } catch (InputMismatchException ime) {
            System.out.println(Constants.INCORRECT_VALUE_MSG);
        }
        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                \uD83D\uDDA5\uFE0F   Оберіть опцію:
                
                1\uFE0F\u20E3 - Додати продукт
                2\uFE0F\u20E3 - Переглянути всі продукти
                3\uFE0F\u20E3 - Переглянути продукт за ідентифікатором
                4\uFE0F\u20E3 - Оновити продукт
                5\uFE0F\u20E3 - Видалити продукт
                0\uFE0F\u20E3 - Закрити програму
                """);
        System.out.print("\n\uD83D\uDDA5\uFE0F   Введіть обрану опцію: ");
    }

    public void getOutput(String output) {
        if (output.equals(Constants.APP_CLOSE_MSG))
            System.out.println(output);
        scanner.close();
        System.exit(0);
    }
}
