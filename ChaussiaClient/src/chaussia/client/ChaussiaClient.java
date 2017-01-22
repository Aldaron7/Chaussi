package chaussia.client;

import java.io.IOException;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.minlog.Log;

import chaussia.shared.Ports;
import chaussia.shared.registry.Registry;

public class ChaussiaClient
{

    private Client client;

    public ChaussiaClient()
    {
        this.client = new Client();
    }

    public void start()
    {
        new Registry(this.client.getKryo()).registerClasses();
        this.client.addListener(new ChaussiaClientListener());
        this.client.start();
        try
        {
            this.client.connect(5000, Ports.SERVER_IP, Ports.TCP_PORT);
        }
        catch (IOException e)
        {
            Log.error(String.format("Connection zu %s:%d fehlgeschlagen", Ports.SERVER_IP, Ports.TCP_PORT), e);
        }
    }

}
