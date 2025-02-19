package collections.insurance_policy_management_system_using_map;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        InsurancePolicyManagement management = new InsurancePolicyManagement();

        management.addPolicy(new InsurancePolicy(1, "Durgesh", LocalDate.now().plusDays(15), "Health", 500.0));
        management.addPolicy(new InsurancePolicy(2, "Om", LocalDate.now().plusDays(45), "Auto", 750.0));
        management.addPolicy(new InsurancePolicy(3, "Bipin", LocalDate.now().plusDays(10), "Health", 600.0));
        management.addPolicy(new InsurancePolicy(4, "Aryan", LocalDate.now().plusDays(5), "Home", 900.0));
        management.addPolicy(new InsurancePolicy(5, "harsh", LocalDate.now().minusDays(5), "Travel", 300.0));

        System.out.println("---- All Policies:");
        management.displayAllPolicies();

        System.out.println("\n---- Policy with Number 2:");
        System.out.println(management.getPolicyByNumber(2));

        System.out.println("\n---- Policies Expiring Soon:");
        for (InsurancePolicy policy : management.getExpiringSoon()) {
            System.out.println(policy);
        }

        System.out.println("\n---- Policies for Alice:");
        for (InsurancePolicy policy : management.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        System.out.println("\n---- Removing Expired Policies...");
        management.removeExpiredPolicies();

        System.out.println("\n---- Policies After Removal:");
        management.displayAllPolicies();
    }


}
