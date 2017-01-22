package chaussia.shared.building.production;

import java.util.List;

import chaussia.shared.building.Building;
import chaussia.shared.material.MaterialType;
import chaussia.shared.units.Unit;
import chaussia.shared.units.UnitType;

public interface ProductionBuilding extends Building
{

    boolean isActive();

    void setActive(boolean active);

    MaterialType getMaterial();

    UnitType getUnitType();

    int getMaxLaborer();

    List<Unit> getLaborer();

    boolean addLaborer(Unit unit);

    Unit removeLaborer();

}