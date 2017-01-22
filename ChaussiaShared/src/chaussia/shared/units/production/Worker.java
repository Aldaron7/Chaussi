package chaussia.shared.units.production;

import chaussia.shared.Const;
import chaussia.shared.material.Stock;
import chaussia.shared.units.AbstractUnit;
import chaussia.shared.units.UnitType;

public class Worker extends AbstractUnit
{

    @Override
    public void resetTrainigPeriod()
    {
        this.setTrainingPeriod(Const.CONSTRUCTIONPERIOD_PRODUCTION1);
    }

    @Override
    public Stock getTrainingCost()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stock getUpkeepMaterials()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UnitType getType()
    {
        return UnitType.WORKER;
    }

}
