package tieto.bank.admin

class Payment {

	Date date
	Integer amount
	Account from
	Account to

	static constraints = {

		amount min:1
		//date nullable:true		date je nastaveny
		from nullable:true
		to nullable:true
	}

	def beforeValidate(){
		date = new Date()
	}
}
