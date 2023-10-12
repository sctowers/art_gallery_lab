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

    public ArrayList<Artwork> getStocks(){
//    return this.stock;
//////    }        public ArrayList<Artwork> getStock(){
          return this.stock;
  }

    public double getTill(){
         return this.till;
    }

    public void addArtwork(Artwork artwork) {
        stock.add(artwork);
    }
    //
    
    
    
  








}
