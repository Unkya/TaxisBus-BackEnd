package com.nawak.taxisBus.services.exception;

public class CRUDNotFoundException extends Exception{

	private String object;
	private Long id;
	
	public CRUDNotFoundException(String object, Long id) {
		this.object = object;
		this.id = id;
	}
	
	@Override
	public String getMessage() {
		return "L'objet de type "+ object +" avec l'id "+id+" n'a pas été trouvé.";
	}
}
