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
        if (this.getStufe() < 1)
        {
            this.resetUpgradedauer();
        }
        return this;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEPERIOD_SCHOOL);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.CONSTRUCTIONPERIOD_SCHOOL);
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
        return BuildingType.SCHOOL;
    }

    @Override
    public List<UnitType> getAuszubildende()
    {
        List<UnitType> auszubildende = new ArrayList<>();
        switch (this.getStufe())
        {
            case 0:
                auszubildende.add(UnitType.WORKER);
            default:
                break;
        }
        return auszubildende;
    }

}
