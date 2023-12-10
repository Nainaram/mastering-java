package com.hubberspot.algorithms.analysis;
import java.io.*;
public class Timecomplexity{
	public static void main(String[] args){
		double now = System.currentTimeMillis();
		Timecomplexity demo  = new Timecomplexity();
		System.out.println(demo.findSum(99999));
		System.out.println("Time taken - "+ (System.currentTimeMillis() -now) + " millisecs.");
	}
	public int findSum(int n){
	return n*(n+1)/2;}
	// public int findSum(int n){
		// int sum = 0;
		// for( int i = 0; i <= n; i++){
		// sum = sum+i;}
		
		// return sum;
	}
}