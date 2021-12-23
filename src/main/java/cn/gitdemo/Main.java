package cn.gitdemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!!!");
        System.out.println("hello master!!!");
        System.out.println("hot-fix test!!!!");

        System.out.println("===修改代码===");
        int x = 10;
        if( x < 20 ){
            System.out.print("这是 if 语句");
        }

        System.out.println("hello world");

        System.out.println("===修改远程库代码===");
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );
        System.out.println("hello Gitee");
    }
}
