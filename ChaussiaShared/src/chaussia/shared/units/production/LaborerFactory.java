package chaussia.shared.units.production;

import chaussia.shared.Const;
import chaussia.shared.units.AbstractUnit;
import chaussia.shared.units.Unit;
import chaussia.shared.units.UnitType;

public class LaborerFactory
{

    public LaborerFactory()
    {
    }

    public Unit create(UnitType typ)
    {
        AbstractUnit arbeiter = null;
        switch (typ)
        {
            case WORKER:
                arbeiter = new Worker();
                arbeiter.setUnterhaltskosten(Const.UPKEEP_WORKER);
                break;
            default:
                break;
        }
        if (arbeiter != null)
        {
            arbeiter.resetAusbildungszeit();
        }
        return arbeiter;
    }
}
