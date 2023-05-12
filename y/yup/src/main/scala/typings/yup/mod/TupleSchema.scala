package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings._empty
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "TupleSchema")
@js.native
open class TupleSchema[TType /* <: Maybe[AnyTuple] */, TContext, TDefault, TFlags /* <: Flags */] protected () extends Schema[TType, TContext, TDefault, TFlags] {
  def this(schemas: Array[ISchema[Any, Any, Any, Any]]) = this()
  
  /* protected */ def _cast(inputValue: Any, options: InternalOptions[TContext]): Any = js.native
  
  def concat[TOther /* <: TupleSchema[Any, Any, Unit, _empty] */](schema: TOther): TOther = js.native
  
  def nullable(msg: Message[Any]): TupleSchema[TType | Null, TContext, TDefault, TFlags] = js.native
  
  @JSName("spec")
  var spec_TupleSchema: TupleSchemaSpec[TType] = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): TupleSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): TupleSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
}
