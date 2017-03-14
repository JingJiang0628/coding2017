package com.Datastructure.ArrayUtil;

public class ArrayUtil {
	/**
	 * ����һ����������a , �Ը������ֵ�����û�
		���磺 a = [7, 9 , 30, 3]  ,   �û���Ϊ [3, 30, 9,7]
		���     a = [7, 9, 30, 3, 4] , �û���Ϊ [4,3, 30 , 9,7]
	 * @param origin
	 * @return
	 */
	
	public void reverseArray(int[] origin){
		int b[] = null;
		for(int i=origin.length-1;i>=0;i--){
			for(int j=0;j<origin.length;j++){
				b[j]=origin[i];
			}
		}
		origin=b;
	}
	
	/**
	 * ���������µ�һ�����飺   int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}   
	 * Ҫ������������ֵΪ0����ȥ��������Ϊ0��ֵ����һ���µ����飬���ɵ�������Ϊ��   
	 * {1,3,4,5,6,6,5,4,7,6,7,5}  
	 * @param oldArray
	 * @return
	 */
	
	public int[] removeZero(int[] oldArray){
		int newArray[]=null;
		int j=0;
		for(int i=0;i<oldArray.length;i++){
			if(oldArray[i]!=0){
				newArray[j]=oldArray[i];
			}
		}
		return newArray;
	}
	
	/**
	 * ���������Ѿ�����õ��������飬 a1��a2 ,  ����һ���µ�����a3, ʹ��a3 ����a1��a2 ������Ԫ�أ� ������Ȼ�������
	 * ���� a1 = [3, 5, 7,8]   a2 = [4, 5, 6,7]    �� a3 Ϊ[3,4,5,6,7,8]    , ע�⣺ �Ѿ��������ظ�
	 * @param array1
	 * @param array2
	 * @return
	 */
	
	public int[] merge(int[] array1, int[] array2){
		int a3[]=null;
		int temp=array1.length+array2.length;
		int j=0,k=0;
		for(int i=0;i<temp;){
			if(array1[k]<array2[j]){
				a3[i]=array1[k];
				j++;
			}else if(array1[k]>array2[j]){
				a3[i]=array2[j];
				k++;
			}else{
				a3[i]=array1[k];
				k++;
				j++;
				temp--;
			}
		}
		return  null;
	}
	/**
	 * ��һ���Ѿ��������ݵ����� oldArray������������չ�� ��չ��������ݴ�СΪoldArray.length + size
	 * ע�⣬�������Ԫ��������������Ҫ����
	 * ���� oldArray = [2,3,6] , size = 3,�򷵻ص�������Ϊ
	 * [2,3,6,0,0,0]
	 * @param oldArray
	 * @param size
	 * @return
	 */
	public int[] grow(int [] oldArray,  int size){
		int[] newArray=new int[oldArray.length+size];
		for(int i=0;i<oldArray.length;i++){
			newArray[i]=oldArray[i];
		}
		return null;
	}
	
	/**
	 * 쳲���������Ϊ��1��1��2��3��5��8��13��21......  ������һ�����ֵ�� ����С�ڸ�ֵ������
	 * ���磬 max = 15 , �򷵻ص�����Ӧ��Ϊ [1��1��2��3��5��8��13]
	 * max = 1, �򷵻ؿ����� []
	 * @param max
	 * @return
	 */
	public int[] fibonacci(int max){
		if(max==1){
			return null;
		}
		int a[] = null;
		a[0]=1;
		a[1]=1;
		for(int n=2;n>=2;n++){
			a[n]=n-1+n-2;
		}
		int b[] = new int[max];
		int j=0;
		for(int i=0;;i++){
			if(a[i]<max){
				b[j]=a[i];
				j++;
			}
		}
	}
	
	/**
	 * ����С�ڸ������ֵmax��������������
	 * ����max = 23, ���ص�����Ϊ[2,3,5,7,11,13,17,19]
	 * @param max
	 * @return
	 */
	public int[] getPrimes(int max){
		int a[] = new int[max];
		int m=0;
		while(m!=max+1){
			for(int i=0;i>=0;i++){
			for(int j=2;j<=i;j++){
				if(i%j==0||i<=1){
					break;
				}else{
					a[m]=i;
					m++;
				}
			}	      
		}
		}
		return null;
	}
	/**
	 * ��ν���������� ��ָ�����ǡ�õ�����������֮�ͣ�����6=1+2+3
	 * ����һ�����ֵmax�� ����һ�����飬 ��������С��max ����������
	 * @param max
	 * @return
	 */
	public int[] getPerfectNumbers(int max){
		int a[] = new int[max];
		int m=0;
		while(m!=max+1){
			for(int i=0;i>=0;i++){
				int wan=0;
			for(int j=2;j<=i;j++){
				if(i%j==0){
					wan+=j;
				}
			}
			if(wan==i){
				a[m]=i;
				m++;
			}
		}
		}
		return null;
	}
	
	/**
	 * ��seperator ������ array����������
	 * ����array= [3,8,9], seperator = "-"
	 * �򷵻�ֵΪ"3-8-9"
	 * @param array
	 * @param s
	 * @return
	 */
	public String join(int[] array, String seperator){
		for(int i=0;i<array.length;i++){
			if(i==(array.length-1)){
				System.out.println(array[i]);
			}else{
				System.out.println(array[i]+seperator);
			}
		}
		return null;
	}
}
