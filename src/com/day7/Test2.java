package com.day7;

public class Test2 {
    public static void main(String[] args) {
        String str = "12345";
        //public char[] toCharArray () ：将此字符串转换为新的字符数组。
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ",");
        }

        System.out.println("\n‐‐‐‐‐‐‐‐‐‐‐‐‐");

        //public byte[] getBytes ()：使用平台的默认字符集将该 String编码转换为新的字节数组。
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + ",");
        }
    }
}
