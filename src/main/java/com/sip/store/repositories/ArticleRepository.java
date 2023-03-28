package com.sip.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sip.store.entities.Article;

public interface ArticleRepository  extends CrudRepository<Article, Long> {

}
