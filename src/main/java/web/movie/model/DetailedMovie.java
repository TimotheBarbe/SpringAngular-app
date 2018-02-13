package web.movie.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class DetailedMovie extends Movie {

    private List<Actor> actors;

    public DetailedMovie(String name, long entranceNumber, double rating, List<Actor> actors) {
        super(name, entranceNumber, rating);
        this.actors = actors;
    }
}
