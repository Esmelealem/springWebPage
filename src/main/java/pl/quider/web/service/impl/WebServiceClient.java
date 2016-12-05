package pl.quider.web.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.quider.web.allegro.DoLoginRequest;
import pl.quider.web.allegro.ObjectFactory;
import pl.quider.web.service.ifc.WebServiceAllegro;

@Service
public class WebServiceClient extends WebServiceGatewaySupport implements WebServiceAllegro {

    private ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public void logIn(){
        DoLoginRequest doLoginRequest = objectFactory.createDoLoginRequest();
        Object o = getWebServiceTemplate().marshalSendAndReceive(doLoginRequest);
        System.out.print(o);
    }
}
