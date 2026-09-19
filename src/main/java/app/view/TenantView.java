package app.view;

import app.domain.Tenant;
import app.domain.enums.TenantStatusEnum;
import app.service.TenantService;
import app.service.helpers.SetOwnerDocType;

import java.util.Date;
import java.util.Scanner;

public class TenantView {

    Scanner sc = new Scanner(System.in);

    private final TenantService tenantService;

    public TenantView(TenantService tenantService){
        this.tenantService = tenantService;
    }

    public void createTenant(){

        System.out.println("Ingrese el id del arrendatario");
        int id = sc.nextInt();
        System.out.println("Ingrese el tipo de documento del arrendatario");
        String docType = SetOwnerDocType.getDocType();
        System.out.println("Ingrese el nombre del arrendatario");
        String name = sc.next();
        System.out.println("Ingrese el apellido del arrendatario");
        String lastName = sc.next();
        System.out.println("Ingrese el telefono del arrendatario");
        String phone = sc.next();
        System.out.println("Ingrese el email del arrendatario");
        String email = sc.next();
        System.out.println("Ingrese la direccion del arrendatario");
        String address = sc.next();
        System.out.println("Ingrese la contraseña del arrendatario");
        String password = sc.next();
        Date birthDate = getBirthDateFromInput();
        System.out.println("Ingrese el estado del arrendatario: 1. Active, 2. Finished, 3. Pending");
        String tenantType = getTenantType();

        Tenant tenant = tenantService.createTenant(id, docType, name, lastName, phone, email, address, password, birthDate, tenantType);
        System.out.println("Arrendatario creado con éxito: " + tenant.getName() + " " + tenant.getLastName());
    }

    // Métodos Helper, luego se convertirán en métodos de la clase service para que sean llamados desde el controller

    public Date getBirthDateFromInput() {
        System.out.println("Ingrese la fecha de nacimiento del arrendatario (formato: yyyy-MM-dd): ");
        String birthDateString = sc.next();
        Date birthDate = null;
        try {
            birthDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(birthDateString);
        } catch (java.text.ParseException e) {
            System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato correcto.");
        }
        return birthDate;
    }

    public String getTenantType(){

        int option = sc.nextInt();
        String value = "";
        switch (option){
            case 1:
                value = TenantStatusEnum.ACTIVE.getValue();
                break;
            case 2:
                value = TenantStatusEnum.FINISHED.getValue();
                break;
            case 3:
                value = TenantStatusEnum.PENDING.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}