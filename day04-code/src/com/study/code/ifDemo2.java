package com.study.code;

public class ifDemo2 {
    static void main() {
        boolean isLightRed = true;
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        //ctrl + d 复制这一行
        if(isLightRed){
            System.out.println("stop");
        }
        if(isLightGreen){
            System.out.println("go");
        }
        if (isLightYellow){
            System.out.println("slow");
        }
    }
}
