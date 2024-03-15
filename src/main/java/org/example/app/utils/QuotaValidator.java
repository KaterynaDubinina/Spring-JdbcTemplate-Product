package org.example.app.utils;

public class QuotaValidator {
    private final static String QUOTA_RGX =
            "\\d+";

    private QuotaValidator() {
    }

    public static boolean isQuotaValid(String quota) {
        return quota.isEmpty() || !quota.matches(QUOTA_RGX);
    }
}

