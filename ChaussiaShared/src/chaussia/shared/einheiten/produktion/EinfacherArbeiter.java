package chaussia.shared.einheiten.produktion;

import chaussia.shared.Const;
import chaussia.shared.einheiten.AbstractEinheit;
import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.rohstoffe.RohstoffVorrat;

public class EinfacherArbeiter extends AbstractEinheit
{

    @Override
    public void resetAusbildungszeit()
    {
        this.setAusbildungszeit(Const.BAUZEIT_PRODUKTION1);
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
        return Einheitentyp.EINFACHER_ARBEITER;
    }

}
