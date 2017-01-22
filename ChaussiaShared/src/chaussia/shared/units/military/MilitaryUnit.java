package chaussia.shared.units.military;

import chaussia.shared.units.Unit;

public interface MilitaryUnit extends Unit
{
    int getMovementPoints();

    void resetMovementPoints();

    int getMaxMovementPoints();

    int getStrength();

}
