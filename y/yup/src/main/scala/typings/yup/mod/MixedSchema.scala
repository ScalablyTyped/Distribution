package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "MixedSchema")
@js.native
open class MixedSchema[TType /* <: Maybe[AnyPresentValue] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TType, TContext, TDefault, TFlags] {
  def this(spec: MixedOptions[TType]) = this()
  def this(spec: TypeGuard[TType]) = this()
  
  def concat[IT, IC, ID, IF /* <: Flags */](schema: Schema[IT, IC, ID, IF]): MixedSchema[Concat[TType, IT], TContext & IC, ID, TFlags | IF] = js.native
  @JSName("concat")
  def concat_ITICIDIF_MixedSchema[IT, IC, ID, IF /* <: Flags */](schema: MixedSchema[IT, IC, ID, IF]): MixedSchema[Concat[TType, IT], TContext & IC, ID, TFlags | IF] = js.native
  
  def nullable(msg: Message[Any]): MixedSchema[TType | Null, TContext, TDefault, TFlags] = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): MixedSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): MixedSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
}
