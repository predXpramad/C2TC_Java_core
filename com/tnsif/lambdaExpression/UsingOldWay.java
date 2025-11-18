package com.tnsif.lambdaExpression;

public class UsingOldWay {
	public static void main (String args[]) {
		
		//
		
		class MyCubeImp implements MyCube{
			public int getCube(int no){
				return no*no*no;
			}
		}
		
		
		//2. Using Anonymous Class
		
		MyCube CubeObj = new MyCube() {
			public int getCube(int no) {
				return no*no*no;
			}
		};
		
		int cube = 5;
		
		System.out.println("The Cube of {" + cube + "} is : " + CubeObj.getCube(cube));
	
}
	
}


