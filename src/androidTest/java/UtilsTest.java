package me.zhihan.helloworld1;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import me.zhihan.helloworld1.utils;
import org.robolectric.annotation.Config;

@Config(emulateSdk=18) 
@RunWith(RobolectricTestRunner.class)
public class UtilsTest {
	@Test
	public void testFirst() {
		Integer r = utils.timesTwo(1);
		System.out.println("finish");
		Assert.assertTrue(2 == r);
	}
}