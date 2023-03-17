package tn.csf.souk.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.souk.model.Article;

 
//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  
