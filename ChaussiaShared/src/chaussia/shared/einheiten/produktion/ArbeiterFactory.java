package chaussia.shared.einheiten.produktion;

import chaussia.shared.Const;
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
                arbeiter.setUnterhaltskosten(Const.UNTERHALT_EINFACHER_ARBEITER);
                break;
            case GESELLE:
                arbeiter = new Geselle();
                arbeiter.setUnterhaltskosten(Const.UNTERHALT_GESELLE);
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
