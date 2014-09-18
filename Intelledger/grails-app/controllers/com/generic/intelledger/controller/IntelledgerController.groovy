package com.generic.intelledger.controller

import com.generic.intelledger.domain.Intelledger

class IntelledgerController {
	static scaffold = Intelledger

	def entries() {
		redirect(controller: 'intelledgerEntry', action: 'list')
	}
}
