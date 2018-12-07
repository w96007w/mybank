package com.example.demo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DataServiceT {
	private static DataService m = new DataService();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDataService() throws Exception {
		m.setDatebaseIp("192.168.172.143");
		m.setDatebasePort("3306");
		m.setDatebaseName("sampledb");
		m.setDatebaseUsername("dev");
		m.setDatebasePassword("welcome1");
		
		ArrayList<Office> list = m.queryOffice();
		
		for(Office o : list){
			System.out.println(o.getCountry() + ":" + o.getCity() );
		}
	}

}
