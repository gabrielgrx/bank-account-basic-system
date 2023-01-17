package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressDTOConverter {

    public AddressRequestDTO modelToRequest (Address address) {
        AddressRequestDTO addressRequestDTO = new AddressRequestDTO();
        addressRequestDTO.setStreet(address.getStreet());
        addressRequestDTO.setNumber(address.getNumber());
        addressRequestDTO.setCity(address.getCity());
        addressRequestDTO.setState(address.getState());
        addressRequestDTO.setCountry(address.getCountry());
        return addressRequestDTO;
    }

    public Address requestToModel(AddressRequestDTO addressRequestDTO) {
        Address address = new Address();
        address.setStreet(addressRequestDTO.getStreet());
        address.setNumber(addressRequestDTO.getNumber());
        address.setCity(addressRequestDTO.getCity());
        address.setState(addressRequestDTO.getState());
        address.setCountry(addressRequestDTO.getCountry());
        return address;
    }

    public AddressResponseDTO modelToResponse (Address address) {
        AddressResponseDTO addressResponseDTO = new AddressResponseDTO();
        addressResponseDTO.setStreet(address.getStreet());
        addressResponseDTO.setNumber(address.getNumber());
        addressResponseDTO.setCity(address.getCity());
        addressResponseDTO.setState(address.getState());
        addressResponseDTO.setCountry(address.getCountry());
        return addressResponseDTO;
    }

    public Address responseToModel(AddressResponseDTO addressResponseDTO) {
        Address address = new Address();
        address.setStreet(addressResponseDTO.getStreet());
        address.setNumber(addressResponseDTO.getNumber());
        address.setCity(addressResponseDTO.getCity());
        address.setState(addressResponseDTO.getState());
        address.setCountry(addressResponseDTO.getCountry());
        return address;
    }
}
