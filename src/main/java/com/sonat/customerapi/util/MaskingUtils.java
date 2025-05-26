package com.sonat.customerapi.util;

public final class MaskingUtils {
    public static String mask(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        int len = input.length();
        if (len == 1) {
            return "*";
        }
        if (len == 2) {
            return "**";
        }
        if (len == 3) {
            return input.charAt(0) + "*" + input.charAt(2);
        }
        if (len == 4) {
            return input.charAt(0) + "**" + input.charAt(3);
        }
        if (len == 5) {
            return input.charAt(0) + "***" + input.charAt(4);
        }
        if (len == 6) {
            return input.charAt(0) + "****" + input.charAt(5);
        }

        // length > 6
        return input.substring(0, 2) + "***" + input.substring(len - 2);
    }

    private MaskingUtils() {
    }
}
