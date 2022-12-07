
package business.role.ngo;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoAdmin.NGOAdminWorkAreaJPanel;


public class NGOAdminRole extends Role {

    public NGOAdminRole() {
        super(RoleType.NGOMAdmin);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new NGOAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }

}
