/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.dairy;

import business.organization.Organization;
import business.role.dairy.DairyAdminRole;
import business.role.Role;
import java.util.ArrayList;


public class DairyAdminOrganization extends Organization {
    
        public DairyAdminOrganization() {
        super(Organization.Type.DairyAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DairyAdminRole());
        return roles;
    }
    
}
