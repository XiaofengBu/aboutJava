package com.bxf.example.solution;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String args[]){
        int [] nums = {2,3,3,2,4};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums) {
        int flag = 0;
        for(int i = 0 ;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                if(flag >0){
                    return false;
                }else if(i-1>=0&&nums[i-1]>nums[i+1]&&i+2<=nums.length-1&&nums[i]>nums[i+2]){
                    return false;
                }else{
                    flag++;
                }
            }
        }
        return true;
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        if(deck.length<=2){
            return deck;
        }
        for(int i = deck.length-3;i>=0;i--){
            put(deck,i);
        }
        return deck;
    }
    public static void put(int[] deck,int index){
        int temp = deck[deck.length-1];
        for(int i = deck.length-1;i>index+1;i--){
            deck[i] = deck[i-1];
        }
        deck[index+1] = temp;
    }
}
