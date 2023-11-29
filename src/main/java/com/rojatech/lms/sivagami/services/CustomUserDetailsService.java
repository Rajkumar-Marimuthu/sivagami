package com.rojatech.lms.sivagami.services;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rojatech.lms.sivagami.models.User;
import com.rojatech.lms.sivagami.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;
	
	public CustomUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUsername(username);
		user.orElseThrow(() -> {
			throw new UsernameNotFoundException("Could not find user");
		});
		
		return user.map(MyUserDetails::new).get();
	}

}
