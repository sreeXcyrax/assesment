package com.ecs.demo;

public class Percentage {

	public void calculatePercentage(float x, float y, float z) {
		float percent = ((x + y + z) / 300) * 100;
		float totalMarks=x+y+z;
        System.out.println("Total marks=" +totalMarks);
		System.out.println("Percentage =" + percent);
	}

}
