package typings.yup.mod

import typings.std.NonNullable
import typings.yup.anon.Length
import typings.yup.anon.Max
import typings.yup.anon.Min
import typings.yup.anon.Regex
import typings.yup.anon.Values
import typings.yup.yupBooleans.`false`
import typings.yup.yupBooleans.`true`
import typings.yup.yupStrings._empty
import typings.yup.yupStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "StringSchema")
@js.native
open class StringSchema[TType /* <: Maybe[String] */, TContext, TDefault, TFlags /* <: Flags */] () extends Schema[TType, TContext, TDefault, TFlags] {
  
  @JSName("concat")
  def concat_UTypeUContextUDefaultUFlags_StringSchema[UType /* <: Maybe[String] */, UContext, UDefault, UFlags /* <: Flags */](schema: StringSchema[UType, UContext, UDefault, UFlags]): StringSchema[Concat[TType, UType], TContext & UContext, UDefault, TFlags | UFlags] = js.native
  
  def email(): this.type = js.native
  def email(message: Message[Regex]): this.type = js.native
  
  def ensure(): StringSchema[NonNullable[TType], AnyObject, Unit, _empty] = js.native
  
  def length(length: Double): this.type = js.native
  def length(length: Double, message: Message[Length]): this.type = js.native
  def length(length: Reference[Double]): this.type = js.native
  def length(length: Reference[Double], message: Message[Length]): this.type = js.native
  
  def lowercase(): this.type = js.native
  def lowercase(message: Message[Any]): this.type = js.native
  
  def matches(regex: js.RegExp): this.type = js.native
  def matches(regex: js.RegExp, options: MatchOptions): this.type = js.native
  def matches(regex: js.RegExp, options: Message[Regex]): this.type = js.native
  
  def max(max: Double): this.type = js.native
  def max(max: Double, message: Message[Max]): this.type = js.native
  def max(max: Reference[Double]): this.type = js.native
  def max(max: Reference[Double], message: Message[Max]): this.type = js.native
  
  def min(min: Double): this.type = js.native
  def min(min: Double, message: Message[Min]): this.type = js.native
  def min(min: Reference[Double]): this.type = js.native
  def min(min: Reference[Double], message: Message[Min]): this.type = js.native
  
  def nullable(msg: Message[Any]): StringSchema[TType | Null, TContext, TDefault, TFlags] = js.native
  
  @JSName("oneOf")
  def oneOf_U_StringSchema[U /* <: TType */](arrayOfValues: js.Array[U | Reference[U]]): StringSchema[U | Optionals[TType], TContext, TDefault, TFlags] = js.native
  @JSName("oneOf")
  def oneOf_U_StringSchema[U /* <: TType */](arrayOfValues: js.Array[U | Reference[U]], message: js.UndefOr[Message[Values]]): StringSchema[U | Optionals[TType], TContext, TDefault, TFlags] = js.native
  
  @JSName("strip")
  def strip_false(enabled: `false`): StringSchema[TType, TContext, TDefault, UnsetFlag[TFlags, s]] = js.native
  @JSName("strip")
  def strip_true(enabled: `true`): StringSchema[TType, TContext, TDefault, SetFlag[TFlags, s]] = js.native
  
  def trim(): this.type = js.native
  def trim(message: Message[Any]): this.type = js.native
  
  def uppercase(): this.type = js.native
  def uppercase(message: Message[Any]): this.type = js.native
  
  def url(): this.type = js.native
  def url(message: Message[Regex]): this.type = js.native
  
  def uuid(): this.type = js.native
  def uuid(message: Message[Regex]): this.type = js.native
}
