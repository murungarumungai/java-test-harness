package com.testharness;

import java.util.Scanner;

public class PrintF {

    public static void main(String[] args) throws Exception {

        PrintF tw = new PrintF();

        Scanner sc=new Scanner(System.in);
        long socialSecurityNumber = 999_99_9999L;
        System.out.printf("long %s" ,socialSecurityNumber);

        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String col1 = String.format("%-" + 15 + "s", s1);
            String col2 = String.format("%" + 3 + "s", x).replace(' ', '0');

            System.out.println(col1);
            System.out.println(col2);
            System.out.printf("%s %s", col1,col2);
        }
    }


}
