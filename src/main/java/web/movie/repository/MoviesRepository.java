package web.movie.repository;

import org.springframework.stereotype.Repository;
import web.movie.model.Actor;
import web.movie.model.DetailedMovie;
import web.movie.model.Movie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class MoviesRepository {

    private static final List<DetailedMovie> fakeDB = Arrays.asList(
            new DetailedMovie("Movie1", 120000L, 4.5,
                    Arrays.asList(new Actor("Actor1", 42),
                            new Actor("Actor2", 22),
                            new Actor("Actor4", 28)
                    )
            ),
            new DetailedMovie("Movie2", 502123L, 3.5,
                    Arrays.asList(new Actor("Actor1", 42)
                    )
            ),
            new DetailedMovie("Movie3", 152L, 2.5,
                    Arrays.asList(new Actor("Actor1", 42),
                            new Actor("Actor2", 22)
                    )
            ),
            new DetailedMovie("Movie4", 805052L, 4.5,
                    Arrays.asList(new Actor("Actor1", 42),
                            new Actor("Actor3", 18)
                    )
            )
    );

    public List<Movie> getAllMovies() {
        return fakeDB.stream()
                .map(x -> (Movie) x)
                .collect(Collectors.toList());
    }

    public DetailedMovie getDetailedMovie(String movieName) {
        return fakeDB.stream()
                .filter(x -> x.getName().equals(movieName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown movie " + movieName));
    }
}
