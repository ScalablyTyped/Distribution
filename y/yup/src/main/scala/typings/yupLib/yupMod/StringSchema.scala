package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema
  extends Schema[java.lang.String] {
  def email(): StringSchema = js.native
  def email(message: TestOptionsMessage): StringSchema = js.native
  def ensure(): StringSchema = js.native
  def length(limit: scala.Double): StringSchema = js.native
  def length(limit: scala.Double, message: TestOptionsMessage): StringSchema = js.native
  def length(limit: Ref): StringSchema = js.native
  def length(limit: Ref, message: TestOptionsMessage): StringSchema = js.native
  def lowercase(): StringSchema = js.native
  def lowercase(message: TestOptionsMessage): StringSchema = js.native
  def matches(regex: stdLib.RegExp): StringSchema = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: yupLib.Anon_ExcludeEmptyString): StringSchema = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: TestOptionsMessage): StringSchema = js.native
  def max(limit: scala.Double): StringSchema = js.native
  def max(limit: scala.Double, message: TestOptionsMessage): StringSchema = js.native
  def max(limit: Ref): StringSchema = js.native
  def max(limit: Ref, message: TestOptionsMessage): StringSchema = js.native
  def min(limit: scala.Double): StringSchema = js.native
  def min(limit: scala.Double, message: TestOptionsMessage): StringSchema = js.native
  def min(limit: Ref): StringSchema = js.native
  def min(limit: Ref, message: TestOptionsMessage): StringSchema = js.native
  def trim(): StringSchema = js.native
  def trim(message: TestOptionsMessage): StringSchema = js.native
  def uppercase(): StringSchema = js.native
  def uppercase(message: TestOptionsMessage): StringSchema = js.native
  def url(): StringSchema = js.native
  def url(message: TestOptionsMessage): StringSchema = js.native
}

