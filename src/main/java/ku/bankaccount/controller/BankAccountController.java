package ku.bankaccount.controller;

import ku.bankaccount.model.BankAccount;
import ku.bankaccount.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaccount")
public class BankAccountController {

    @Autowired
    private BankAccountRepository repository;

    @GetMapping
    public List<BankAccount> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody BankAccount account) {
        repository.save(account);
        return new ResponseEntity<String>("Account created successfully",
                HttpStatus.OK);
    }
}
