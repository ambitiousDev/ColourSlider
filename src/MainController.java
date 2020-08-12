
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saber
 */
public class MainController {

    MainForm form = new MainForm();
    JPanel colorPal = form.getjPanel1();
    JSlider rSlider = form.getjSlider2();
    JSlider gSlider = form.getjSlider1();
    JSlider bSlider = form.getjSlider3();
    JTextField redSt = form.getjTextField1();
    JTextField greenSt = form.getjTextField2();
    JTextField blueSt = form.getjTextField3();

    public MainController() {
        form.setVisible(true);
        rSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int val = rSlider.getValue();
                redSt.setText("R = " + val);
                colorPal.setBackground(new Color(val, gSlider.getValue(), bSlider.getValue()));
            }
        });
        gSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int val = gSlider.getValue();
                greenSt.setText("G = " + val);
                colorPal.setBackground(new Color(rSlider.getValue(), val, bSlider.getValue()));
            }
        });
        bSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int val = bSlider.getValue();
                blueSt.setText("B = " + val);
                colorPal.setBackground(new Color(rSlider.getValue(), gSlider.getValue(), val));
            }
        });
    }

}
