package com.design.proxy;

/**
 * 静态代理
 * 
 * @author liuwei
 *
 */
public class ProxyTest {
	public static void main(String[] args) {
		BuyHouse buyHouse = new BuyHouseImpl();
		buyHouse.buyHosue();
		BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
		buyHouseProxy.buyHosue();
	}
}
