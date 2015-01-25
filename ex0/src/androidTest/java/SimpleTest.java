
package me.zhihan.groovyandroid.test;

import groovy.transform.CompileStatic;
import me.zhihan.groovyandroid.Utils;
import org.robolectric.RobolectricTestRunner;
import org.junit.runner.RunWith; 
import org.junit.Test;
import org.junit.Assert;

@CompileStatic
@RunWith(RobolectricTestRunner.class)
public class SimpleTest {
	@Test
	public void testTimesTwo() {
		Assert.assertEquals(Utils.timesTwo(1), 2);
	}

	@Test
	public void testHelloWorld() {
		Assert.assertEquals(Utils.hello("world"), "Hello world");
	}
}
