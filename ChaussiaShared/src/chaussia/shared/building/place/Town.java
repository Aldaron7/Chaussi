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
        grossstadt.resetUpgradedauer();
        return grossstadt;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEPERIOD_TOWN);
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
        return BuildingType.TOWN;
    }

}
