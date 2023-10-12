import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Joe Lycett");
        artwork = new Artwork ("Mona Lisa", artist, 1000000);
    }

    @Test
    public void canGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canGetPrice(){
      assertThat(artwork.getPrice()).isEqualTo(1000000);
    }

}
