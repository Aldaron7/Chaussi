package chaussia.shared.gebaeude.ortschaft;

import chaussia.shared.gebaeude.AbstractGebaeude;

public abstract class AbstractOrtschaft extends AbstractGebaeude implements Ortschaft
{
    private static final long serialVersionUID = 1L;
    private int               steuerertrag;

    public AbstractOrtschaft()
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
