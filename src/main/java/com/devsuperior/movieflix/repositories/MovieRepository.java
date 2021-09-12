package com.devsuperior.movieflix.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entites.Genre;
import com.devsuperior.movieflix.entites.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	@Query("SELECT DISTINCT obj FROM Movie obj INNER JOIN obj.genre gen WHERE "
			+ "(COALESCE(:genre) IS NULL OR gen IN :genre )"
			+ "ORDER BY obj.title ASC")
	Page <Movie> findByGenre(Genre genre, Pageable pageable);
	
	@Query("SELECT obj FROM Movie obj JOIN FETCH obj.genre WHERE obj IN :movies")
	List<Movie> findMoviesWithgenres(List<Movie> movies);

}
