package chaussia.shared.building;

import java.io.Serializable;

public abstract class AbstractBuilding implements Serializable, Building
{

    private static final long serialVersionUID = 1L;

    private int               upkeep, constructionperiod, upgradeperiod, tier = 0;

    public AbstractBuilding()
    {
    }

    @Override
    public int getUpkeep()
    {
        // unterhalt * (2 ^ stufe) = unterhalt * (1,2,4,8,16,...) [exponentielles Wachstum]
        return (int) (this.upkeep * Math.pow(2, this.getTier()));
    }

    public void setUpkeep(int upkeep)
    {
        this.upkeep = upkeep;
    }

    @Override
    public void reduceConstructionPeriod()
    {
        if (this.constructionperiod > 0)
        {
            this.constructionperiod--;
        }
    }

    @Override
    public void reduceUpgrdePeriod()
    {
        if (this.upgradeperiod > 0)
        {
            if (this.upgradeperiod <= 1)
            {
                this.tier++;
            }
            this.upgradeperiod--;
        }
    }

    @Override
    public int getUpgradePeriod()
    {
        return this.upgradeperiod;
    }

    public void setupgradeperiod(int upgradeperiod)
    {
        this.upgradeperiod = upgradeperiod;
    }

    @Override
    public int getConstructionPeriod()
    {
        return this.constructionperiod;
    }

    public void setConstructionperiod(int constructionperiod)
    {
        this.constructionperiod = constructionperiod;
    }

    @Override
    public int getTier()
    {
        return this.tier;
    }

}
