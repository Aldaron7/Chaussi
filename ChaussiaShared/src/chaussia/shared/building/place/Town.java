package chaussia.shared.building.place;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;

public class Town extends AbstractPlace
{
    private static final long serialVersionUID = 1L;

    public Town()
    {
    }

    @Override
    public Building upgrade()
    {

        Place grossstadt = new PlaceFactory().create(BuildingType.CITY);
        grossstadt.resetUpgradePeriod();
        return grossstadt;
    }

    @Override
    public void resetUpgradePeriod()
    {
        this.setupgradeperiod(Const.UPGRADEPERIOD_TOWN);
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
        return BuildingType.TOWN;
    }

}
