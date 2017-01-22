package chaussia.shared.gebaeude.ortschaft;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Grossstadt extends AbstractOrtschaft
{
    private static final long serialVersionUID = 1L;

    public Grossstadt()
    {
    }

    @Override
    public Gebaeude upgrade()
    {
        return null;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEDAUER_GROSSSTADT);
    }

    @Override
    public void resetBauzeit()
    {
    }

    @Override
    public List<Gebaeudetyp> getBenoetigteGebaeude()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RohstoffVorrat getBaukosten()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Gebaeudetyp getTyp()
    {
        return Gebaeudetyp.GROSSSTADT;
    }

}
