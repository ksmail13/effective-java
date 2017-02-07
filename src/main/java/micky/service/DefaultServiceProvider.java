package micky.service;

public class DefaultServiceProvider implements Provider {

	@Override
	public Service newService() {
		return new DefaultService();
	}

}
