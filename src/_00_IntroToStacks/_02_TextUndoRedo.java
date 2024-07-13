package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
String text = "";
Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
		new _02_TextUndoRedo().run();
	}

	void run(){
		frame.setVisible(true);
frame.addKeyListener(this);
panel.add(label);
frame.add(panel);
frame.pack();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		char a = arg0.getKeyChar();
		if(arg0.getKeyCode() != 8 && arg0.getKeyCode() != 45) {
			text += a;
			label.setText(text);
		}
		if(arg0.getKeyCode() == 8) {
			stack.push(text.charAt(text.length()-1));
			text = text.substring(0, text.length()-1);
			label.setText(text);
		}
		if(arg0.getKeyCode() == 45) {
			char b = stack.pop();
			text +=b;
			label.setText(text);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}






}
