import java.util.Objects;


public class Song {
        public final String title;
        public final String artist;
        public final String songwriter;

        public Song(String title, String artist, String songwriter) {
            this.title = title;
            this.artist = artist;
            this.songwriter = songwriter;
        }

    @Override
    public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass())
                return false;
            if (this == obj || this.artist == ((Song) obj).artist)
            return true;

        return false;
    }

}
