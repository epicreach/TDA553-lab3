package lab3.controller;

import java.util.ArrayList;
import java.awt.*;

import javax.swing.JButton;
import lab3.model.Vehicle;

public class StopButton extends JButton{
    private static final int X = 800;

    public StopButton(ArrayList<Vehicle> cars){
        super("Stop all cars");
        setBackground(Color.blue);
        setForeground(Color.green);
        setPreferredSize(new Dimension(X/5-15,200));
        
        addActionListener(e -> {
            for (Vehicle car : cars) {
                    car.stopEngine();
            }
        });
    }
}
