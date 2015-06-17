package org.fusesource.restygwt.rebind;

import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.JType;

public class DummyJFieldExt extends DummyJField {
    private final JClassType _enclosingType;

    public DummyJFieldExt(String name, JType type, JClassType enclosingType) {
        super(name, type);
        _enclosingType = enclosingType;
    }

    @Override
    public JClassType getEnclosingType() {
        return _enclosingType;
    }
}
