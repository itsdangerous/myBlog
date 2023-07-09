package me.itsdangerous.springbootdeveloper.repository;

import me.itsdangerous.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
