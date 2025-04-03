// SPDX-License-Identifier: GPL-3.0-or-later OR Apache-2.0

package com.eiyooooo.adb;

import java.io.ByteArrayOutputStream;

class ByteArrayNoThrowOutputStream extends ByteArrayOutputStream {
    public ByteArrayNoThrowOutputStream(int size) {
        super(size);
    }

    @Override
    public void write(byte[] b) {
        write(b, 0, b.length);
    }

    @Override
    public void close() {
    }
}
