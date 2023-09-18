package day2023829.strings;

/**
 * StringNumber
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2023/9/2 13:24
 */
public class StringNumber {

    public static void main(String[] args) {
        String str1 = "-1E1.5";
        String str2 = "-0.5e+3";
        String str3 = "12e";
        String str4 = "1a3.14";
        System.out.printf("%s is valid number: %b%n", str1, isNumeric(str1));
        System.out.printf("%s is valid number: %b%n", str2, isNumeric(str2));
        System.out.printf("%s is valid number: %b%n", str3, isNumeric(str3));
        System.out.printf("%s is valid number: %b%n", str4, isNumeric(str4));
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        int i = 0;
        int n = str.length();

        // 跳过前面的空格
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        // 判断符号部分
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            i++;
        }

        // 判断整数部分
        boolean hasDigits = false;
        while (i < n && Character.isDigit(str.charAt(i))) {
            i++;
            hasDigits = true;
        }

        // 判断小数部分
        if (i < n && str.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(str.charAt(i))) {
                i++;
                hasDigits = true;
            }
        }

        // 判断指数部分
        if (hasDigits && i < n && (str.charAt(i) == 'e' || str.charAt(i) == 'E')) {
            i++;
            if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                i++;
            }
            boolean hasExponentDigits = false;
            while (i < n && Character.isDigit(str.charAt(i))) {
                i++;
                hasExponentDigits = true;
            }
            // 如果指数部分没有数字，则整个字符串不表示数值
            if (!hasExponentDigits) {
                return false;
            }
        }

        // 跳过末尾的空格
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        // 如果所有字符都已经处理完毕，则认为是一个合法的数值
        return i == n;
    }
}

