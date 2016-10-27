import type.ApartmentType;

/**
 * @author Florinskiy Artyom
 * @date 27.10.2016
 */

public class CurrentApartment
{
    private static CurrentApartment instance;

    private static String apartmentName;
    private static String apartmentID;

    public static CurrentApartment getInstance()
    {
        if (instance == null)
        {
            instance = new CurrentApartment();
        }
        return instance;
    }

    public String getApartment()
    {
        return apartmentName;
    }

    public String getApartmentID()
    {
        return apartmentID;
    }

    public void setApartment( ApartmentType apartmentType )
    {
        switch (apartmentType)
        {
            case AIMANOVA:
                apartmentID = "Aimanova";
                apartmentName = "Айманова";
                break;
            case GAGARINA:
                apartmentID = "Gagarina";
                apartmentName = "Гагарина";
                break;
        }
    }
}
