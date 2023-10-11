package com.iksad.chattinglab;

public record TextRequestDTO(
        Long from,
        Long to,
        String data
) {
}
