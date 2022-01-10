package wallet.example.mswallet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("wallets")
@Data
public class Wallet {
    @Id
    private String id;
    private Double solde;
}
