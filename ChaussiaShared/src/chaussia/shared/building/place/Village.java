package chaussia.shared.building.place;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.Building;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;

public class Village extends AbstractPlace
{
    private static final long serialVersionUID = 1L;

    public Village()
    {
    }

    @Override
    public Building upgrade()
    {
        Place stadt = new PlaceFactory().create(BuildingType.TOWN);
        stadt.resetUpgradePeriod();
        return stadt;
    }

    @Override
    public void resetUpgradePeriod()
    {
    }

    @Override
    public void resetConstructionPeriod()
    {
        this.setConstructionperiod(Const.CONSTRUCTIONPERIOD_VILLAGE);
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
        return BuildingType.VILLAGE;
    }

}
