package com.docker.smallApp.repo;

import com.docker.smallApp.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
@Repository
public interface BaseRepository extends JpaRepository<BaseEntity, Integer> {



}
