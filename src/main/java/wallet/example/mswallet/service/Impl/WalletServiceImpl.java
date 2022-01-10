package wallet.example.mswallet.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wallet.example.mswallet.model.Wallet;
import wallet.example.mswallet.repository.WalletRepository;
import wallet.example.mswallet.service.WalletService;

import java.util.List;

@Service
@AllArgsConstructor
public class WalletServiceImpl implements WalletService {
    final WalletRepository walletRepository;

    @Override
    public Wallet delete(String id) {
        Wallet wallet = walletRepository.findById(id).orElse(null);
        walletRepository.delete(wallet);
        return wallet;
    }

    @Override
    public List<Wallet> findAll() {
        return walletRepository.findAll();
    }

    @Override
    public Wallet findById(String id) {
        return walletRepository.findById(id).orElse(null);
    }

    @Override
    public Wallet save(Wallet wallet) {
        if (wallet == null) return null;
        return walletRepository.save(wallet);
    }

    @Override
    public Wallet update(Wallet wallet) {
        if (wallet == null) return null;
        if (!walletRepository.existsById(wallet.getId())) return null;
        return walletRepository.save(wallet);
    }
}
