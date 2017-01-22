package chaussia.shared.units;

import chaussia.shared.material.Stock;

public interface Unit
{
    int getAusbildungszeit();

    void resetAusbildungszeit();

    int getUnterhaltskosten();

    Stock getAusbildungskosten();

    Stock getRohstoffUnterhalt();

    UnitType getTyp();
}