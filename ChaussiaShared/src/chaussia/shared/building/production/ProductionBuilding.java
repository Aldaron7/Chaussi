package chaussia.shared.building.production;

import chaussia.shared.building.Building;
import chaussia.shared.material.MaterialType;
import chaussia.shared.units.UnitType;

public interface ProductionBuilding extends Building
{

    int getErtrag();

    boolean isArbeitet();

    void setArbeitet(boolean arbeitet);

    MaterialType getRohstoff();

    UnitType getArbeitertyp();

    int getMaxArbeiter();

    boolean addArbeiter();

    boolean removeArbeiter();

}