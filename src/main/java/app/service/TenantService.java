package app.service;

import app.domain.Tenant;
import app.repository.TenantRepository;

import java.util.Date;

public class TenantService {

    private final TenantRepository tenantRepository;

    public TenantService(TenantRepository tenantRepository){
        this.tenantRepository = tenantRepository;
    }

    public Tenant createTenant(int id, String docType, String name, String lastName, String phone, String email, String address, String password, Date birthDate, String tenantType){
        Tenant tenant = new Tenant(id, docType, name, lastName, phone, email, address, password, birthDate, tenantType);
        return tenant;
    }

}