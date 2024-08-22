package com.demo.demo66.core.Infrastructure.repo;

import com.demo.demo66.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
