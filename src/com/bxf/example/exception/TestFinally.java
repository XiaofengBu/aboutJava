package com.bxf.example.exception;

public class TestFinally {
    public static void main(String args[]){
        System.out.println(foo());     /////////2
        System.out.println(foo2());     /////////execute finally Hello World
        System.out.println(bar());    /////////2
    }
    public static int foo() {
        try{
            int a = 5 / 0;
        } catch (Exception e){
            return 1;
        } finally{
            return 2;
        }
    }
    public static StringBuffer foo2() {
        StringBuffer s = new StringBuffer("Hello");
        try{
            int a = 5 / 0;
            return s;
        } catch (Exception e){
            return s;
        } finally{
            System.out.println("execute finally");
            s.append(" World");
        }
    }

    public static int bar() {
        try {
            return 1;
        }finally {
            return 2;
        }
    }
}
