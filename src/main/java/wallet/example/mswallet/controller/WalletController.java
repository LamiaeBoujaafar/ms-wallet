package wallet.example.mswallet.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import wallet.example.mswallet.facades.*;
import wallet.example.mswallet.model.Wallet;
import wallet.example.mswallet.service.WalletService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("wallets")
public class WalletController implements Save<Wallet>, Delete<String,Wallet>, FindAll<List<Wallet>>, Update<Wallet>, FindById<Wallet,String> {

    final WalletService walletService;

    @DeleteMapping("/{id}")
    @Override
    public Wallet delete(@PathVariable String id) {
        return walletService.delete(id);
    }

    @GetMapping("/")
    @Override
    public List<Wallet> findAll() {
        return walletService.findAll();
    }

    @GetMapping("/{id}")
    @Override
    public Wallet findById(@PathVariable String id) {
        return walletService.findById(id);
    }

    @PostMapping("/")
    @Override
    public Wallet save(@RequestBody Wallet wallet) {
        return walletService.save(wallet);
    }

    @PutMapping("/")
    @Override
    public Wallet update(@RequestBody Wallet wallet) {
        return walletService.update(wallet);
    }
}
