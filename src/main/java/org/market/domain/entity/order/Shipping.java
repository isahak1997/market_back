package org.market.domain.entity.order;

import lombok.Data;
import org.market.domain.entity.user.Address;

import javax.persistence.*;

@Entity
@Data
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double shipping_price;
    private double avgDay;

    @OneToOne(fetch = FetchType.EAGER)
    private Address address;
}
