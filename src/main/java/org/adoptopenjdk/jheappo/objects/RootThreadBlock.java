package org.adoptopenjdk.jheappo.objects;

/*
 * Copyright (c) 2018 Kirk Pepperdine.
 * Licensed under https://github.com/AdoptOpenJDK/jheappo/blob/master/LICENSE
 * Instructions: https://github.com/AdoptOpenJDK/jheappo/wiki
 */

import org.adoptopenjdk.jheappo.io.HeapDumpBuffer;

public class RootThreadBlock extends HeapData {

    public final static int TAG = 0x06;

    private long objectID;
    private long threadSerialNumber;

    public RootThreadBlock(HeapDumpBuffer buffer) {
        objectID = buffer.extractID();
        threadSerialNumber = buffer.extractU4();
    }
}