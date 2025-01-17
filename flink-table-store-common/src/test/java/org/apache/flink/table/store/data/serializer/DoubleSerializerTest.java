/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.store.data.serializer;

import java.util.Random;

/** Test for {@link DoubleSerializer}. */
public class DoubleSerializerTest extends SerializerTestBase<Double> {

    @Override
    protected Serializer<Double> createSerializer() {
        return DoubleSerializer.INSTANCE;
    }

    @Override
    protected boolean deepEquals(Double t1, Double t2) {
        return t1.equals(t2);
    }

    @Override
    protected Double[] getTestData() {
        Random rnd = new Random();
        double rndDouble = rnd.nextDouble() * Double.MAX_VALUE;

        return new Double[] {
            (double) 0,
            1.0,
            (double) -1,
            Double.MAX_VALUE,
            Double.MIN_VALUE,
            rndDouble,
            -rndDouble,
            Double.NaN,
            Double.NEGATIVE_INFINITY,
            Double.POSITIVE_INFINITY
        };
    }
}
