package typings.yup.mod

import typings.std.Extract
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Partial
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "ObjectSchema")
@js.native
open class ObjectSchema[TIn /* <: Maybe[AnyObject] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[MakeKeysOptional[TIn], TContext, TDefault, TFlags] {
  def this(spec: Shape[TIn, TContext]) = this()
  
  /* protected */ def _cast(_value: Any): Any = js.native
  /* protected */ def _cast(_value: Any, options: InternalOptions[TContext]): Any = js.native
  
  /* private */ var _excludedEdges: Any = js.native
  
  /* private */ var _nodes: Any = js.native
  
  /* private */ var _sortErrors: Any = js.native
  
  def camelCase(): this.type = js.native
  
  def clone(spec: ObjectSchemaSpec): this.type = js.native
  
  @JSName("concat")
  def concat_IInICIDIF_ObjectSchema[IIn /* <: Maybe[AnyObject] */, IC, ID, IF /* <: Flags */](schema: ObjectSchema[IIn, IC, ID, IF]): ObjectSchema[
    ConcatObjectTypes[TIn, IIn], 
    TContext & IC, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<IF, 'd'> extends never ? TDefault extends yup.yup.AnyObject ? ID extends yup.yup.AnyObject ? yup.yup._<yup.yup.ConcatObjectTypes<TDefault, ID>> : ID : ID : ID */ js.Any, 
    TFlags | IF
  ] = js.native
  
  def constantCase(): this.type = js.native
  
  def deepPartial(): ObjectSchema[PartialDeep[TIn], TContext, TDefault, TFlags] = js.native
  
  var fields: Shape[NonNullable[TIn], TContext] = js.native
  
  def from(from: String, to: /* keyof TIn */ String): this.type = js.native
  def from(from: String, to: /* keyof TIn */ String, alias: Boolean): this.type = js.native
  
  /** Parse an input JSON string to an object */
  def json(): this.type = js.native
  
  def noUnknown(): this.type = js.native
  def noUnknown(message: Message[Any]): this.type = js.native
  def noUnknown(noAllow: Boolean): this.type = js.native
  def noUnknown(noAllow: Boolean, message: Message[Any]): this.type = js.native
  
  def nullable(msg: Message[Any]): ObjectSchema[TIn | Null, TContext, TDefault, TFlags] = js.native
  
  def omit[TKey /* <: /* keyof TIn */ String */](keys: js.Array[TKey]): ObjectSchema[Omit[TIn, TKey], TContext, TDefault, TFlags] = js.native
  
  def partial(): ObjectSchema[Partial[TIn], TContext, TDefault, TFlags] = js.native
  
  def pick[TKey /* <: /* keyof TIn */ String */](keys: js.Array[TKey]): ObjectSchema[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in TKey ]: TIn[K]} */ js.Any, 
    TContext, 
    TDefault, 
    TFlags
  ] = js.native
  
  /* private */ var setFields: Any = js.native
  
  def shape[U /* <: ObjectShape */](additions: U): ObjectSchema[
    _underscore[
      ((/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TIn ]: P extends keyof U? yup.yup.TypeFromShape<U, TContext>[P] : TIn[P]} */ js.Any) & (TypeFromShape[U, TContext])) | (Extract[TIn, js.UndefOr[Null]])
    ], 
    TContext, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<TFlags, 'd'> extends never ? yup.yup._<TDefault & yup.yup.DefaultFromShape<U>> : TDefault */ js.Any, 
    TFlags
  ] = js.native
  def shape[U /* <: ObjectShape */](additions: U, excludes: js.Array[js.Tuple2[String, String]]): ObjectSchema[
    _underscore[
      ((/* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TIn ]: P extends keyof U? yup.yup.TypeFromShape<U, TContext>[P] : TIn[P]} */ js.Any) & (TypeFromShape[U, TContext])) | (Extract[TIn, js.UndefOr[Null]])
    ], 
    TContext, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<TFlags, 'd'> extends never ? yup.yup._<TDefault & yup.yup.DefaultFromShape<U>> : TDefault */ js.Any, 
    TFlags
  ] = js.native
  
  def snakeCase(): this.type = js.native
  
  @JSName("spec")
  var spec_ObjectSchema: ObjectSchemaSpec = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): ObjectSchema[TIn, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): ObjectSchema[TIn, TContext, TDefault, SetFlag[TFlags, s]] = js.native
  
  def transformKeys(fn: js.Function1[/* key */ String, String]): this.type = js.native
  
  def unknown(): this.type = js.native
  def unknown(allow: Boolean): this.type = js.native
  def unknown(allow: Boolean, message: Message[Any]): this.type = js.native
  def unknown(allow: Unit, message: Message[Any]): this.type = js.native
}
