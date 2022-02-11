package domain;
/**
 * Найголовніший клас, де виконується логіка програми
 * @author Влада
 */
public class Exercise {
    public static int Calculate(int arr[],int max_element,int max_repeated, int max_count){
    /**
     * оголоушємо масив розміру max_element+1 
     */
    int count_arr[] = new int[max_element+1];
    /**
     * рахуємо кількість елементів за домомогою циклу 
     */
    for(int i=0; i<arr.length; i++){
            count_arr[arr[i]]++;
        }
    /**
     * знаходимо кількість елементів з найбільшим значенням 
     */
        for(int i=0; i<arr.length; i++){
            if(count_arr[arr[i]] > max_count){
                max_count = count_arr[arr[i]];
                max_repeated = arr[i];
            }
}
        /** 
         * повертаємо значення 
         */
        return (int) max_repeated; 
    }
    
}