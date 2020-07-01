package typings.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertingTestFunction[T] = js.ThisFunction1[/* this */ typings.yup.mod.TestContext, /* value */ js.Any, /* is T */ scala.Boolean]
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.yup.yupStrings.Id with org.scalablytyped.runtime.TopLevel[T]
  type InferType[T] = typings.yup.mod.InnerInferType[js.Any]
  type InferredArrayType[T] = T
  type InnerInferType[T] = (typings.yup.mod.Id[typings.yup.mod.NotRequiredProps[_] with typings.yup.mod.RequiredProps[_]]) | typings.yup.mod.InnerInferTypeArray[js.Any] | typings.yup.mod.PreserveOptionals[T]
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  type Lazy_ = typings.yup.mod.Schema[js.Any]
  type LocaleValue = java.lang.String | (js.Function1[/* params */ typings.yup.mod.FormatErrorParams, java.lang.String])
  /** If `T` is optional, returns optional `U`. */
  type MaintainOptionality[T, U] = js.UndefOr[U]
  type NotRequiredProps[T] = typings.std.Partial[typings.std.Pick[T, typings.yup.mod.KeyOfUndefined[T]]]
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field]> | yup.yup.MixedSchema<T[field]> | yup.yup.Ref}
    */ typings.yup.yupStrings.ObjectSchemaDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  type PreserveNull[T] = scala.Null
  type PreserveOptionals[T] = typings.yup.mod.PreserveNull[T] | typings.yup.mod.PreserveUndefined[T]
  type PreserveUndefined[T] = js.UndefOr[scala.Nothing]
  type RequiredProps[T] = typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, typings.yup.mod.KeyOfUndefined[T]]
  ]
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = (typings.yup.yupStrings.Shape with org.scalablytyped.runtime.TopLevel[js.Any] with U) | typings.yup.mod.PreserveOptionals[T]
  type TestFunction = js.ThisFunction1[
    /* this */ typings.yup.mod.TestContext, 
    /* value */ js.Any, 
    scala.Boolean | typings.yup.mod.ValidationError | (js.Promise[scala.Boolean | typings.yup.mod.ValidationError])
  ]
  type TestOptionsMessage[Extra /* <: typings.std.Record[java.lang.String, _] */, R] = java.lang.String | (js.Function1[/* params */ Extra with typings.yup.anon.PartialTestMessageParams, R])
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  type WhenOptions[T] = typings.yup.mod.WhenOptionsBuilderFunction[T] | typings.yup.mod.WhenOptionsBuilderObject
  type WhenOptionsBuilderObject = typings.yup.anon.Is | js.Object
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
}
