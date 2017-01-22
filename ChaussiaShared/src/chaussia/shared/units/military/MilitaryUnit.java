package chaussia.shared.units.military;

import chaussia.shared.units.Unit;

public interface MilitaryUnit extends Unit
{
    int getBewegungspunkte();

    void resetBewegungspunkte();

    int getMaxBewegungspunkte();

    int getStaerke();

}
