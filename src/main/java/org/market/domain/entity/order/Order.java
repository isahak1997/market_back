package org.market.domain.entity.order;

import lombok.Data;
import org.market.domain.entity.component.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;
    private String promo;
    private long productNumber;
    private LocalDate startDate;

    @OneToOne(fetch = FetchType.EAGER)
    private Component component;

    @ManyToOne
    @JoinColumn(name = "shipping_id")
    private Shipping shipping;
}
