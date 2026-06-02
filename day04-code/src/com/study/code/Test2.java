package com.study.code;

import java.util.Scanner;

public class Test2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入余额：");
        int money = scanner.nextInt();
        if(money>=500){
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }
    }

}
