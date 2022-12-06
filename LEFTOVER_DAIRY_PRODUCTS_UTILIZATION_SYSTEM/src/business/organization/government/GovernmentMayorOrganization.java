/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.government;

import business.organization.Organization;
import business.role.Role;
import business.role.government.GovernmentMayorRole;
import java.util.ArrayList;
/**
 *
 * @author nehas
 */
public class GovernmentMayorOrganization extends Organization{
    
    public GovernmentMayorOrganization() {
        super(Organization.Type.GovernmentMayor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentMayorRole());
        return roles;
    }
    
}
