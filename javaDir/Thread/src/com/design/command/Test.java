package com.design.command;

/**
 * 命令模式
 * 
 * @author liuwei
 *
 */
public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
