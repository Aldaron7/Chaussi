package chaussia.shared.building.place;

import chaussia.shared.Const;
import chaussia.shared.building.BuildingType;

public class PlaceFactory
{

    public PlaceFactory()
    {
    }

    public Place create(BuildingType typ)
    {
        AbstractPlace place = null;
        switch (typ)
        {
            case VILLAGE:
                place = new Village();
                place.setTaxes(Const.TAXYIELD_VILLAGE);
                break;
            case TOWN:
                place = new Town();
                place.setTaxes(2 * Const.TAXYIELD_VILLAGE);
                break;
            case CITY:
                place = new City();
                place.setTaxes(4 * Const.TAXYIELD_VILLAGE);
                break;
            default:
                break;
        }
        if (place != null)
        {
            place.resetConstructionPeriod();
        }
        return place;
    }
}
