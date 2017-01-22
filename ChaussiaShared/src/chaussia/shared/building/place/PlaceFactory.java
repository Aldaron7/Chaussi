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
        AbstractPlace ortschaft = null;
        switch (typ)
        {
            case VILLAGE:
                ortschaft = new Village();
                ortschaft.setSteuerertrag(Const.TAXYIELD_VILLAGE);
                break;
            case TOWN:
                ortschaft = new Town();
                ortschaft.setSteuerertrag(2 * Const.TAXYIELD_VILLAGE);
                break;
            case CITY:
                ortschaft = new City();
                ortschaft.setSteuerertrag(4 * Const.TAXYIELD_VILLAGE);
                break;
            default:
                break;
        }
        if (ortschaft != null)
        {
            ortschaft.resetBauzeit();
        }
        return ortschaft;
    }
}
