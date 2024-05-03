package com.meikural.codeeditor.repository;

import com.meikural.codeeditor.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
