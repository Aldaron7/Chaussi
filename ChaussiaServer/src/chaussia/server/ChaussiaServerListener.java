package chaussia.server;

import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import chaussia.shared.messages.NeuesSpielMsg;

public class ChaussiaServerListener extends Listener
{
    private Map<Integer, Connection> connections = new HashMap<>();

    public ChaussiaServerListener()
    {
    }

    @Override
    public void received(Connection connection, Object object)
    {
        if (object instanceof NeuesSpielMsg)
        {

        }

    }

    @Override
    public void connected(Connection connection)
    {
        this.connections.put(connection.getID(), connection);
    }

    @Override
    public void disconnected(Connection connection)
    {
        this.connections.remove(connection.getID());
    }

}
