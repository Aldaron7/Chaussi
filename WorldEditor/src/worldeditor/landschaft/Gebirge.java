package worldeditor.landschaft;

import worldeditor.Bebauung;

public class Gebirge extends Landschaft
{

    private static final long serialVersionUID = 1L;

    public Gebirge()
    {
        super();
    }

    public Gebirge(int ertrag)
    {
        super(ertrag);
    }

    public Gebirge(int ertrag, Bebauung bebauung)
    {
        super(ertrag, bebauung);
    }

}
