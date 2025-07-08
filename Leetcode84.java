import java.util.*;

public class Leetcode84 {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};  // You can change this input
        Solution sol = new Solution();
        int result = sol.largestRectangleArea(heights);
        System.out.println("Maximum Rectangle Area: " + result);
    }
}

class Solution {
    public int largestRectangleArea(int []heights){
        int a = heights.length;
        int []right= new int [a];
        int []left= new int[a];

        Stack<Integer> stack = new Stack<>();
        for (int i =0; i<a-1;i++){
            while (!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=stack.peek();
            }
            stack.push(i);
        }
        for (int i =a-1;i>0;i--){
            while (!stack.isEmpty() && heights[stack.peek()]> heights[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                right[i]=a;
            }
            else{
                right[i]=stack.peek();
            }
            stack.push(i);
        }
        int maxArea=0;
        for (int i =0;i<a;i++){
            int width = right[i]-left[i]-1;
            int area=heights[i]*width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;

    }
}