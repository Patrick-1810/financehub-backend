package com.example.financehub.controller;

import com.example.financehub.dto.ProfileDTO;
import com.example.financehub.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfileController {

        private final ProfileService profileService;

        @PostMapping("/register")
        public ResponseEntity<ProfileDTO> registerProfile(@RequestBody ProfileDTO profileDTO) {
            ProfileDTO registerProfile = profileService.registerProfile(profileDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(registerProfile);
        }

    }


