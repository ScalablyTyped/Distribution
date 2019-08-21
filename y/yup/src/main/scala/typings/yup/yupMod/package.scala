package typings.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object yupMod {
  import typings.std.Partial
  import typings.std.Record
  import typings.yup.Anon_Is
  import typings.yup.NotRequiredProps
  import typings.yup.RequiredProps

  type Id[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.yup.yupStrings.Id with T
  type InferType[T] = InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = Id[NotRequiredProps[T] with RequiredProps[T]]
  type KeyOfUndefined[T] = /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy = Schema[js.Any]
  type LocaleValue = String | (js.Function1[/* params */ FormatErrorParams, String])
  type MappedLocaleSchema[S /* <: Schema[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof S ]:? S[key] extends (args : infer P): any? yup.yup.MessageFromParameters<std.Required<any>> : never}
    */ typings.yup.yupStrings.MappedLocaleSchema with S
  type MessageFromParameters[P /* <: js.Array[_] */] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof P ]: P[K] extends yup.yup.TestOptionsMessage<any, any>? P[K] : never}[number] */ js.Any
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | Null] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.Ref}
    */ typings.yup.yupStrings.ObjectSchemaDefinition with T
  type Shape[T /* <: js.UndefOr[js.Object | Null] */, U /* <: js.Object */] = typings.yup.yupStrings.Shape with js.Any with U
  type TestOptionsMessage[Extra /* <: Record[String, _] */, R] = String | (js.Function1[/* params */ Extra with Partial[TestMessageParams], R])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = WhenOptionsBuilderFunction[T] | WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = Anon_Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, Boolean]) | Boolean | Double | Null | js.Object | String
}
