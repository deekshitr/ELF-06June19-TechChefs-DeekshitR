package com.techchefs.javaapp.annotation1;

@FunctionalInterface
public interface Sum {
	void add();
	default void doSomething() {
		
	}
}
