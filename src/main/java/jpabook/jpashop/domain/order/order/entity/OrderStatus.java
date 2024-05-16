package jpabook.jpashop.domain.order.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

public enum OrderStatus {
    ORDER,
    CANCEL,
    ;
}