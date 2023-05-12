package typings.yup.mod

import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings._empty
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "BooleanSchema")
@js.native
open class BooleanSchema[TType /* <: Maybe[Boolean] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TType, TContext, TDefault, TFlags] {
  
  def isFalse(): BooleanSchema[`false` | Optionals[TType], TContext, TFlags, _empty] = js.native
  def isFalse(message: Message[Any]): BooleanSchema[`false` | Optionals[TType], TContext, TFlags, _empty] = js.native
  
  def isTrue(): BooleanSchema[`true` | Optionals[TType], TContext, TFlags, _empty] = js.native
  def isTrue(message: Message[Any]): BooleanSchema[`true` | Optionals[TType], TContext, TFlags, _empty] = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): BooleanSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): BooleanSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
}
