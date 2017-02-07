package micky.service;

public class BServiceProvider implements Provider {

	@Override
	public Service newService() {
		return new BService();
	}

}
