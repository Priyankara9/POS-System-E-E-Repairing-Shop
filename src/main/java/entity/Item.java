package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item {
    @Id
    private String itemCode;
    private String name;
    private String category;
    private String status;
    private String description;
    @ManyToOne
    @JoinColumn(name="orderId")
    private Orders orders;

}
