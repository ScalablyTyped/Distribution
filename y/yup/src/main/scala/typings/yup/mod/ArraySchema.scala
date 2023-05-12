package typings.yup.mod

import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings._empty
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "ArraySchema")
@js.native
open class ArraySchema[TIn /* <: js.UndefOr[js.Array[Any] | Null] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TIn, TContext, TDefault, TFlags] {
  def this(`type`: ISchema[InnerType[TIn], TContext, Any, Any]) = this()
  
  /* protected */ def _cast(_value: Any, _opts: InternalOptions[TContext]): Any = js.native
  
  def clone(spec: SchemaSpec[Any]): this.type = js.native
  
  def compact(): this.type = js.native
  def compact(rejector: RejectorFn): this.type = js.native
  
  @JSName("concat")
  def concat_IInICIDIF_ArraySchema[IIn /* <: Maybe[js.Array[Any]] */, IC, ID, IF /* <: Flags */](schema: ArraySchema[IIn, IC, ID, IF]): ArraySchema[
    Concat[TIn, IIn], 
    TContext & IC, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<IF, 'd'> extends never ? TDefault : ID */ js.Any, 
    TFlags | IF
  ] = js.native
  
  def ensure(): ArraySchema[TIn, TContext, TIn, ToggleDefault[TFlags, TIn]] = js.native
  
  val innerType: js.UndefOr[ISchema[InnerType[TIn], TContext, Any, Any]] = js.native
  
  /** Parse an input JSON string to an object */
  def json(): this.type = js.native
  
  def length(length: Double): this.type = js.native
  def length(length: Double, message: Message[Length]): this.type = js.native
  def length(length: Reference[Double]): this.type = js.native
  def length(length: Reference[Double], message: Message[Length]): this.type = js.native
  
  def max(max: Double): this.type = js.native
  def max(max: Double, message: Message[Max]): this.type = js.native
  def max(max: Reference[Double]): this.type = js.native
  def max(max: Reference[Double], message: Message[Max]): this.type = js.native
  
  def min(min: Double): this.type = js.native
  def min(min: Double, message: Message[Min]): this.type = js.native
  def min(min: Reference[Double]): this.type = js.native
  def min(min: Reference[Double], message: Message[Min]): this.type = js.native
  
  def nullable(msg: Message[Any]): ArraySchema[TIn | Null, TContext, TDefault, TFlags] = js.native
  
  def of[U](schema: ISchema[U, TContext, Any, Any]): ArraySchema[js.Array[U] | Optionals[TIn], TContext, TFlags, _empty] = js.native
  
  @JSName("spec")
  var spec_ArraySchema: ArraySchemaSpec[TIn, TContext] = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): ArraySchema[TIn, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): ArraySchema[TIn, TContext, TDefault, SetFlag[TFlags, s]] = js.native
}
