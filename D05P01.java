package com.learning.corejava.da4session1;



	public class D05P01{

	    public static void quickSort(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return;
	        }
	        quickSort(arr, 0, arr.length - 1);
	    }

	    private static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	        return i + 1;
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 7, 8, 9, 1, 5};
	        System.out.println("Input array:");
	        printArray(arr);
	        quickSort(arr);
	        System.out.println("Output array after Quick sort:");
	        printArray(arr);
	    }
	}


