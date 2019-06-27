package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  type InferType[T] = InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = yupLib.NotRequiredProps[T] with yupLib.RequiredProps[T]
  type KeyOfUndefined[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy = Schema[js.Any]
  type LocaleValue = java.lang.String | (js.Function1[/* params */ FormatErrorParams, java.lang.String])
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ yupLib.yupLibStrings.ObjectSchemaDefinition with T
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = yupLib.yupLibStrings.Shape with js.Any with U
  type TestOptionsMessage = java.lang.String | (js.Function1[/* params */ js.Object with stdLib.Partial[TestMessageParams], java.lang.String])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilderFunction[T] | WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = yupLib.Anon_Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
}
