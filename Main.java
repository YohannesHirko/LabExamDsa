import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int[] question2(int[] array, int target){
        int[] indices = {0,0};
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if (i + j == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
    public static int question4(int[] array) {
        int currentMax = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > currentMax){
                currentMax = array[i];
            }
        }
        return currentMax;
    }
    public static String questoin5(String s){
        char[] array = s.toCharArray();
        String reverse = "";
        ExamStack<Character> stack = new ExamStack<>(array.length);
        for (int i = 0; i < array.length; i++){
            Character chr = (Character) array[i];
            stack.push(chr);
        }
        for (int i = 0; i < array.length; i++){
            reverse += stack.pop();
        }
        return reverse;
    }
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,99};
        System.out.println(Arrays.toString(question2(array, 5)));
        System.out.println(question4(array));
        System.out.println(questoin5("hello"));
        CircularQueue<Integer> q = new CircularQueue<>(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();


    }
}