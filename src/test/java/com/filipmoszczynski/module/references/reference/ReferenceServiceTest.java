package com.filipmoszczynski.module.references.reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceServiceTest {

    ReferenceService referenceService = new ReferenceService();

    @Test
    void getReferences() {
        assertEquals(referenceService.getReferences().size(), 1);
    }
}