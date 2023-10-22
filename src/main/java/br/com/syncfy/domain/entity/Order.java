package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ID")
    @SequenceGenerator(name = "SQ_ID", sequenceName = "SQ_ID")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private double totalAmount;

    @Column(name = "DELIVERY_DATE")
    private LocalDateTime deliveryDate;

    @Column(name = "ORDER_NUMBER", nullable = false)
    private String orderNumber;

    @Column(name = "DESCRIPTION")
    private String description;

    private List<Material> materials;

    private ShippingCost shippingCost;

    private Vendor vendor;
}
