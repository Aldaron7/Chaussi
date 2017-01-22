package chaussia.shared.building.place;

import chaussia.shared.building.AbstractBuilding;

public abstract class AbstractPlace extends AbstractBuilding implements Place
{
    private static final long serialVersionUID = 1L;
    private int               taxes;

    public AbstractPlace()
    {
    }

    @Override
    public int getTaxes()
    {
        if (this.getUpgradePeriod() > 0)
        {
            return this.taxes / 2;
        }
        return this.taxes;
    }

    public void setTaxes(int taxes)
    {
        this.taxes = taxes;
    }

}
