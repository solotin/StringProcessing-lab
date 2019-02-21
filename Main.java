package com.solotin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        StringProcessing strp;
        System.out.println("Введите текст для перевода в транслит\nВведите 'exit' или 'выход' для завершения ввода");
        try(Scanner sc = new Scanner(System.in))
    {
        String str;
        while (sc.hasNextLine())
        {
            str=sc.nextLine();
            if(str.equalsIgnoreCase("exit") || str.equalsIgnoreCase("выход")) break;
            strp = new StringProcessing(str);
            strp.translit();
            System.out.println(strp);
        }
    }

    strp=new StringProcessing();
    strp.translit();
    System.out.println(strp.toString(2,999));

    strp=new StringProcessing("всем привет, меня зовут егор");
    strp.translit();
    System.out.println(strp.toString(0,10));

    strp=new StringProcessing(new char[]{'П','р','о','в','е','р','к','а',' ','с','в','я','з','и'});
    strp.translit();
    System.out.println(strp);
    }
}
