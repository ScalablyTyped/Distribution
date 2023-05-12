package typings.yup.mod

import typings.yup.anon.`0`
import typings.yup.anon.`1`
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings._empty
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "DateSchema")
@js.native
open class DateSchema[TType /* <: Maybe[js.Date] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TType, TContext, TDefault, TFlags] {
  
  def concat[TOther /* <: DateSchema[Any, Any, Unit, _empty] */](schema: TOther): TOther = js.native
  
  def max(max: Any): this.type = js.native
  def max(max: Any, message: Message[`1`]): this.type = js.native
  def max(max: Reference[Any]): this.type = js.native
  def max(max: Reference[Any], message: Message[`1`]): this.type = js.native
  
  def min(min: Any): this.type = js.native
  def min(min: Any, message: Message[`0`]): this.type = js.native
  def min(min: Reference[js.Date]): this.type = js.native
  def min(min: Reference[js.Date], message: Message[`0`]): this.type = js.native
  
  def nullable(msg: Message[Any]): DateSchema[TType | Null, TContext, TDefault, TFlags] = js.native
  
  /* private */ var prepareParam: Any = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): DateSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): DateSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
}
object DateSchema {
  
  @JSImport("yup", "DateSchema")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("yup", "DateSchema.INVALID_DATE")
  @js.native
  def INVALID_DATE: js.Date = js.native
  inline def INVALID_DATE_=(x: js.Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_DATE")(x.asInstanceOf[js.Any])
}
