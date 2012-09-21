package de.dpunkt.myaktion.monitor.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import de.dpunkt.myaktion.model.Spende;
import de.dpunkt.myaktion.monitor.MonitorWebSocket;

@WebService
public class SpendeService {
	@WebMethod
	public void addSpende(Spende spende) {
		MonitorWebSocket.getInstance().sendSpende(spende);
	}
}