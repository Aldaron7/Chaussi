package chaussia.shared.gebaeude.ausbildung;

import java.util.ArrayList;
import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.gebaeude.AbstractGebaeude;
import chaussia.shared.gebaeude.Gebaeude;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Schule extends AbstractGebaeude implements Ausbildungsgebaeude
{

    private static final long serialVersionUID = 1L;

    @Override
    public Gebaeude upgrade()
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
        this.setUpgradedauer(Const.UPGRADEDAUER_SCHULE);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.BAUZEIT_SCHULE);
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
        return Gebaeudetyp.SCHULE;
    }

    @Override
    public List<Einheitentyp> getAuszubildende()
    {
        List<Einheitentyp> auszubildende = new ArrayList<>();
        switch (this.getStufe())
        {
            case 0:
                auszubildende.add(Einheitentyp.EINFACHER_ARBEITER);
            case 1:
                auszubildende.add(Einheitentyp.GESELLE);
            default:
                break;
        }
        return auszubildende;
    }

}
