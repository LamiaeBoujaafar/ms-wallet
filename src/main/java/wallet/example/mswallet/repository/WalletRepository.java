package wallet.example.mswallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import wallet.example.mswallet.model.Wallet;

public interface WalletRepository extends MongoRepository<Wallet,String> {
}
