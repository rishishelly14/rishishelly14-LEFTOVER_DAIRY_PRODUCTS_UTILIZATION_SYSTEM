
package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

public class ConfigureEcoSystem {

    public static EcoSystem configure() {
        EcoSystem ecoSystem = EcoSystem.getInstance();

        Employee employee = ecoSystem.getEmployeeDirectory().addEmployee("System Admin");
        UserAccount ua = new UserAccount();
        String password = ua.encodePassword("sysadmin");
        ua = ecoSystem.getUserAccountDirectory().addUserAccount("sysadmin", password, employee, new SystemAdminRole());

        return ecoSystem;

    }
}
