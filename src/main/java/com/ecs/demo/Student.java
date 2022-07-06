package com.ecs.demo;

public class Student {
	private String name;
    private Integer admissionNo;
    private Float totalMarks;
    private Float percentage;
    private String grade;
    private String gradePoint;
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGradePoint() {
		return gradePoint;
	}
	public void setGradePoint(String gradePoint) {
		this.gradePoint = gradePoint;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(Integer admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Float totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
}
