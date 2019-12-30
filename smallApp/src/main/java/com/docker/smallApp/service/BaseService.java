package com.docker.smallApp.service;

import com.docker.smallApp.entity.BaseEntity;
import com.docker.smallApp.repo.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@Service
public class BaseService {

    @Autowired
    private BaseRepository baseRepository;

    public BaseEntity post(BaseEntity baseEntity) {
        return baseRepository.save(baseEntity);
    }

    public BaseEntity findById(int id) {
        return baseRepository.findById(id).orElseThrow(null);
    }
}
