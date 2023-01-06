/*
 * Copyright (c) 2022 - 2024 Ideas2it, Inc.All rights are reserved.
 *
 * This document is protected by copyright. No part of this document may be
 * reproduced in any form by any means without prior written authorization of
 * Ideas2it and its licensors, if any.
 */
package com.ideas2it.onlinestore.dto;

/**
 * It represents the AuthenticationResponse.
 *
 * @author - Gokul V
 * @version - 1.0
 * @since - 2022-12-20
 */
public class AuthenticationResponse {

    private final String token;

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getJwt() {
        return token;
    }
}