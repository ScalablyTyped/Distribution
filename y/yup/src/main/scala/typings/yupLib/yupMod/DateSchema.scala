package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema
  extends Schema[stdLib.Date] {
  def max(limit: java.lang.String): DateSchema = js.native
  def max(limit: java.lang.String, message: java.lang.String): DateSchema = js.native
  def max(limit: stdLib.Date): DateSchema = js.native
  def max(limit: stdLib.Date, message: java.lang.String): DateSchema = js.native
  def max(limit: Ref): DateSchema = js.native
  def max(limit: Ref, message: java.lang.String): DateSchema = js.native
  def min(limit: java.lang.String): DateSchema = js.native
  def min(limit: java.lang.String, message: java.lang.String): DateSchema = js.native
  def min(limit: stdLib.Date): DateSchema = js.native
  def min(limit: stdLib.Date, message: java.lang.String): DateSchema = js.native
  def min(limit: Ref): DateSchema = js.native
  def min(limit: Ref, message: java.lang.String): DateSchema = js.native
}

