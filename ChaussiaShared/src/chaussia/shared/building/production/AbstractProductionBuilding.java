package chaussia.shared.building.production;

import chaussia.shared.building.AbstractBuilding;
import chaussia.shared.building.Building;

public abstract class AbstractProductionBuilding extends AbstractBuilding implements ProductionBuilding
{
    private static final long serialVersionUID = 1L;
    private int               ertrag, anzahlArbeiter = 0;
    private boolean           arbeitet         = false;

    public AbstractProductionBuilding()
    {
    }

    @Override
    public int getErtrag()
    {
        // lineare Entwicklung proportional zu anzahl Arbeiter
        if (this.getBauzeit() <= 0 && this.isArbeitet())
        {
            return this.ertrag * (this.anzahlArbeiter);
        }
        return 0;
    }

    public void setErtrag(int ertrag)
    {
        this.ertrag = ertrag;
    }

    @Override
    public boolean isArbeitet()
    {
        if (this.anzahlArbeiter <= 0)
        {
            return false;
        }
        return this.arbeitet;
    }

    @Override
    public void setArbeitet(boolean arbeitet)
    {
        this.arbeitet = arbeitet;
    }

    @Override
    public boolean addArbeiter()
    {
        if (this.anzahlArbeiter < this.getMaxArbeiter())
        {
            this.anzahlArbeiter++;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeArbeiter()
    {
        if (this.anzahlArbeiter > 0)
        {
            this.anzahlArbeiter--;
            return true;
        }
        return false;

    }

    @Override
    public int getMaxArbeiter()
    {
        return this.getStufe() + 1;
    }

    @Override
    public int getUnterhaltskosten()
    {
        if (this.isArbeitet())
        {
            return super.getUnterhaltskosten();
        }
        return 0;
    }

    @Override
    public Building upgrade()
    {
        this.resetUpgradedauer();
        return this;
    }

}
