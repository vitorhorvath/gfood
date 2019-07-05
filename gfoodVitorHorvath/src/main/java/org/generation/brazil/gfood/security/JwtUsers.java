package org.generation.brazil.gfood.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUsers implements UserDetails {


  @JsonIgnore
  private final Long id;
  private final String username;
  private final String firstname;
  private final String lastname;
  private final String password;
  private final String email;
  private final Collection<? extends GrantedAuthority> authorities;
  private final boolean enabled;
  private final Date lastPasswordResetDate;

}
