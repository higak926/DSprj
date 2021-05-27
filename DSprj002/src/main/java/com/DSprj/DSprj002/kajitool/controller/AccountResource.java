package com.DSprj.DSprj002.kajitool.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DSprj.DSprj002.kajitool.domain.model.Account;
import com.DSprj.DSprj002.kajitool.service.account.AccountService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/account")
public class AccountResource {

  private final AccountService service;

  public AccountResource(AccountService service) {
	this.service = service;
  }

  @GetMapping("/")
  @ApiOperation(value="ログインアカウントを返します。", nickname="account_get")
  public ResponseEntity<Account> get() {
	return ResponseEntity.ok()
			.body(service.getCurrentUserLogin().orElseThrow(
				() -> new RuntimeException("Account could not be found")));
  }

}
