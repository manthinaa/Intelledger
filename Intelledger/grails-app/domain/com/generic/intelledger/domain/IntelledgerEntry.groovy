package com.generic.intelledger.domain


class IntelledgerEntry {
	/**
	 * The key by which the entry is accessed.
	 */
	String key

	/**
	 * The value of the key (normalized as a String)
	 */
	String value

	/**
	 * Describes the purpose of the <code>value</code> or where it is
	 * used.
	 */
	String description

	static belongsTo = [ intelledger: Intelledger ]

	static constraints = {
		key         (blank: false, unique: 'intelledger')
		value       (nullable: true, size: 1..8000)
		description (nullable: true, size: 1..8000)
		intelledger ()
	}

	static mapping = {
		key         column: 'identifier'
		value       type: "text"
		description type: "text"
		version 	false
	}

	int compareTo(IntelledgerEntry obj) {
		key.compareTo(obj.key)
	}

	String toString() {
		return key
	}
}
