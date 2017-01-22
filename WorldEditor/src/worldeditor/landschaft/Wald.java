package worldeditor.landschaft;

import worldeditor.Bebauung;

public class Wald extends Landschaft
{

    private static final long serialVersionUID = 1L;

    public Wald()
    {
        super();
    }

    public Wald(int ertrag)
    {
        super(ertrag);
    }

    public Wald(int ertrag, Bebauung bebauung)
    {
        super(ertrag, bebauung);
    }

}
