package io.test.guiceDemo.server.impl;

import javax.inject.Inject;

import io.test.guiceDemo.server.OrderService;
import io.test.guiceDemo.server.PaymentService;
import io.test.guiceDemo.server.PriceService;


public class OrderServiceImpl implements OrderService{
	private final PriceService priceService;
	private final PaymentService paymentService;
	private final SessionManager sessionManager;
	
	@Inject
	public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
		super();
		this.priceService = priceService;
		this.paymentService = paymentService;
		this.sessionManager = sessionManager;
	}
	
	
}
