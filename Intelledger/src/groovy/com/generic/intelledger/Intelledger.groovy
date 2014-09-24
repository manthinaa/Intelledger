package com.generic.intelledger

import com.generic.intelledger.domain.Intelledger as IntelledgerDomain

class Intelledger {

	static void set(String intelledgerName, String intelledgerDescription = null) {
		getCreateDomain(intelledgerName, intelledgerDescription).save(failOnError: true)
	}

	static private IntelledgerDomain getCreateDomain(String intelledgerName, String description = null) {
		IntelledgerDomain domain = getDomain(intelledgerName) ?: new IntelledgerDomain(name: intelledgerName)

		domain.description = (description ?: domain.description)

		return domain
	}

	static private IntelledgerDomain getDomain(String intelledgerName) {
		return IntelledgerDomain.findByName(intelledgerName)
	}
}
