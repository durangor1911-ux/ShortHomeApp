package app.service;

import app.domain.PropertyOwner;
import app.repository.PropertyOwnerRepository;

import java.util.Date;

public class PropertyOwnerService {


    private final PropertyOwnerRepository propertyOwnerRepository;

    public PropertyOwnerService(PropertyOwnerRepository propertyOwnerRepository){
        this.propertyOwnerRepository = propertyOwnerRepository;
    }


    public PropertyOwner createPropertyOwner(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String ownerType){
        PropertyOwner propertyOwner = new PropertyOwner(id,docType,name,lastName,phone,email,address, password,birthDate,ownerType);
        return propertyOwner;
    }




}
