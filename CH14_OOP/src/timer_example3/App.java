package timer_example3;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


// 하나의 파일에 여러개의 클래스를 만들 수 있다. 그러나 public 클래스는 단 하나이고 파일의 이름과 같다.
class Alert extends TimerTask { 	// 추상클래스
	@Override
	public void run() {
		System.out.println("헬로우!");
	}
}

class Task implements Runnable {	// 추상클래스 run메소드
	@Override
	public void run() {
		System.out.println("하이!");
		
	}
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000); // 할 일: run(), 0초뒤 실행, 반복 1초(1000)

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); // 할일 시작시간 반복시간 단위

	
	}
}
