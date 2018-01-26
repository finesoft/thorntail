/**
 * Copyright © 2013 Antonin Stefanutti (antonin.stefanutti@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.unimbus.metrics.ext;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import javax.enterprise.inject.spi.AnnotatedMethod;
import javax.enterprise.inject.spi.AnnotatedParameter;
import javax.enterprise.inject.spi.AnnotatedType;

/* package-private */ final class AnnotatedMethodDecorator<X> extends AnnotatedDecorator implements AnnotatedMethod<X> {

    private final AnnotatedMethod<X> decoratedMethod;

    AnnotatedMethodDecorator(AnnotatedMethod<X> decoratedMethod, Annotation decoratingAnnotation) {
        super(decoratedMethod, Collections.singleton(decoratingAnnotation));
        this.decoratedMethod = decoratedMethod;
    }

    @Override
    public Method getJavaMember() {
        return decoratedMethod.getJavaMember();
    }

    @Override
    public boolean isStatic() {
        return decoratedMethod.isStatic();
    }

    @Override
    public AnnotatedType<X> getDeclaringType() {
        return decoratedMethod.getDeclaringType();
    }

    @Override
    public List<AnnotatedParameter<X>> getParameters() {
        return decoratedMethod.getParameters();
    }

    @Override
    public String toString() {
        return decoratedMethod.toString();
    }

    @Override
    public int hashCode() {
        return decoratedMethod.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return decoratedMethod.equals(object);
    }
}
