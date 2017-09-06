package com.sai;

import org.apache.cxf.bus.spring.SpringBusFactory;

public class Starter {

	public static void main(String[] args) {
		SpringBusFactory bf = new SpringBusFactory();
		bf.createBus("cxf-beans.xml");
	}

}
