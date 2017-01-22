package chaussia.shared.gebaeude.produktion;

import chaussia.shared.Const;
import chaussia.shared.gebaeude.Gebaeudetyp;

public class ProduktionsgebaeudeFactory
{

    public ProduktionsgebaeudeFactory()
    {
    }

    public AbstractProduktionsgebaeude create(Gebaeudetyp typ)
    {
        AbstractProduktionsgebaeude produktionsgebaeude = null;
        switch (typ)
        {
            case HOLZFAELLER:
                produktionsgebaeude = new Holzfaeller();
                produktionsgebaeude.setErtrag(Const.ERTRAG_HOLZ);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION1);
                break;
            case MINE:
                produktionsgebaeude = new Mine();
                produktionsgebaeude.setErtrag(Const.ERTRAG_ERZ);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION1);
                break;
            case BAUERNHOF:
                produktionsgebaeude = new Bauernhof();
                produktionsgebaeude.setErtrag(Const.ERTRAG_KORN);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION1);
                break;
            case LEHMGRUBE:
                produktionsgebaeude = new Lehmgrube();
                produktionsgebaeude.setErtrag(Const.ERTRAG_LEHM);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION1);
                break;
            case SCHAEFER:
                produktionsgebaeude = new Schaefer();
                produktionsgebaeude.setErtrag(Const.ERTRAG_WOLLE);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION1);
                break;
            case WEBSTUBE:
                produktionsgebaeude = new Webstube();
                produktionsgebaeude.setErtrag(Const.ERTRAG_STOFF);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION2);
                break;
            case SAEGEWERK:
                produktionsgebaeude = new Saegewerk();
                produktionsgebaeude.setErtrag(Const.ERTRAG_BRETT);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION2);
                break;
            case BAECKEREI:
                produktionsgebaeude = new Baeckerei();
                produktionsgebaeude.setErtrag(Const.ERTRAG_BROT);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION2);
                break;
            case SCHMIEDE:
                produktionsgebaeude = new Schmiede();
                produktionsgebaeude.setErtrag(Const.ERTRAG_EISEN);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION2);
                break;
            case ZIEGELEI:
                produktionsgebaeude = new Ziegelei();
                produktionsgebaeude.setErtrag(Const.ERTRAG_ZIEGEL);
                produktionsgebaeude.setUnterhaltskosten(Const.UNTERHALT_PRODUKTION2);
                break;
            default:
                break;
        }
        if (produktionsgebaeude != null)
        {
            produktionsgebaeude.resetBauzeit();
        }
        return produktionsgebaeude;
    }
}
