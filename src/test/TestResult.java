package test;

import domain.Exercise;
/**
 * ����, �� ���������� ��������� 
 * @author �����
 */
public class TestResult {

    public static void main(String[] args) {
           /**
            * ���������� ������ �� ����� ������
            */
        int arr[]={7,0,0,1,4,0,7,2};
        int max_element = 8;
        int max_repeated = Integer.MIN_VALUE;
        int max_count = -1;
        /**
         * ���� ���������� �� ����� 
         */
        System.out.println( "�����, ��� ����������� � ����� �������� ������� ����: " + Exercise.Calculate (arr, max_element,max_repeated, max_count));  
    }
}
