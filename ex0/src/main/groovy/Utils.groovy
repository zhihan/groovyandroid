package me.zhihan.groovyandroid

import groovy.transform.CompileStatic

@CompileStatic
class Utils {
	@CompileStatic
	static int timesTwo(int x) {
		x * 2;
	}

	@CompileStatic
	static String hello(String world) {
		"Hello " + world
	}

}