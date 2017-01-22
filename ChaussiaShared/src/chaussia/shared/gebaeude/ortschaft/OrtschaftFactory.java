package chaussia.shared.gebaeude.ortschaft;

import chaussia.shared.Const;
import chaussia.shared.gebaeude.Gebaeudetyp;

public class OrtschaftFactory
{

    public OrtschaftFactory()
    {
    }

    public Ortschaft create(Gebaeudetyp typ)
    {
        AbstractOrtschaft ortschaft = null;
        switch (typ)
        {
            case DORF:
                ortschaft = new Dorf();
                ortschaft.setSteuerertrag(Const.STEUERERTRAG_DORF);
                break;
            case STADT:
                ortschaft = new Stadt();
                ortschaft.setSteuerertrag(2 * Const.STEUERERTRAG_DORF);
                break;
            case GROSSSTADT:
                ortschaft = new Grossstadt();
                ortschaft.setSteuerertrag(4 * Const.STEUERERTRAG_DORF);
                break;
            default:
                break;
        }
        if (ortschaft != null)
        {
            ortschaft.resetBauzeit();
        }
        return ortschaft;
    }
}
