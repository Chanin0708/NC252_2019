package com.manitpornsut.nc214.sorting;

public class SelectionSortArray {
	private int [] element;
	 private int eSize;
	 
	 public SelectionSortArray(int size) {
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
	 
	 public void SelectionSort() {
	  int out,in,min;
	 
	  for(out = 0;out <eSize-1 ;out++) {
	   min = out;
	   for(in = out+1;in<eSize-1;in++) {
	    if(this.element[in]>this.element[min]) {
	     min = in;
	    }
	   }
	    this.swap(out,min);
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
	  SelectionSortArray Selection = new SelectionSortArray(max);
	  int a = (int) System.currentTimeMillis();

	   for(int i = 0;i< max;i++) {
	    Selection.insert((int)(Math.random()*100));  
	   
	   }   
	   Selection.SelectionSort();

	   int b = (int) System.currentTimeMillis();

	   data[j]=b-a;

	  }

	  System.out.println(max+" avg : "+(data[0]+data[1]+data[2]+data[3]+data[4]+data[5]+data[6]+data[7]+data[8]+data[9])/10);
	  
	  }
	  
	  
	 }

	}
