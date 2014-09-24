package com.generic.intelledger

import static org.junit.Assert.*

import org.junit.Test

class IntelledgerTests {

	@Test
	void testSetWithoutEntries() {
		Intelledger.set("4.0.1")
	}
}
