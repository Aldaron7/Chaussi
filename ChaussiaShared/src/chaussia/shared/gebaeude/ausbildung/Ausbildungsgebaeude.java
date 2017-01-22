package chaussia.shared.gebaeude.ausbildung;

import java.util.List;

import chaussia.shared.einheiten.Einheitentyp;
import chaussia.shared.gebaeude.Gebaeude;

public interface Ausbildungsgebaeude extends Gebaeude
{
    public List<Einheitentyp> getAuszubildende();
}
