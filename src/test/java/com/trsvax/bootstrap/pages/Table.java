package com.trsvax.bootstrap.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Property;

import com.trsvax.bootstrap.Address;

public class Table {
	
	@Property
	private List<Address> addresses;
	
	@BeginRender
	void beginRender() {
		addresses = new ArrayList<Address>();
		Address address = new Address();
		address.firstName = "Barry";
		for ( int i = 0; i < 100; i++) {
			addresses.add(address);
		}
	}

}
