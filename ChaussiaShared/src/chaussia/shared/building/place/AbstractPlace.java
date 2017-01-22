package chaussia.shared.building.place;

import chaussia.shared.building.AbstractBuilding;

public abstract class AbstractPlace extends AbstractBuilding implements Place
{
    private static final long serialVersionUID = 1L;
    private int               steuerertrag;

    public AbstractPlace()
    {
    }

    @Override
    public int getSteuerertrag()
    {
        if (this.getUpgradedauer() > 0)
        {
            return this.steuerertrag / 2;
        }
        return this.steuerertrag;
    }

    public void setSteuerertrag(int steuerertrag)
    {
        this.steuerertrag = steuerertrag;
    }

}
