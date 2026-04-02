package com.pamionj.usermanagementapi.repository;

import com.pamionj.usermanagementapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}