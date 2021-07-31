package typings.yup.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Record
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchema[T /* <: js.UndefOr[js.Object | Null] */, C]
  extends StObject
     with Schema[T, C] {
  
  def camelCase(): ObjectSchema[T, C] = js.native
  
  @JSName("concat")
  def concat_U_Object_ObjectSchema[U /* <: js.Object */](schema: ObjectSchema[U, C]): ObjectSchema[T & U, C] = js.native
  
  def constantCase(): ObjectSchema[T, C] = js.native
  
  def defined(): ObjectSchema[Exclude[T, Unit], C] = js.native
  
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U, C] = js.native
  def equals[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): ObjectSchema[U, C] = js.native
  
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: yup.yup.Schema<T[k], C>}
    */ typings.yup.yupStrings.ObjectSchema & TopLevel[T] = js.native
  
  def from(fromKey: String, toKey: String): ObjectSchema[T, C] = js.native
  def from(fromKey: String, toKey: String, alias: Boolean): ObjectSchema[T, C] = js.native
  
  def noUnknown(): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: Boolean): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: Boolean, message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): ObjectSchema[T, C] = js.native
  def noUnknown(onlyKnownKeys: Unit, message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): ObjectSchema[T, C] = js.native
  
  def notRequired(): ObjectSchema[js.UndefOr[T], C] = js.native
  
  def nullable(): ObjectSchema[T | Null, C] = js.native
  def nullable(isNullable: Boolean): ObjectSchema[T, C] = js.native
  @JSName("nullable")
  def nullable_false(isNullable: `false`): ObjectSchema[Exclude[T, Null], C] = js.native
  @JSName("nullable")
  def nullable_true(isNullable: `true`): ObjectSchema[T | Null, C] = js.native
  
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_]): ObjectSchema[U, C] = js.native
  def oneOf[U /* <: T */](arrayOfValues: js.Array[U | Ref_], message: js.UndefOr[TestOptionsMessage[Values, js.Any]]): ObjectSchema[U, C] = js.native
  
  def optional(): ObjectSchema[js.UndefOr[T], C] = js.native
  
  def required(): ObjectSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  def required(message: TestOptionsMessage[js.Object, js.Any]): ObjectSchema[Exclude[T, js.UndefOr[Null]], C] = js.native
  
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U, C]): ObjectSchema[Shape[T, U], C] = js.native
  def shape[U /* <: js.Object */](fields: ObjectSchemaDefinition[U, C], noSortEdges: js.Array[js.Tuple2[String, String]]): ObjectSchema[Shape[T, U], C] = js.native
  
  def snakeCase(): ObjectSchema[T, C] = js.native
  
  def test(
    name: String,
    message: TestOptionsMessage[js.Object, js.Any],
    test: TestFunction[js.UndefOr[T | Null], C]
  ): this.type = js.native
  def test(options: TestOptions[Record[String, js.Any], C]): this.type = js.native
  def test[U /* <: T */](options: AssertingTestOptions[U, Record[String, js.Any], C]): ObjectSchema[U, C] = js.native
  @JSName("test")
  def test_U_T_ObjectSchema[U /* <: T */](name: String, message: TestOptionsMessage[js.Object, js.Any], test: AssertingTestFunction[U, C]): ObjectSchema[U, C] = js.native
  
  def transformKeys(callback: js.Function1[/* key */ js.Any, js.Any]): Unit = js.native
  
  def unknown(): ObjectSchema[T, C] = js.native
  def unknown(allow: Boolean): ObjectSchema[T, C] = js.native
  def unknown(allow: Boolean, message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): ObjectSchema[T, C] = js.native
  def unknown(allow: Unit, message: js.UndefOr[TestOptionsMessage[js.Object, js.Any]]): ObjectSchema[T, C] = js.native
}
