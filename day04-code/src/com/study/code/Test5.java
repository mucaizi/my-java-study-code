package com.study.code;

import java.util.Scanner;

public class Test5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要判断的数字");
        int number = scanner.nextInt();
        int num1 = number;
        int num  =0;

        if (number < 0) {
            System.out.println("不是回文数");
            scanner.close();
            return;
        }
        //int  count = 0;
        while (number != 0){
            int s = number % 10;
            number/=10;
            //count++;
            num = num*10 + s;
        }
        //Java不支持动态数组
        //int numbers [count];
        if(num == num1){
            System.out.println("是回文字");
        }else {
            System.out.println("不是回文字");
        }

    }
}
