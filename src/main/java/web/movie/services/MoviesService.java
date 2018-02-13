package web.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.movie.model.DetailedMovie;
import web.movie.model.Movie;
import web.movie.repository.MoviesRepository;

import java.util.List;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movie> getAllMovies() {
        return moviesRepository.getAllMovies();
    }

    public DetailedMovie getDetailedMovie(String movieName) {
        return moviesRepository.getDetailedMovie(movieName);
    }
}
