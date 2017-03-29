import java.awt.*;
import java.applet.*;
public class PanelExample extends Applet {
  public void init () {
    
    setLayout (new BorderLayout()); 
    
    add (new Button ("North"),BorderLayout.NORTH);
    add (new Button ("West"),BorderLayout.WEST);
    add (new Button ("East"),BorderLayout.EAST);
    add (new Button ("Center"),BorderLayout.CENTER);
    
    Panel p = new Panel();
	  
    add (p, BorderLayout.SOUTH);
	  
    p.add (new Button ("I am inside a panel"));
	  p.add (new Button ("Button 2"));
  }
} 