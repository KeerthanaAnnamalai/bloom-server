package com.meikural.codeeditor.repository;

import com.meikural.codeeditor.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
}
