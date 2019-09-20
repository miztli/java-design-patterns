package com.examples.java.structural.object.facade;

/**
 * Entity class: Entity classes are commonly objects that will
 * map a traditional java object to a DB table.
 */
public class CarEntity
{
    private long id;

    private String model;

    private boolean assigned;

    public CarEntity(final long id, final String model, final boolean assigned)
    {
        this.id = id;
        this.model = model;
        this.assigned = assigned;
    }

    public long getId()
    {
        return id;
    }

    public void setId(final long id)
    {
        this.id = id;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(final String model)
    {
        this.model = model;
    }

    public boolean isAssigned()
    {
        return assigned;
    }

    public void setAssigned(final boolean assigned)
    {
        this.assigned = assigned;
    }

    /**
     * Making use of another interesting pattern,
     * AKA 'static factory methods'
     * @param model The model name
     * @return The created {@link CarEntity}
     */
    public static CarEntity createDefault(final String model) {
        return new CarEntity(0L, model, Boolean.TRUE);
    }
}
