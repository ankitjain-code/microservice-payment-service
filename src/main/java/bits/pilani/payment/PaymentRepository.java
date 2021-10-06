package bits.pilani.payment;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<PaymentRecord, Long> {
	
	public Optional<PaymentRecord> findById(Long id);
	
}
