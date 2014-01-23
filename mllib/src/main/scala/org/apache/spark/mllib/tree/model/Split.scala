/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.mllib.tree.model

import org.apache.spark.mllib.tree.configuration.FeatureType.FeatureType

case class Split(feature: Int, threshold : Double, featureType : FeatureType, categories : List[Double]){
  override def toString =
    "Feature = " + feature + ", threshold = " + threshold + ", featureType =  " + featureType + ", categories = " + categories
}

class DummyLowSplit(feature: Int, kind : FeatureType) extends Split(feature, Double.MinValue, kind, List())

class DummyHighSplit(feature: Int, kind : FeatureType) extends Split(feature, Double.MaxValue, kind, List())

class DummyCategoricalSplit(feature: Int, kind : FeatureType) extends Split(feature, Double.MaxValue, kind, List())

