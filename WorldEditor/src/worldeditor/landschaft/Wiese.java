package worldeditor.landschaft;

import worldeditor.Bebauung;

public class Wiese extends Landschaft
{

    private static final long serialVersionUID = 1L;

    public Wiese()
    {
        super();
    }

    public Wiese(int ertrag)
    {
        super(ertrag);
    }

    public Wiese(int ertrag, Bebauung bebauung)
    {
        super(ertrag, bebauung);
    }

}
