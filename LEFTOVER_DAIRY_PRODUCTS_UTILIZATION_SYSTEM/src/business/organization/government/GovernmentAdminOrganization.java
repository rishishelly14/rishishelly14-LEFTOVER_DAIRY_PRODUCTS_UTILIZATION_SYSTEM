/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.government;

import business.organization.Organization;
import business.role.Role;
import business.role.government.GovernmentAdminRole;
import java.util.ArrayList;

/**
 *
 * @author nehas
 */
public class GovernmentAdminOrganization extends Organization {
    
    public GovernmentAdminOrganization() {
        super(Organization.Type.GovernmentAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentAdminRole());
        return roles;
    }
        
    
}
