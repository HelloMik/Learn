package lessons;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class lesson6
{
  public static void main( String[] args ) {

    JFrame frame = new JFrame( "Hellow world" );
    frame.add( new HelloComponent2("Привет! Как дела") );
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize( 300, 300 );
    frame.setVisible( true );
    
  } // end of main
} // end of class


class HelloComponent2 extends JComponent 
	implements MouseMotionListener, ActionListener
{
  String theMessage;
//  String message;
  int messageX = 125, messageY = 95; // Coordinates of the message

  JButton theButton;

  int colorIndex;
  static Color[] someColors = {
    Color.black, Color.red, Color.green, Color.blue, Color.magenta };

  boolean blinkState;

  
  public HelloComponent2( String message ) {
    theMessage = message;
    
    theButton = new JButton("Change Color");
    
    setLayout( new FlowLayout() );
    add( theButton );

    theButton.addActionListener( this );    
    
//    this.message = message;
    addMouseMotionListener(this);
    
  } // end of helloComponent
   
  public void paintComponent( Graphics g ) {
    g.drawString( theMessage, messageX, messageY );
  }
    
  public void mouseDragged(MouseEvent e) {
    // Save the mouse coordinates and paint the message.
    messageX = e.getX();
    messageY = e.getY();
    repaint();
  }
  
  public void mouseMoved(MouseEvent e) {
	  
  }
  
  
  public void actionPerformed( ActionEvent e ) {
	    if (e.getSource() == theButton)
	      changeColor();
	  }
  
  synchronized private void changeColor() {
	    if (++colorIndex == someColors.length)
	      colorIndex = 0;
	    setForeground( currentColor() ); 
	    repaint();
	  }

  synchronized private Color currentColor() {
    return someColors[colorIndex];
  }
  
  
} // end of class