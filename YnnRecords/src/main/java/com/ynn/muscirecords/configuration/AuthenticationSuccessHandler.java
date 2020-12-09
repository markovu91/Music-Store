package com.ynn.muscirecords.configuration;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;

import com.ynn.muscirecords.model.Role;



public class AuthenticationSuccessHandler implements org.springframework.security.web.authentication.AuthenticationSuccessHandler {

	private final RedirectStrategy redirectStrategy =  new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication a) throws IOException, ServletException {
		
		Collection<? extends GrantedAuthority> authorities = a.getAuthorities();
        
        String targetUrl = "/login";
        
        for(GrantedAuthority grantedAuthority: authorities){
            if(grantedAuthority.getAuthority().equals(Role.ADMIN)){
                targetUrl = "/admin/";
                break;
            }
           
        }
        
        redirectStrategy.sendRedirect(request, response, targetUrl);
		
		
	}

	
}
