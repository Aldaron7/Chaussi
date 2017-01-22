package chaussia.shared.building.production;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.building.BuildingType;
import chaussia.shared.material.Stock;
import chaussia.shared.material.MaterialType;
import chaussia.shared.units.UnitType;

public class Shepherd extends AbstractProductionBuilding
{

    private static final long serialVersionUID = 1L;

    @Override
    public MaterialType getRohstoff()
    {
        return MaterialType.WOOL;
    }

    @Override
    public UnitType getArbeitertyp()
    {
        return UnitType.WORKER;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADE_PRODUCTION1);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.CONSTRUCTIONPERIOD_PRODUCTION1);
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
        return BuildingType.SHEPHERD;
    }

}
