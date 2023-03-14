package io.github.mrsamudio.test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.IntrospectionException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.github.mrsamudio.ApiDocLinks;

class ApiDocLinksTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		try {
			throw new IntrospectionException(null);
		} catch (Exception e) {
			boolean res = ApiDocLinks.printInfo(e.getClass());
			assertEquals(true, res, "");
		}
	}

	

}