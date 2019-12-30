package com.shivam.framework.service;

import com.shivam.framework.entity.BaseVo;
import com.shivam.framework.exception.RecordNotFoundException;
import lombok.NonNull;

import java.util.List;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public interface IDataService<V extends BaseVo<V>> {

    @NonNull
    V save(V vo);

    @NonNull
    List<V> getAll();

    @NonNull
    V update(int id, V vo) throws RecordNotFoundException;

    @NonNull
    V delete(int id) throws RecordNotFoundException;

    @NonNull
    V findById(int id) throws RecordNotFoundException;

    @NonNull
    List<V> deleteAll();

}
