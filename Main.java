/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l1;

import static java.lang.Math.toRadians;
import java.util.Scanner;

/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {              
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));        
    }
    
    
    /* 1
        Утильный класс: часть 1
        Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, 
        косинус и тангенс угла соответственно, полученного как параметр. Угол задан в градусах.
        В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
        */  
    public static double sin(double a) {
        return Math.sin(toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(toRadians(a));
    }
    
    /* 2
    Утильный класс: часть 2
    sqrt(double) — должен возвращать квадратный корень переданного аргумента.
    cbrt(double) — должен возвращать кубический корень переданного аргумента.
    pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.
    */
    
    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
       return Math.pow(number, power);
    }
    
    /* 3
    В этой задаче нужно:
    Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
    Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
    В методе min(int[]) обязательно используй метод Math.min(int, int).
    */
    
     public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
    

