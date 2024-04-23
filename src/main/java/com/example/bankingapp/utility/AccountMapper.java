package com.example.bankingapp.utility;

import com.example.bankingapp.dto.AccountRequest;
import com.example.bankingapp.model.Account;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "customer.id", target = "customerId")
    AccountRequest entityToDto(Account entity);

    @InheritInverseConfiguration
    @Mapping(target = "customer.id", ignore = true)
    Account dtoToEntity(AccountRequest dto);
}
