package com.generic.intelledger.domain

class Intelledger {
	/**
	 * The name of the Intelledger, which is a mnemonic for what the
	 * collection represents.
	 */
	String name

	/**
	 * A description for the <code>Intelledger</code> object, and what
	 * data it might pertain to.
	 */
	String description

	/**
	 * Specify the <code>Entry</code> Objects as a
	 * <code>SortedSet</code>
	 */
	SortedSet entries

	static hasMany = [ entries: IntelledgerEntry ]

	static constraints = {
		name        (blank: false, unique: true)
		description (nullable: true, size: 1..8000)
	}

	static mapping = { description type: "text" }

	String toString() {
		return name
	}

	Map toMap() {
		Map m = [:]

		entries.each {
			m[it.key] = it.value
		}

		return m
	}
}
