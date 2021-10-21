package timer_ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;




class Alert extends TimerTask {
	@Override
	public void run() {
		System.out.println("계란 삶는 중");
	}
}


class Task implements Runnable {	// 추상클래스 run메소드
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란삶기 완료");
	}
}


public class App {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 10, 30, TimeUnit.SECONDS); // 할일 시작시간 반복시간 단위

	}

}
