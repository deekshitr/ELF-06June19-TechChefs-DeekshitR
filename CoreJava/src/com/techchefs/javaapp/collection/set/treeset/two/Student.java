package com.techchefs.javaapp.collection.set.treeset.two;

public class Student implements Comparable<Student> {
	
	String name;
	int id;
	double percentage;
	
	@Override public int compareTo(Student o) {
		Integer i = this.id;
		Integer j = o.id;
		return i.compareTo(j); 
	}
	
	
	/*
	 * @Override public int compareTo(Student o) {
	 * 
	 * return this.name.compareTo(o.name); }
	 */
	
	/* Logic to sort students w.r.t id */
	
	/*
	 * @Override public int compareTo(Student o) {
	 * 
	 * if (this.id < o.id) { return -1; } else if(this.id > o.id) { return 1; } else
	 * { return 0; } }
	 */
	
	/* Logic to sort students w.r.t percentage */
	
	/* 
	 * @Override public int compareTo(Student o) { if (this.percentage <
	 * o.percentage) { return -1; } else if (this.percentage > o.percentage) {
	 * return 1; } else { return 0; }
	 * 
	 * }
	 */
	
}
