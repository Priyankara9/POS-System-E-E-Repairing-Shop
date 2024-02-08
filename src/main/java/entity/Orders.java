package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Orders {
    @Id
    private String orderId;
    private double amount;
    private String status;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "id")
    private Customer customer;


}
