package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  type AnySchemaConstructor = MixedSchemaConstructor | StringSchemaConstructor | NumberSchemaConstructor | BooleanSchemaConstructor | DateSchemaConstructor | ArraySchemaConstructor | ObjectSchemaConstructor
  type BooleanSchema = Schema[scala.Boolean]
  type Lazy = Schema[js.Any]
  type MixedSchema = Schema[js.Any]
  type ObjectSchemaDefinition[T /* <: js.Object */] = yupLib.yupLibStrings.ObjectSchemaDefinition with T
  type Shape[T /* <: js.Object */, U /* <: js.Object */] = yupLib.yupLibStrings.Shape with T with U
  type TestOptionsMessage = java.lang.String | (js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilder[T] | yupLib.Anon_Then | js.Object
}
