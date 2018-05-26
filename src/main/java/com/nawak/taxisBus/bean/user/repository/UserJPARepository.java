package com.nawak.taxisBus.bean.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nawak.taxisBus.bean.user.User;

@Repository
public interface UserJPARepository extends JpaRepository<User, Long> {

}
