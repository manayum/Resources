package com.kata;

/**
 * Created by Admin on 8/14/2016.
 */
public class RotateLeft {

    public int [] rotateNow(int nums[]){
        int temp;
        temp = nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
            if(i==nums.length-2){
                nums[nums.length-1]=temp;
            }
        }

        for(int x=0;x<nums.length;x++){
          System.out.print(nums[x] + "\t");
        }
        return nums;
    }
    public int [] rotateBy(int nums[], int data){
        int x = nums.length - data;
        int y = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i <nums.length; i++){
            if (x < nums.length) {
                arr[x] = nums[i];
                x = x + 1;
            }
        }
        for (int j = data; j <= nums.length - 1; j++){
            arr[y] = nums[j];
            y = y + 1;
        }
        for (int w = 0; w < arr.length; w++){
            System.out.print(arr[w] + "\t");
        }
        return arr;
    }
}

