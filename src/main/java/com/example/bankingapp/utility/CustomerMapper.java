package com.example.bankingapp.utility;

import com.example.bankingapp.dto.CustomerRequest;
import com.example.bankingapp.model.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerRequest entityToDto(Customer entity);

    @InheritInverseConfiguration
    Customer dtoToEntity(CustomerRequest dto);

}
