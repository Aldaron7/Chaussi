package chaussia.shared.building.place;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;

public class City extends AbstractPlace
{
    private static final long serialVersionUID = 1L;

    public City()
    {
    }

    @Override
    public Building upgrade()
    {
        return null;
    }

    @Override
    public void resetUpgradePeriod()
    {
        this.setupgradeperiod(Const.UPGRADEPERIOD_CITY);
    }

    @Override
    public void resetConstructionPeriod()
    {
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
        return BuildingType.CITY;
    }

}
