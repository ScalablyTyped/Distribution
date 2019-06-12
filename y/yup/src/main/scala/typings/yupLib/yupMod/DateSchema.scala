package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSchema[T /* <: stdLib.Date | scala.Null */] extends Schema[T] {
  def max(limit: java.lang.String): DateSchema[T] = js.native
  def max(limit: java.lang.String, message: TestOptionsMessage): DateSchema[T] = js.native
  def max(limit: stdLib.Date): DateSchema[T] = js.native
  def max(limit: stdLib.Date, message: TestOptionsMessage): DateSchema[T] = js.native
  def max(limit: Ref): DateSchema[T] = js.native
  def max(limit: Ref, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: java.lang.String): DateSchema[T] = js.native
  def min(limit: java.lang.String, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: stdLib.Date): DateSchema[T] = js.native
  def min(limit: stdLib.Date, message: TestOptionsMessage): DateSchema[T] = js.native
  def min(limit: Ref): DateSchema[T] = js.native
  def min(limit: Ref, message: TestOptionsMessage): DateSchema[T] = js.native
}

