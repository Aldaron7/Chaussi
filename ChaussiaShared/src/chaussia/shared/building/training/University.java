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
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEPERIOD_UNIVERSITY);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.CONSTRUCTIONPERIOD_UNIVERSITY);
    }

    @Override
    public Building upgrade()
    {
        if (this.getStufe() < 1)
        {
            this.resetUpgradedauer();
        }
        return this;
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
        return BuildingType.UNIVERSITY;
    }

    @Override
    public List<UnitType> getAuszubildende()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
