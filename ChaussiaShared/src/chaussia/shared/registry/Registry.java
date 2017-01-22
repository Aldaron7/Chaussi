package chaussia.shared.registry;

import com.esotericsoftware.kryo.Kryo;

import chaussia.shared.messages.NeuesSpielMsg;

public class Registry
{

    private Kryo kryo;

    public Registry(Kryo kryo)
    {
        this.kryo = kryo;
    }

    public void registerClasses()
    {
        this.kryo.register(NeuesSpielMsg.class);
    }

}
