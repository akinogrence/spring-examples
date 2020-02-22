package com.akinogrence.service.impl;

import com.akinogrence.dto.UserDto;
import com.akinogrence.entity.Address;
import com.akinogrence.entity.AddressType;
import com.akinogrence.entity.User;
import com.akinogrence.repository.AddressRepository;
import com.akinogrence.repository.UserRepository;
import com.akinogrence.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final AddressRepository addressRepository;


    @Transactional
    public UserDto save(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        final User userDB = userRepository.save(user);

        List<Address> addresses = new ArrayList<>();

        userDto.getAddresses().forEach(item -> {
            Address address = new Address();
            address.setAddress(item);
            address.setAddressType(AddressType.OTHER);
            address.setIsActive(true);
            address.setUser(userDB);
            addresses.add(address);
        });

        addressRepository.saveAll(addresses);
        userDto.setId(userDB.getId());
        return userDto;
    }

    public void delete(Long id) {

    }

    public List<UserDto> getAll() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        userList.forEach(item -> {
            UserDto userDto = new UserDto();
            userDto.setId(item.getId());
            userDto.setName(item.getName());
            userDto.setSurname(item.getSurname());
            userDto.setAddresses(item.getAddresses().stream().map(Address::getAddress).
                    collect(Collectors.toList()));
            userDtos.add(userDto);

        });

        return userDtos;
    }

    public Page<UserDto> getAll(Pageable pageable) {
        return null;
    }
}
