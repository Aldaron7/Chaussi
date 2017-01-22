package chaussia.shared.building;

import java.io.Serializable;

public abstract class AbstractBuilding implements Serializable, Building
{

    private static final long serialVersionUID = 1L;

    private int               unterhaltskosten, bauzeit, upgradedauer, stufe = 0;

    public AbstractBuilding()
    {
    }

    @Override
    public int getUnterhaltskosten()
    {
        // unterhalt * (2 ^ stufe) = unterhalt * (1,2,4,8,16,...) [exponentielles Wachstum]
        return (int) (this.unterhaltskosten * Math.pow(2, this.getStufe()));
    }

    public void setUnterhaltskosten(int unterhaltskosten)
    {
        this.unterhaltskosten = unterhaltskosten;
    }

    @Override
    public void reduziereBauzeit()
    {
        if (this.bauzeit > 0)
        {
            this.bauzeit--;
        }
    }

    @Override
    public void reduziereUpgradeDauer()
    {
        if (this.upgradedauer > 0)
        {
            if (this.upgradedauer <= 1)
            {
                this.stufe++;
            }
            this.upgradedauer--;
        }
    }

    @Override
    public int getUpgradedauer()
    {
        return this.upgradedauer;
    }

    public void setUpgradedauer(int upgradedauer)
    {
        this.upgradedauer = upgradedauer;
    }

    @Override
    public int getBauzeit()
    {
        return this.bauzeit;
    }

    public void setBauzeit(int bauzeit)
    {
        this.bauzeit = bauzeit;
    }

    @Override
    public int getStufe()
    {
        return this.stufe;
    }

}
