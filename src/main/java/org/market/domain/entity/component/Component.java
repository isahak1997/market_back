package org.market.domain.entity.component;

import lombok.Data;
import org.market.domain.entity.order.Order;

import javax.persistence.*;

@Data
@Entity
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productNumber;
    private String road;
    private String category;
    private double length;
    private double width;
    private double height;
    private int year;

    @OneToOne(fetch = FetchType.LAZY)
    private Description description;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;
}
