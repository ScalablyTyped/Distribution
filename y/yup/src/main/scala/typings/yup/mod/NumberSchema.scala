package typings.yup.mod

import typings.yup.anon.Less
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.More
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings.ceil
import typings.yup.yupStrings.floor
import typings.yup.yupStrings.s
import typings.yup.yupStrings.trunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "NumberSchema")
@js.native
open class NumberSchema[TType /* <: Maybe[Double] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TType, TContext, TDefault, TFlags] {
  
  @JSName("concat")
  def concat_UTypeUContextUFlagsUDefault_NumberSchema[UType /* <: Maybe[Double] */, UContext, UFlags /* <: Flags */, UDefault](schema: NumberSchema[UType, UContext, UDefault, UFlags]): NumberSchema[Concat[TType, UType], TContext & UContext, UDefault, TFlags | UFlags] = js.native
  
  def integer(): this.type = js.native
  def integer(message: Message[Any]): this.type = js.native
  
  def lessThan(less: Double): this.type = js.native
  def lessThan(less: Double, message: Message[Less]): this.type = js.native
  def lessThan(less: Reference[Double]): this.type = js.native
  def lessThan(less: Reference[Double], message: Message[Less]): this.type = js.native
  
  def max(max: Double): this.type = js.native
  def max(max: Double, message: Message[Max]): this.type = js.native
  def max(max: Reference[Double]): this.type = js.native
  def max(max: Reference[Double], message: Message[Max]): this.type = js.native
  
  def min(min: Double): this.type = js.native
  def min(min: Double, message: Message[Min]): this.type = js.native
  def min(min: Reference[Double]): this.type = js.native
  def min(min: Reference[Double], message: Message[Min]): this.type = js.native
  
  def moreThan(more: Double): this.type = js.native
  def moreThan(more: Double, message: Message[More]): this.type = js.native
  def moreThan(more: Reference[Double]): this.type = js.native
  def moreThan(more: Reference[Double], message: Message[More]): this.type = js.native
  
  def negative(): this.type = js.native
  def negative(msg: Message[Less]): this.type = js.native
  
  def nullable(msg: Message[Any]): NumberSchema[TType | Null, TContext, TDefault, TFlags] = js.native
  
  def positive(): this.type = js.native
  def positive(msg: Message[More]): this.type = js.native
  
  def round(): this.type = js.native
  def round(method: ceil | floor | typings.yup.yupStrings.round | trunc): this.type = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): NumberSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): NumberSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
  
  def truncate(): this.type = js.native
}
