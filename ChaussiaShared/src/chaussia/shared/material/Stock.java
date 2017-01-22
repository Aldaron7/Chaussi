package chaussia.shared.material;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Stock implements Map<MaterialType, Integer>
{

    private Map<MaterialType, Integer> stock = new HashMap<>();

    public Stock(Map<MaterialType, Integer> stock)
    {
        this();
        this.putAll(stock);
    }

    public Stock(Material... materials)
    {
        this();
        for (Material material : materials)
        {
            this.put(material);
        }
    }

    public Stock()
    {
        for (MaterialType materialType : MaterialType.values())
        {
            this.stock.put(materialType, 0);
        }
    }

    public void putKosten(MaterialType material, Integer value)
    {
        this.stock.put(material, value);
    }

    public void put(Material material)
    {
        this.put(material.getTyp(), material.getMenge());
    }

    public boolean contains(Stock stock)
    {
        return stock.keySet().stream().allMatch(material -> this.get(material) >= stock.get(material));
    }

    public void multiply(double skalar)
    {
        this.stock.entrySet().forEach(entry -> entry.setValue((int) (entry.getValue() * skalar)));
    }

    public boolean subtract(Stock stock)
    {
        if (this.contains(stock))
        {
            for (MaterialType materialType : stock.keySet())
            {
                this.put(materialType, (this.get(materialType) - stock.get(materialType)));
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.stock == null) ? 0 : this.stock.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        Stock other = (Stock) obj;
        if (this.stock == null)
        {
            if (other.stock != null)
            {
                return false;
            }
        }
        else
            if (!this.stock.equals(other.stock))
            {
                return false;
            }
        return true;
    }

    @Override
    public void clear()
    {
        this.stock.clear();
    }

    @Override
    public boolean containsKey(Object key)
    {
        return this.stock.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return this.stock.containsValue(value);
    }

    @Override
    public Set<java.util.Map.Entry<MaterialType, Integer>> entrySet()
    {
        return this.stock.entrySet();
    }

    @Override
    public Integer get(Object key)
    {
        return this.stock.get(key);
    }

    @Override
    public boolean isEmpty()
    {
        return this.stock.isEmpty();
    }

    @Override
    public Set<MaterialType> keySet()
    {
        return this.stock.keySet();
    }

    @Override
    public Integer put(MaterialType key, Integer value)
    {
        return this.stock.put(key, value);
    }

    @Override
    public void putAll(Map<? extends MaterialType, ? extends Integer> m)
    {
        this.stock.putAll(m);
    }

    @Override
    public Integer remove(Object key)
    {
        return this.stock.remove(key);
    }

    @Override
    public int size()
    {
        return this.stock.size();
    }

    @Override
    public Collection<Integer> values()
    {
        return this.stock.values();
    }

}
