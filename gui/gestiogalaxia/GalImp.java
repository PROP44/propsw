package gui.gestiogalaxia;

import gui.Principal;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

public class GalImp extends JPanel{
	public GalImp() {
		
		//Amb aix� fiquem el fondo del panel transparent.
				setBackground(new Color(0,0,0,0));
				System.out.println("A PINTAAAR IMPORT GALAXIA");
				setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
				
				Box verticalBox = Box.createVerticalBox();
				verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
				add(verticalBox);
				
				//Afegim tot tipus d'info
				JLabel label = new JLabel("New label");
				verticalBox.add(label);
				label.setAlignmentX(Component.CENTER_ALIGNMENT);
				label.setText(String.valueOf(Principal.getCont()));
				
				Component verticalStrut_1 = Box.createVerticalStrut(20);
				verticalBox.add(verticalStrut_1);
				
				Box horizontalBox = Box.createHorizontalBox();
				verticalBox.add(horizontalBox);
				
				Component horizontalStrut = Box.createHorizontalStrut(20);
				horizontalStrut.setMaximumSize(new Dimension(20, 20));
				horizontalBox.add(horizontalStrut);
				
				JTextPane txtpnRuta = new JTextPane();
				txtpnRuta.setEditable(false);
				txtpnRuta.setBorder(new LineBorder(new Color(0, 0, 0)));
				txtpnRuta.setMaximumSize(new Dimension(500, 20));
				horizontalBox.add(txtpnRuta);
				txtpnRuta.setText("Ruta");
				
				Component horizontalStrut_1 = Box.createHorizontalStrut(20);
				horizontalStrut_1.setMaximumSize(new Dimension(20, 20));
				horizontalBox.add(horizontalStrut_1);
				
				JButton btnExaminar = new JButton("Examinar");
				btnExaminar.setAlignmentX(Component.CENTER_ALIGNMENT);
				horizontalBox.add(btnExaminar);
				
				Component verticalStrut = Box.createVerticalStrut(20);
				verticalBox.add(verticalStrut);
				
				JButton btnImportar = new JButton("Importar");
				btnImportar.setAlignmentX(Component.CENTER_ALIGNMENT);
				verticalBox.add(btnImportar);
	}

}