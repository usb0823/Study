package com.design.proxy.dynamic;

import java.lang.reflect.Proxy;

import com.design.proxy.BuyHouse;
import com.design.proxy.BuyHouseImpl;

public class DynamicProxyTest {
	public static void main(String[] args) {
		System.out.println("DynamicProxyTest");
		BuyHouse buyHouse = new BuyHouseImpl();
		BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
				new Class[] { BuyHouse.class }, new DynamicProxyHandler(buyHouse));
		proxyBuyHouse.buyHosue();
	}
}
