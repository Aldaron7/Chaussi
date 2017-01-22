package chaussia.shared.einheiten.produktion;

import chaussia.shared.Konstanten;
import chaussia.shared.einheiten.AbstractEinheit;
import chaussia.shared.einheiten.Einheit;
import chaussia.shared.einheiten.Einheitentyp;

public class ArbeiterFactory
{

    public ArbeiterFactory()
    {
    }

    public Einheit create(Einheitentyp typ)
    {
        AbstractEinheit arbeiter = null;
        switch (typ)
        {
            case EINFACHER_ARBEITER:
                arbeiter = new EinfacherArbeiter();
                arbeiter.setUnterhaltskosten(Konstanten.UNTERHALT_EINFACHER_ARBEITER);
                break;
            case GESELLE:
                arbeiter = new Geselle();
                arbeiter.setUnterhaltskosten(Konstanten.UNTERHALT_GESELLE);
            default:
                break;
        }
        if (arbeiter != null)
        {
            arbeiter.resetAusbildungszeit();
        }
        return arbeiter;
    }
}
