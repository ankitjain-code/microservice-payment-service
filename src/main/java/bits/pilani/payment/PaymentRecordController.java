package bits.pilani.payment;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRecordController {


	@Autowired
	private PaymentRepository repository;

	@GetMapping("/payment/{id}")
	public PaymentRecord getPaymentRecord(@PathVariable Long id) {
		
		Optional<PaymentRecord> paymentRecord = repository.findById(id);	 

		return paymentRecord.get();
	}
	
	@PostMapping("/payment")
	public PaymentRecord savePaymentRecord(@RequestBody PaymentRecord paymentRecord) {
		
		PaymentRecord exchangeValue = repository.save(paymentRecord);	 

		return exchangeValue;
	}
}