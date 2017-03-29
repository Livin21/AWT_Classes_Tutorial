import java.awt.*;
import java.applet.*;

//*****
import java.awt.event.*;
//****

public class ListenerExample extends Applet {
  
  Label labelInsidePanel;

  public void init () {

    setLayout(new GridLayout(1, 3));

    Button button1 = new Button("One");
    Button button2 = new Button("Two");

    button1.addActionListener(new ButtonOneClickListener());

    button2.addActionListener(new ButtonTwoClickListener());
  	
  	add(button1);
  	add(button2);


    Panel panel = new Panel();
    panel.setLayout(new GridLayout(1,2));
    Button buttonInsidePanel = new Button("Click Me");
    labelInsidePanel = new Label(); 
    buttonInsidePanel.addActionListener(new ButtonThreeClickListener());

    panel.add(labelInsidePanel);
    panel.add(buttonInsidePanel);
    add(panel);

  }
  
  class ButtonOneClickListener implements ActionListener {
  	public void actionPerformed (ActionEvent e) {
    	showStatus ("Ouch! I am Button One!");
  	}
  }
  
  class ButtonTwoClickListener implements ActionListener {
  	public void actionPerformed (ActionEvent e) {
    	showStatus ("Ouch! I am Button Two!");
  	}
  }
  
  class ButtonThreeClickListener implements ActionListener {
  	public void actionPerformed (ActionEvent e) {
    	showStatus ("Ouch! I am Button Three!");
  		labelInsidePanel.setText("Hello World!");
  	}
  }
}