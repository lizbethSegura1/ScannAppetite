package com.example.entitys;

public enum Estado {
	NEW, PAYED, PAYMENT_CONFIRM, COOKING, DELIVERY, DONE;

	private static final Estado[] statuses = values();

	//Este método permite obtener el siguiente estado en la secuencia de estados
	public Estado next() {
		return statuses[(this.ordinal() + 1) % statuses.length];
	}
}