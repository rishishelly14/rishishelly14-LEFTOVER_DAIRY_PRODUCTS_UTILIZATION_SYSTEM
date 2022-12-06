/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.organization.dairy;

import business.organization.Organization;
import business.role.dairy.DairyManagerRole;
import business.role.Role;
import java.util.ArrayList;

public class DairyManagerOrganization extends Organization {
    
        public DairyManagerOrganization() {
        super(Organization.Type.DairyManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DairyManagerRole());
        return roles;
    }
    
}
