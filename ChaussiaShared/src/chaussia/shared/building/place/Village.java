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
        stadt.resetUpgradedauer();
        return stadt;
    }

    @Override
    public void resetUpgradedauer()
    {
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.CONSTRUCTIONPERIOD_VILLAGE);
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
        return BuildingType.VILLAGE;
    }

}
