package com.project.web.repository;

import com.project.web.entity.userInfoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSelectRepository extends JpaRepository<userInfoDto, String> {
    //차후 service 분리
}
