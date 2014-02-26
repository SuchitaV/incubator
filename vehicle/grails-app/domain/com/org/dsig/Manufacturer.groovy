package com.org.dsig

class Manufacturer {
	String name
	String location
    
	static constraints = {
		name blank:false
		location blank:false
    }
}
