package effective.ch2.r1to3.service;

public class BServiceProvider implements Provider {

	@Override
	public Service newService() {
		return new BService();
	}

}
