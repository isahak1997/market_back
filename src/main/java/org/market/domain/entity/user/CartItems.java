package org.market.domain.entity.user;

import lombok.Data;
import org.market.domain.entity.component.Component;

import javax.persistence.*;

@Data
@Entity
public class CartItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Component component;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
