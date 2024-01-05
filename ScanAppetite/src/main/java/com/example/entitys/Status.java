package com.example.entitys;

public enum Status {
	NEW, PAYED, PAYMENT_CONFIRM, COOKING, DELIVERY, DONE;

	private static final Status[] statuses = values();

	//Este método permite obtener el siguiente estado en la secuencia de estados
	public Status next() {
		return statuses[(this.ordinal() + 1) % statuses.length];
	}
}