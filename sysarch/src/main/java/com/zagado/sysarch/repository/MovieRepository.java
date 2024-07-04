package com.zagado.sysarch.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zagado.sysarch.api.controller.MovieController;
import com.zagado.sysarch.api.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String> {

    List<MovieController> findByTitle(String title);

    List<Movie> findByUrl(String url);
}
