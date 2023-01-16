package com.gabrielxavier.bankaccount.service.util;

import com.gabrielxavier.bankaccount.dto.AccountDTO;
import com.gabrielxavier.bankaccount.dto.AddressDTO;
import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.entity.Account;
import com.gabrielxavier.bankaccount.entity.Address;
import com.gabrielxavier.bankaccount.entity.User;
import org.springframework.stereotype.Component;

@Component
public class BankAccountDTOConverter {

    public UserDTO convertToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setPhone(user.getPhone());
        userDTO.setAddress(user.getAddress());
        return userDTO;
    }

    public User convertToUserEntity(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setCpf(userDTO.getCpf());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setAddress(userDTO.getAddress());
        return user;
    }

    public AddressDTO convertToAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setStreet(address.getStreet());
        addressDTO.setNumber(address.getNumber());
        addressDTO.setCity(address.getCity());
        addressDTO.setState(address.getState());
        addressDTO.setCountry(address.getCountry());
        return addressDTO;
    }

    public Address convertToAddressEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setCountry(addressDTO.getCountry());
        return address;
    }

    public AccountDTO convertToAccountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAgency(account.getAgency());
        accountDTO.setNumber(account.getNumber());
        accountDTO.setCheckDigit(account.getCheckDigit());
        accountDTO.setAccountType(account.getAccountType());
        return accountDTO;
    }

    public Account convertToAccountEntity(AccountDTO accountDTO) {
        Account account = new Account();
        account.setAgency(accountDTO.getAgency());
        account.setNumber(accountDTO.getNumber());
        account.setCheckDigit(accountDTO.getCheckDigit());
        account.setAccountType(accountDTO.getAccountType());
        return account;
    }
}
