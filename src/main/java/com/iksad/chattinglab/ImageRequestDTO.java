package com.iksad.chattinglab;

public record ImageRequestDTO(
        Long from,
        Long to,
        byte[] data
) {
}
