package com.bxf.example.string;

//关于java中的String类的方法测试
public class TestString {
    public static void main(String args[]){
        testSSS(20000);
    }
    //测试String StringBuffer StringBuilder的性能 曾在苏宁面试时 考官告诉我String在拼接
    // 8次之后才会出现大的性能差异,特地试验一下 没试验出来 不知道是怎么得出的结论

    /**
     *
     * @param count 拼接次数
     */
    public static void testSSS(int count){
        String s1 = "";
        StringBuffer sb = new StringBuffer();
        StringBuilder stringBuilder =  new StringBuilder();
        long start,end;
        start = System.currentTimeMillis();
        for(int i = 0; i < count ;i++){
            s1 += "test";
        }
        end = System.currentTimeMillis();
        System.out.println("String:"+(end-start));
        start = System.currentTimeMillis();
        for(int i = 0; i < count ;i++){
            sb.append("test");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer:"+(end-start));
        start = System.currentTimeMillis();
        for(int i = 0; i < count ;i++){
            stringBuilder.append("test");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder:"+(end-start));
    }
}
