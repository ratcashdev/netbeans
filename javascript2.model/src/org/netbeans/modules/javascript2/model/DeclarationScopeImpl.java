/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javascript2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.javascript2.model.api.JsObject;
import org.netbeans.modules.javascript2.types.api.DeclarationScope;
import org.netbeans.modules.javascript2.types.api.Identifier;
import org.netbeans.modules.javascript2.types.api.TypeUsage;

/**
 *
 * @author Petr Pisl
 */
public class DeclarationScopeImpl extends JsObjectImpl implements DeclarationScope {

    private DeclarationScope parentScope;

    private final List<DeclarationScope> childrenScopes;

    public DeclarationScopeImpl(DeclarationScope inScope, JsObject inObject,
            Identifier name, OffsetRange offsetRange, String mimeType, String sourceLabel) {
        super(inObject, name, offsetRange, mimeType, sourceLabel);
        this.parentScope = inScope;
        this.childrenScopes = new ArrayList<DeclarationScope>();
    }

    @Override
    public DeclarationScope getParentScope() {
        return parentScope;
    }

    @Override
    public Collection<? extends DeclarationScope> getChildrenScopes() {
        return childrenScopes;
    }

    @Override
    public void addDeclaredScope(DeclarationScope scope) {
        childrenScopes.add(scope);
    }

    public void setParentScope(DeclarationScope parentScope) {
        this.parentScope = parentScope;
    }

    private static class With {

        private final OffsetRange range;

        private final Collection<? extends TypeUsage> types;

        public With(OffsetRange range, Collection<? extends TypeUsage> types) {
            this.range = range;
            this.types = types;
        }

        public OffsetRange getRange() {
            return range;
        }

        public Collection<? extends TypeUsage> getTypes() {
            return types;
        }
    }

}
