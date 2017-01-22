package chaussia.shared.einheiten;

import chaussia.shared.rohstoffe.RohstoffVorrat;

public interface Einheit
{
    int getAusbildungszeit();

    void resetAusbildungszeit();

    int getUnterhaltskosten();

    RohstoffVorrat getAusbildungskosten();

    RohstoffVorrat getRohstoffUnterhalt();

    Einheitentyp getTyp();
}