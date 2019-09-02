package com.yesim.test.contracts;

public interface ILoginPage {

    ILoginPage login(String email, String password);

    void clickButtonLogin();
}
