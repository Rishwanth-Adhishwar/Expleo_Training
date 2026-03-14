package javaHandson_7_Strings;

import java.util.Scanner;

public class TrimSpaces {

    public static String trim(String s) {

        char a[] = s.toCharArray();
        int start = 0;
        int end = a.length - 1;
        
        while(start<a.length && a[start]==' ')
        {
            start++;
        }

        while(end>=0 && a[end]==' ')
        {
            end--;
        }

        String result = "";

        for(int i=start;i<=end;i++)
        {
            result = result+a[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        String result = trim(s);
        System.out.println(result);
    }
}