package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  type BooleanSchema = Schema[scala.Boolean]
  type Lazy = Schema[js.Any]
  type MixedSchema = Schema[js.Any]
  type ObjectSchemaDefinition[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ yupLib.yupLibStrings.ObjectSchemaDefinition with T
  type Shape[T /* <: js.Object */, U /* <: js.Object */] = yupLib.yupLibStrings.Shape with js.Any with U
  type TestOptionsMessage = java.lang.String | (js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - WhenOptionsBuilder[T]
    - yupLib.Anon_Is
    - js.Object
  */
  type WhenOptions[T] = _WhenOptions[T] | js.Object
}
