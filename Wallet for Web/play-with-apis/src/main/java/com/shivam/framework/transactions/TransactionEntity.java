package com.shivam.framework.transactions;

import com.shivam.framework.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "TRANSACTION_ENTITY")
@EqualsAndHashCode(callSuper = false)
public class TransactionEntity extends BaseEntity<TransactionEntity> {

    @Column(name = "FROM_NUMBER")
    private long fromNumber;

    @Column(name = "TO_NUMBER")
    private long toNumber;

    @Column(name = "AMOUNT")
    private float amount;

    @Column(name = "TIME")
    private Date time;

}
