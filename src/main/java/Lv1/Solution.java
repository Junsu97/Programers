package Lv1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ss = sol.solution(s).toString();
        System.out.println(ss);
    }
    public int[] solution(String s){
        char[] arr = new char[s.length()];
        int[] answer = new int[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.charAt(i);
            answer[i] = -1;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    answer[j] = j - i;
                }
            }
        }


        return answer;
    }
}
