package com.study.code;

import java.util.Scanner;

public class Test3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int money = scanner.nextInt();
        if(money ==100){
            System.out.println("1000元");
        }else if(money>=90) {
            System.out.println("游乐场");
        }else if(money >= 80){
            System.out.println("变形金刚");
        }
    }
}
