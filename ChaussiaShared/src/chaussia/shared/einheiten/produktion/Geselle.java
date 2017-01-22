package chaussia.shared.einheiten.produktion;

import chaussia.shared.Konstanten;
import chaussia.shared.einheiten.AbstractEinheit;
import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class Geselle extends AbstractEinheit
{

    @Override
    public void resetAusbildungszeit()
    {
        this.setAusbildungszeit(Konstanten.BAUZEIT_PRODUKTION2);
    }

    @Override
    public RohstoffVorrat getAusbildungskosten()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public RohstoffVorrat getRohstoffUnterhalt()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Einheitentyp getTyp()
    {
        return Einheitentyp.GESELLE;
    }

}
