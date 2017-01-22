package chaussia.shared.material;

public enum MaterialType
{
    WOOD, CLAY, GRAIN, ORE, WOOL, BOARD, BRICK, BREAD, IRON, FABRIC;

    @Override
    public String toString()
    {
        return this.name().toLowerCase();
    }
}
