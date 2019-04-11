package com.sort;

/**
 * 冒泡排序算法
 */
public class BubbleSortTest
{
	public static void bubbleSort(int [] array)
	{
		for(int i = 0 ; i < array.length - 1; i++)
		{
            //每一轮确定一个最大的。
			for(int j = 0; j < array.length - i -1 ; j++)
			{
                //前一个比后一个大就交换。
				if (array[j] >= array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			
			}
			System.out.println("第"+(i+1)+"趟排序结果");
			for(int s = 0 ; s < array.length ; s++)
				System.out.print(array[s]+" ");
			System.out.println();
		}
	
	
	}


	public static void main(String args[])
	{
		int [] array = {2,5,6,4,8,9,3,1,0,7};
		
		bubbleSort(array);
	
	
	}


}
