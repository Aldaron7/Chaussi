package chaussia.shared.einheiten.militaer;

import chaussia.shared.einheiten.Einheit;

public interface Militaereinheit extends Einheit
{
    int getBewegungspunkte();

    void resetBewegungspunkte();

    int getMaxBewegungspunkte();

    int getStaerke();

}
