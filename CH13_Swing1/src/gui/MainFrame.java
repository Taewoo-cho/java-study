package gui;

import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;
//import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title); // JFrame에 타이틀을 생성하도록 
		
		// 레이아웃 설정
		setLayout(new BorderLayout());		// 창에 컴포넌트 (버튼 등)을 붙이기 위함
		add(new MainPanel(), BorderLayout.CENTER);
		add(new Toolbar(), BorderLayout.NORTH);
		//JPanel panel = new JPanel();		// JPanel 패널을 생성
		//panel.setBackground(Color.GREEN);	// 색 설정
		//add(panel, BorderLayout.CENTER);	// 메인 프레임에 붙이기 (중앙 가운데 위치)
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 때 프로그램 종료	
		setVisible(true); // 보이게 하기
	}

}
