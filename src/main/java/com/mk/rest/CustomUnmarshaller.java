package com.mk.rest;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.Unmarshaller;

 
public class CustomUnmarshaller implements ContextResolver<Unmarshaller>{

	@Override
	public Unmarshaller getContext(Class<?> type) {
		// TODO Auto-generated method stub
		//Unmarshaller unmarshaller = new Unmarshaller();
		return null;
	}

}
