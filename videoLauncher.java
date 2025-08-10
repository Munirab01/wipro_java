
class video{
    private String videoname;
    private boolean checkout;
    private int rating;

    public video(String name){
        this.videoname = name;
        this.checkout = false;
        this.rating = 0;    
    }

    public String getName(){
        return videoname;
    }

    void doCheckout(){
        checkout = true;
    }

    void doReturn(){
        checkout = false;
    }

    void receiveRating(int rating){
        if(rating >= 1 && rating <= 5){
            this.rating = rating ;
        } else {
            System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
        }
    }

    int getRating(){
        return rating;
    }

    boolean getCheckout(){
        return checkout;
    }

}

class videoStore{
    private video[] store = new video[10];

    void addVideo(String name){
        for(int i = 0; i < store.length; i++){
            if(store[i] == null){
                store[i] = new video(name);
                System.out.println("Video added: " + name);
                return;
            }
        }
        System.out.println("Store is full, cannot add more videos.");
    }

    void doCheckout(String name){
        for(video v : store){
            if(v != null && v.getName().equals(name)){
                if(!v.getCheckout()){
                    v.doCheckout();
                    System.out.println("Checked out: " + name);
                } else {
                    System.out.println("Video is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    void doReturn(String name){
        for(video v : store){
            if(v != null && v.getName().equals(name)){
                if(v.getCheckout()){
                    v.doReturn();
                    System.out.println("Returned: " + name);
                } else {
                    System.out.println("Video was not checked out.");
                }
                return;
            }
        }
        System.out.println("Video not found.");
    }

    void receiveRating(String name, int rating){
        for(video v : store){
            if(v != null && v.getName().equals(name)){
                v.receiveRating(rating);
                System.out.println("Rating received for " + name + ": " + rating);
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
        }
    }
}


public class videoLauncher {
    public static void main(String[] args){
        videoStore vs = new videoStore();
        vs.addVideo("Interstellar");
        vs.addVideo("Inception");
        vs.receiveRating("Interstellar", 5);
        vs.receiveRating("Inception", 4);
        vs.doCheckout("Interstellar");
        vs.listInventory();
        vs.doReturn("Interstellar");
        vs.listInventory();
    }
}
