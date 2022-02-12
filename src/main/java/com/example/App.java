package com.example;

/**
 * Hello world!
 *
 */
/*
 * Java程序中最基本的组成单位是类，
 * 
 * 类的定义格式：
 * public class 类名{
 * 
 * }
 * 这是我定义的HelloWorld类
 */
/*
 * 标识符定义规则:
 * 由数字、区分大小写的字母、下划线_和美元符号$组成，不能由数字开头，不能与关键字重名
 */
/*
 * 常见命名约定：
 * 小驼峰命名法：方法和变量
 * 1.标识符为一个单词时，首字母小写；
 * 2.标识符由多个单词组成时，第一个单词首字母小写，其他单词首字母大写
 * 大驼峰命名法：类
 * 1.标识符是一个单词时，首字母大写；
 * 2.标识符由多个单词组成时，每个单词首字母大写
 */
/*
 * 强制类型转换格式：
 * 目标数据类型 变量名 = （目标数据类型）值或者变量
 * 变量名 = （目标数据类型）值或者变量
 */
public class App {
    /*
     * 这是main方法
     * main方法是程序的入口方法，代码的执行是从main方法开始的
     */
    public static void main(String[] args) {// 这是输出语句，“”里面的内容是可以改变的
        // 字符串常量
        System.out.println("Hello World!");
        System.out.println("第一条测试:“你好!”");
        System.out.println("--------");
        // 整数常量
        System.out.println(666);
        System.out.println(-1314);
        System.out.println("--------");
        // 小数常量
        System.out.println(6.66);
        System.out.println(13.14);
        System.out.println("--------");
        // 字符常量
        System.out.println('A');
        System.out.println('我');
        System.out.println("--------");
        // 布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("--------");
        // 空常量不能直接输出
        // System.out.println(null);
        // -------------------------------------------------------------------------------------
        /*
         * 变量定义格式：
         * 数据类型 变量名 = 变量值；
         */
        // 定义变量：不能重名；未初始化（赋值）不能使用；
        int a = 2;
        // 输出变量
        System.out.println(a);
        // 修改变量
        a = 20;
        System.out.println(a);
        System.out.println("--------");
        // 定义long类型的变量，整数默认为int类型，为了防止整数过大，末尾要加l
        long b = 10000000000l;
        System.out.println(b);
        System.out.println("--------");
        // 定义float类型的变量，浮点数默认为double类型，为了防止不兼容，末尾要加f
        float c = 13.14f;
        System.out.println(c);
        System.out.println("--------");
        // -------------------------------------------------------------------------------------
        // 强制类型转换(不建议使用)
        int d = (int) 88.88;
        System.out.println(d);
        short e = 20;
        e = (short) (e + 20);// 等价于e += e;
        System.out.println(e);
        System.out.println("--------");
        // -------------------------------------------------------------------------------------
        // 算术运算符
        double m = 6;
        double n = 4;
        System.out.println(m + n);
        System.out.println(m - n);
        System.out.println(m * n);
        // 整数之间进行运算只能得到整数，浮点数参与运算才能得到小数
        // 算数表达式中包含多个数据类型的时候，整个表达式的类型会自动提升为表达式中操作数的最高等级
        // 等级顺序：byte,short,char->int->long->float->double
        System.out.println(m / n);
        System.out.println(m % n);
        System.out.println("--------");
        // 字符串的+操作:当+运算中出现字符串，则为连接运算，否则为加法运算
        System.out.println("Hello" + "World" + "!");
        System.out.println("Hello" + 66 + 6);
        System.out.println(66 + 6 + "Hello");
        System.out.println("--------");
        // 赋值运算符:+=,-=,*=,/=,%=类似C语言,隐含强制类型转换
        short f = 10;
        f += f;
        System.out.println(f);
        System.out.println("--------");
        // 自增自减运算符:++,--类似C语言
        // 关系运算符:==,!=,>,>=,<,<=,类似C语言
        // 逻辑运算符:&与,|或,!非,^异或(同假异真)
        // 短路逻辑运算符:&&(如果左边为假，右边不执行),||;(如果左边为真，右边不执行)
    }
}