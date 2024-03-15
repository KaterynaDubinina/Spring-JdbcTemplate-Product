package org.example.app.utils;

import java.text.DecimalFormat;

public class PriceValidator {
    private final static String PRICE_RGX =
            "^\\d+(\\.\\d{1,2})?|(\\d+,\\d{1,2})?$";

    private PriceValidator() {
    }

    public static boolean isPriceValid(String price) {
        return price.isEmpty() || !price.matches(PRICE_RGX);
    }

    public static String formatPrice(String price) {
        String priceWithDot = price.replace(',', '.');
        double priceValue = Double.parseDouble(priceWithDot);
        DecimalFormat format = new DecimalFormat("0.00");
        return format.format(priceValue);
    }
}