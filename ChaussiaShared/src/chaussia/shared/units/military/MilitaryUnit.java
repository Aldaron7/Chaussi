package chaussia.shared.units.military;

import chaussia.shared.Locatable;
import chaussia.shared.units.Unit;

public interface MilitaryUnit extends Unit, Locatable
{
    int getMovementPoints();

    void resetMovementPoints();

    int getMaxMovementPoints();

    int getStrength();

}
