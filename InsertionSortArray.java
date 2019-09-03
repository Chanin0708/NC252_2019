package com.manitpornsut.nc214.sorting;

public class InsertionSortArray {
	 private int [] element;
	 private int eSize;
	 
	 public InsertionSortArray(int size) {
	  if(size > 0)
	   this.element = new int[size];
	  else
	   this.element = new int[10];
	  eSize = 0;
	 }
	 
	 public void insert(int e) {
	  this.element[eSize] = e;
	  eSize++;
	 }
	 
	 public void show(){
	  for(int i = 0;i<eSize;i++) {
	   System.out.print(this.element[i]+" ");
	  }
	  System.out.println("");
	 }
	 
	 public void InsertionSort() {
	  int out,in,temp;
	 
	  for(out = 1;out < eSize;out++) {
	   temp = this.element[out];
	   for(in = out;in>0 && this.element[in-1]>=temp;in--) {
	    this.element[in] = this.element[in-1];
	   }
	   this.element[in] = temp;
	  }
	 }
	 
	 private void swap(int left,int right) {
	  int temp = this.element[left];
	  this.element[left] = this.element[right];
	  this.element[right] = temp;
	 }
	 
	 
	 public static void main(String []args){
	  int [] data = new int[10]; 
	  for(int max = 10000;max<=80000;max+=10000) {
	  for(int j = 0;j<10;j++) { 
	  InsertionSortArray insertion = new InsertionSortArray(max);
	  int a = (int) System.currentTimeMillis();

	   for(int i = 0;i< max;i++) {
	    insertion.insert((int)(Math.random()*100));  
	   
	   }   
	   insertion.InsertionSort();

	   int b = (int) System.currentTimeMillis();

	   data[j]=b-a;

	  }

	  System.out.println(max+" avg : "+(data[0]+data[1]+data[2]+data[3]+data[4]+data[5]+data[6]+data[7]+data[8]+data[9])/10);
	  
	  }
	 
	 }
	
}
