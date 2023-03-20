package micromarket.eproduct.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Discounts {
    private String products;
    private Float discount_amount;
    private Date discount_duration;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
