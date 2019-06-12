package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  type Lazy = Schema[js.Any]
  type LocaleValue = java.lang.String | (js.Function1[/* params */ FormatErrorParams, java.lang.String])
  type MixedSchema = Schema[js.Any]
  type ObjectSchemaDefinition[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ yupLib.yupLibStrings.ObjectSchemaDefinition with T
  type Shape[T /* <: js.Object */, U /* <: js.Object */] = yupLib.yupLibStrings.Shape with js.Any with U
  type TestOptionsMessage = java.lang.String | (js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilderFunction[T] | WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = yupLib.Anon_Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
}
