package com.reg.collections;

import java.util.ArrayList;
import java.util.List;

public class ObjectsCall {

	public List<Bus> getdata() {

		List<Bus> bList = new ArrayList<>();

		Bus b = new Bus();

		b.busno = "ap01";
		b.model = "volvo";
		b.bustype = "sleeper";
		b.buscapacity = "42";
		bList.add(b);

		BusRoute br = new BusRoute();

		br.origin = "guntur";
		br.destination = "banglore";
		br.noofdrivers = 2;
		
		b.badd = br;
		

		Bus b1 = new Bus();

		b1.busno = "ap02";
		b1.model = "volvo";
		b1.bustype = "semi-sleeper";
		b1.buscapacity = "44";
		bList.add(b1);

		BusRoute br1 = new BusRoute();

		br1.origin = "banglore";
		br1.destination = "hyderabad";
		br1.noofdrivers = 1;
		b1.badd = br1;
		

		Bus b2 = new Bus();

		b2.busno = "ap03";
		b2.model = "volvo";
		b2.bustype = "sleeper";
		b2.buscapacity = "42";
		bList.add(b2);

		BusRoute br2 = new BusRoute();

		br2.origin = "guntur";
		br2.destination = "banglore";
		br2.noofdrivers = 2;
		b2.badd = br2;

		Bus b3 = new Bus();

		b3.busno = "ap04";
		b3.model = "benz";
		b3.bustype = "semi-sleeper";
		b3.buscapacity = "44";
		bList.add(b3);

		BusRoute br3 = new BusRoute();

		br3.origin = "guntur";
		br3.destination = "hyd";
		br3.noofdrivers = 1;
		b3.badd = br3;

		return bList;

	}

	public void display() {

		List<Bus> disp = getdata();

		System.out.println("buses details are:");

		for (Bus b : disp) {

			System.out.println("\n busno  :" + b.busno);
			System.out.println("model is:" + b.model);
			System.out.println("type of bus:" + b.bustype);
			System.out.println("max capacity of bus:" + b.buscapacity);

			System.out.println("\n----------Routes----------- :");

			System.out.println("from location:" + b.badd.origin);
			System.out.println("to location:" + b.badd.destination);
			System.out.println("no of drivers :" + b.badd.noofdrivers);

		}

	}
}