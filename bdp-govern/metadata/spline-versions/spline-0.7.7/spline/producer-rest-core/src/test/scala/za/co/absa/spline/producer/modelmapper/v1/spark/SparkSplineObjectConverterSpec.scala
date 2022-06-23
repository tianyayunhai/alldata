/*
 * Copyright 2021 ABSA Group Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package za.co.absa.spline.producer.modelmapper.v1.spark

import org.scalatest.flatspec.AnyFlatSpec
import za.co.absa.spline.producer.model.v1_1.{AttrOrExprRef, ExpressionLike, Literal}
import za.co.absa.spline.producer.modelmapper.v1.ExpressionConverter
import za.co.absa.spline.producer.modelmapper.v1.TypesV1.ExprDef

class SparkSplineObjectConverterSpec extends AnyFlatSpec {

  behavior of "convert()"

  it should "convert expr.AttrRef" in {
    val dummyAttrRefDef = Map("dummy" -> "expr.AttrRef")
    val dummyRef = AttrOrExprRef.attrRef("foo")

    val attributeRefConverterMock = new AttributeRefConverter {
      override def isAttrRef(obj: Any): Boolean = obj == dummyAttrRefDef

      override def convert(arg: ExprDef): AttrOrExprRef = dummyRef
    }

    val converter = new SparkSplineObjectConverter(attributeRefConverterMock, null)

    val attrRef = converter.convert(dummyAttrRefDef)

    assert(attrRef == dummyRef)
  }

  it should "convert expr.XYZ" in {
    val dummyExprDef = Map("dummy" -> "expr.XYZ")
    val dummyExpr = Literal("007", value = 42)
    val dummyRef = AttrOrExprRef.exprRef("007")

    val attributeRefConverterMock = new AttributeRefConverter {
      override def isAttrRef(obj: Any): Boolean = false

      override def convert(arg: ExprDef): AttrOrExprRef = null
    }

    val expressionConverterMock = new ExpressionConverter {
      override def isExpression(obj: Any): Boolean = obj == dummyExprDef

      override def convert(arg: ExprDef): ExpressionLike = dummyExpr
    }

    val converter = new SparkSplineObjectConverter(attributeRefConverterMock, expressionConverterMock)

    val attrRef = converter.convert(dummyExprDef)

    assert(attrRef == dummyRef)
  }
}
