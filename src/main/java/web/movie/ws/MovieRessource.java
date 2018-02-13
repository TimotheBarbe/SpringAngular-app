package web.movie.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.movie.model.Movie;
import web.movie.model.DetailedMovie;
import web.movie.services.MoviesService;

import java.util.List;

@RestController
@RequestMapping(value = "/movies", produces = "application/json; charset=UTF-8")
@Slf4j
public class MovieRessource {

    @Autowired
    private MoviesService moviesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Movie> getMovies() {
        log.info("Fetching all movies");
        return moviesService.getAllMovies();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public DetailedMovie getDetailedMovie(@PathVariable("name") String movieName) {
        log.info("Fetching detail for movie " + movieName);
        return moviesService.getDetailedMovie(movieName);
    }

}