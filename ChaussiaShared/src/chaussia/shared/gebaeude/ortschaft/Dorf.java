package chaussia.shared.gebaeude.ortschaft;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Dorf extends AbstractOrtschaft
{
    private static final long serialVersionUID = 1L;

    public Dorf()
    {
    }

    @Override
    public Gebaeude upgrade()
    {
        Ortschaft stadt = new OrtschaftFactory().create(Gebaeudetyp.STADT);
        stadt.resetUpgradedauer();
        return stadt;
    }

    @Override
    public void resetUpgradedauer()
    {
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.BAUZEIT_DORF);
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
        return Gebaeudetyp.DORF;
    }

}
