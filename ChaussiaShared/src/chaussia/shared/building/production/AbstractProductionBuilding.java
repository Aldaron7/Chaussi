package chaussia.shared.building.production;

import java.util.ArrayList;
import java.util.List;

import chaussia.shared.building.AbstractBuilding;
import chaussia.shared.building.Building;
import chaussia.shared.units.Unit;

public abstract class AbstractProductionBuilding extends AbstractBuilding implements ProductionBuilding
{

    private static final long serialVersionUID = 1L;
    private List<Unit>        laborer          = new ArrayList<>();
    private boolean           active           = false;

    public AbstractProductionBuilding()
    {
    }

    @Override
    public int getUpkeep()
    {
        // lineare Entwicklung proportional zu anzahl Arbeiter
        if (this.getConstructionPeriod() <= 0 && this.isActive())
        {
            return super.getUpkeep() * (this.laborer.size());
        }
        return 0;
    }

    @Override
    public boolean isActive()
    {
        if (this.laborer.size() <= 0)
        {
            return false;
        }
        return this.active;
    }

    @Override
    public void setActive(boolean arbeitet)
    {
        this.active = arbeitet;
    }

    @Override
    public boolean addLaborer(Unit unit)
    {
        if (this.laborer.size() < this.getMaxLaborer())
        {
            return this.laborer.add(unit);
        }
        return false;
    }

    @Override
    public Unit removeLaborer()
    {
        if (!this.laborer.isEmpty())
        {
            return this.laborer.remove(0);
        }
        return null;

    }

    @Override
    public List<Unit> getLaborer()
    {
        return this.laborer;
    }

    @Override
    public int getMaxLaborer()
    {
        return this.getTier() + 1;
    }

    @Override
    public Building upgrade()
    {
        this.resetUpgradePeriod();
        return this;
    }

}
