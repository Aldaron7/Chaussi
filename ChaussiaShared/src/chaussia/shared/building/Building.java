package chaussia.shared.building;

import java.io.Serializable;
import java.util.List;

import chaussia.shared.material.Stock;

public interface Building extends Serializable
{
    int getUnterhaltskosten();

    void reduziereUpgradeDauer();

    int getUpgradedauer();

    void resetUpgradedauer();

    void reduziereBauzeit();

    int getBauzeit();

    void resetBauzeit();

    int getStufe();

    Building upgrade();

    List<BuildingType> getBenoetigteGebaeude();

    Stock getBaukosten();

    BuildingType getTyp();
}