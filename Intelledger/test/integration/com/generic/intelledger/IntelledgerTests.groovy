package com.generic.intelledger

import static org.junit.Assert.*

import org.junit.*

class IntelledgerTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        fail "Implement me"
    }
	
	@Test
	void testSetWithoutEntries() {
		Intelledger.set("4.0.1")
	}
}
