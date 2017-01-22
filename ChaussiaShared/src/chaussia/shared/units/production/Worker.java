package chaussia.shared.units.production;

import chaussia.shared.Const;
import chaussia.shared.material.Stock;
import chaussia.shared.units.AbstractUnit;
import chaussia.shared.units.UnitType;

public class Worker extends AbstractUnit
{

    @Override
    public void resetAusbildungszeit()
    {
        this.setAusbildungszeit(Const.CONSTRUCTIONPERIOD_PRODUCTION1);
    }

    @Override
    public Stock getAusbildungskosten()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stock getRohstoffUnterhalt()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UnitType getTyp()
    {
        return UnitType.WORKER;
    }

}
