package chaussia.server;

import java.io.IOException;

import com.esotericsoftware.kryonet.Server;
import com.esotericsoftware.minlog.Log;

import chaussia.shared.Ports;
import chaussia.shared.registry.Registry;

public class ChaussiaServer
{

    private Server server;

    public ChaussiaServer()
    {
        this.server = new Server();
    }

    public void start()
    {
        Log.debug("Server startet");
        new Registry(this.server.getKryo()).registerClasses();
        try
        {
            this.server.bind(Ports.TCP_PORT);
        }
        catch (IOException e)
        {
            Log.error("Server binding zu " + Ports.TCP_PORT + " fehlgeschlagen", e);
        }
        this.server.start();
        this.server.addListener(new ChaussiaServerListener());
    }

    public void stop()
    {
        Log.debug("Server fährt herunter");
        this.server.stop();
    }

}
