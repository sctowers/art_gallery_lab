 import org.junit.jupiter.api.BeforeEach;
 import org.junit.jupiter.api.Test;

 import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

 public class CustomerTest {
     Artist artist;
     Customer customer;
     Artwork artwork;

     @BeforeEach
     public void setUp(){
         artist = new Artist("Joe Lycett");
         artwork = new Artwork("Mona Lisa", artist, 1000000);
         customer = new Customer("Kate", 1000000);
     }

     @Test
     public void canGetName(){
         assertThat(customer.getName()).isEqualTo(("Kate"));
     }

     @Test
     public void canGetWallet(){
         assertThat(customer.getWallet()).isEqualTo((1000000));
         }

     @Test
     public void canAddArtwork(){
          customer.buyArtwork(artwork);
          assertThat(customer.getWallet()).isEqualTo(0);
     }

 }
