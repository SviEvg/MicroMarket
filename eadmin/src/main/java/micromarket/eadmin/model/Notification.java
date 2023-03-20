package micromarket.eadmin.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Notification {
    private String header;
    private Date date;
    private String text;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
}
