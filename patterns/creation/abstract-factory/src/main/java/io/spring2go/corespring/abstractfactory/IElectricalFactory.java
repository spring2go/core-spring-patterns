package io.spring2go.corespring.abstractfactory;

// 电器工厂接口
public interface IElectricalFactory {
	
	IFan createFan();
	
	ITubeLight createTubeLight();
}
