public class MP3 extends Gadget {
    private int availableMemory;

    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super.display(model,price,weight,size);
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void downloadMusic(int size) {
        if (size <= availableMemory) {
            availableMemory -= size;
            System.out.println("Downloaded music of size " + size + "MB.");
        } else {
            System.out.println("Not enough memory to download the music.");
        }
    }

     
    public String display() {
        return super.display() + "\nAvailable Memory: " + availableMemory;
    }
}

/**
 * Write a description of class MP3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  public class MP3

{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MP3
     */
    public MP3()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
