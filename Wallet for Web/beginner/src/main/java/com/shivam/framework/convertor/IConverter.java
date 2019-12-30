package com.shivam.framework.convertor;

import com.shivam.framework.entity.BaseEntity;
import com.shivam.framework.entity.BaseVo;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public interface IConverter<T extends BaseEntity<T>, V extends BaseVo<V>> {

    T mapVoToEntity(V v);

    V mapEntityToVo(T t);
}
