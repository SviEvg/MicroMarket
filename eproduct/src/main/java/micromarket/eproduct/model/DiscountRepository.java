package micromarket.eproduct.model;

import micromarket.eproduct.model.Discounts;
import org.springframework.data.repository.CrudRepository;

public interface DiscountRepository extends CrudRepository<Discounts,Integer> {
}
