package typings.yup

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def array: typings.yup.mod.ArraySchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("array").asInstanceOf[typings.yup.mod.ArraySchemaConstructor]
  
  @scala.inline
  def bool: typings.yup.mod.BooleanSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bool").asInstanceOf[typings.yup.mod.BooleanSchemaConstructor]
  
  @scala.inline
  def boolean: typings.yup.mod.BooleanSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("boolean").asInstanceOf[typings.yup.mod.BooleanSchemaConstructor]
  
  @scala.inline
  def date: typings.yup.mod.DateSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("date").asInstanceOf[typings.yup.mod.DateSchemaConstructor]
  
  @scala.inline
  def mixed: typings.yup.mod.MixedSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mixed").asInstanceOf[typings.yup.mod.MixedSchemaConstructor]
  
  @scala.inline
  def number: typings.yup.mod.NumberSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("number").asInstanceOf[typings.yup.mod.NumberSchemaConstructor]
  
  @scala.inline
  def string: typings.yup.mod.StringSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("string").asInstanceOf[typings.yup.mod.StringSchemaConstructor]
  
  type AssertingTestFunction[T, C] = js.ThisFunction1[
    /* this */ typings.yup.mod.TestContext[C], 
    /* value */ js.Any, 
    /* is T */ scala.Boolean
  ]
  
  type Id[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? yup.yup.InnerInferType<T[K]> : T[K]}
    */ typings.yup.yupStrings.Id with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type InferType[T] = typings.yup.mod.InnerInferType[js.Any]
  
  type InferredArrayType[T] = T
  
  type InnerInferType[T] = (typings.yup.mod.Id[typings.yup.mod.NotRequiredProps[_] with typings.yup.mod.RequiredProps[_]]) | typings.yup.mod.InnerInferTypeArray[js.Any] | typings.yup.mod.PreserveOptionals[T]
  
  type KeyOfUndefined[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: -? undefined extends T[P]? P : never}[keyof T] */ js.Any
  
  type Lazy_ = typings.yup.mod.Schema[js.Any, js.Object]
  
  type LocaleValue = java.lang.String | (js.Function1[/* params */ typings.yup.mod.FormatErrorParams, java.lang.String])
  
  /** If `T` is optional, returns optional `U`. */
  type MaintainOptionality[T, U] = js.UndefOr[U]
  
  type NotRequiredProps[T] = typings.std.Partial[typings.std.Pick[T, typings.yup.mod.KeyOfUndefined[T]]]
  
  type ObjectSchemaDefinition[T /* <: js.UndefOr[js.Object | scala.Null] */, C] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ field in keyof T ]: yup.yup.Schema<T[field], C> | yup.yup.MixedSchema<T[field], C> | yup.yup.Ref}
    */ typings.yup.yupStrings.ObjectSchemaDefinition with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type PreserveNull[T] = scala.Null
  
  type PreserveOptionals[T] = typings.yup.mod.PreserveNull[T] | typings.yup.mod.PreserveUndefined[T]
  
  type PreserveUndefined[T] = js.UndefOr[scala.Nothing]
  
  type RequiredProps[T] = typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, typings.yup.mod.KeyOfUndefined[T]]
  ]
  
  type Shape[T /* <: js.UndefOr[js.Object | scala.Null] */, U /* <: js.Object */] = (typings.yup.yupStrings.Shape with org.scalablytyped.runtime.TopLevel[js.Any] with U) | typings.yup.mod.PreserveOptionals[T]
  
  type TestFunction[T, C] = js.ThisFunction1[
    /* this */ typings.yup.mod.TestContext[C], 
    /* value */ T, 
    scala.Boolean | typings.yup.mod.ValidationError | (js.Promise[scala.Boolean | typings.yup.mod.ValidationError])
  ]
  
  type TestOptionsMessage[Extra /* <: typings.std.Record[java.lang.String, _] */, R] = java.lang.String | (js.Function1[/* params */ Extra with typings.yup.anon.PartialTestMessageParams, R])
  
  type TransformFunction[T] = js.ThisFunction2[/* this */ T, /* value */ js.Any, /* originalValue */ js.Any, js.Any]
  
  type WhenOptions[T] = typings.yup.mod.WhenOptionsBuilderFunction[T] | typings.yup.mod.WhenOptionsBuilderObject
  
  type WhenOptionsBuilderObject = typings.yup.anon.Is | js.Object
  
  type WhenOptionsBuilderObjectIs = (js.Function1[/* repeated */ js.Any, scala.Boolean]) | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
  
  @scala.inline
  def addMethod[T /* <: typings.yup.mod.Schema[_, js.Object] */](
    schemaCtor: typings.yup.mod.AnySchemaConstructor,
    name: java.lang.String,
    method: js.ThisFunction1[/* this */ T, /* repeated */ js.Any, T]
  ): scala.Unit = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addMethod")(schemaCtor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isSchema(obj: js.Any): /* is yup.yup.Schema<any, object> */ scala.Boolean = typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSchema")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is yup.yup.Schema<any, object> */ scala.Boolean]
  
  @scala.inline
  def `lazy`[T](fn: js.Function1[/* value */ T, typings.yup.mod.Schema[T, js.Object]]): typings.yup.mod.Lazy_ = typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.yup.mod.Lazy_]
  
  @scala.inline
  def `object`: typings.yup.mod.ObjectSchemaConstructor = typings.yup.mod.^.asInstanceOf[js.Dynamic].selectDynamic("object").asInstanceOf[typings.yup.mod.ObjectSchemaConstructor]
  
  @scala.inline
  def reach[T, C](schema: typings.yup.mod.Schema[T, C], path: java.lang.String): typings.yup.mod.Schema[T, C] = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typings.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](
    schema: typings.yup.mod.Schema[T, C],
    path: java.lang.String,
    value: js.UndefOr[scala.Nothing],
    context: js.Any
  ): typings.yup.mod.Schema[T, C] = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](schema: typings.yup.mod.Schema[T, C], path: java.lang.String, value: js.Any): typings.yup.mod.Schema[T, C] = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.yup.mod.Schema[T, C]]
  @scala.inline
  def reach[T, C](schema: typings.yup.mod.Schema[T, C], path: java.lang.String, value: js.Any, context: js.Any): typings.yup.mod.Schema[T, C] = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("reach")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yup.mod.Schema[T, C]]
  
  @scala.inline
  def ref(path: java.lang.String): typings.yup.mod.Ref_ = typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any]).asInstanceOf[typings.yup.mod.Ref_]
  @scala.inline
  def ref(path: java.lang.String, options: typings.yup.anon.ContextPrefix): typings.yup.mod.Ref_ = (typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ref")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.yup.mod.Ref_]
  
  @scala.inline
  def setLocale(customLocale: typings.yup.mod.LocaleObject): scala.Unit = typings.yup.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(customLocale.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
