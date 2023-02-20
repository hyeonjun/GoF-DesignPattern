package com.design.pattern.StructuralPatterns.adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
