package com;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.alibaba.fastjson.JSONObject;

public class TestJson {
	public static void main(String[] args) {
		System.out.println("abc");
		
		ArrayList list = new ArrayList();
		JSONObject object = new JSONObject();
		object.put("abc", "张园");
		System.out.println("str = " + object.toJSONString());
		
		System.out.println("length = " + URLEncoder.encode(object.toJSONString()));
		
		String length = object.toJSONString();
		byte[] bytes = length.getBytes(Charset.forName("utf-8"));
		for(int i = 0;i < bytes.length; i ++) {
			System.out.println("A = " + bytes[i]);
		}
		System.out.println("length.getBytes() = " + length.getBytes(Charset.forName("utf-8")).toString());
		System.out.println("Charset.defaultCharset().name() = " + Charset.defaultCharset().name());
		
		RobotState i = RobotState.charge_detach;
		System.out.println("length.getBytes() = " + RobotState.valueOf("charge_dock").ordinal());
		
		int i11 = 10*000;
		System.out.println("length.getBytes()1111 = " + i11);
	}
	
	public enum RobotState {
        navigating,
        idle,
        charge_move,
        charge_dock,
        charge_on_station,
        charge_detach
    }
}
