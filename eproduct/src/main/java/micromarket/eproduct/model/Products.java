package micromarket.eproduct.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Products {
    private String name;
    private String description;
    private String organization;
    private Double price;
    private Integer quantity;
    private String discounts;
    private String reviews;
    private String keywords;
    private String characteristics;
    private Integer estimates;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
