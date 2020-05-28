package com.example;

import static org.hamcrest.Matchers.comparesEqualTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathUtilTest {
	/** 計算結果 */
	private double answer;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	    // 毎回計算結果が入るanswerを初期化
		answer = 0.0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		answer = MathUtil.power(2, 2);
		System.out.println(answer);
		assertThat("答えが違います。", answer, comparesEqualTo(8.0));
	}

}
