package NNTDATA.msproduct_bank.documents;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data

public class ProductRule {
    private List<String> customerOwner;
    private boolean commissionMaintenance;
    private boolean maximumLimitMonthlyMovements;
    private Integer quantityMaximumMovementsMonthly;
    private Integer maximumLimitCreditPerson;
    private Integer maximumLimitCreditEnterprise;
    private boolean balance;
}
