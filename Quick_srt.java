package manasa;

import java.util.Random;
import java.util.Scanner;

public class Quick_srt {
	  public static int SIZE =7000;
	   public static void main(String[] args)throws
	   ArrayIndexOutOfBoundsException
	 {
	     int a[]=new int[SIZE];
	    System.out.println("enter the total number of elements for sorting:");
	    Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();
	    Random m= new Random();
	     for(int i=0;i<n;i++)
	{
	      a[i] = m.nextInt(10)+1;
	}
	System.out.println("\n The elements before sorting...");
	for(int i=0;i<n;i++){
	System.out.println(" "+a[i]);
	}
	    long start_time,end_time;
	start_time=System.nanoTime();
	Quick(a,0,n-1);
	end_time=System.nanoTime();
	System.out.println("\n The element after sorting");
	for(int i=0;i<n;i++) {
	System.out.println(" "+a[i]);
	}
	System.out.println("\n The time required for sorting "+n+"number is:"+(end_time-
	start_time)+"ns");
	}
	static void Quick(int a[],int low,int high){
	int m,i;
	if(low<high) {
	m= partition(a,low,high);
	Quick(a,low,m-1);
	Quick(a,m+1,high);
	}
	}
	static int partition(int a[],int low,int high){
	int pivot = a[low],i=low,j=high;
	while(i<=j)
	{
	while(a[i]<=pivot)
	i++;
	while(a[j]>pivot)
	j--;
	if(i<j)
	swap(a,i,j);
	}
	swap(a,low,j);
	return j;
	}
	static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	}