package com.forcastthis.nonsense;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyNonsenseClass {

	public void run() {

		Logger log = LoggerFactory.getLogger(getClass());

		for(int i=0; i<10; i++) {
			log.warn("Nonsense = {}", i);
		}

	}

}
