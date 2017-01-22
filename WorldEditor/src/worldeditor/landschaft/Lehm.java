package worldeditor.landschaft;

import worldeditor.Bebauung;

public class Lehm extends Landschaft
{

    private static final long serialVersionUID = 1L;

    public Lehm()
    {
        super();
    }

    public Lehm(int ertrag)
    {
        super(ertrag);
    }

    public Lehm(int ertrag, Bebauung bebauung)
    {
        super(ertrag, bebauung);
    }

}
