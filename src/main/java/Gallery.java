import java.util.ArrayList;

public class Gallery {

    private String name;
    private ArrayList<Artwork> stock;
    private double till;


    public Gallery(String name, double till){
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = till;
        }

    public String getName(){

        return this.name;
    }

    public ArrayList<Artwork> getStock(){
        return this.stock;
  }

    public double getTill(){

        return this.till;
    }

    public void addArtwork(Artwork artwork) {
        stock.add(artwork);
    }
    
    public void sellArtwork(Artwork artwork, Customer customer){
        if (stock.contains(artwork) && customer.getWallet()>= artwork.getPrice()){
            stock.remove(artwork);
            customer.buyArtwork(artwork);
            till += artwork.getPrice();
        }
    }



}
