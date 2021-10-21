package application;

//import javax.swing.JFrame;

import gui.MainFrame;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// JFrame으로 윈도우 창 만들기
		SwingUtilities.invokeLater(()->{
			
			new MainFrame("Test Swing App"); // 새창 mainFrame을 생성 
		});
		
	}

}
