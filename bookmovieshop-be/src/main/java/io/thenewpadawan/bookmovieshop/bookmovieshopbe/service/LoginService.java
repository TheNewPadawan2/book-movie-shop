package io.thenewpadawan.bookmovieshop.bookmovieshopbe.service;

import io.thenewpadawan.bookmovieshop.bookmovieshopbe.dto.LoginRequestDTO;

public interface LoginService {
	void signIn(LoginRequestDTO loginRequestDTO);
}
