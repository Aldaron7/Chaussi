package chaussia.shared.gebaeude;

import java.io.Serializable;
import java.util.List;

import chaussia.shared.rohstoffe.RohstoffVorrat;

public interface Gebaeude extends Serializable
{
    int getUnterhaltskosten();

    void reduziereUpgradeDauer();

    int getUpgradedauer();

    void resetUpgradedauer();

    void reduziereBauzeit();

    int getBauzeit();

    void resetBauzeit();

    int getStufe();

    Gebaeude upgrade();

    List<Gebaeudetyp> getBenoetigteGebaeude();

    RohstoffVorrat getBaukosten();

    Gebaeudetyp getTyp();
}