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
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEPERIOD_CITY);
    }

    @Override
    public void resetBauzeit()
    {
    }

    @Override
    public List<BuildingType> getBenoetigteGebaeude()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Stock getBaukosten()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BuildingType getTyp()
    {
        return BuildingType.CITY;
    }

}
