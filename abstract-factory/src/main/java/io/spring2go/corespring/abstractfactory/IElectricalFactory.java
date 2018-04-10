package io.spring2go.corespring.abstractfactory;

public interface IElectricalFactory {
	
	IFan createFan();
	
	ITubeLight createTubeLight();
}
