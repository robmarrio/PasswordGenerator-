import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JTextField longitud;
    JTextField especiales;
    JTextField numeros;
    JTextField result;
    JCheckBox mayus;
    JButton generate;
    String password = "";

    Ventana() {

        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Password Generator");

        JLabel label1 = new JLabel("Password length");
        label1.setBounds(20, 100, 160, 20);
        JLabel label2 = new JLabel("Number of special characters");
        label2.setBounds(20, 140, 200, 20);
        JLabel label3 = new JLabel("Number of digits");
        label3.setBounds(20, 180, 160, 20);
        JLabel label4 = new JLabel("Activate mayus?");
        label4.setBounds(20, 230, 160, 20);
        JLabel label5 = new JLabel("Password generator");
        label5.setBounds(20, 10, 300, 40);
        label5.setFont(new Font("Arial", Font.BOLD, 25));
        JLabel label6 = new JLabel("Please complete the fields with only digits");
        label6.setBounds(20, 35, 350, 40);
        label6.setFont(new Font("Arial", Font.BOLD, 17));

        longitud = new JTextField();
        longitud.setBounds(250, 100, 50, 20);
        especiales = new JTextField();
        especiales.setBounds(250, 140, 50, 20);
        numeros = new JTextField();
        numeros.setBounds(250, 180, 50, 20);
        result = new JTextField();
        result.setBounds(80, 300, 240, 40);

        result.setText("Your password is here: ");
        result.setEditable(false);

        mayus = new JCheckBox();
        mayus.setBounds(250, 230, 20, 20);

        generate = new JButton("Generate");
        generate.setBounds(140, 270, 100, 20);
        generate.addActionListener(this);

        JLabel label7 = new JLabel("Created by Rober. OpenBootcamp");
        label7.setBounds(200, 355, 200, 20);
        label7.setFont(new Font("Arial", Font.ITALIC, 12));

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(result);
        frame.add(longitud);
        frame.add(especiales);
        frame.add(numeros);
        frame.add(label5);
        frame.add(label6);
        frame.add(mayus);
        frame.add(generate);
        frame.add(label7);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generate) {
            password ="";
            if (mayus.isSelected()) {
                try {
                    int longitudMost = Integer.parseInt(longitud.getText());
                    int especialesMost = Integer.parseInt(especiales.getText());
                    int numerosMost = Integer.parseInt(numeros.getText());
                    int letrasMost = longitudMost - especialesMost - numerosMost;
                    int longitudreal = 0;
                    do {
                        int eleccion = ((int) Math.floor(Math.random() * 4 + 1));
                        if ((eleccion == 1) && (letrasMost != 0)) {
                            int eleccion2 = ((int) Math.floor(Math.random() * 3 + 1));
                            if(eleccion2 == 1) {
                                char letra = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                                password += letra;
                                longitudreal = longitudreal + 1;
                                letrasMost = letrasMost - 1;
                            } else{
                                char letra = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                                password += letra;
                                longitudreal = longitudreal + 1;
                                letrasMost = letrasMost - 1;
                            }
                        }
                        if ((eleccion == 2) && (especialesMost != 0)) {
                            int eleccion2 = ((int) Math.floor(Math.random() * 3 + 1));
                            if (eleccion2 == 1) {
                                char letra = (char) ((int) Math.floor(Math.random() * (48 - 33) + 33));
                                password += letra;

                            } else{
                                char letra = (char) ((int) Math.floor(Math.random() * (65 - 58) + 58));
                                password += letra;
                            }
                            especialesMost = especialesMost - 1;
                            longitudreal = longitudreal + 1;
                        }
                        if ((eleccion == 3) && (numerosMost != 0)) {
                            char letra = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                            password += letra;
                            numerosMost = numerosMost - 1;
                            longitudreal = longitudreal + 1;
                        }
                    } while (longitudreal != longitudMost);
                } catch (Exception b) {
                    JOptionPane.showMessageDialog(null, "YOU DIDN'T ENTER DIGITS!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    int longitudMost = Integer.parseInt(longitud.getText());
                    int especialesMost = Integer.parseInt(especiales.getText());
                    int numerosMost = Integer.parseInt(numeros.getText());
                    int letrasMost = longitudMost - especialesMost - numerosMost;
                    int longitudreal = 0;
                    do {
                        int eleccion = ((int) Math.floor(Math.random() * 4 + 1));
                        if ((eleccion == 1) && (letrasMost != 0)) {
                            char letra = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                            password += letra;
                            longitudreal = longitudreal + 1;
                            letrasMost = letrasMost - 1;
                        }
                        if ((eleccion == 2) && (especialesMost != 0)) {
                            int eleccion2 = ((int) Math.floor(Math.random() * 3 + 1));
                            if (eleccion2 == 1) {
                                char letra = (char) ((int) Math.floor(Math.random() * (48 - 33) + 33));
                                password += letra;
                            } else{
                                char letra = (char) ((int) Math.floor(Math.random() * (65 - 58) + 58));
                                password += letra;
                            }
                            especialesMost = especialesMost - 1;
                            longitudreal = longitudreal + 1;
                        }
                        if ((eleccion == 3) && (numerosMost != 0)) {
                            char letra = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                            password += letra;
                            numerosMost = numerosMost - 1;
                            longitudreal = longitudreal + 1;
                        }
                    } while (longitudreal != longitudMost);
                } catch (Exception b) {
                    JOptionPane.showMessageDialog(null, "YOU DIDN'T ENTER DIGITS!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            result.setText("");
            result.setText(password);
            JOptionPane.showMessageDialog(null, "Your password is: " + password, "Result", JOptionPane.INFORMATION_MESSAGE);

        }
        }
    }
