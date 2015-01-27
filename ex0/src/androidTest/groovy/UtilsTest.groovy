package me.zhihan.groovyandroid.test

import android.test.AndroidTestCase
import groovy.transform.CompileStatic
import me.zhihan.groovyandroid.Utils

@CompileStatic
public class UtilsTest extends AndroidTestCase {
	public void testTimesTwo() {
		assertEquals(Utils.timesTwo(1), 2)
	}

	public void testHello() {
		assertEquals("Hello world", Utils.hello("world"))
	}
}

