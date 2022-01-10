package wallet.example.mswallet.service;

import wallet.example.mswallet.facades.*;
import wallet.example.mswallet.model.Wallet;

import java.util.List;

public interface WalletService extends Save<Wallet>, Delete<String,Wallet>, FindAll<List<Wallet>>, Update<Wallet>, FindById<Wallet,String>{
}
