import java.util.Objects;

public class Movie {
    String name;
    int rating;
    String date;
    String genre;
    public Movie(String name,int rating,String date,String genre){
        this.name=name;
        this.rating=rating;
        this.date=date;
        this.genre=genre;

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", date='" + date + '\'' +
                ", genre='" + genre + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name);
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
