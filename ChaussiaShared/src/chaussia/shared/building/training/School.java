package chaussia.shared.building.training;

import java.util.ArrayList;
import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.AbstractBuilding;
import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;
import chaussia.shared.units.UnitType;

public class School extends AbstractBuilding implements TrainingFacility
{

    private static final long serialVersionUID = 1L;

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
    public void resetUpgradePeriod()
    {
        this.setupgradeperiod(Const.UPGRADEPERIOD_SCHOOL);
    }

    @Override
    public void resetConstructionPeriod()
    {
        this.setConstructionperiod(Const.CONSTRUCTIONPERIOD_SCHOOL);
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
        return BuildingType.SCHOOL;
    }

    @Override
    public List<UnitType> getTrainees()
    {
        List<UnitType> auszubildende = new ArrayList<>();
        switch (this.getTier())
        {
            case 0:
                auszubildende.add(UnitType.WORKER);
            default:
                break;
        }
        return auszubildende;
    }

}
