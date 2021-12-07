package NNTDATA.msproduct_bank.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRule {
    @Id
    private String id;
    private List<String> customerOwner;
    private boolean commissionMaintenance;
    private boolean maximumLimitMonthlyMovements;
    private Integer quantityMaximumMovementsMonthly;
    private Integer maximumLimitCreditPerson;
    private Integer maximumLimitCreditEnterprise;
    private Integer balance;
}
