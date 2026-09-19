package app.service.helpers;

import app.domain.enums.OwnerTypeEnum;
import java.util.Scanner;

public class SetOwnerType {

    public static String getOwnerType(){

        Scanner sc = new Scanner(System.in);
        String value = "";

        System.out.println("Seleccione el tipo de propietario:");
        System.out.println("1. Propietario directo");
        System.out.println("2. Administrador de propiedad");
        System.out.println("3. Agencia inmobiliaria");
        int option = sc.nextInt();

        switch (option){
            case 1:
                value = OwnerTypeEnum.DIRECT_OWNER.getValue();
                break;
            case 2:
                value = OwnerTypeEnum.PROPERTY_MANAGER.getValue();
                break;
            case 3:
                value = OwnerTypeEnum.REAL_ESTATE_AGENCY.getValue();
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
        return value;
    }
}
