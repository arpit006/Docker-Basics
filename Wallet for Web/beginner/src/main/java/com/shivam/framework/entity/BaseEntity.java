package com.shivam.framework.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity<T> implements Serializable {

    @Id
    @Column(name = "ID_COL")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
}
