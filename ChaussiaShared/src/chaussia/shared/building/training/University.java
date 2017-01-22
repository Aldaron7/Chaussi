package chaussia.shared.building.training;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.AbstractBuilding;
import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;
import chaussia.shared.units.UnitType;

public class University extends AbstractBuilding implements TrainingFacility
{

    private static final long serialVersionUID = 1L;

    @Override
    public void resetUpgradePeriod()
    {
        this.setupgradeperiod(Const.UPGRADEPERIOD_UNIVERSITY);
    }

    @Override
    public void resetConstructionPeriod()
    {
        this.setConstructionperiod(Const.CONSTRUCTIONPERIOD_UNIVERSITY);
    }

    @Override
    public Building upgrade()
    {
        if (this.getTier() < 1)
        {
            this.resetUpgradePeriod();
        }
        return this;
    }

    @Override
    public List<BuildingType> getRequiredBuildings()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stock getConstructionCost()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BuildingType getType()
    {
        return BuildingType.UNIVERSITY;
    }

    @Override
    public List<UnitType> getTrainees()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
