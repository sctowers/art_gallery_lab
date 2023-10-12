import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork;
    Artist artist;
    Customer customer;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("National Gallery", 100000000);
        artist = new Artist("Joe Lycett");
        artwork = new Artwork("Mona Lisa", artist, 1000000);
        customer = new Customer("Kate", 1000000);
    }

    @Test
    public void canGetName() {
        assertThat(gallery.getName()).isEqualTo("National Gallery");
    }

    @Test
    public void canGetTill() {
        assertThat(gallery.getTill()).isEqualTo(100000000);
    }

    @Test
    public void canAddArtwork() {
        gallery.addArtwork(artwork);
        assertThat(gallery.getStock()).isEqualTo(List.of(artwork));
    }

    @Test
    public void canSellArtwork() {
        gallery.addArtwork(artwork);
        gallery.sellArtwork(artwork, customer);
// Ensure the stock is empty after the sale
// The gallery's till should be updated
// The wallet should be empty after the purchase
// The customer collection should contain the collect artwork
        assertThat(gallery.getStock()).isEqualTo(List.of());
        assertThat(gallery.getTill()).isEqualTo(99000000);
        assertThat(customer.getWallet()).isEqualTo(0);
        assertThat(customer.getCollection()).isEqualTo(artwork);
    }
}
