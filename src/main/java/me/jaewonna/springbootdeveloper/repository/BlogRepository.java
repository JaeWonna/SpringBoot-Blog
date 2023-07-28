package me.jaewonna.springbootdeveloper.repository;

import me.jaewonna.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
