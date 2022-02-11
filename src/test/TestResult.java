package test;

import domain.Exercise;
/**
 * Клас, за допомогою якого ми виводимо результат 
 * @Влада
 */
public class TestResult {

    public static void main(String[] args) {
           /**
            *  оголошення масиву
            */
        int arr[]={7,0,0,1,4,0,7,2};
        int max_element = 8;
        int max_repeated = Integer.MIN_VALUE;
        int max_count = -1;
        /**
         * Виведення на екран числа, яке повторюєтоься у масиві найбільшу кількість разів
         */
        System.out.println( "Число, яке повторюєтоься у масиві найбільшу кількість разів  : " + Exercise.Calculate (arr, max_element,max_repeated, max_count));  
    }
}
