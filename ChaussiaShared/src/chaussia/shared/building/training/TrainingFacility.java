package chaussia.shared.building.training;

import java.util.List;

import chaussia.shared.building.Building;
import chaussia.shared.units.UnitType;

public interface TrainingFacility extends Building
{
    public List<UnitType> getTrainees();
}
