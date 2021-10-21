package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


//class RedListener implements ActionListener {
//	private MainPanel mainPanel;
//	
//	public RedListener(MainPanel mainPanel) {
//		this.mainPanel=mainPanel;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("빨간버튼 클릭!");
//		mainPanel.setBackground(Color.RED);
//	}
//}
//
//
//class BlueListener implements ActionListener {
//	private MainPanel mainPanel; // 변수 생성
//	
//	public BlueListener(MainPanel mainPanel) {
//		this.mainPanel=mainPanel;	// 외부에서 값을 받아옴
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("파란버튼 클릭!");	
//		mainPanel.setBackground(Color.BLUE);
//	}
//}

class ColorListener implements ActionListener {
	private MainPanel mainPanel;
	private Color color;
	
	public ColorListener(MainPanel mainPanel, Color color) {
		this.mainPanel = mainPanel;
		this.color=color;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("버튼 클릭!");	
		mainPanel.setBackground(color);
	}
}


public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new ColorListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorListener(mainPanel, Color.blue));
		
		add(redButton);
		add(blueButton);
	}
}

