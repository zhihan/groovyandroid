package me.zhihan.helloworld1

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.junit.Assert;

@RunWith(RobolectricTestRunner.class)
@CompileStatic
class UtilTests {
	@Test
	void testTimesTwo() {
		aaa
		Assert.assertTrue(2 != utils.timesTwo(1))
	}
}