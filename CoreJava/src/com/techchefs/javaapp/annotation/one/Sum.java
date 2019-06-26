package com.techchefs.javaapp.annotation.one;

@FunctionalInterface
public interface Sum {
	void add();
	default void doSomething() {
		
	}
}
