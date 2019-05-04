package com.threadcommunication;

public class ThreadCommunicateReview {
	public static void main(String[] args) {
		int k = 10;
		// 把calculator作为内部类的操作成员，操作共享变量K
		final Calculator calculator = new Calculator(k);
		new Thread(new Runnable() {
			@Override
			public void run() {
				SleepHelper.sleep(100);
				// 进行四轮调换
				for (int i = 0; i < 4; i++) {
					calculator.addNum();
				}
			}

		}, "add").start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				SleepHelper.sleep(100);
				// 进行四轮调换
				for (int i = 0; i < 4; i++) {
					calculator.subNum();
				}
			}
		}, "sub").start();
	}
}

// 建立计算类，把相关计算内容整合到同一个类里面进行管理
class Calculator {
	// 让操作变量属于同一个类，在外部使用
	private int k = 0;
	private volatile boolean isAdd = true;

	public Calculator(int value) {
		this.k = value;
	}

	public synchronized void addNum() {
		while (!isAdd) {
			try {
				// 不是进行“加”操作时，线程进行等待，释放对象锁
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 循环五次进行递增
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + ++k);
		}
		// 执行完递减操作后，把标识位标识为递减，通知其他线程竞争对象锁
		isAdd = false;
		notify();
	}

	public synchronized void subNum()
    {
        while (isAdd)
        {
            try
            {
                // 进行“加”操作时，线程进行等待
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        // 循环五次进行递减
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + --k);
        }
        // 执行完递减操作后，把标识位标识为增加，通知其他线程竞争对象锁
        isAdd = true;
        notify();
    }
}
