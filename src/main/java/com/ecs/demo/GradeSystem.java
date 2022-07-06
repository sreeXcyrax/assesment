package com.ecs.demo;

public class GradeSystem {
	public void gradeSystem(float marks)
	{
		if (marks> 90) {
            System.out.print("Grade:A1 , Grade Point:10.0\n");
        } else if (marks> 80 ) {
            System.out.print("Grade:A2 , Grade Point:9.0\n");
        } else if (marks> 70 ) {
            System.out.print("Grade:B1 , Grade Point:8.0\n");
        } else if (marks> 60 ) {
            System.out.print("Grade:B2 , Grade Point:7.0\n");
        } else if (marks> 50 ) {
            System.out.print("Grade:C1 , Grade Point:6.0\n");
        } else if (marks> 40 ) {
            System.out.print("Grade:C2 , Grade Point:5.0\n");
        } else if (marks> 32 ) {
            System.out.print("Grade:D , Grade Point:4.0\n");
        } else if (marks> 20 ) {
            System.out.print("Grade:E1 , Grade Point:C\n");
        } else if (marks<= 20) {
            System.out.print("Grade:E2 , Grade Point:C\n");
        }
	}
	
}
