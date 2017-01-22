package chaussia.shared.gebaeude.produktion;

import java.util.List;

import chaussia.shared.Const;
import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.gebaeude.Gebaeudetyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;
import chaussia.shared.rohstoffe.Rohstofftyp;

public class Baeckerei extends AbstractProduktionsgebaeude
{

    private static final long serialVersionUID = 1L;

    @Override
    public Rohstofftyp getRohstoff()
    {
        return Rohstofftyp.BROT;
    }

    @Override
    public Einheitentyp getArbeitertyp()
    {
        return Einheitentyp.GESELLE;
    }

    @Override
    public void resetUpgradedauer()
    {
        this.setUpgradedauer(Const.UPGRADEDAUER_PRODUKTION2);
    }

    @Override
    public void resetBauzeit()
    {
        this.setBauzeit(Const.BAUZEIT_PRODUKTION2);
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
        return Gebaeudetyp.BAECKEREI;
    }

}
