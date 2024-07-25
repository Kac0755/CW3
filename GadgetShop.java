import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GadgetShop {
    private ArrayList<Gadget> gadgets = new ArrayList<>();
    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField, phoneNumberField, durationField, downloadSizeField, displayNumberField;
    private JTextArea displayArea;

    public GadgetShop() {
        createGUI();
    }

    private void createGUI() {
        JFrame frame = new JFrame("Gadget Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(12, 2));

        modelField = new JTextField();
        priceField = new JTextField();
        weightField = new JTextField();
        sizeField = new JTextField();
        creditField = new JTextField();
        memoryField = new JTextField();
        phoneNumberField = new JTextField();
        durationField = new JTextField();
        downloadSizeField = new JTextField();
        displayNumberField = new JTextField();
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        frame.add(new JLabel("Model:"));
        frame.add(modelField);
        frame.add(new JLabel("Price:"));
        frame.add(priceField);
        frame.add(new JLabel("Weight:"));
        frame.add(weightField);
        frame.add(new JLabel("Size:"));
        frame.add(sizeField);
        frame.add(new JLabel("Credit:"));
        frame.add(creditField);
        frame.add(new JLabel("Memory:"));
        frame.add(memoryField);
        frame.add(new JLabel("Phone Number:"));
        frame.add(phoneNumberField);
        frame.add(new JLabel("Duration:"));
        frame.add(durationField);
        frame.add(new JLabel("Download Size:"));
        frame.add(downloadSizeField);
        frame.add(new JLabel("Display Number:"));
        frame.add(displayNumberField);

        frame.add(new JScrollPane(displayArea));

        JButton addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(e -> addMobile());
        frame.add(addMobileButton);

        JButton addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(e -> addMP3());
        frame.add(addMP3Button);

        JButton clearButton = new JButton("Clear Fields");
        clearButton.addActionListener(e -> clearFields());
        frame.add(clearButton);

        JButton displayAllButton = new JButton("Display All");
        displayAllButton.addActionListener(e -> displayAll());
        frame.add(displayAllButton);

        JButton makeCallButton = new JButton("Make Call");
        makeCallButton.addActionListener(e -> makeCall());
        frame.add(makeCallButton);

        JButton downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.addActionListener(e -> downloadMusic());
        frame.add(downloadMusicButton);

        frame.setVisible(true);
    }

    private void addMobile() {
        try {
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String size = sizeField.getText();
            int credit = Integer.parseInt(creditField.getText());

            Mobile mobile = new Mobile(model, price, weight, size, credit);
            gadgets.add(mobile);
            displayArea.append("Added Mobile: " + mobile.display() + "\n");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for price, weight, and credit.");
        }
    }

    private void addMP3() {
        try {
            String model = modelField.getText();
            double price = Double.parseDouble(priceField.getText());
            int weight = Integer.parseInt(weightField.getText());
            String size = sizeField.getText();
            int memory = Integer.parseInt(memoryField.getText());

            MP3 mp3 = new MP3(model, price, weight, size, memory);
            gadgets.add(mp3);
            displayArea.append("Added MP3: " + mp3.display() + "\n");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for price, weight, and memory.");
        }
    }

    private void clearFields() {
        modelField.setText("");
        priceField.setText("");
        weightField.setText("");
        sizeField.setText("");
        creditField.setText("");
        memoryField.setText("");
        phoneNumberField.setText("");
        durationField.setText("");
        downloadSizeField.setText("");
        displayNumberField.setText("");
    }

    private void displayAll() {
        displayArea.setText("");
        for (int i = 0; i < gadgets.size(); i++) {
            displayArea.append("Gadget " + i + ":\n" + gadgets.get(i).display() + "\n\n");
        }
    }

    private void makeCall() {
        try {
            int displayNumber = Integer.parseInt(displayNumberField.getText());
            if (gadgets.get(displayNumber) instanceof Mobile) {
                Mobile mobile = (Mobile) gadgets.get(displayNumber);
                String phoneNumber = phoneNumberField.getText();
                int duration = Integer.parseInt(durationField.getText());
                mobile.:makeCall(phoneNumber, duration);
                displayArea.append("Made Call: " + phoneNumber + " for " + duration + " minutes.\n");
            } else {
                JOptionPane.showMessageDialog(null, "Selected gadget is not a mobile.");
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid gadget number.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for gadget number and duration.");
        }
    }

    private void downloadMusic() {
        try {
            int displayNumber = Integer.parseInt(displayNumberField.getText());
            if (gadgets.get(displayNumber) instanceof MP3) {
                MP3 mp3 = (MP3) gadgets.get(displayNumber);
                int size = Integer.parseInt(downloadSizeField.getText());
                mp3.downloadMusic(size);
                displayArea.append("Downloaded music of size " + size + "MB to MP3.\n");
            } else {
                JOptionPane.showMessageDialog(null, "Selected gadget is not an MP3 player.");
            }
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid gadget number.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for gadget number and download size.");
        }
    }

    public static void main(String[] args) {
        new GadgetShop();
    }
}

/**
 * Write a description of class Gadgetshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gadgetshop
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Gadgetshop
     */
    public Gadgetshop()
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
