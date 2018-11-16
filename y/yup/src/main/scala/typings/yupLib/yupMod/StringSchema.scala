package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSchema
  extends Schema[java.lang.String] {
  def email(): StringSchema = js.native
  def email(message: java.lang.String): StringSchema = js.native
  def ensure(): StringSchema = js.native
  def lowercase(): StringSchema = js.native
  def lowercase(message: java.lang.String): StringSchema = js.native
  def matches(regex: stdLib.RegExp): StringSchema = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: java.lang.String): StringSchema = js.native
  def matches(regex: stdLib.RegExp, messageOrOptions: yupLib.Anon_ExcludeEmptyString): StringSchema = js.native
  def max(limit: scala.Double): StringSchema = js.native
  def max(limit: scala.Double, message: java.lang.String): StringSchema = js.native
  def max(limit: Ref): StringSchema = js.native
  def max(limit: Ref, message: java.lang.String): StringSchema = js.native
  def min(limit: scala.Double): StringSchema = js.native
  def min(limit: scala.Double, message: java.lang.String): StringSchema = js.native
  def min(limit: Ref): StringSchema = js.native
  def min(limit: Ref, message: java.lang.String): StringSchema = js.native
  def trim(): StringSchema = js.native
  def trim(message: java.lang.String): StringSchema = js.native
  def uppercase(): StringSchema = js.native
  def uppercase(message: java.lang.String): StringSchema = js.native
  def url(): StringSchema = js.native
  def url(message: java.lang.String): StringSchema = js.native
}

