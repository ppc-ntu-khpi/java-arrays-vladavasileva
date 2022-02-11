package test;

import domain.Exercise;
/**
 * Клас, де виводиться результат 
 * @author Влада
 */
public class TestResult {

    public static void main(String[] args) {
           /**
            * Оголошення масиву та інших змінних
            */
        int arr[]={7,0,0,1,4,0,7,2};
        int max_element = 8;
        int max_repeated = Integer.MIN_VALUE;
        int max_count = -1;
        /**
         * Вивід результату на екран 
         */
        System.out.println( "Число, яке зустрічається в масиві найбільшу кількість разів: " + Exercise.Calculate (arr, max_element,max_repeated, max_count));  
    }
}
