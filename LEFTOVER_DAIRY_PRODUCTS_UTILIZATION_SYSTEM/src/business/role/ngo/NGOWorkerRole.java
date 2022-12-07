
package business.role.ngo;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ngo.ngoWorker.NGOWorkerWorkAreaJPanel;

public class NGOWorkerRole extends Role {

    public NGOWorkerRole() {
        super(RoleType.NGOWorker);
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
      return new NGOWorkerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

}
